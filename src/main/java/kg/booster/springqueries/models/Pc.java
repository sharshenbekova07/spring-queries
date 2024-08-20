package kg.booster.springqueries.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "pcs")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SqlResultSetMapping(
        name = "ModelSpeedHdMapping",
        classes = @ConstructorResult(
                targetClass = kg.booster.springqueries.dtos.ModelSpeedHdDto.class,
                columns = {
                        @ColumnResult(name = "model", type = String.class),
                        @ColumnResult(name = "speed", type = Integer.class),
                        @ColumnResult(name = "hd", type = Integer.class)
                }
        )
)
@NamedNativeQuery(
        name = "Pc.findModelAndSpeedAndHdByPriceLessThan",
        query = "SELECT model, speed, hd FROM pcs WHERE price < :price",
        resultSetMapping = "ModelSpeedHdMapping"
)

public class Pc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int speed;

    private int ram;

    private int hd;

    private String cd;

    private int code;

    private String model;

    private double price;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Product product;


}

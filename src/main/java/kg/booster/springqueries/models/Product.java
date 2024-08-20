package kg.booster.springqueries.models;

import jakarta.persistence.*;
import kg.booster.springqueries.dtos.MakerSpeedDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "products")
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SqlResultSetMapping(
        name = "MakerSpeedMapping",
        classes = @ConstructorResult(
                targetClass = kg.booster.springqueries.dtos.MakerSpeedDto.class,
                columns = {
                        @ColumnResult(name = "maker",type = String.class),
                        @ColumnResult(name = "speed",type = Integer.class),
                }
        )
)
@NamedNativeQuery(
        name = "Product.findDistincPmakerAndLspeedByHdLessEqualThan",
        query = "SELECT distinct p.maker,l.speed from products p " +
         "join laptops l on p.model=l.model  where l.hd>= :hd",
        resultSetMapping = "MakerSpeedMapping"
)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String maker;

    private String model;

    private String type;

}

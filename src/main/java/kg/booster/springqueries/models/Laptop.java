package kg.booster.springqueries.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "laptops")
@Table(name = "laptops")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int speed;
    private int ram;
    private int hd;
    private int screen;

    private int code;

    private String model;

    private double price;



    @ManyToOne
    @JoinColumn(name = "model_id")
    private Product product;


}

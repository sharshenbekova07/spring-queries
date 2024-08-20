package kg.booster.springqueries.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "printers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Printer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private char color;

    private String type;

    private int code;

    private String model;

    private double price;


    @ManyToOne
    @JoinColumn(name = "model_id")
    private Product product;

}

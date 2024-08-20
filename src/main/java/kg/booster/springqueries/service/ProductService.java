package kg.booster.springqueries.service;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    Optional<Product> findById(Long id);

    List<String>findByType(String type);

    List<Product> findAll();

    List<MakerSpeedDto>findDistincPmakerAndLspeedByHdLessEqualThan(int hd);
}

package kg.booster.springqueries.service.impl;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.models.Product;
import kg.booster.springqueries.repository.ProductRepository;
import kg.booster.springqueries.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<MakerSpeedDto> findDistincPmakerAndLspeedByHdLessEqualThan(int hd) {


       return productRepository.findDistincPmakerAndLspeedByHdLessEqualThan(hd);
    }

    @Override
    public List<String> findByType(String type) {
        List<String> makers = new ArrayList<>();
        for (Product product : productRepository.findAll()) {
            if (product.getType().equalsIgnoreCase(type) && !makers.contains(product.getMaker())) {
                makers.add(product.getMaker());

            }
        }
        return makers;

    }
}

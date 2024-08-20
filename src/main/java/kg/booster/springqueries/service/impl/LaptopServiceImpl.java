package kg.booster.springqueries.service.impl;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.dtos.ModelRamScreenDto;
import kg.booster.springqueries.models.Laptop;
import kg.booster.springqueries.models.Product;
import kg.booster.springqueries.repository.LaptopRepository;
import kg.booster.springqueries.service.LaptopService;
import kg.booster.springqueries.service.PcService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class LaptopServiceImpl implements LaptopService {

    private  final LaptopRepository laptopRepository;

    @Override
    public List<ModelRamScreenDto> findModelRamAndScreenDtosByPriceMoreThan(double price) {
        return laptopRepository.findModelRamAndScreenDtosByPriceMoreThan(price);
    }


}

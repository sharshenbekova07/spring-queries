package kg.booster.springqueries.service.impl;

import kg.booster.springqueries.dtos.ModelSpeedHdDto;
import kg.booster.springqueries.repository.PcRepository;
import kg.booster.springqueries.service.PcService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PcServiceImpl implements PcService {

    private  final PcRepository pcRepository;

    @Override
    public List<ModelSpeedHdDto> findModelAndSpeedAndHdByPriceLessThan(double price) {

        return pcRepository.findModelAndSpeedAndHdByPriceLessThan(price);
    }

    @Override
    public List<ModelSpeedHdDto> findModelSpeedAndHdDtosByCdAndPriceLessThan(List<String> cds, double price) {
        return pcRepository.findModelSpeedAndHdDtosByCdAndPriceLessThan(cds,price);
    }


}

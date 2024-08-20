package kg.booster.springqueries.service;


import kg.booster.springqueries.dtos.ModelSpeedHdDto;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface PcService {

    List<ModelSpeedHdDto> findModelAndSpeedAndHdByPriceLessThan(double price);

    List<ModelSpeedHdDto> findModelSpeedAndHdDtosByCdAndPriceLessThan(List<String> cds,double price);


}

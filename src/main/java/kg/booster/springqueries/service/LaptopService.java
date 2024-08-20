package kg.booster.springqueries.service;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.dtos.ModelRamScreenDto;
import kg.booster.springqueries.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LaptopService  {

    List<ModelRamScreenDto> findModelRamAndScreenDtosByPriceMoreThan(double price);


}

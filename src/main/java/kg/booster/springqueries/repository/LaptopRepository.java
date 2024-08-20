package kg.booster.springqueries.repository;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.dtos.ModelRamScreenDto;
import kg.booster.springqueries.models.Laptop;
import kg.booster.springqueries.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {

    @Query("select new kg.booster.springqueries.dtos.ModelRamScreenDto(l.model,l.ram,l.screen)from laptops l  where l.price >:price")
    List<ModelRamScreenDto>findModelRamAndScreenDtosByPriceMoreThan(@Param("price")double price);

}

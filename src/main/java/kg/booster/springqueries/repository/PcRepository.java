package kg.booster.springqueries.repository;

import kg.booster.springqueries.dtos.ModelSpeedHdDto;
import kg.booster.springqueries.models.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long> {

    //JPQL запрос
//    @Query("SELECT new kg.booster.springqueries.dtos.ModelSpeedHdDto(p.model, p.speed, p.hd) FROM pcs p WHERE p.price < :price")
//    List<ModelSpeedHdDto> findModelAndSpeedAndHdByPriceLessThan(@Param("price") double price);

    @Query(name = "Pc.findModelAndSpeedAndHdByPriceLessThan", nativeQuery = true)
    List<ModelSpeedHdDto> findModelAndSpeedAndHdByPriceLessThan(@Param("price") double price);


    @Query("SELECT new kg.booster.springqueries.dtos.ModelSpeedHdDto(p.model, p.speed, p.hd) " +
            "FROM pcs p " +
            "WHERE p.cd IN :cds AND p.price < :price")
    List<ModelSpeedHdDto> findModelSpeedAndHdDtosByCdAndPriceLessThan(@Param("cds") List<String> cds, @Param("price") double price);


}

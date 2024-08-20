package kg.booster.springqueries.repository;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

 @Query(value = "SELECT distinct maker from products where type=:type",nativeQuery = true)
 List<String>findByType(String type);

//6 не работает
/* @Query( value = "SELECT Distinct p.* ,l.* from products p " +
         "join laptops l on p.model=l.model  where l.hd>=hd",nativeQuery = true)
 List<MakerSpeedDto>findDistincPmakerAndLspeedByHdLessEqualThan( int hd);*/

// 6 JPQL
// @Query( "SELECT DISTINCT  new kg.booster.springqueries.dtos.MakerSpeedDto (p.maker,l.speed)from products p " +
//         "join laptops l on p.model=l.model  where l.hd>=hd")
// List<MakerSpeedDto>findDistincPmakerAndLspeedByHdLessEqualThan(@Param("hd") int hd);

// 6 native
 @Query(name = "Product.findDistincPmakerAndLspeedByHdLessEqualThan",nativeQuery = true)
 List<MakerSpeedDto>findDistincPmakerAndLspeedByHdLessEqualThan(@Param("hd") int hd);

}

package kg.booster.springqueries.repository;

import kg.booster.springqueries.models.Printer;
import kg.booster.springqueries.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepository extends JpaRepository<Printer,Long> {

    List<Printer>findAllByColor(char color);
}


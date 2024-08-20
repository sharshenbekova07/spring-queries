package kg.booster.springqueries.service;

import kg.booster.springqueries.models.Printer;

import java.util.List;

public interface PrinterService {
    List<Printer> findAllByColor(char color);
}

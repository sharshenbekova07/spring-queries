package kg.booster.springqueries.service.impl;

import kg.booster.springqueries.models.Printer;
import kg.booster.springqueries.repository.PrinterRepository;
import kg.booster.springqueries.service.PrinterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PrinterServiceImpl implements PrinterService {

    private  final PrinterRepository printerRepository;
    @Override
    public List<Printer> findAllByColor(char color) {
        return printerRepository.findAllByColor(color);
    }
}

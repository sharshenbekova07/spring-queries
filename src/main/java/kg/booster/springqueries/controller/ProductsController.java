package kg.booster.springqueries.controller;

import kg.booster.springqueries.dtos.MakerSpeedDto;
import kg.booster.springqueries.dtos.ModelRamScreenDto;
import kg.booster.springqueries.dtos.ModelSpeedHdDto;
import kg.booster.springqueries.models.Printer;
import kg.booster.springqueries.models.Product;
import kg.booster.springqueries.service.LaptopService;
import kg.booster.springqueries.service.PcService;
import kg.booster.springqueries.service.PrinterService;
import kg.booster.springqueries.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductsController {

    private final ProductService productService;
    private final PrinterService printerService;
    private final PcService pcService;
    private final LaptopService laptopService;

    @GetMapping("/1/{price}")
    public List<ModelSpeedHdDto> getModelSpeedHdByPriceLessThan(@PathVariable double price) {
        return pcService.findModelAndSpeedAndHdByPriceLessThan(price);
    }

    @GetMapping("/2/{type}")
    public List<String> findMakerByType(@PathVariable String type) {

        return productService.findByType(type);
    }

    @GetMapping("/3/{price}")
    public List<ModelRamScreenDto> getModelRamScreenDtosByPriceMoreThan(@PathVariable double price) {
        return laptopService.findModelRamAndScreenDtosByPriceMoreThan(price);

    }

    @GetMapping("/4/{color}")
    public List<Printer> getAllByColor(@PathVariable char color) {
        return printerService.findAllByColor(color);
    }

    @GetMapping("/5")
    public List<ModelSpeedHdDto> getModelSpeedAndHDtosdByCdBetween12And14AndPriceLessThan(@RequestParam List<String> cds,
                                                                                          @RequestParam double price) {
        return pcService.findModelSpeedAndHdDtosByCdAndPriceLessThan(cds, price);
    }

    @GetMapping("/6")
    public List<MakerSpeedDto> getPmakerLspeedByHdGraterEqualThan(@RequestParam int hd) {
        return productService.findDistincPmakerAndLspeedByHdLessEqualThan(hd);
    }


    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.findAll();
    }

}

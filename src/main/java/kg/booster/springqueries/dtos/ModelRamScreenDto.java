package kg.booster.springqueries.dtos;

public class ModelRamScreenDto {

    private String model;

    private int ram;

    private  int screen;

    public ModelRamScreenDto(String model, int ram, int screen) {
        this.model = model;
        this.ram = ram;
        this.screen = screen;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }
}

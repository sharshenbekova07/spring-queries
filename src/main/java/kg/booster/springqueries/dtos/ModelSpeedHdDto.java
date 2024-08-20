package kg.booster.springqueries.dtos;




public class ModelSpeedHdDto {

    private String model;

    private int speed;

    private int hd;

    public ModelSpeedHdDto(String model, int speed, int hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "ModelSpeedHdDto{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", hd=" + hd +
                '}';
    }
}

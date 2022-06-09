import java.util.Locale;

public class car {

    public int Check_number_of_tyres(String mname){

        mname = ModelName.toLowerCase();

        if(mname.equals("ciaz")) {
            return 4;
        }else {
            return -1;
        }



    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    private String Model;
    private int numberOfWheels;
    public String ModelName;
    private String Color;




}

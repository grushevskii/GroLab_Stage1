package JavaClasses;

import java.awt.*;

public class Cars {
    private Make make;
    private String model;
    private int yearOfIssue;
    private Color color;
    private int price;
    private String regNumber;

    public Cars(Make make,String model, int yearOfIssue, Color color, int price, String regNumber){
        this.make = make;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("{");
        builder.append(" Марка: ").append(make);
        builder.append(", Модель: ").append(model);
        builder.append(", Год выпуска: ").append(yearOfIssue);
        builder.append(", Регистрационный номер: ").append(regNumber);
        builder.append(", Цена= ").append(price);
        builder.append('}');
        return builder.toString();
    }
    public void setBrand(Make make){
        this.make = make;
    }

    public Make getMake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {return model;}

    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;}

    public void  setPrice(int price){
        this.price = price;
    }

    public long getPrice(){
        return price;
    }

    public void setRegNumber(String regMark){
        this.regNumber  = regNumber;
    }

    public String getRegNumber(){
        return regNumber;
    }


}

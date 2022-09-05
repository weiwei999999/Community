package csu.train.community.views;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class househeader {

    private final StringProperty dishId;
    private final StringProperty dishName;
    private final StringProperty imagePath;
    private final DoubleProperty price;

    public househeader() {
        this(null,null,null,null);
    }

    public househeader(String id, String name, String imagePath, Double price) {
        this.dishId = new SimpleStringProperty(id);
        this.dishName = new SimpleStringProperty(name);
        this.imagePath = new SimpleStringProperty(imagePath);
        this.price = new SimpleDoubleProperty(price);
    }

    public String getDishId() {
        return dishId.get();
    }

    public StringProperty dishIdProperty() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId.set(dishId);
    }

    public String getDishName() {
        return dishName.get();
    }

    public StringProperty dishNameProperty() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName.set(dishName);
    }

    public String getImagePath() {
        return imagePath.get();
    }

    public StringProperty imagePathProperty() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath.set(imagePath);
    }

    public double getPrice() {
        return price.get();
    }

    public DoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }
}

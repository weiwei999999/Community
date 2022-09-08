package csu.train.community.views;

import javafx.beans.property.*;

public class househeader {

    private final StringProperty name;
    private final StringProperty sex;
    private final StringProperty address;
    private final IntegerProperty age;
    private final StringProperty phone;
    private final StringProperty job;

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSex() {
        return sex.get();
    }

    public StringProperty sexProperty() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex.set(sex);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getJob() {
        return job.get();
    }

    public StringProperty jobProperty() {
        return job;
    }

    public void setJob(String job) {
        this.job.set(job);
    }



    public househeader() {
        this(null, null, null, null, null, null);
    }

    public househeader(String name, String sex, String address, Integer age, String phone, String job) {
        this.name = new SimpleStringProperty(name);
        this.sex = new SimpleStringProperty(sex);
        this.age = new SimpleIntegerProperty(age);
        this.phone = new SimpleStringProperty(phone);
        this.job = new SimpleStringProperty(job);
        this.address = new SimpleStringProperty(address);
    }
}


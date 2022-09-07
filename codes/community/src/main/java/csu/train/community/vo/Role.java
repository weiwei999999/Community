package csu.train.community.vo;

import csu.train.community.views.Checkbox;
import javafx.scene.control.CheckBox;

//数据库每一行数据都会分装成一个Role对象
public class Role {


    //建立数据
    public Checkbox cb = new Checkbox();
    public Checkbox cb2 = new Checkbox();
    private int id;
    private String mailBox;
    private int service_situation;
    private String service_content;
    private int receive_content;
    private int receive_covid_content;
    private String name;
    private String address;
    private CheckBox shiwu;
    private int waidi;
    private String waidiplace;
    private String waiditime;
    private  String waidilast;
    private String waidigrade;

    public Role() { }

    public Role(int id, String mailBox, int service_situation, String service_content, int receive_content, int receive_covid_content,String address,String name,int shiwu,int waidi,String waidiplace,String waidigrade,String waidilast,String waiditime) {
        this.id = id;
        this.mailBox = mailBox;
        this.service_situation = service_situation;
        this.service_content = service_content;
        this.receive_content = receive_content;
        this.receive_covid_content = receive_covid_content;
        this.address=address;
        this.name=name;
        this.waidi=waidi;
        this.waidilast=waidilast;
        this.waidigrade=waidigrade;
        this.waiditime=waiditime;
        this.waidiplace=waidiplace;
    }

    public int getId() {
        return id;
    }

    public String getMailBox() {
        return mailBox;
    }

    public int getService_situation() {
        return service_situation;
    }

    public String getService_content() {
        return service_content;
    }

    public int getReceive_content() {
        return receive_content;
    }

    public int getReceive_covid_content() {
        return receive_covid_content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    public void setService_situation(int service_situation) {
        this.service_situation = service_situation;
    }

    public void setService_content(String service_content) {
        this.service_content = service_content;
    }

    public void setReceive_content(int receive_content) {
        this.receive_content = receive_content;
    }

    public void setReceive_covid_content(int receive_covid_content) {
        this.receive_covid_content = receive_covid_content;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CheckBox getShiwu() {
        return shiwu;
    }

    public void setShiwu(CheckBox shiwu) {
        this.shiwu = shiwu;
    }
    public Checkbox getCheckbox() {
        return cb;
    }

    public void setCheckbox(Checkbox cb) {
        this.cb = cb;
    }
    public Checkbox getCheckbox2() {
        return cb2;
    }

    public void setCheckbox2(Checkbox cb2) {
        this.cb2 = cb2;
    }
    public int getWaidi() {
        return waidi;
    }

    public void setWaidi(int waidi) {
        this.waidi = waidi;
    }

    public String getWaidiplace() {
        return waidiplace;
    }

    public void setWaidiplace(String waidiplace) {
        this.waidiplace = waidiplace;
    }

    public String getWaiditime() {
        return waiditime;
    }

    public void setWaiditime(String waiditime) {
        this.waiditime = waiditime;
    }

    public String getWaidilast() {
        return waidilast;
    }

    public void setWaidilast(String waidilast) {
        this.waidilast = waidilast;
    }

    public String getWaidigrade() {
        return waidigrade;
    }

    public void setWaidigrade(String waidigrade) {
        this.waidigrade = waidigrade;
    }
}

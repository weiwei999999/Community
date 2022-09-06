package csu.train.community.views;

import javafx.beans.property.*;

public class check {
    private final StringProperty name;
    private final StringProperty waittime;
    private final StringProperty shenqingwu;
    private final StringProperty refusereason;
    private final DoubleProperty zhuangtai;
    public check()
    {this(null,null,null,null,null);}


    public check(String name,String waittime,String shenqingwu,String refusereason,Double zhuangtai)
    {
        this.name= new SimpleStringProperty(name);
        this.shenqingwu=new SimpleStringProperty(shenqingwu);
        this.refusereason=new SimpleStringProperty(refusereason);
        this.zhuangtai=new  SimpleDoubleProperty(zhuangtai);
        this.waittime=new SimpleStringProperty(waittime);

    }
    public String getWaittime() {
        return waittime.get();
    }

    public StringProperty waittimeProperty() {
        return waittime;
    }

    public void setWaittime(String waittime) {
        this.waittime.set(waittime);
    }
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getShenqingwu() {
        return shenqingwu.get();
    }

    public StringProperty shenqingwuProperty() {
        return shenqingwu;
    }

    public void setShenqingwu(String shenqingwu) {
        this.shenqingwu.set(shenqingwu);
    }

    public String getRefusereaon() {
        return refusereason.get();
    }

    public StringProperty refusereaonProperty() {
        return refusereason;
    }

    public void setRefusereaon(String refusereaon) {
        this.refusereason.set(refusereaon);
    }

    public double getZhuangtai() {
        return zhuangtai.get();
    }

    public DoubleProperty zhuangtaiProperty() {
        return zhuangtai;
    }

    public void setZhuangtai(double zhuangtai) {
        this.zhuangtai.set(zhuangtai);
    }



}

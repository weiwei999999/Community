package csu.train.community.vo;

//数据库每一行数据都会分装成一个Role对象
public class Role {
    //建立数据
    private int id;
    private String mailBox;
    private int service_situation;
    private String service_content;
    private int receive_content;
    private int receive_covid_content;

    public Role() { }

    public Role(int id, String mailBox, int service_situation, String service_content, int receive_content, int receive_covid_content) {
        this.id = id;
        this.mailBox = mailBox;
        this.service_situation = service_situation;
        this.service_content = service_content;
        this.receive_content = receive_content;
        this.receive_covid_content = receive_covid_content;
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
}

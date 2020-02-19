package reactor_rest_api.models;

public class Reactor {
    private String name;
    private String mail;
    private String phoneNumber;

    public Reactor(String name, String mail, String phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

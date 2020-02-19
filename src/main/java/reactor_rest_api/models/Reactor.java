package reactor_rest_api.models;

import java.io.*;

public class Reactor {
    private String name;
    private String mail;
    private String phoneNumber;

    public Reactor(String name, String mail, String phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public static Reactor fromCSV(File csvFile) {
        Reactor reactor = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            String line = bufferedReader.readLine();
            if (line != null) {
                String[] data = line.split(",");
                reactor = new Reactor(data[0], data[1], data[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reactor;
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

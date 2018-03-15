package model;

public class MahasiswaModel {
    private String nim;
    private String name;
    private String address;

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

package com.example.jWTAuth.jwtAuth.model;

public class Player {
    private int id;
    private String name;

    private String gender;

    private Long contactNo;
    private String gameType;

    public Player(int id, String name,String gameType, String gender, Long contactNo) {
        this.id = id;
        this.name = name;
        this.gameType = gameType;
        this.gender = gender;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }


    @Override
    public String toString() {
        return "StudentController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + gameType +
                ", marks=" + contactNo +
                ", marks=" + gender +
                '}';
    }
}

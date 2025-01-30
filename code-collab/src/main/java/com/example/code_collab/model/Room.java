package com.example.code_collab.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {
    @Id
    private String id;
    private String roomId;
    private String code;

    // Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRoomId(String roomId) {
    }

    public String getRoomId() {
        return roomId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
package com.example.code_collab.model;

public class Room {
    private String roomId;
    private String code;

    public Room() {}

    public Room(String roomId, String code) {
        this.roomId = roomId;
        this.code = code;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

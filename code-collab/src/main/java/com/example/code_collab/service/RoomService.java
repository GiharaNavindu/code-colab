package com.example.code_collab.service;

import com.example.code_collab.model.Room;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private final Map<String, Room> roomMap = new HashMap<>();

    public Room createRoom(String roomId) {
        Room room = new Room(roomId, ""); // Initialize with empty code
        roomMap.put(roomId, room);
        return room;
    }

    public Room getRoom(String roomId) {
        return roomMap.get(roomId);
    }

    public Room updateRoom(String roomId, Room updatedRoom) {
        if (roomMap.containsKey(roomId)) {
            roomMap.put(roomId, updatedRoom);
            return updatedRoom;
        }
        return null;
    }

    public void deleteRoom(String roomId) {
        roomMap.remove(roomId);
    }

    public List<Room> getAllRooms() {
        return roomMap.values().stream().collect(Collectors.toList());
    }
}

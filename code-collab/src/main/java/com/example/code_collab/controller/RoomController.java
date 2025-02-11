package com.example.code_collab.controller;

import com.example.code_collab.model.Room;
import com.example.code_collab.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // Create a new room
    @PostMapping("/create")
    public Room createRoom(@RequestParam String roomId) {
        return roomService.createRoom(roomId);
    }

    // Get details of a specific room
    @GetMapping("/get")
    public Room getRoom(@RequestParam String roomId) {
        return roomService.getRoom(roomId);
    }

    // Update room details (e.g., code content, participants)
    @PutMapping("/update")
    public Room updateRoom(@RequestParam String roomId, @RequestBody Room updatedRoom) {
        return roomService.updateRoom(roomId, updatedRoom);
    }

    // Delete a room
    @DeleteMapping("/delete")
    public String deleteRoom(@RequestParam String roomId) {
        roomService.deleteRoom(roomId);
        return "Room deleted successfully!";
    }

    // Get all rooms
    @GetMapping("/all")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}

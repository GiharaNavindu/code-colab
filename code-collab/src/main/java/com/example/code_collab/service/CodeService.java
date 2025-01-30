package com.example.code_collab.service;



import com.example.code_collab.model.Room;
import com.example.code_collab.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {

    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(String roomId) {
        Room room = new Room();
        room.setRoomId(roomId);
        room.setCode(""); // Initialize with empty code
        return roomRepository.save(room);
    }

    public Room getRoom(String roomId) {
        return roomRepository.findByRoomId(roomId);
    }

    public Room updateCode(String roomId, String code) {
        Room room = roomRepository.findByRoomId(roomId);
        room.setCode(code);
        return roomRepository.save(room);
    }
}
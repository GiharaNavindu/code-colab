package com.example.code_collab.repository;



import com.example.code_collab.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    Room findByRoomId(String roomId);
}
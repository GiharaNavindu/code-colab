package com.example.code_collab.controller;


import com.example.code_collab.model.Room;
import com.example.code_collab.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/code")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @PostMapping("/create")
    public Room createRoom(@RequestParam String roomId) {
        return codeService.createRoom(roomId);
    }

    @GetMapping("/get")
    public Room getRoom(@RequestParam String roomId) {
        return codeService.getRoom(roomId);
    }

    @PostMapping("/update")
    public Room updateCode(@RequestParam String roomId, @RequestBody String code) {
        return codeService.updateCode(roomId, code);
    }
}
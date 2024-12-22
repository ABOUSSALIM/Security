package ma.chatApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/chat")
public class ChatController {

    @GetMapping
    public ResponseEntity<String> message(){
        return ResponseEntity.ok("Sallam laachran");
    }
}

package ma.chatApp.controllers;

import lombok.RequiredArgsConstructor;
import ma.chatApp.entities.AuthenticationRequest;
import ma.chatApp.entities.AuthenticationResponse;
import ma.chatApp.entities.RegisterRequest;
import ma.chatApp.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class AuthentificationController {

    private final AuthService authService;

    @PostMapping("/regist")
    public ResponseEntity<AuthenticationResponse> register1(@RequestBody RegisterRequest request){
    return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/auth")
    public ResponseEntity<AuthenticationResponse> register2(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authService.authenticate(request));
    }

}

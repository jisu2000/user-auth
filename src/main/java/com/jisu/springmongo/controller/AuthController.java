package com.jisu.springmongo.controller;import com.jisu.springmongo.dto.request.LoginRequest;import com.jisu.springmongo.dto.request.UserRequestDTO;import com.jisu.springmongo.service.AuthService;import com.jisu.springmongo.service.UserService;import lombok.RequiredArgsConstructor;import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;@RestController@RequiredArgsConstructor@RequestMapping("/api/v1/auth")public class AuthController {    private final AuthService authService;    @PostMapping("/register")    public ResponseEntity<?> register(@RequestBody UserRequestDTO user) {        return  new ResponseEntity<>(authService.registerUser(user), HttpStatus.CREATED);    }    @PostMapping("/login")    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){        return new ResponseEntity<>(authService.login(loginRequest),HttpStatus.OK);    }}
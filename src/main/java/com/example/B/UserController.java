package com.example.B;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

   private  final UserDTO userDTO;
   public UserController(UserDTO userDTO) { this.userDTO = userDTO; }

    @GetMapping("/user1")
    public UserDTO user1() {
    userDTO.setName("Ali");
    userDTO.setSurname("Akın");
    userDTO.setGender("Male");
    userDTO.setAddress("İstanbul");
    return userDTO;
    }
    @GetMapping("/user2")
    public UserDTO user2() {
        userDTO.setName("Esma");
        userDTO.setSurname("Akın");
        userDTO.setGender("Female");
        userDTO.setAddress("İzmir");
        return userDTO;
    }

}

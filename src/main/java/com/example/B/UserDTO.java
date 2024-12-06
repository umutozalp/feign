package com.example.B;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String Name;
    private String Surname;
    private String Gender;
    private String Address;
}
 
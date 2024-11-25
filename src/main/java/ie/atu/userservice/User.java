package ie.atu.userservice;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean isActive;
}

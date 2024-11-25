package ie.atu.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
    public class UserController {

        @Autowired
        private UserService userService;


        @PostMapping
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }


        @PutMapping("/{userId}")
        public User updateUser(@PathVariable String userId, @RequestBody User updatedUser) {
            return userService.updateUser(userId, updatedUser);
        }


        @GetMapping("/{userId}")
        public User getUserById(@PathVariable String userId) {
            return userService.getUserById(userId);
        }

        @DeleteMapping("/{userId}")
        public void deactivateUser(@PathVariable String userId) {
            userService.deactivateUser(userId);
        }


        @PostMapping("/authenticate")
        public User authenticate(@RequestParam String email, @RequestParam String password) {
            return userService.authenticate(email, password);
        }
    }



package danekerscode.quizbackend.controller;

import danekerscode.quizbackend.model.User;
import danekerscode.quizbackend.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void delete(
            @PathVariable Integer id
    ) {
        userService.deleteById(id);
    }

    @GetMapping("all")
    ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PatchMapping("update/{id}")
    @ApiResponses(value = {
            @ApiResponse(content = @Content(mediaType = "application/json" , schema = @Schema(implementation = User.class)))
    })
    ResponseEntity<?> update(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(userService.update(id, name, surname));
    }

    @GetMapping("{id}")
    @ApiResponses(value = {
            @ApiResponse(content = @Content(mediaType = "application/json" , schema = @Schema(implementation = AllUsersResponse.class)))
})
    ResponseEntity<?> getById(
            @PathVariable Integer id
    ){
        return ResponseEntity.ok(userService.getById(id));
    }

    public record AllUsersResponse(
            List<User> users
    ) {
    }
}

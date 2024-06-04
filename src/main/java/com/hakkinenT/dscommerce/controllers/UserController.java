package com.hakkinenT.dscommerce.controllers;

import com.hakkinenT.dscommerce.dto.UserDTO;
import com.hakkinenT.dscommerce.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@Tag(name = "Users", description = "Controller for User")
public class UserController {
    @Autowired
    private UserService service;

    @Operation(
            description = "Get logged user information",
            summary = "Get logged user information",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200"),
                    @ApiResponse(description = "Unauthorized", responseCode = "401"),
                    @ApiResponse(description = "Forbidden", responseCode = "403")
            }
    )
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping(value = "/me", produces = "application/json")
    public ResponseEntity<UserDTO> getMe(){
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }
}

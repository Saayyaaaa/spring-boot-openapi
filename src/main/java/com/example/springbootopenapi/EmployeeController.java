package com.example.springbootopenapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Operation(summary = "Get All Employees", description = "Returns a list of all employees.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of employees returned successfully"),
            @ApiResponse(responseCode = "204", description = "No employees found")
    })
    @GetMapping("/employees")
    public List<String> getAllEmployees() {
        return List.of("Saya", "Ali", "Ajar");
    }

//    Swagger UI: http://localhost:8080/swagger-ui.html
//    API Docs (JSON): http://localhost:8080/v3/api-docs
//    API Docs (YAML): http://localhost:8080/v3/api-docs.yaml
}

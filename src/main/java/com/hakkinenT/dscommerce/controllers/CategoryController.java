package com.hakkinenT.dscommerce.controllers;

import com.hakkinenT.dscommerce.dto.CategoryDTO;
import com.hakkinenT.dscommerce.dto.ProductDTO;
import com.hakkinenT.dscommerce.dto.ProductMinDTO;
import com.hakkinenT.dscommerce.services.CategoryService;
import com.hakkinenT.dscommerce.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
@Tag(name = "Categories", description = "Controller for Category of a Product")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @Operation(
            description = "Get all categories",
            summary = "List all categories",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200")
            }
    )
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CategoryDTO>> findAll(){
        List<CategoryDTO> dto = categoryService.findAll();
        return ResponseEntity.ok(dto);
    }


}

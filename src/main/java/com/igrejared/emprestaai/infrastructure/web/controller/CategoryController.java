package com.igrejared.emprestaai.infrastructure.web.controller;

import com.igrejared.emprestaai.application.usecases.CategoryUseCase;
import com.igrejared.emprestaai.domain.dtos.request.CategoryRequestDto;
import com.igrejared.emprestaai.domain.dtos.response.CategoryResponseDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryUseCase useCase;

    public CategoryController(CategoryUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponseDto>> findAll() {
        log.info("GET /categories");
        return ResponseEntity.ok(useCase.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> saveCategory(
            @Valid @RequestBody CategoryRequestDto dto) {
        return ResponseEntity.ok().build();
    }
}

package com.igrejared.emprestaai.application.usecases;

import com.igrejared.emprestaai.application.gateways.CategoryRepository;
import com.igrejared.emprestaai.domain.dtos.request.CategoryRequestDto;
import com.igrejared.emprestaai.domain.dtos.response.CategoryResponseDto;
import com.igrejared.emprestaai.domain.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryUseCase {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryUseCase(CategoryRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<CategoryResponseDto> findAll() {
        return this.repository.findAll().stream()
                .map(mapper::mapToResponseDto)
                .toList();
    }

    public void save(CategoryRequestDto dto) {
        var category = mapper.mapToDomain(dto);
        this.repository.save(category);
    }

    public void update(Long id, CategoryRequestDto dto) {
        // TODO : Validations
        // this.repository.update(id, dto);
    }

    public void delete(Long id) {
        // TODO : Validations
        //  this.repository.delete(id);
    }
}

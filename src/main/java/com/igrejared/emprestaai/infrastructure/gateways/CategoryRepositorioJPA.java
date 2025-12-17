package com.igrejared.emprestaai.infrastructure.gateways;

import com.igrejared.emprestaai.application.gateways.CategoryRepository;
import com.igrejared.emprestaai.domain.mapper.CategoryMapper;
import com.igrejared.emprestaai.domain.model.Category;
import com.igrejared.emprestaai.infrastructure.persistence.repository.CategoryEntityRepositoryJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositorioJPA implements CategoryRepository {

    private final CategoryEntityRepositoryJPA repository;
    private final CategoryMapper mapper;

    public CategoryRepositorioJPA(CategoryEntityRepositoryJPA repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Category> findAll() {
        return this.repository.findAll().stream()
                .map(mapper::mapToDomain)
                .toList();
    }

    @Override
    public String save(Category category) {
        return this.repository.save(mapper.mapToEntity(category)).getId().toString();
    }

    @Override
    public void update(Long id, Category category) {

    }

    @Override
    public void delete(Long id) {

    }
}

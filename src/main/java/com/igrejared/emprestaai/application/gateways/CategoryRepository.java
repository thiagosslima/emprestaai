package com.igrejared.emprestaai.application.gateways;

import com.igrejared.emprestaai.domain.model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();

    String save(Category category);

    void update(Long id, Category category);

    void delete(Long id);
}

package com.igrejared.emprestaai.application.gateways;

import com.igrejared.emprestaai.domain.dtos.request.CategoryRequestDto;
import com.igrejared.emprestaai.domain.dtos.response.CategoryResponseDto;
import com.igrejared.emprestaai.domain.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryRepository {
    List<Category> findAll();

    void save(Category category);

    void update(Long id, Category category);

    void delete(Long id);
}

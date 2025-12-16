package com.igrejared.emprestaai.domain.mapper;

import com.igrejared.emprestaai.domain.dtos.request.CategoryRequestDto;
import com.igrejared.emprestaai.domain.dtos.response.CategoryResponseDto;
import com.igrejared.emprestaai.domain.model.Category;
import com.igrejared.emprestaai.infrastructure.persistence.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    CategoryEntity mapToEntity(Category domain);

    Category mapToDomain(CategoryEntity entity);

    Category mapToDomain(CategoryRequestDto request);

    CategoryResponseDto mapToResponseDto(Category response);
}

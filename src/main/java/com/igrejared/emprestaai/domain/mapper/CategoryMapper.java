package com.igrejared.emprestaai.domain.mapper;

import com.igrejared.emprestaai.domain.dtos.request.CategoryRequestDto;
import com.igrejared.emprestaai.domain.dtos.response.CategoryResponseDto;
import com.igrejared.emprestaai.domain.model.Category;
import com.igrejared.emprestaai.domain.valueobject.CategoryId;
import com.igrejared.emprestaai.infrastructure.persistence.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.UUID;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    CategoryEntity mapToEntity(Category domain);

    Category mapToDomain(CategoryEntity entity);

    Category mapToDomain(CategoryRequestDto request);

    CategoryResponseDto mapToResponseDto(Category response);

    default CategoryId map(UUID id) {
        return id != null ? new CategoryId(id) : null;
    }

    default UUID map(CategoryId id) {
        return id != null ? id.value() : null;
    }
}

package com.aitorleria.springhexagonal.common;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    List<T> content;
    CustomPageable pageable;

    public Page(org.springframework.data.domain.Page<T> page) {
        this.content = page.getContent();
        this.pageable = new CustomPageable(page.getPageable().getPageNumber(),
                page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    @Data
    class CustomPageable {
        int page;
        int size;
        long totalElements;
        long totalPages;

        public CustomPageable(int pageNumber, int pageSize, long totalElements, long totalPages) {
            this.page = pageNumber;
            this.size = pageSize;
            this.totalElements = totalElements;
            this.totalPages = totalPages;
        }
    }
}
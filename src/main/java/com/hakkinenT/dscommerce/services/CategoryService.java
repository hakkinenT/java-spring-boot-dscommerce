package com.hakkinenT.dscommerce.services;

import com.hakkinenT.dscommerce.dto.CategoryDTO;
import com.hakkinenT.dscommerce.dto.ProductDTO;
import com.hakkinenT.dscommerce.dto.ProductMinDTO;
import com.hakkinenT.dscommerce.entities.Category;
import com.hakkinenT.dscommerce.entities.Product;
import com.hakkinenT.dscommerce.repositories.CategoryRepository;
import com.hakkinenT.dscommerce.repositories.ProductRepository;
import com.hakkinenT.dscommerce.services.exceptions.DatabaseException;
import com.hakkinenT.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> result = repository.findAll();

        return result.stream().map(category -> new CategoryDTO(category)).toList();
    }


}

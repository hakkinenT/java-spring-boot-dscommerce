package com.hakkinenT.dscommerce.repositories;

import com.hakkinenT.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

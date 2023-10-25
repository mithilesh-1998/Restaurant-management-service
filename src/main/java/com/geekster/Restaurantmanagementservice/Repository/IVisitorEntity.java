package com.geekster.Restaurantmanagementservice.Repository;

import com.geekster.Restaurantmanagementservice.Model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitorEntity extends JpaRepository<Visitor,Long> {
}

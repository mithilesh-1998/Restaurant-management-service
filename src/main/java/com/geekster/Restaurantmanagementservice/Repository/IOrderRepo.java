package com.geekster.Restaurantmanagementservice.Repository;

import com.geekster.Restaurantmanagementservice.Model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<OrderEntity,Long> {
}

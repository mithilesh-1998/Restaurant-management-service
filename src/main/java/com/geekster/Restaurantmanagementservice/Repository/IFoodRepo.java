package com.geekster.Restaurantmanagementservice.Repository;

import com.geekster.Restaurantmanagementservice.Model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {
}

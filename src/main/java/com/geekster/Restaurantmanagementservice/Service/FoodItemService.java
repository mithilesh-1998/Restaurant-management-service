package com.geekster.Restaurantmanagementservice.Service;

import com.geekster.Restaurantmanagementservice.Model.FoodItem;
import com.geekster.Restaurantmanagementservice.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodRepo ifoodrepo;
    public List<FoodItem> getall() {
        return ifoodrepo.findAll();

    }
}

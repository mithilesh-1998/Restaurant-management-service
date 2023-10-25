package com.geekster.Restaurantmanagementservice.Repository;

import com.geekster.Restaurantmanagementservice.Model.Admin;
import com.geekster.Restaurantmanagementservice.Model.AuthenticationToken;
import com.geekster.Restaurantmanagementservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

    AuthenticationToken findFirstByAdmin(Admin admin);
}

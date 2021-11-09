package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
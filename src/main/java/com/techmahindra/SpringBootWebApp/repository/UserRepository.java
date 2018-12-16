package com.techmahindra.SpringBootWebApp.repository;

import com.techmahindra.SpringBootWebApp.Domain.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Anurag Mishra on 10-12-2018.
 */

@Repository
public interface UserRepository extends CrudRepository<UserDetails,Long> {
}

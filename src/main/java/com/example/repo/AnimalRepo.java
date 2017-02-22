package com.example.repo;

import com.example.data.Animal;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jasonskipper on 2/22/17.
 */
public interface AnimalRepo extends PagingAndSortingRepository<Animal, Long> {
}

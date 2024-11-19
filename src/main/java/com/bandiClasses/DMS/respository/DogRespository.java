package com.bandiClasses.DMS.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRespository extends CrudRepository <Dog, Integer>{
	 

	List<Dog> findByName(String name);

}

package org.example.customermanagement.repository;

import org.example.customermanagement.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
}

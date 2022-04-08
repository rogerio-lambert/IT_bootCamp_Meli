package com.meli.bootcamp.modulo6.pratica1storageimplementationii.repository;

import com.meli.bootcamp.modulo6.pratica1storageimplementationii.entity.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewelryRepository extends JpaRepository<Jewelry, Integer> {
}

package com.mynotes.spring.cloud.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mynotes.spring.cloud.service.Offers;


@Repository
public interface OffersRepository extends JpaRepository<Offers, Integer> {

}

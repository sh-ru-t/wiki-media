package com.indium.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indium.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}

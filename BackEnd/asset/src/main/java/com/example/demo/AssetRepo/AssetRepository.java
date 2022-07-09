package com.example.demo.AssetRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Asset;
@Service

public interface AssetRepository extends JpaRepository<Asset,Long> {

}

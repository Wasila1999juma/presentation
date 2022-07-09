package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AssetRepo.AssetRepository;
import com.example.demo.model.Asset;

@Service

public class AssetServiceimplement implements AssetService {
	
	@Autowired private AssetRepository AssetRepo;

	@Override
	public void saveAsset(Asset asset) {
		this.AssetRepo.save(asset);
		
	}

}

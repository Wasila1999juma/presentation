package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Asset> getallAsset() {
		// TODO Auto-generated method stub
		return AssetRepo.findAll();
	}

	@Override
	public void delet(long id) {
		this.AssetRepo.deleteById(id);
		
	}

	@Override
	public void save(Asset asset) {
		// TODO Auto-generated method stub
		this.AssetRepo.save(asset);
		
	}

	@Override
	public Optional<Asset> findId(long id) {
		// TODO Auto-generated method stub
		return AssetRepo.findById(id);
	}

}

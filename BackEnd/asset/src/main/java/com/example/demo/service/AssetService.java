package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Asset;

public interface AssetService {
	void saveAsset(Asset asset);
	List <Asset> getallAsset();
	
	
	//delete function//
	
	void delet(long id);
	
	//update//
	void save(Asset asset);
	
	
	Optional<Asset> findId(long id);
	

}

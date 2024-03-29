package com.fullstack.Backend.services;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fullstack.Backend.entities.Ram;
import com.fullstack.Backend.utils.dropdowns.RamList;

public interface IRamService {
	public CompletableFuture<Ram> findBySize(String size);
	public CompletableFuture<Boolean> doesRamExist(int id);
	public CompletableFuture<List<String>> getRamList();

	public CompletableFuture<List<RamList>> fetchRams();
}

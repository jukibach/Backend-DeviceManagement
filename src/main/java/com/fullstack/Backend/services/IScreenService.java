package com.fullstack.Backend.services;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.fullstack.Backend.entities.Screen;
import com.fullstack.Backend.utils.dropdowns.ScreenList;

public interface IScreenService {
	public CompletableFuture<Screen> findBySize(String size);
	public CompletableFuture<Boolean> doesScreenExist(int id);

	public CompletableFuture<List<String>> getScreenList();

	public CompletableFuture<List<ScreenList>> fetchScreen();
}

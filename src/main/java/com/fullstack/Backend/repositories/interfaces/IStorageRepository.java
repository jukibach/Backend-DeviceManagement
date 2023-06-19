package com.fullstack.Backend.repositories.interfaces;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fullstack.Backend.entities.Storage;
import com.fullstack.Backend.utils.dropdowns.StorageList;

public interface IStorageRepository extends JpaRepository<Storage, Long> {
	public static final String FIND_STORAGE_SIZES = "SELECT size FROM Storage";
	public static final String FIND_STORAGE = "SELECT s FROM Storage s WHERE size = :size";
	public static final String FETCH_STORAGE = "SELECT Id, size FROM Storage";

	@Query(value = FIND_STORAGE_SIZES, nativeQuery = true)
	public List<String> findStorageSize();
	
	@Query(value = FIND_STORAGE, nativeQuery = true)
	public Storage findBySize(int size);
	
	@Query(value = FETCH_STORAGE, nativeQuery = true)
	public List<StorageList> fetchStorage();
}

package com.codeclan.example.filesfoldersrelationships.repositories;

import com.codeclan.example.filesfoldersrelationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}

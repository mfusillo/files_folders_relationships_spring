package com.codeclan.example.filesfoldersrelationships.components;

import com.codeclan.example.filesfoldersrelationships.models.File;
import com.codeclan.example.filesfoldersrelationships.models.Folder;
import com.codeclan.example.filesfoldersrelationships.models.User;
import com.codeclan.example.filesfoldersrelationships.repositories.FileRepository;
import com.codeclan.example.filesfoldersrelationships.repositories.FolderRepository;
import com.codeclan.example.filesfoldersrelationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

        @Autowired
        FileRepository fileRepository;

        @Autowired
        FolderRepository folderRepository;

        @Autowired
        UserRepository userRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args){
            User matteo = new User("matteo");
            userRepository.save(matteo);
            Folder pictures = new Folder("pictures", matteo);
            folderRepository.save(pictures);
            Folder documents = new Folder("documents", matteo);
            folderRepository.save(documents);
            File picture = new File("dog", "jpg", 100, pictures);
            fileRepository.save(picture);
            File picture2 = new File("cat", "png", 350, pictures);
            fileRepository.save(picture2);

            pictures.getFiles().add(picture);
            pictures.getFiles().add(picture2);
            folderRepository.save(pictures);

            matteo.getFolders().add(pictures);
            matteo.getFolders().add(documents);
            userRepository.save(matteo);

        }
    }

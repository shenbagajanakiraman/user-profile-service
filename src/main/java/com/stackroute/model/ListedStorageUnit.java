package com.stackroute.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


    @Document
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder


    public class ListedStorageUnit {

        @Id
        private String emailId;

        private String name;
        private String UUID;
        private String location;
        private int occupiedPartition;
        private int totalPartition;
    }

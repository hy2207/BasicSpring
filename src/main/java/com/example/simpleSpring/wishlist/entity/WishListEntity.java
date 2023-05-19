package com.example.simpleSpring.wishlist.entity;

import com.example.simpleSpring.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity {

    private String title;
    private String category;
    private String address;
    private String readAddress;
    private String homePageLink;
    private String imageLink;
    private Boolean isVisit;
    private int visitCount;
    private LocalDateTime lastVisitDate;


}

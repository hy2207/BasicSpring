package com.example.simpleSpring.wishlist.repository;

import com.example.simpleSpring.db.MemoryDbRepositoryAbstract;
import com.example.simpleSpring.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}

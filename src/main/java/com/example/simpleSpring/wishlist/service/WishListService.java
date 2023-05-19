package com.example.simpleSpring.wishlist.service;

import com.example.simpleSpring.naver.NaverClient;
import com.example.simpleSpring.naver.dto.SearchLocalReq;
import com.example.simpleSpring.wishlist.dto.WishListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final NaverClient naverClient;
    public WishListDto search(String query){
        //지역검색
        var searchLocalReq = new SearchLocalReq();
        searchLocalReq.setQuery(query);

        var searchLocalRes = naverClient.searchLocal(searchLocalReq);
        if (searchLocalRes.getTotal() > 0 ){
            //검색이 가능 할 때
            var localItem = searchLocalRes.getItems().stream().findFirst().get();

            //이미지 검색 --> 난 생략,,,
            var imageQuery = localItem.getTitle().replaceAll("<[^>]*>", ""); //정규식이용하여 검색에 특수문자열 제외

            //결과를 리턴
            var result = new WishListDto();
            result.setTitle(localItem.getTitle());
            result.setCategory(localItem.getCategory());
            result.setAddress(localItem.getAddress());
            result.setRoadAddress(localItem.getRoadAddress());
            result.setHomePageLink(localItem.getLink());
//            result.setImageLink(result);
            return result;
        }
        return new WishListDto();

    }
}

package com.example.simpleSpring.naver;

import com.example.simpleSpring.naver.dto.SearchLocalReq;
import com.example.simpleSpring.naver.dto.SearchLocalRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class NaverClient {
    @Value("${naver.client.id}") //application.yaml에서 불러오는 방법
    private String naverClientId;
    @Value("${naver.client.secret}")
    private String naverSecret;
    @Value("${naver.url.search.local}")
    private String naverLocalSearchUrl;
    @Value("${naver.url.search.image}")
    private String naverImageSearchUrl;

    public SearchLocalRes searchLocal(SearchLocalReq searchLocalReq){
        System.out.println("searchlocal 실행");
        var uri = UriComponentsBuilder.fromUriString(naverLocalSearchUrl)
                .queryParams(searchLocalReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();
        System.out.println("uriinfo" + uri);

        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id","aVOD1TqTt3Dd4Z_EUZGK");
        headers.set("X-Naver-Client-Secret","");
        headers.setContentType(MediaType.APPLICATION_JSON);

        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchLocalRes>(){};

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );

        return responseEntity.getBody();
    }

    public void searchImage(){ //생략

    }

}

package com.sbessential.sbessential.util;

import com.sbessential.sbessential.requests.AnimePostRequestBody;

public class AnimePostRequestBodyCreator {
    public static AnimePostRequestBody createAnimePostRequestBody(){
        return AnimePostRequestBody.builder().name(AnimeCreator.createAnimeToBeSaved().getName()).build();
    }
}

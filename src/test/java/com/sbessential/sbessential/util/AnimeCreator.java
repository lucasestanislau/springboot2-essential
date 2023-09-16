package com.sbessential.sbessential.util;

import com.sbessential.sbessential.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder().name("Hajime no ippo").build();
    }

    public static Anime createValidAnime(){
        return Anime.builder().name("Hajime no ippo").id(1L).build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder().name("Hajime no ippo").id(1L).build();
    }
}

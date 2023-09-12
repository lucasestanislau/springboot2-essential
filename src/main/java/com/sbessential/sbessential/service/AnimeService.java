package com.sbessential.sbessential.service;

import com.sbessential.sbessential.domain.Anime;
import com.sbessential.sbessential.exception.BadRequestException;
import com.sbessential.sbessential.mapper.AnimeMapper;
import com.sbessential.sbessential.repository.AnimeRepository;
import com.sbessential.sbessential.requests.AnimePostRequestBody;
import com.sbessential.sbessential.requests.AnimePutRequestBody;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {
    private final AnimeRepository animeRepository;
    public Page<Anime> listAll(Pageable pageable){
        return animeRepository.findAll(pageable);
    }

    public List<Anime> findByName(String name){
        return animeRepository.findByName(name);
    }

    @Transactional
    public Anime findByIdOrThrowBadRequestException(long id){
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not found"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody){
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id){
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody){
        findByIdOrThrowBadRequestException(animePutRequestBody.getId());

        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(animePutRequestBody.getId());

        animeRepository.save(anime);
    }

    public List<Anime> listAllNonPageable(Pageable pageable) {
        return animeRepository.findAll();
    }
}

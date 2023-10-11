package com.utn.TpApiRest.services;

import com.utn.TpApiRest.entities.Autor;
import com.utn.TpApiRest.repositories.AutorRepository;
import com.utn.TpApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);

    }
}

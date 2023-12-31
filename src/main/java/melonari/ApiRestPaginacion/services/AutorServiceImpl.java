package melonari.ApiRestPaginacion.services;

import melonari.ApiRestPaginacion.entities.Autor;
import melonari.ApiRestPaginacion.repositories.BaseRepository;
import melonari.ApiRestPaginacion.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}

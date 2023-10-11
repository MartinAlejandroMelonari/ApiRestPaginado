package melonari.ApiRestPaginacion.services;

import melonari.ApiRestPaginacion.entities.Localidad;
import melonari.ApiRestPaginacion.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}

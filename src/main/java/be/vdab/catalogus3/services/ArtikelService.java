package be.vdab.catalogus3.services;

import be.vdab.catalogus3.domain.Artikel;
import be.vdab.catalogus3.events.ArtikelGemaakt;
import be.vdab.catalogus3.repositories.ArtikelRepository;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ArtikelService {
    private final ArtikelRepository repository;
    private final AmqpTemplate template;

    public ArtikelService(ArtikelRepository repository, AmqpTemplate template) {
        this.repository = repository;
        this.template = template;
    }

    public void create(Artikel artikel) {
        repository.save(artikel);
        template.convertAndSend("catalogus", null, new ArtikelGemaakt(artikel));
    }
}

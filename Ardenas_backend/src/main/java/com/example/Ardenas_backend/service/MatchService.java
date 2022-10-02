package com.example.Ardenas_backend.service;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.DTO.PlayerDTO;
import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.model.Match;
import com.example.Ardenas_backend.model.Player;
import com.example.Ardenas_backend.repository.MatchRepository;
import com.example.Ardenas_backend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository;

    public List<Match> findAll () { return matchRepository.findAll(); }

    public Optional<Match> getMatchById (Long id) throws ResourceNotFoundException {
        Optional<Match> serchedMatch = matchRepository.findById(id);
        if (serchedMatch.isPresent()){
            return serchedMatch;
        }
        else {
            throw new ResourceNotFoundException("Match with id:"+id+" dosen´t exist");
        }
    }

    public Match saveMatch(Match mt){
        Match newMatch = new Match(mt.getFecha());
        //Acá debería incluir validaciones a la fecha ingresada:
        //Que sea una fecha que todavia no haya pasado.
        //Que no exista una partida con esa fecha ya existente.
        //...
        return matchRepository.save(newMatch);
    }
    public Match updateMatch(Match mt){
        return matchRepository.save(mt);
    }
}

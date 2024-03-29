package com.cmconsulting.playersManagement.service;

import com.cmconsulting.playersManagement.domain.Player;

public interface PlayerService {


    Player getById(Long id) throws PlayerNotFoundException;
    Player create(Player player);
    boolean existe(Long id);
    void delete(Long id);

}

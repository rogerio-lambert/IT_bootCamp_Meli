package com.meli.bootcamp.modulo6.pratica1storageimplementationii.service;

import com.meli.bootcamp.modulo6.pratica1storageimplementationii.DTO.JewelryDTO;
import com.meli.bootcamp.modulo6.pratica1storageimplementationii.repository.JewelryRepository;
import com.meli.bootcamp.modulo6.pratica1storageimplementationii.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JewelryService {

    private JewelryRepository jewelryRepository;
    private MaterialRepository materialRepository;

    public JewelryService(JewelryRepository j, MaterialRepository m) {
        jewelryRepository = j;
        materialRepository = m;
    }

    public JewelryDTO createJewelry(JewelryDTO newJewelry) {

    }
}


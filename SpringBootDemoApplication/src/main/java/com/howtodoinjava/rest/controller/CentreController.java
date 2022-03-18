package com.howtodoinjava.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.howtodoinjava.rest.dao.CentreDAO;
import com.howtodoinjava.rest.model.Centre;
import com.howtodoinjava.rest.model.Centres;

@RestController
@RequestMapping(path = "/centres")
public class CentreController
{
    @Autowired
    private CentreDAO centreDao;

    @GetMapping(path="/", produces = "application/json")
    public Centres getCentres()
    {
        return CentreDao.getAllCentre();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addCentre(
            @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
            @RequestBody Centre centre)
            throws Exception
    {
        //Generate resource id
        Integer id = centreDao.getAllCentres().getCentreList().size() + 1;
        Centre.setId(id);

        //add resource
        CentreDao.addCentre(centre);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(centre.getId())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }
}

package com.example.practiceassignment.controller;

import com.example.practiceassignment.model.City;
import com.example.practiceassignment.model.Nation;
import com.example.practiceassignment.service.city.ICityService;
import com.example.practiceassignment.service.nation.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private ICityService cityService;

    @Autowired
    private INationService nationService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<City>> showCityList(){
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<City> createNewCity(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity<>(city,HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<City> findCityById(@PathVariable Long id){
        return new ResponseEntity<>(cityService.findById(id).get(),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<City> updateCityById(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<City> deleteCityById(@PathVariable Long id){
        cityService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/nation/list")
    public ResponseEntity<Iterable<Nation>> showAllNationList(){
        return new ResponseEntity<>(nationService.findAll(),HttpStatus.OK);
    }
}

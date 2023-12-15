package com.realestate.project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {
    private final EstateRepository repository;

    public EstateService(EstateRepository repository) {
        this.repository = repository;
    }

    public List<Estate> getAllEstate() {
        return repository.findAll();
    }

    public boolean addEstate(Estate estate) throws Exception {
        try{
            repository.save(estate);
            System.out.println(estate.toString());
            return true;
        }catch (Exception e){
         throw new Exception("Error");
        }
    }

    public boolean deleteEstate(int id) throws Exception {
        try{
            repository.deleteById(id);
            return true;
        }catch (Exception e){
            throw new Exception("Error");
        }
    }

    public boolean updateEstate(Estate estate) throws Exception {
        try{
            repository.save(estate);
            System.out.println(estate.toString());
            return true;
        }catch (Exception e){
            throw new Exception("Error");
        }
    }
}

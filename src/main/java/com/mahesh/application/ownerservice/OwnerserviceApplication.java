package com.mahesh.application.ownerservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.application.ownerservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.*;

@SpringBootApplication
@EnableCaching
public class OwnerserviceApplication implements CommandLineRunner {

    @Autowired
    ObjectMapper objectMapper;

    public static void main(String[] args) {
        SpringApplication.run(OwnerserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Owners owners = new Owners();
//        Set<Pet> petSet = new HashSet<>();
//        Pet pet = new Pet();
//        pet.setName("petname");
//
//        Calendar cal= Calendar.getInstance();
//        cal.set(2020,1,1,10,10,10);
//        pet.setBirthDate(cal.getTime());
//        PetTypes types = new PetTypes();
//        types.setName("cat");
//        pet.setPetTypes(types);
//        petSet.add(pet);
//        pet.setOwners(owners);
//        owners.setFirstName("first name");
//        owners.setTelephone("1234567890");
//        owners.setLastName("last name");
//        owners.setCity("city");
//        owners.setAddress("address1");
//        owners.setPetSet(petSet);

//        List<Owners> ownersList = new ArrayList<>();
////////        Owners owners1 = new Owners();
////////        owners1.setFirstName("firstOwner");
////////        Owners owners2 = new Owners();
////////        owners2.setFirstName("secondOwner");
////////        ownersList.add(owners1);
////////        ownersList.add(owners2);
////////        OwnerList listOfOwners = new OwnerList();
////////        listOfOwners.setOwnersList(ownersList);
////////
////////        String output = objectMapper.writeValueAsString(listOfOwners);


//        PetRequest petRequest = new PetRequest();
//        petRequest.setName("Dog");
//        petRequest.setTypeId(2);
//        Calendar cal= Calendar.getInstance();
//        cal.set(2020,1,1,10,10,10);
//        petRequest.setDateOfBirth(cal.getTime());
//
//        Owners owners = new Owners();
//        owners.setId(1);
//        owners.setFirstName("first name");
//        owners.setTelephone("1234567890");
//        owners.setLastName("last name");
//        owners.setCity("city");
//        owners.setAddress("address1");
//
//        Pet pet = new Pet();
//        pet.setOwners(owners);
//        pet.setName(petRequest.getName());
//        pet.setBirthDate(petRequest.getDateOfBirth());

        Owners owners = new Owners();
        owners.setFirstName("testFirstName2");
        owners.setLastName("testLastName2");
        owners.setCity("city2");
        owners.setTelephone("1234567890");
        owners.setAddress("address2");

        PetTypes type = new PetTypes();
        type.setId(2);
        type.setName("Dog");

        Pet pet = new Pet();
        pet.setName("petName1");
        pet.setOwners(owners);
        pet.setPetTypes(type);
        Set<Pet> petSet = new HashSet<>();
        petSet.add(pet);
       // owners.setPetSet(petSet);

        String output = objectMapper.writeValueAsString(owners);

        System.out.println(output);

    }
}

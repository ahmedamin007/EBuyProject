
package com.ebuy.service;


import com.ebuy.model.Person;
import com.ebuy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author ahmedamin serivice
 */
@Service
@Transactional
public class PersonService {
    @Autowired
    PersonRepository personRepository; 
    
    public PersonService () {
        super();
        
    }
    
    public Person save(Person person){
        return personRepository.save(person);
    }
    
    public void delete (Person person ){
       // my update
        personRepository.delete(person);
    }

    public Person findByUserName(String username){
        return personRepository.findByUsername(username);
    }
    
}

package com.erenalpt.case2.repository;


import com.erenalpt.case2.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
//https://youtu.be/7m4oJLHtyP8?t=2098
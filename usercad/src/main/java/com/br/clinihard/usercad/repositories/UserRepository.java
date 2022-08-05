package com.br.clinihard.usercad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.clinihard.usercad.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{

}

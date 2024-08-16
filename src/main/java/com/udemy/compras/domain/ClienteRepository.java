package com.udemy.compras.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Override
    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value = "true") }) //it was already here, but we need to add this as well
    List<Cliente> findAll();
}

package com.pluralsight.northwind_traders_springboot.Interface;


import com.pluralsight.northwind_traders_springboot.model.Product;
import jakarta.websocket.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Session, Long> {}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.repository;

import com.projet.stock.bean.Personnel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anoir
 */
@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

    public Personnel findByCode(String code);

    List<Personnel> findByFonction(String fonction);
}
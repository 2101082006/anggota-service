/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.buku.repository;

import com.ibra.buku.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LENOVO
 */
    public interface BukuRepository extends JpaRepository<Buku, Long>{
        public Buku findByBukuId(Long bukuId);

}

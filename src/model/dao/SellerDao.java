package model.dao;

import model.entidades.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteByid(Integer id);
    Seller findByid(Integer id);
    List<Seller> findAll();
}

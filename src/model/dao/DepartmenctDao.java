package model.dao;

import model.entidades.Departament;

import java.util.List;

public interface DepartmenctDao {
    void insert(Departament obj);
    void update(Departament obj);
    void deleteByid(Integer id);
    Departament findBYud(Integer id);
    List<Departament> findAll();
}

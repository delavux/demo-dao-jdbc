package model.dao;

import model.entidades.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteByid(Integer id);
    Department findBYud(Integer id);
    List<Department> findAll();
}

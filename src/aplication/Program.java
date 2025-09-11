package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidades.Department;
import model.entidades.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller1 = sellerDao.findByid(3);
        System.out.println(seller1);
        System.out.println("\n=== TEST 1: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 2: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }


    }
}
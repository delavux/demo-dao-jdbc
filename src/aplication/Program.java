package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidades.Department;
import model.entidades.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        System.out.println(obj);


        System.out.println("=== TEST 1: seller findByid ===");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller1 = sellerDao.findByid(3);
        System.out.println(seller1);

    }
}
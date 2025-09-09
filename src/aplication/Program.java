package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidades.Departament;
import model.entidades.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Departament obj = new Departament(1, "books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
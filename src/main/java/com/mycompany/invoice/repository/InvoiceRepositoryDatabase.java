package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create(Invoice invoice){
        /*
          With JDBC
          PreparedStatement pstmt = connexion.prepareStatement("INSERT INTO FACTURE (NUMER, CUSTOMERNAME) VALUES (?,?)");
          [...]
          pstmt.executeUpdate();
         */
        System.out.println("Database - Invoice added with number" +invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}

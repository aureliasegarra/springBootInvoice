package com.mycompany.invoice.repository;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel implements InvoiceRepositoryInterface {
    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice){
        /**
         * With JDBC
         * PreparedStatement pstmt = connexion.prepareStatement("INSERT INTO FACTURE (NUMER, CUSTOMERNAME) VALUES (?,?)");
         * [...]
         * pstmt.executeUpdate();
         */
    }
}

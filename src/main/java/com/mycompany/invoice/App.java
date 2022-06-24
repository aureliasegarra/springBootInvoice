package com.mycompany.invoice;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello World !
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("What is the customerName ?");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        InvoiceService  invoiceservice = new InvoiceService();
        invoiceservice.createInvoice(invoice);
    }
}

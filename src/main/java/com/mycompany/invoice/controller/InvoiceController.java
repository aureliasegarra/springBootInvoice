package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {

    public void createInvoiceUsingConsole(){
        System.out.println("What is the customerName ?");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}

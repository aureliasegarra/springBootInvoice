package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;




public class InvoiceControllerMichel implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceService;

    public void createInvoice(){

        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}

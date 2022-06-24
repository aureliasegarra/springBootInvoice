package com.mycompany.invoice;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceService;
import com.mycompany.invoice.service.InvoiceServiceMichel;

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

        System.out.println("Dans quel configuration êtes vous ?");
        int configuration = sc.nextInt();
        if (configuration == 1){
            InvoiceService  invoiceService = new InvoiceService();
            invoiceService.createInvoice(invoice);
        }
        else if (configuration == 2){
            InvoiceServiceMichel invoiceService = new InvoiceServiceMichel();
            invoiceService.createInvoice(invoice);
        }

    }
}

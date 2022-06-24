package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceController;
import com.mycompany.invoice.controller.InvoiceControllerMichel;
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
        System.out.println("Dans quel configuration êtes vous ?");
        Scanner sc = new Scanner(System.in);
        int configuration = sc.nextInt();
        if (configuration == 1){
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoiceUsingConsole();
        }
        else if (configuration == 2){
            InvoiceControllerMichel invoiceController = new InvoiceControllerMichel();
            invoiceController.createInvoiceUsingWebForm();
        }

    }
}

package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.controller.InvoiceControllerKeyboard;
import com.mycompany.invoice.controller.InvoiceControllerDouchette;
import com.mycompany.invoice.controller.InvoiceControllerWeb;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.repository.InvoiceRepositoryMemory;
import com.mycompany.invoice.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.InvoiceServiceNumber;
import com.mycompany.invoice.service.InvoiceServicePrefixe;

import java.util.Scanner;

/**
 * Hello World !
 *
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le type de controller ? (keyboard, web, douchette)");
        String controllerType = sc.nextLine();

        System.out.println("Quel est le type de service ? (number, prefix)");
        String serviceType = sc.nextLine();

        System.out.println("Quel est le type de repository? (memory, database)");
        String repositoryType = sc.nextLine();


        // N°1 Instancier tous les composants
        InvoiceControllerInterface invoiceController = null;
        switch (controllerType){
            case "keyboard" :
                invoiceController = new InvoiceControllerKeyboard();
                break;
            case "web" :
                invoiceController = new InvoiceControllerWeb();
                break;
            case "douchette" :
                invoiceController = new InvoiceControllerDouchette();
        }

        InvoiceServiceInterface invoiceService = null;
        switch (serviceType){
            case "number" :
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix" :
                invoiceService = new InvoiceServicePrefixe();
        }

        InvoiceRepositoryInterface invoiceRepository = null;
        switch (repositoryType){
            case "memory" :
                invoiceRepository = new InvoiceRepositoryMemory();
                break;
            case "database" :
                invoiceRepository = new InvoiceRepositoryDatabase();
        }

        // N°2 => Injecter les dépendences (publier au niveau de l'interface le setter)

        invoiceController.setInvoiceService(invoiceService);

        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();
    }
}

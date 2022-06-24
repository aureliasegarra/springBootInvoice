package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepository;
import com.mycompany.invoice.repository.InvoiceRepositoryMichel;

public class InvoiceServiceMichel {
    private static long lastNumber = 112L;
    private InvoiceRepositoryMichel invoiceRepository = new InvoiceRepositoryMichel();

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV" + (++lastNumber)));
        invoiceRepository.create(invoice);
    }
}

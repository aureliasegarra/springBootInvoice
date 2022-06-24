package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface{
    private static long lastNumber = 0L;

    // No more instantiation => no dependency
    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}

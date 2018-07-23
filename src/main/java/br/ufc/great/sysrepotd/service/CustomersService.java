package br.ufc.great.sysrepotd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.ufc.great.sysrepotd.model.Customers;
import br.ufc.great.sysrepotd.repository.CustomersRepository;

/**
 * Classe serviço para manipular o repositório de dados Cliente
 * @author armandosoaressousa
 *
 */
@Service
public class CustomersService extends AbstractService<Customers, Long> {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    protected JpaRepository<Customers, Long> getRepository() {
        return customersRepository;
    }

}

package br.com.restful.service;

import br.com.restful.model.ValorVO;

import javax.ejb.Stateless;

@Stateless
public class CalculoService {

    private static final Double METROS_POLEGADA = 98.200;
    private static final Double METROS_PES = 1.2908;
    private static final Double POLEGADA_PES = 1.283333;

    public ValorVO metrosToPolegadas(Double metros) {
        return new ValorVO(metros * METROS_POLEGADA);
    }

    public ValorVO polegadasToMetro(Double polegadas) {
        return new ValorVO(polegadas / METROS_POLEGADA);
    }

    public ValorVO metrosToPes(Double metros) {
        return new ValorVO(metros * METROS_PES);
    }

    public ValorVO pesToMetros(Double pes) {
        return new ValorVO(pes / METROS_PES);
    }

    public ValorVO polegadasToPes(Double polegadas) {
        return new ValorVO(polegadas * POLEGADA_PES);
    }

    public ValorVO pesToPolegadas(Double polegadas) {
        return new ValorVO(polegadas / POLEGADA_PES);
    }



}

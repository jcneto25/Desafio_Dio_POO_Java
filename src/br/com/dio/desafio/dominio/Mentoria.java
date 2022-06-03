package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    @Getter @Setter private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}

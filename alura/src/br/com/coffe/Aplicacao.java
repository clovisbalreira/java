package br.com.coffe;

import java.io.IOException;

public class Aplicacao {

    public static final int ANO_LANCAMENTO_FILTRO = 2009;
    public static final String ESTUDIO_FILTRO = "Universal";

    public static void main(String[] args) {

        var filmeStrategy = FilmeFactory.criarFabrica(FilmeFactoryEnum.FILE);

        try {
            var filmeDtos = filmeStrategy.buscarFilmes();

            var filmeDtoStream = filmeDtos.stream()
                    .filter(filmeDto -> {
                        return filmeDto.getAnoLancamento() == ANO_LANCAMENTO_FILTRO &&
                                filmeDto.getEstudio().contains(ESTUDIO_FILTRO);
                    });
            filmeDtoStream
                    .forEach(filmeDto -> {
                        System.out.println(filmeDto);
                    });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

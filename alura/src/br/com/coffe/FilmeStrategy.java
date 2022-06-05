package br.com.coffe;

import java.io.IOException;
import java.util.List;

public interface FilmeStrategy {

    List<FilmeDto> buscarFilmes() throws IOException;
}

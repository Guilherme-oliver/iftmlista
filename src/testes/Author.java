package testes;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private List<Livro> livros;

    public Author() {
        this.livros = new ArrayList<>();
    }
    public void escreveu(Livro livro){
        livros.add(livro);
    }
}

package testes;

import lista01.Pessoa;

public class Programa {
    public static void main(String[] args) {

       Author author = new Author();
       Livro livro = new Livro(author);

       author.escreveu(livro);

    }
}

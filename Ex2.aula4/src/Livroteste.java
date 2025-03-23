public class Livroteste {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("No Longer Human");
        livro1.setAutor("Dazai Osamu");

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());

        livro1.exibeDados();

        Livro livro2 = new Livro();
        livro2.setTitulo("A Arte da Guerra");
        livro2.setAutor("Sun Tzu");

        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());

        livro2.exibeDados();
    }
}

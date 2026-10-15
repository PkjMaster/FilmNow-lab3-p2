import java.util.Arrays;
import java.util.Scanner;

public class FilmNow {

    private Filme[] filmes;

    private Filme[] hotList;

    public FilmNow(){
        this.filmes = new Filme[100];
        this.hotList = new Filme[10];
    }
    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        String opt;
        while (true){
            System.out.println("(A)Adicionar filme");
            System.out.println("(M)Mostrar todos");
            System.out.println("(D)Detalhar filme");
            System.out.println("(E)Exibir HotList");
            System.out.println("(H)Atribuir Hot");
            System.out.println("(R)Remover Hot");
            System.out.println("(S)Sair");
            System.out.print("\nOpção> ");
            opt = sc.nextLine().strip().toUpperCase();
            switch (opt){
                case ("A"):
                    if (adicionarFilme()){

                    }
                    else{

                    }
                    break;
                case ("M"):
                    break;
                case ("D"):
                    break;
                case ("E"):
                    break;
                case ("H"):
                    break;
                case ("R"):
                    break;
                case ("S"):
                    return;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!\n");
                    break;
            }
        }

    }

    private boolean validaPosicao(int posicao){
        return posicao >= 0 && posicao < 100;
    };

    public boolean adicionarFilme(int posicao, String nome, int anoLancamento, String local) {
        posicao--;
        if (validaPosicao(po)){
            return false;
        }
        Filme f = new Filme(nome, anoLancamento, local);
        for (int i = 0; i < 100; i++){
            if (i != posicao && f.equals(this.filmes[i])){
                return false;
            }
        }
        this.filmes[posicao] = f;
        return true;
    }

    public String[] mostrarTodos() {
        String[] temp = new String[100];
        int itemp = 0;
        for (int i = 0; i < 100; i++){
            if (filmes[i] != null){
                temp[itemp++] = toString() + '\n';
            }
        }

        String[] out = new String[itemp];
        System.arraycopy(temp, 0, out, 0, itemp);
        return out;
    }

    public String detalharFilme(int posicao) {
        if (this.filmes[posicao] != null){
            return this.filmes[posicao].mostrarDetalhes();
        }
        return "";// n gostei
    }

    public boolean atribuirHot(int posicao) {
        posicao--;
        if (posicao < 0 || posicao >= 100){
            return false;
        }
        if (this.filmes[posicao] == null){
            return false;
        }
        this.filmes[]

    }

    public void exibirHotList() {

    }

    public boolean removerHot(int posicao) {

    }

}
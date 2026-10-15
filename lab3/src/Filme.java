import java.util.Objects;

public class Filme {

    private String nome;

    private int anoLancamento;

    private String local;

    private boolean hot;

    public Filme(String nome, int anoLancamento, String local) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.local = local;
        this.hot = false;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setHot(boolean value) {
        this.hot = value;
    }

    public boolean isHot() {
        return this.hot;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return anoLancamento == filme.anoLancamento && Objects.equals(nome, filme.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoLancamento);
    }

    @Override
    public String toString() {
        return this.nome+", "+ this.anoLancamento;
    }

    public String mostrarDetalhes(){
        String out = "";
        if (isHot()){
            out += "🔥 ";
        }
        out += this.toString();
        out += "\n" + this.getLocal();
        return out;
    }

}
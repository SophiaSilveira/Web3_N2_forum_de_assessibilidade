import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Usuario> fila;

    public Cadastro() {
        this.fila = new ArrayList<>();
    }

    public void setFila(ArrayList<Usuario> fila) {
        this.fila = fila;
    }
    public ArrayList<Usuario> getFila() {
        return fila;
    }

    public Usuario verUsuario() {
        Usuario p1 = this.fila.get(0);
        this.fila.remove(0);
        return p1;
    }

    public void adicionarUsuario(Usuario u) {
        this.fila.add(u);
    }

    
    public Usuario pesquisarPelaSenha(String senha) {
        Usuario u2 = null;
        for(int i = 0; i <this.fila.size(); i++) {
            if(this.fila.get(i).getSenha().equals(senha)) {
                u2 = this.fila.get(i);
            }
        }
        return u2;
    }

    @Override
    public String toString() {
        return "Fila de Atendimento\n;" + fila;
    }
}

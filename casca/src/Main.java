import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadastro c1 = new Cadastro();
        byte escolha;

        do{
            System.out.println("Digite a sua Opção: ");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Ver os usuários");
            System.out.println("5 - Login");
            System.out.println("0 - Sair");
            escolha = ler.nextByte();

            switch(escolha){
                case 1:
                    Usuario u1 = new Usuario();
                    System.out.println("Informe o nome do cliente: ");
                    u1.setUsuario(ler.next());

                        do{
                            System.out.println("Informe sua senha, em 8 digitos com somente letras e números");
                            u1.setSenha(ler.next());
                            
                            if(u1.getSenha().length() != 8) {
                            System.out.println("Erro, senha inválida, tente novamente");
                            }
                         }while(u1.getSenha().length() != 8);
            
                    c1.adicionarUsuario(u1);
                    System.out.println("cadastro efetuado com sucesso");

                    break;
                case 2:
                        if(c1.getFila().isEmpty()) {
                            System.out.println("Não há cliente na fila");
                    }else{
                        System.out.println(c1);
                    }
                    break;
                
                case 5:
                        System.out.println("Informe a Senha");
                        String valor = ler.next();
                        Usuario resultado = c1.pesquisarPelaSenha(valor);
                        if(resultado == null) {
                            System.out.println("Senha não reconhecida, tente se cadastrar");
                        }else{
                            System.out.println(resultado);
                            //<a><button> lista
                        }

                    break;

                case 0:
                    System.out.println("Sistema Encerrado");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while(escolha != 0);
    }
}
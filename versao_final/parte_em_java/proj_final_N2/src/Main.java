import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Cadastro c1 = new Cadastro();

        int comentarios=0;

        int soma = 0;
        int minhaMedia=0;
        int tamanho=0;
        byte escolha;
        byte menu;
        int app;
        String appcoment;
        int coment=0;
        String sugestao;

        do{
            System.out.println("******************************************************************************************************************************************************");
            System.out.println("Bem vindo a JS-Opinião sobre Acessibilidade, após o login, aqui você poderá dar a sua opinião sobre os Apps de acessibilidade disponíveis atualmente. ");
            System.out.println("Além de avaliá-los você pode nos enviar uma sugestão de App, que não esteja na lista, para que a nossa equipe pesquise sobre a aplicação e a adicione na plataforma. Aceitamos também, sugestões para o melhorar a utilização do JS-Opinião sobre Acessibilidade. ");
            System.out.println("Esperamos que você ache o que procura, bom proveito!");
            System.out.println("******************************************************************************************************************************************************");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Login");
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
                    System.out.println("cadastro efetuado com sucesso, agora faça o login para acessar o fórum;");
                    break;
                
                case 2:
                        System.out.println("Informe a Senha");
                        String valor = ler.next();
                        Usuario resultado = c1.pesquisarPelaSenha(valor);
                        if(resultado == null) {
                            System.out.println("Senha não reconhecida, tente se cadastrar");
                        }else{

                            System.out.println("Bem Vindo!");
                            System.out.println("");
                            System.out.println("Você deseja saber sobre Apps de acessibilidade para:");
                            System.out.println("  IOS - Insira 1");
                            System.out.println("  Android - Insira 2");
                            System.out.println("  IOS e Android - Insira 3");
                            System.out.println("");
                            System.out.println("Ou você quer deixar uma Sugestão? Então insira 4");

                            menu = ler.nextByte();

                            switch(menu){
                                case 1:
                                    System.out.println("***********************************************************");
                                    System.out.println("      !VoiceOver!");
                                    System.out.println("Com o VoiceOver – um leitor de tela baseado em gestos – você pode usar o iPhone mesmo que você não possa ver a tela. O VoiceOver fornece descrições audíveis do que está na tela — desde o nível da bateria até quem está ligando e em qual app o seu dedo está. Você também pode ajustar a velocidade da fala e o tom de voz conforme as suas necessidades.");
                                    System.out.println("Você pode encontralo em: https://play.google.com/store/apps/details?id=com.RK.voiceover&hl=pt_BR&gl=US");
                                    System.out.println("");
                                    System.out.println("Você gostaria de avaliar o App? digite 1" + "\n"+ "caso não digite 2.");
                                    app = ler.nextInt();

                                    if(app ==1){
                                        //caso fosse um app no tomcat, o do while manteria as notas rodando
                                        //do{
                                            ArrayList<Integer> NumerosIOS = new ArrayList<>();
                                            System.out.println("Digite um valor entre 1 e 10: ");
                                            NumerosIOS.add(ler.nextInt());

                                            for (Integer n : NumerosIOS) {
                                                soma += n.intValue();
                                
                                                tamanho = NumerosIOS.size();
                                
                                                minhaMedia = (soma/tamanho);
                                            }
                                            System.out.println(" A nota deste app é nota: " + minhaMedia);
                                          //  comentarios++;
                                     // }while(comentarios>0);

                                            System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                            coment = ler.nextInt();
                                            if(coment ==1){
                                        //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                        //do{
                                                Date date = new Date();  
                                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                String strDate= formatter.format(date);

                                                ArrayList<String> appscoment = new ArrayList<>();

                                                System.out.println("Comente alguma coisa");
                                                appcoment = ler.next();
                                                appscoment.add(appcoment);

                                                for (String aula : appscoment) {
                                                    System.out.println(strDate+ "> " + aula);
                                                        }
                                                    //comentarios++;
                                                //}while(comentarios>0);

                                            }else{
                                                System.out.println("Você voltará ao inicio");
                                                }
                                        
                                            }else if(app==2){
                                                System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                                coment = ler.nextInt();
                                            if(coment ==1){
                                                //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                            //do{
                                                Date date = new Date();  
                                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                String strDate= formatter.format(date);

                                                ArrayList<String> appscoment = new ArrayList<>();

                                                System.out.println("Comente alguma coisa");
                                                appcoment = ler.next();
                                                appscoment.add(appcoment);

                                                for (String aula : appscoment) {
                                                    System.out.println(strDate+ "> " + aula);
                                                        }
                                                    //comentarios++;
                                                //}while(comentarios>0);
                                            
                                            }else{
                                                System.out.println("Você voltará ao inicio");
                                            }
                                        }else{
                                            System.out.println("Você voltará ao inicio");
                                        }
                                    
                                    break;

                                    case 2:
                                        System.out.println("***********************************************************");
                                        System.out.println("      !Be My Eyes!");
                                        System.out.println("Be My Eyes foi criado para ajudar pessoas cegas ou com visão limitada. O aplicativo é composto por uma comunidade global de pessoas cegas ou com visão limitada, em conjunto com voluntários sem deficiência visual. Be My Eyes captura o poder da tecnologia e a conexão humana para levar a visão para pessoas que perderam esse sentido. " + "\n" +
                                        "Através de uma chamada de vídeo, voluntários dão auxílio visual para pessoas cegas e com visão limitada, em situações que vão desde combinar cores até checar se as luzes estão acesas ou preparar o jantar.");
                                        System.out.println("Você pode encontralo em: https://play.google.com/store/apps/details?id=com.bemyeyes.bemyeyes&hl=pt_BR&gl=US");
                                        System.out.println("");
                                        System.out.println("Você gostaria de avaliar o App? digite 1" + "\n"+ "caso não digite 2.");
                                        app = ler.nextInt();

                                        if(app ==1){
                                            //caso fosse um app no tomcat, o do while manteria as notas rodando
                                            //do{
                                                ArrayList<Integer> NumerosA = new ArrayList<>();
                                                System.out.println("Digite um valor entre 1 e 10: ");
                                                NumerosA.add(ler.nextInt());

                                                for (Integer n : NumerosA) {
                                                    soma += n.intValue();
                                
                                                    tamanho = NumerosA.size();
                                
                                                    minhaMedia = (soma/tamanho);
                                                }
                                                System.out.println(" A nota deste app é nota: " + minhaMedia);
                                            //  comentarios++;
                                        // }while(comentarios>0);

                                                System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                                coment = ler.nextInt();
                                                if(coment ==1){
                                            //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                            //do{
                                                    Date date = new Date();  
                                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                    String strDate= formatter.format(date);

                                                    ArrayList<String> appscoment = new ArrayList<>();

                                                    System.out.println("Comente alguma coisa");
                                                    appcoment = ler.next();
                                                    appscoment.add(appcoment);

                                                    for (String aula : appscoment) {
                                                        System.out.println(strDate+ "> " + aula);
                                                            }
                                                        //comentarios++;
                                                    //}while(comentarios>0);

                                                }else{
                                                    System.out.println("Você voltará ao inicio");
                                                    }
                                        
                                                }else if(app==2){
                                                    System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                                    coment = ler.nextInt();
                                                if(coment ==1){
                                                    //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                                //do{
                                                    Date date = new Date();  
                                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                    String strDate= formatter.format(date);

                                                    ArrayList<String> appscoment = new ArrayList<>();

                                                    System.out.println("Comente alguma coisa");
                                                    appcoment = ler.next();
                                                    appscoment.add(appcoment);

                                                    for (String aula : appscoment) {
                                                     System.out.println(strDate+ "> " + aula);
                                                        }
                                                        //comentarios++;
                                                    //}while(comentarios>0);
                                            
                                                }else{
                                                    System.out.println("Você voltará ao inicio");
                                                }
                                            }else{
                                                System.out.println("Você voltará ao inicio");
                                            }
                                    break;

                                    case 3:
                                        System.out.println("***********************************************************");
                                        System.out.println("      !TalkBack!");
                                        System.out.println("O que o TalkBack faz, quando ativado, a leitura de todas as informações que aparecem na tela do celular, como opções e diálogos do sistema, atalhos e notificações de aplicativos." + "\n" +
                                        "Ele funciona quase como um assistente pessoal e serve para quem tem perda de visão total ou parcial. Além de fazer o feedback falado, o TalkBack também diz quais são as opções disponíveis para o usuário fazer alguma ação. Se você digitar um número de telefone, por exemplo, a ferramenta irá orientá-lo a tocar no ícone de discagem para completar a ligação.");
                                        System.out.println("Você pode encontralo em: https://play.google.com/store/apps/details?id=com.google.android.marvin.talkback&hl=pt_BR&gl=US");
                                        System.out.println("");
                                        System.out.println("Você gostaria de avaliar o App? digite 1" + "\n"+ "caso não digite 2.");
                                        app = ler.nextInt();

                                        if(app ==1){
                                            //caso fosse um app no tomcat, o do while manteria as notas rodando
                                            //do{
                                                ArrayList<Integer> NumerosIOSA = new ArrayList<>();
                                                System.out.println("Digite um valor entre 1 e 10: ");
                                                NumerosIOSA.add(ler.nextInt());

                                             for (Integer n : NumerosIOSA) {
                                                    soma += n.intValue();
                            
                                                    tamanho = NumerosIOSA.size();
                            
                                                    minhaMedia = (soma/tamanho);
                                                }
                                                System.out.println(" A nota deste app é nota: " + minhaMedia);
                                        //  comentarios++;
                                        // }while(comentarios>0);

                                                System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                                coment = ler.nextInt();
                                                if(coment ==1){
                                            //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                            //do{
                                                    Date date = new Date();  
                                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                    String strDate= formatter.format(date);
                                                    ArrayList<String> appscoment = new ArrayList<>();

                                                    System.out.println("Comente alguma coisa");
                                                    appcoment = ler.next();
                                                    appscoment.add(appcoment);

                                                    for (String aula : appscoment) {
                                                        System.out.println(strDate+ "> " + aula);
                                                            }
                                                        //comentarios++;
                                                    //}while(comentarios>0);
                                                }else{
                                                    System.out.println("Você voltará ao inicio");
                                                    }
                                    
                                                }else if(app==2){
                                                    System.out.println("Você gostaria de comentar sobre o app? digite 1" + "\n"+ "caso não digite 2.");
                                                    coment = ler.nextInt();
                                                if(coment ==1){
                                                 //caso fosse um app no tomcat, o do while manteria os comentários rodando                 
                                                //do{
                                                    Date date = new Date();  
                                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                    String strDate= formatter.format(date);
                                                    ArrayList<String> appscoment = new ArrayList<>();

                                                    System.out.println("Comente alguma coisa");
                                                    appcoment = ler.next();
                                                    appscoment.add(appcoment);

                                                    for (String aula : appscoment) {
                                                    System.out.println(strDate+ "> " + aula);
                                                        }
                                                        //comentarios++;
                                                    //}while(comentarios>0);
                                        
                                                }else{
                                                    System.out.println("Você voltará ao inicio");
                                                }
                                            }else{
                                                System.out.println("Você voltará ao inicio");
                                            }
                                    break;

                                    case 4:
                                                Date date = new Date();  
                                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                                                String strDate= formatter.format(date);
                                                ArrayList<String> appssugestao = new ArrayList<>();   

                                                do{  
                                                System.out.println(" De a sua sugestão");
                                                sugestao = ler.next();
                                                appssugestao.add(sugestao);

                                                for (String aula : appssugestao) {
                                                    System.out.println(strDate+ "> " + aula);
                                                        }
                                                
                                                    comentarios++;
                                                }while(comentarios<4);
                                    break;

                                    default:
                                    System.out.println("Opção Inválida");
                                    break;
                                }
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
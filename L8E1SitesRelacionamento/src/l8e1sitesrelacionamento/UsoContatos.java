package l8e1sitesrelacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoContatos {

    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        
        int menu = 0;
        int subTipo = 0;
        String nome = "";
        String apelido = "";
        String email = "";
        String aniversario = "";
        int grau = 0;
        String parentesco = "";
        String tipo = "";
        
        //menu
        do  {
            menu = teclado.nextInt();
            //1 - inserir um contato
            if (menu == 1)   {
                subTipo = teclado.nextInt();
                teclado.nextLine();
                
                //1 = amigo
                if (subTipo == 1){
                    nome = teclado.next();
                    apelido = teclado.next();
                    email = teclado.next();
                    aniversario = teclado.next();
                    grau = teclado.nextInt();
                    teclado.nextLine();
                    
                    Amigos amigo = new Amigos(nome, apelido, email, aniversario, grau);
                    
                    contatos.add(amigo);
                }
                //2 = familia
                else if (subTipo == 2) {
                    nome = teclado.next();
                    apelido = teclado.next();
                    email = teclado.next();
                    aniversario = teclado.next();
                    parentesco = teclado.next();
                    teclado.nextLine();
                    
                    Familia familia = new Familia(nome, apelido, email, aniversario, parentesco);
                    
                    contatos.add(familia);
                }
                //3 = colega de trabalho
                else if (subTipo == 3) {
                    nome = teclado.next();
                    apelido = teclado.next();
                    email = teclado.next();
                    aniversario = teclado.next();
                    tipo = teclado.next();
                    teclado.nextLine();
                    
                    ColegasDeTrabalho colegaTrabalho = new ColegasDeTrabalho(nome, apelido, 
                                                            email, aniversario, tipo);
                    
                    contatos.add(colegaTrabalho);
                }
            }
            //2 - imprimir todos os contatos
            else if (menu == 2) {
                teclado.nextLine();
                for (int i = 0; i < contatos.size(); i++) {
                    System.out.println(contatos.get(i).imprimirContato());
                }
            }
            //3 - imprimir somente familiares
            else if (menu == 3) {
                teclado.nextLine();
                for (int i = 0; i < contatos.size(); i++) {
                    if (contatos.get(i) instanceof Familia) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                }
            }
            //4 - imprimir somente amigos
            else if (menu == 4) {
                teclado.nextLine();
                for (int i = 0; i < contatos.size(); i++) {
                    if (contatos.get(i) instanceof Amigos) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                }
            }
            //5 - imprimir somente colegas de trabalho
            else if (menu == 5) {
                teclado.nextLine();
                for (int i = 0; i < contatos.size(); i++) {
                    if (contatos.get(i) instanceof ColegasDeTrabalho) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                }
            }
            //6 - imprimir os melhores amigos
            else if (menu == 6) {
                teclado.nextLine();
                for (int i = 0; i < contatos.size(); i++) {
                    if (contatos.get(i) instanceof Familia &&
                            contatos.get(i).getFamilia().getParentesco().equals("irmão")) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                    else if (contatos.get(i) instanceof Amigos &&
                            contatos.get(i).getAmigo().getGrau() == 1) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                    else if (contatos.get(i) instanceof ColegasDeTrabalho &&
                            contatos.get(i).getColegasDeTrabalho().getTipo().equals("colega")) {
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                }
            }
            //7 - imprimir contato que teve indice informado
            else if (menu == 7) {
                int index = teclado.nextInt();
                teclado.nextLine();
                
                System.out.println(contatos.get(index-1).imprimirContato());
            }
            
        }while(menu != 8);
        
    }
}

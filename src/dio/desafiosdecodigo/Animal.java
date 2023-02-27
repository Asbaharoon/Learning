package dio.desafiosdecodigo;

import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1,AN2,AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.
        String resposta = "";
        if (AN1.equals("vertebrado")){
            if (AN2.equals("ave")){
                if (AN3.equals("carnivoro")){
                    resposta = "aguia";
                }
                else if (AN3.equals("onivoro")){
                    resposta = "pomba";
                }
            }
            else if (AN2.equals("mamifero")){
                if (AN3.equals("onivoro")){
                    resposta = "homem";
                }
                else if (AN3.equals("herbivoro")){
                    resposta = "vaca";
                }
            }
        }
        else if (AN1.equals("invertebrado")){
            if (AN2.equals("inseto")){
                if (AN3.equals("hematofago")){
                    resposta = "pulga";
                }
                else if (AN3.equals("herbivoro")){
                    resposta = "lagarta";
                }

            }
            else if (AN2.equals("anelideo")){
                if (AN3.equals("hematofago")){
                    resposta = "sanguessuga";
                }
                else if (AN3.equals("onivoro")){
                    resposta = "minhoca";
                }
            }
        }
        System.out.println(resposta);
    }
}

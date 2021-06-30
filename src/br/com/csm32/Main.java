package br.com.csm32;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Elias Murat
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) throws Exception{
        //Lista que vai armazenar as senhas
        Collection<String> passwords = new HashSet<>();
        
        //Scanner para ler o arquivo
        Scanner scnPass = new Scanner(new File("passwords.txt"));
        
        //Percorendo, lendo e salvando
        while (scnPass.hasNextLine()) {            
            passwords.add(scnPass.nextLine());
        }
        
        //Scanner para ler a senha do usuario
        Scanner scnUser = new Scanner(System.in);
        System.out.println("||==========|| Cadastro ||==========||");
        System.out.print("|| Nome: ");
        String username = scnUser.nextLine();
        System.out.print("|| Senha: ");
        String password = scnUser.nextLine();
 
        //Verifica se a senha do usuario eh umas das senhas mais usadas
        if (passwords.contains(password))
            System.out.println("|| Essa senha é muito fraca");
        else
            System.out.println("|| Cadastro realizado com sucesso");
        
        System.out.println("||==================================||");
    }
}

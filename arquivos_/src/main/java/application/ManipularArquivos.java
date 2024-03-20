package application;

import java.io.File;
import java.util.Scanner;



public class ManipularArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){//Mostra as pastas.
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {//Mostra os arquivos.
            System.out.println(file);
        }
        boolean succes = new File(strPath + "\\subir").mkdir();// Cria uma pasta.
        System.out.println("Diretorio criado com sucesso.");
        sc.close();
    }
}

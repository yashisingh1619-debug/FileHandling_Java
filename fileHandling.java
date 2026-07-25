import java.io.*;
import java.util.*;

public class fileHandling {
        static final String fileName = "notes.txt";

       //Writefile
       public static void writefile(Scanner sc){
        try{
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter data to write into file : ");
            sc.nextLine();
            String data = sc.nextLine();
            writer.write(data + "\n");
            writer.close();

            System.out.println("Data written successfully....");
        } catch(IOException e) {
            System.out.println("Error while writing file.");
        }
       }

       // Readfile
       public static void readfile(){
        try{
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("-----File Content-----");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
                br.close();   
                System.out.println("Data read successfully....");  
        } catch(IOException e) {
            System.out.println("Error while reading file.");
        }
       }

       //Modifyfile (Append new data)
       public static void modifyfile(Scanner sc){
        try{
            FileWriter writer = new FileWriter(fileName, true);
            System.out.println("Enter new data to modify file : ");
            sc.nextLine();
            String modify = sc.nextLine();
            writer.write(modify + "\n");
            writer.close();

            System.out.println("File modified successfully.\n");
        } catch(IOException e) {
            System.out.println("Error while modifying file.");
        }
       }
       
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            System.out.println();
            System.out.println("----------FILE HANDLING UTILITY----------");
            System.out.println("1. Write File");
            System.out.println("2. Read File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
             
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    writefile(sc);
                    break;
                case 2:
                    readfile();
                    break;
                case 3:
                    modifyfile(sc);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
            default:
                System.out.println("Invalid Choice:");
            }
        } while(choice != 4);
        sc.close();
       }
    }
   
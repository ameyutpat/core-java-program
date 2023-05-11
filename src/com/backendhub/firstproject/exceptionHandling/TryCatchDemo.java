package com.backendhub.firstproject.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        FileInputStream fileInputStream = null;
        try{
           // statements can cause exception
             scanner = new Scanner(System.in);
            fileInputStream = new FileInputStream("A");
            int a = 10;
            System.out.println("Division: "+ a/0);
            System.out.println("Statement after excpetion");
            int b=20;
            System.out.println("Next line..");
            String s = null;
            //System.out.println(""+ s.concat("Sai"));
            fileInputStream.close();
            System.exit(0);

        } catch (NullPointerException   e) {
            // Uncertain conditions are handled here
            System.out.println("Please enter valid value"+e.getMessage());
        }catch(RuntimeException e){
            System.out.println("This is null pointer exception: "+e.getStackTrace());
        }catch(IOException e){
            System.out.println("This is null pointer exception: "+e.getStackTrace());
        }
        catch(Exception e){
            System.out.println("This is null pointer exception: "+e.getStackTrace());
        }finally {
            System.out.println("FInally block is executed..");
            /*
            */
            scanner.close();
           // fileInputStream.close();
        }
    }
}

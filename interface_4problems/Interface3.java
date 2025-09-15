/*A printing application needs to handle different document formats. Create an interface Printable with a method to print document content. Implement two classes:

PDFDocument – prints sample content of a PDF.

WordDocument – prints sample content of a Word file.

Write a program that stores objects of both classes in an array of Printable references and invokes the printContent() method for each.*/

package interface_4problems;

interface Printable {
 void printContent();
}


class PDFDocument implements Printable {
 @Override
 public void printContent() {
     System.out.println("Printing PDF Document: [Sample PDF Content]");
 }
}


class WordDocument implements Printable {
 @Override
 public void printContent() {
     System.out.println("Printing Word Document: [Sample Word Content]");
 }
}


public class Interface3 {
 public static void main(String[] args) {
   
     Printable[] documents = new Printable[2];
     documents[0] = new PDFDocument();
     documents[1] = new WordDocument();

     
     for (Printable doc : documents) {
         doc.printContent();
         System.out.println("---------------------------");
     }
 }
}





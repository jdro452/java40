/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      System.out.println("1.dodaj studenta 2.wypisz liste studentow");
      int wyb = scanner.nextInt();

      switch(wyb){
        case 1:
          System.out.println("podaj dane nowego studenta");
          System.out.println("podaj imie:");
          String imie=scanner.next();
          System.out.println("podaj wiek");
          int wiek=scanner.nextInt();
          s.addStudent(new Student(imie, wiek));
          break;
          
        case 2:
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());
          }
          break;
      }
          



      
   
      

      
      
    } catch (IOException e) {

    }
  }
}
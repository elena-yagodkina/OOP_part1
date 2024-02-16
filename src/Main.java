
public class Main {
  public static void main(String[] args) {
    Gryffindor[] gryffindors = {
      new Gryffindor("Harry Potter", 80, 90, 95, 60, 70),
      new Gryffindor("Hermione Granger", 30, 50, 45, 47, 50),
      new Gryffindor("Ron Weasley", 56, 36, 20, 68, 59),
    };

    Puffenduy[] puffenduys = {
      new Puffenduy("Zachariah Smith", 20, 30, 40, 70, 74),
      new Puffenduy("Cedric Diggory", 30, 50, 45, 54, 69),
      new Puffenduy("Justin Finch-Fletchley", 10, 15, 20, 63, 58),
    };

    Kogtevran[] kogtevrans = {
      new Kogtevran("Zhou Chang", 20, 30, 40, 35, 62, 67),
      new Kogtevran("Padma Patil", 30, 50, 45, 46, 48, 62),
      new Kogtevran("JMarcus Belby", 10, 15, 20, 38, 49, 29),
    };

    Slytherin[] slytherins = {
      new Slytherin("Draco Malfoy", 48, 30, 40, 35, 50, 57, 47),
      new Slytherin("Graham Montague", 30, 50, 45, 46, 48, 51, 52),
      new Slytherin("Gregory Goyle", 10, 15, 20, 38, 61, 39, 46),
    };

    Hogwarts[] hogwarts = new Hogwarts[gryffindors.length + puffenduys.length + kogtevrans.length + slytherins.length];
    System.arraycopy(gryffindors, 0, hogwarts, 0, gryffindors.length);
    System.arraycopy(puffenduys, 0, hogwarts, gryffindors.length, puffenduys.length);
    System.arraycopy(kogtevrans, 0, hogwarts, puffenduys.length, kogtevrans.length);
    System.arraycopy(slytherins, 0, hogwarts, kogtevrans.length, slytherins.length);

    PrintService printService = new PrintService();
    printService.print(gryffindors);
    System.out.println();
    printService.print(puffenduys);
    System.out.println();
    printService.print(kogtevrans);
    System.out.println();
    printService.print(slytherins);
    System.out.println();
    PrintService.findBestStudentInGryffindor(gryffindors, "Harry Potter", "Hermione Granger");
    System.out.println();
    PrintService.findBestStudentInPuffenduy(puffenduys, "Zachariah Smith", "Cedric Diggory");
    System.out.println();
    PrintService.findBestStudentInKogtevran(kogtevrans, "Zhou Chang", "Padma Patil");
    System.out.println();
    PrintService.findBestStudentInSlytherin(slytherins, "Draco Malfoy", "Graham Montague");
    System.out.println();
    PrintService.findBestStudentInFaculty(hogwarts, "Harry Potter", "Draco Malfoy");
  }
}

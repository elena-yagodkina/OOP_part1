import java.util.Arrays;

public class PrintService {
  public void print(Gryffindor[] gryffindors) {
    System.out.println("Студенты Gryffindor: ");
    for (int i = 0; i < gryffindors.length; i++) {
      Gryffindor gryffindor = gryffindors[i];
      System.out.println("Имя: " + gryffindor.getName()
        + " благородство: " + gryffindor.getNobility()
        + " честь: " + gryffindor.getHonor()
        + " храбрость: " + gryffindor.getBravery()
        + " колдовство: " + gryffindor.getWitchcraft()
        + " трансгрессия: " + gryffindor.getTransgression()
      );
    }
  }

  public void print(Puffenduy[] puffenduys) {
    System.out.println("Студенты Puffenduy: ");
    for (int i = 0; i < puffenduys.length; i++) {
      Puffenduy puffenduy = puffenduys[i];
      System.out.println("Имя: " + puffenduy.getName()
        + " верность: " + puffenduy.getLoyalty()
        + " честность: " + puffenduy.getHonesty()
        + " трудолюбие: " + puffenduy.getHardWork()
        + " колдовство: " + puffenduy.getWitchcraft()
        + " трансгрессия: " + puffenduy.getTransgression()
      );
    }
  }

  public void print(Kogtevran[] kogtevrans) {
    System.out.println("Студенты Kogtevran: ");
    for (int i = 0; i < kogtevrans.length; i++) {
      Kogtevran kogtevran = kogtevrans[i];
      System.out.println("Имя: " + kogtevran.getName()
        + " ум: " + kogtevran.getIntelligence()
        + " мудрость: " + kogtevran.getWisdom()
        + " полон творчества: " + kogtevran.getCreativity()
        + " остроумие: " + kogtevran.getWit()
        + " колдовство: " + kogtevran.getWitchcraft()
        + " трансгрессия: " + kogtevran.getTransgression()
      );
    }
  }

  public void print(Slytherin[] slytherins) {
    System.out.println("Студенты Slytherin: ");
    for (int i = 0; i < slytherins.length; i++) {
      Slytherin slytherin = slytherins[i];
      System.out.println("Имя: " + slytherin.getName()
        + " хитрость: " + slytherin.getCunning()
        + " решительность: " + slytherin.getDetermination()
        + " амбициозность: " + slytherin.getAmbition()
        + " находчивость: " + slytherin.getResourcefulness()
        + " жажда власти: " + slytherin.getLustForPower()
        + " колдовство: " + slytherin.getWitchcraft()
        + " трансгрессия: " + slytherin.getTransgression()
      );
    }
  }

  public static void findBestStudentInGryffindor(Gryffindor[] gryffindors, String nameStudent1, String nameStudent2) {
    int sum1 = 0;
    int sum2 = 0;
    for (Gryffindor gryffindor : gryffindors) {
      if (gryffindor.getName().equals(nameStudent1)) {
        sum1 = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility() + gryffindor.getTransgression() + gryffindor.getWitchcraft();
        System.out.println("Сумма баллов " + gryffindor.getName() + ": " + sum1);
      }
      if (gryffindor.getName().equals(nameStudent2)) {
        sum2 = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility() + gryffindor.getTransgression() + gryffindor.getWitchcraft();
        System.out.println("Сумма баллов " + gryffindor.getName() + ": " + sum2);
      }
    }
    if (sum1 > sum2) {
      System.out.println(nameStudent1 + " лучший Гриффиндорец, чем " + nameStudent2);
    }
    else if (sum1 < sum2) {
      System.out.println(nameStudent2 + " лучший Гриффиндорец, чем " + nameStudent1);
    }
  }

  public static void findBestStudentInPuffenduy(Puffenduy[] puffenduys, String nameStudent1, String nameStudent2) {
    int sum1 = 0;
    int sum2 = 0;
    for (Puffenduy puffenduy : puffenduys) {
      if (puffenduy.getName().equals(nameStudent1)) {
        sum1 = puffenduy.getHardWork() + puffenduy.getLoyalty() + puffenduy.getHonesty() + puffenduy.getTransgression() + puffenduy.getWitchcraft();
        System.out.println("Сумма баллов " + puffenduy.getName() + ": " + sum1);
      }
      if (puffenduy.getName().equals(nameStudent2)) {
        sum2 = puffenduy.getHardWork() + puffenduy.getLoyalty() + puffenduy.getHonesty() + puffenduy.getTransgression() + puffenduy.getWitchcraft();
        System.out.println("Сумма баллов " + puffenduy.getName() + ": " + sum2);
      }
    }
    if (sum1 > sum2) {
      System.out.println(nameStudent1 + " лучший Пуффендуйец, чем " + nameStudent2);
    }
    else if (sum1 < sum2) {
      System.out.println(nameStudent2 + " лучший Пуффендуйец, чем " + nameStudent1);
    }
  }

  public static void findBestStudentInKogtevran(Kogtevran[] kogtevrans, String nameStudent1, String nameStudent2) {
    int sum1 = 0;
    int sum2 = 0;
    for (Kogtevran kogtevran : kogtevrans) {
      if (kogtevran.getName().equals(nameStudent1)) {
        sum1 = kogtevran.getCreativity() + kogtevran.getWit() + kogtevran.getIntelligence() + kogtevran.getWisdom() + kogtevran.getTransgression() + kogtevran.getWitchcraft();
        System.out.println("Сумма баллов " + kogtevran.getName() + ": " + sum1);
      }
      if (kogtevran.getName().equals(nameStudent2)) {
        sum2 = kogtevran.getCreativity() + kogtevran.getWit() + kogtevran.getIntelligence() + kogtevran.getWisdom() + kogtevran.getTransgression() + kogtevran.getWitchcraft();
        System.out.println("Сумма баллов " + kogtevran.getName() + ": " + sum2);
      }
    }
    if (sum1 > sum2) {
      System.out.println(nameStudent1 + " лучший Когтевранец, чем " + nameStudent2);
    }
    else if (sum1 < sum2) {
      System.out.println(nameStudent2 + " лучший Когтевранец, чем " + nameStudent1);
    }
  }

  public static void findBestStudentInSlytherin(Slytherin[] slytherins, String nameStudent1, String nameStudent2) {
    int sum1 = 0;
    int sum2 = 0;
    for (Slytherin slytherin : slytherins) {
      if (slytherin.getName().equals(nameStudent1)) {
        sum1 = slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() + slytherin.getDetermination() + slytherin.getCunning() + slytherin.getTransgression() + slytherin.getWitchcraft();
        System.out.println("Сумма баллов " + slytherin.getName() + ": " + sum1);
      }
      if (slytherin.getName().equals(nameStudent2)) {
        sum2 = slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower() + slytherin.getDetermination() + slytherin.getCunning() + slytherin.getTransgression() + slytherin.getWitchcraft();
        System.out.println("Сумма баллов " + slytherin.getName() + ": " + sum2);
      }
    }
    if (sum1 > sum2) {
      System.out.println(nameStudent1 + " лучший Слизеринец, чем " + nameStudent2);
    }
    else if (sum1 < sum2) {
      System.out.println(nameStudent2 + " лучший Слизеринец, чем " + nameStudent1);
    }
  }

  public static void findBestStudentInFaculty (Hogwarts[] hogwarts, String nameStudent1, String nameStudent2) {
    int sum1 = 0;
    int sum2 = 0;
    for (Hogwarts hogwarts1 : hogwarts) {
      if (hogwarts1.getName().equals(nameStudent1)) {
        sum1 = hogwarts1.getTransgression() + hogwarts1.getWitchcraft();
        System.out.println("Мощность магии " + hogwarts1.getName() + ": " + sum1);
      }
      if (hogwarts1.getName().equals(nameStudent2)) {
        sum2 = hogwarts1.getTransgression() + hogwarts1.getWitchcraft();
        System.out.println("Мощность магии " + hogwarts1.getName() + ": " + sum2);
      }
    }
    if (sum1 > sum2) {
      System.out.println(nameStudent1 + " обладает бОльшей мощностью магии, чем " + nameStudent2);
    }
    else if (sum1 < sum2) {
      System.out.println(nameStudent2 + " обладает бОльшей мощностью магии " + nameStudent1);
    }
  }
}

package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};
    for (String l : langs) {
      System.out.println("Я хочу выучить " + l);

      List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
      for (String la : languages) {
        System.out.println("Я хочу выучить " + la);


      }
    }
  }
}

package ru.netology.services;

public class FreeLancService {
    public int calculate( int income, int expenses, int threshould) {
      int counter = 0;
      int wallet = 0;

      for (int i = 0; i < 12; i++) {
        if (wallet >= threshould) {
            // отдыхаем
            wallet = wallet - expenses;
            wallet = wallet / 3;
            counter++;
        } else {
            // работать
            wallet = wallet + income;
            wallet = wallet - expenses;
        }
      }

      return  counter;
    }
}

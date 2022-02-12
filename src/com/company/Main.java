package com.company;



class Time{
    private int hour;
    private int minute;
    private int second;
    private Time hora;

    //Constructor
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        checaHora(hour, minute, second);
    }

    public void setTime(int hora, int minuto, int segundo){
        this.hour = hora;
        this.minute = minuto;
        this.second = segundo;
        checaHora(hora, minuto, segundo);
    }

    //Getters
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int hour){
        int mod;

        this.hour+=hour;
        if(this.hour >= 24){
            this.hour %= 24;
        }
        if(this.hour < 0){
            this.hour += 24;
        }
    }

    public void addMinute(int minute){

        this.minute+=minute;
        if(this.minute >= 60){
            addHour(this.minute/60);
            this.minute %= minute;
        }
        if(this.minute < 0){
            this.hour--;
            this.minute+=60;
        }
    }

    public void addSecond(int second){
        this.second+=second;
        if(this.second >= 60){
            addMinute(this.second/60);
            this.second %= 60;
        }
        if(this.second < 0){
            this.minute--;
            this.second+=60;
        }
    }

    public void checaHora(int hora, int minuto, int segundo){
        if(hora < 24 ){
            if(minuto < 60){
                if(segundo < 60){
                    System.out.println("La hora proporcionada es correcta");
                }else
                    System.out.println("El segundo proporcionado es incorrecto ya que es mayor a 60");
            }else
                System.out.println("El minuto proporcionado es incorrecto ya que es mayor a 60");
        }else
            System.out.println("La hora proporcionada es incorrecta ya que es mayor a 24");
    }

    public void toString(int Hora, int minuto, int segundo){
        System.out.println("Hora: " + Hora + " Minuto: " + minuto + " Segundo: " + segundo);
    }
}

public class Main {

    public static void main(String[] args) {
        Time hora = new Time(0,0,0);

        hora.setTime(5,40,15);
        hora.addHour(6);
        hora.addMinute(-41);
        hora.addSecond(20);
        hora.toString(hora.getHour(), hora.getMinute(), hora.getSecond());
    }
}
package model;

/**
 * Created by ASUS on 02.06.2017.
 */
public enum Degree {
    DOCTOR,
    PROFESSOR,
    DEFAULT;
 public static Degree getDegree(String degree){
     if(degree == null || degree.isEmpty()){
         return DEFAULT;
     }
     for (Degree d : Degree.values()){
         if(degree.equals(d.toString())){
             return d;
         }
     }
     return DEFAULT;
 }

}

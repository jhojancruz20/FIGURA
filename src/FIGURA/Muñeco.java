package FIGURA;

import java.util.*;

/**
 * Write a description of class Muñeco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muñeco extends Figura
{
  ArrayList<Figura> figuras;
  
  
  public Muñeco(){
   figuras = new ArrayList<Figura>();
  }
  
  public void addMuñeco(Figura figura){//agregarMuñeco()
    figuras.add(figura);
  }
  
  public void dibujar(){
    System.out.println("Muñeco");
    for(Figura f : figuras){//for(int i=0;i<figuras.size();i++)
      f.dibujar();//Figura f = figuras.get(i);
    }//Collection.foreach(figuras, operacion);
  }
  
  
}

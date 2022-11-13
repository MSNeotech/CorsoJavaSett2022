package srl.neotech.corsojava.gestionebiblioteca;

import java.util.ArrayList;
import java.util.Random;

import com.github.javafaker.Faker;

import srl.neotech.corsojava.gestionebiblioteca.Associato.stato;
import srl.neotech.corsojava.gestionebiblioteca.Libro.sezione;

public class Startup {
	
static ArrayList <Libro> libri=new ArrayList  <Libro>();
static ArrayList <Associato> associati=new ArrayList <Associato>();

 public static void main(String[] args) {
	 
    Faker f=new Faker();
	Random 	rnd=new Random();
	
for(int i=1; i<=100; i++) {
	
	Libro l=new Libro();
	
	Integer cas = rnd.nextInt(1,5);
	Integer casScaff= rnd.nextInt(1,50);
	
	String autore =f.book().author();
	String titolo=f.book().title();
	
	l.setAutore(autore);
	l.setTitolo(titolo);
	l.setScaffale(casScaff);
	
	if(cas==1)l.setSezione(sezione.romanzo.toString());
	else if(cas==2)l.setSezione(sezione.giallo.toString());
	else if(cas==3)l.setSezione(sezione.scientifico.toString());
	else if(cas==4)l.setSezione(sezione.horror.toString());
	else if(cas==5)l.setSezione(sezione.fantasy.toString());


	l.setIdLibro(i);
	
	libri.add(l);
	
	Associato ass=new Associato();
	
	Integer casLibri = rnd.nextInt(1,10);
	
	String nom = f.name().fullName();
	
	ass.setListaIdPresi(casLibri);
	ass.setNominato(nom);
	
	if(cas==1)ass.setStato(stato.attivo.toString());
	else ass.setStato(stato.rimosso.toString());
	
	ass.setIdAssociato(i);
	associati.add(ass);
	
	
	}

for(Libro l:libri)System.out.println(l);
for (Associato ass:associati)System.out.println(ass);

Integer removeIndex = rnd.nextInt(1,90);

libri.remove(removeIndex);
associati.remove(removeIndex);

System.out.println("\n"+"Associati: " +associati+"\n");
System.out.println("Libro rimosso: " +libri+"\n");
	

 }

}


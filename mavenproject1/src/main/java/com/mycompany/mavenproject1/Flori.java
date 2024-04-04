/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author cola
 */
public class Flori {
     private String culoare, habitat, nume;
    private double dimensiune, durata_de_viata;

    public Flori()
    {
        this.nume = "";
        this.culoare = "";
        this.habitat = "";
        this.dimensiune = 0.0;
        this.durata_de_viata = 0.0;
    }
    public Flori(String N, String C, String H, double D, double V)
    {
        this.nume = N;
        this.culoare = C;
        this.habitat = H;
        this.dimensiune = D;
        this.durata_de_viata = V;
    }
    public Flori(Flori F)
    {
        this.nume = F.nume;
        this.culoare = F.culoare;
        this.habitat = F.habitat;
        this.dimensiune = F.dimensiune;
        this.durata_de_viata = F.durata_de_viata;
    }

    public void initializareDate()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este numele florii?");
        this.nume = scanner.nextLine();
        System.out.println("Care este culoarea florii?");
        this.culoare = scanner.nextLine();
        System.out.println("In ce habitat se dezvolta floarea?");
        this.habitat = scanner.nextLine();
        System.out.println("Care este dimensiunea florii?");
        this.dimensiune = scanner.nextDouble();
        System.out.println("Care este durata de viata a florii?");
        this.durata_de_viata = scanner.nextDouble();
    }

    public void setNume(String N)
    {
        this.nume = N;
    }
    public void setCuloare(String C)
    {
        this.culoare = C;
    }
    public void setHabitat(String H)
    {
        this.habitat = H;
    }
    public void setDimensiune(double D)
    {
        this.dimensiune = D;
    }
    public void setDurataDeViata(double V)
    {
        this.durata_de_viata = V;
    }

    public String getNume()
    {
        return this.nume;
    }
    public String getCuloare()
    {
        return this.culoare;
    }
    public String getHabitat()
    {
        return this.habitat;
    }
    public double getDimensiune ()
    {
        return this.dimensiune;
    }
    public double getDurataDeViata()
    {
        return this.durata_de_viata;
    }

    void afisareDateFlori()
    {
        System.out.println("Nume: " + this.nume + " Culoare: " + this.culoare + " Habitat: " + this.habitat + " Dimensiune: " + this.dimensiune + " metri " + " Durata de viata: " + this.durata_de_viata + " luna");
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.taller5;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class RegistroCampeonato {

    private String name;
    private int timecompetition;
    private double rewardWinner;
    private ArrayList<Equipo> nequipos;

    public RegistroCampeonato(String name, int timecompetition, double rewardWinner, ArrayList<Equipo> nequipos) {
        this.name = name;
        this.timecompetition = timecompetition;
        this.rewardWinner = rewardWinner;
        this.nequipos = nequipos;
    }

    public RegistroCampeonato(ArrayList<Equipo> nequipos) {
        this.nequipos = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimecompetition() {
        return timecompetition;
    }

    public void setTimecompetition(int timecompetition) {
        this.timecompetition = timecompetition;
    }

    public double getRewardWinner() {
        return rewardWinner;
    }

    public void setRewardWinner(double rewardWinner) {
        this.rewardWinner = rewardWinner;
    }

    public ArrayList<Equipo> getNequipos() {
        return nequipos;
    }

    public void setNequipos(ArrayList<Equipo> nequipos) {
        this.nequipos = nequipos;
    }

    public void addEquipos(Equipo e) {
        this.nequipos.add(e);
    }

}

package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAlimentos {
    Scanner ler = new Scanner(System.in);
     private List<String> verdura = new ArrayList<>();
     private List<String> legumes = new ArrayList<>();
     private List<String> outros = new ArrayList<>();
     private List<String> grãos = new ArrayList<>();
    public MenuAlimentos() {
        this.verdura = verdura;
        this.legumes = legumes;
        this.outros = outros;
        this.grãos= grãos;

    }

    public List<String> getVerdura() {
        verdura.add("Brócolis");
        verdura.add("Couve-flor");
        verdura.add("Espinafre");
        verdura.add("Escarola");
        verdura.add("Rúcula");
        verdura.add("Alchachofra");
        return verdura;
    }
    public List<String> getLegumes() {
        legumes.add("Abóbora");
        legumes.add("Cará");
        legumes.add("Cenoura");
        legumes.add("Mandioca");
        legumes.add("Inhame");
        return legumes;
    }

    public List<String> getGrãos() {
        grãos.add("Milho");
        grãos.add("Arroz");
        grãos.add("Feijão");
        grãos.add("Amendoin");
        grãos.add("Ervilha");
        return grãos;
    }

    public List<String> getOutros() {
        return outros;
    }

}


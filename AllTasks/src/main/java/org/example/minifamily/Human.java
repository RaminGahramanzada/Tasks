package org.example.minifamily;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
private String name;
private String surname;
private int year;
private int iqLevel;
private Pet pet;
private Human mother;
private Human father;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIqLevel() == human.getIqLevel() && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getPet(), human.getPet()) && Objects.equals(getMother(), human.getMother()) && Objects.equals(getFather(), human.getFather()) && Arrays.equals(getActivity(), human.getActivity());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIqLevel(), getPet(), getMother(), getFather());
        result = 31 * result + Arrays.hashCode(getActivity());
        return result;
    }

    private  String activity[][];



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greetPet(){
    System.out.println("Hello,"+pet.getNickName());}
    public void describePet(){
        if(pet.trickLevel>=50){
            System.out.printf("I have a %s, it is %s years old, it is %s,it is very sly ",pet.getSpecies(),pet.getAge(),pet.getTrickLevel());
        }
        System.out.printf("I have a %s, it is %s years old, it is %s,it is almost not sly ",pet.getSpecies(),pet.getAge(),pet.getTrickLevel());
    }

    public void feedPet(boolean output){
        if(output==true){
            System.out.println("the owner feeds the pet,");
        }else if(output==false){
            Random rnd = new Random();
            int rndValue = rnd.nextInt(101);

            if(pet.getTrickLevel() < rndValue){
                System.out.println("I think Jack is not hungry.");
            } else if (pet.getTrickLevel() > rndValue) {
                System.out.println("Hm... I will feed Jack's "+pet.getNickName());
            }
        }
    }

    public Human(String name) {//Full constructor
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.activity = activity;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getActivity() {
        return activity;
    }

    public void setActivity(String[][] activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", activity=" + Arrays.toString(activity) +
                '}';
    }

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }


}

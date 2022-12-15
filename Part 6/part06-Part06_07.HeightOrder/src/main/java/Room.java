/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGurjar
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        if (this.personList.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnObj = this.personList.get(0);
        for (Person prs : this.personList) {
            if (returnObj.getHeight() > prs.getHeight()) {
                returnObj = prs;
            }
        }
        return returnObj;
    }
    
    
    public Person take() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnObj = this.shortest();
        this.personList.remove(this.shortest());
        return returnObj;
    }
}

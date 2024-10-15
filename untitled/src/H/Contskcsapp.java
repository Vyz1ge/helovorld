package H;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Contskcsapp{
    private Map<String, Integer> contacts = new HashMap<>();;
    private String name;
    private int number;

    public void newcontscts(String name, int number){
        this.name = name;
        this.number = number;
        contacts.put(name,number);
    }

    public void remove(String name){
        contacts.remove(name);
    }

    public void searchNumberForName(String xname) {
        System.out.println(" " + contacts.get(xname) + " eto nomer etogo cheloveka " + xname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contskcsapp that = (Contskcsapp) o;
        return getNumber() == that.getNumber() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        String s = "";
        for (Map.Entry<String,Integer> entry : contacts.entrySet()){
            s+= " ||||||||||" + entry.getKey()+" с номером телефона "+ entry.getValue();
        }
        return s;
    }

}


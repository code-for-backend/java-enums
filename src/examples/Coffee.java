package examples;

public enum Coffee {

    SMALL("S"),MEDIUM("M"),LARGE("L");

    private String name;

    Coffee(String name)
    {
        this.name=name;

    }

    Coffee()
    {

    }


    public String getName() {
        return name;
    }
}



public class Author {

    private String name;

    Author(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString () {
      return ("Name of the Author: "+this.name);
    }
}

package JavaBasics.by.epam.library.entity;

public class Poster extends PrintedEdition {

    private String event;

    public Poster(String author, String name, int price, String event) {
        super(author, name, price);
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Poster)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Poster poster = (Poster) o;

        return event != null ? event.equals(poster.event) : poster.event == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (event != null ? event.hashCode() : 0);
        return result;
    }
}

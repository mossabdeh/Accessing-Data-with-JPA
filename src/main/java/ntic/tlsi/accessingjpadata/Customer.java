package ntic.tlsi.accessingjpadata;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String firstName;

    private String lastName;

    // The default constructor exists only for the sake of JPA. You do not use it directly, so it is designated as protected
    protected Customer() {}

    public Customer( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

/// ONLY GETTERS no need for setters this guide
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}

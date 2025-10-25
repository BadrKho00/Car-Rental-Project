package ch.unil.softarch.carrental.domain.entity;

import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID uuid;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor.
     * Initializes all fields with null values.
     */
    public User() {this(null, null, null, null, null, null, null);}

    public User(String username, String password, String firstName, String lastName, String email, String phoneNumber) {
        this(null, username, password, firstName, lastName, email, phoneNumber);
    }

    public User(UUID uuid, String username, String password, String firstName, String lastName, String email, String phoneNumber) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Replaces all fields of this user with the values from another user.
     * Throws an exception if the given user is null.
     *
     * @param user the user whose data will replace the current one
     */
    public void replaceWith(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        }
        this.uuid = user.uuid;
        this.username = user.username;
        this.password = user.password;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.email = user.email;
        this.phoneNumber = user.phoneNumber;
    }

    /**
     * Merges non-null fields from the given user into this user.
     * Only fields that are not null in the input user will replace the current values.
     * Throws an exception if the given user is null.
     *
     * @param user the user whose non-null data will be merged into this user
     */
    public void mergeWith(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        }
        if (user.uuid != null) {
            this.uuid = user.uuid;
        }
        if (user.username != null) {
            this.username = user.username;
        }
        if (user.password != null) {
            this.password = user.password;
        }
        if (user.firstName != null) {
            this.firstName = user.firstName;
        }
        if (user.lastName != null) {
            this.lastName = user.lastName;
        }
        if (user.email != null) {
            this.email = user.email;
        }
        if (user.phoneNumber != null) {
            this.phoneNumber = user.phoneNumber;
        }
    }

    /**
     * Gets the unique identifier (UUID) of the user.
     *
     * @return the user's UUID
     */
    public UUID getUUID() {
        return uuid;
    }
    /** Sets the unique identifier (UUID) of the user.
     *
     * @param uuid the UUID to set
     */
    public void setUUID(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    /**
     * Returns a string representation of the user object,
     * including UUID, first name, last name, username, and email.
     *
     * @return a string describing the user's key information
     */
    public String describe() {
        return "id=" + this.uuid + ", username='" + this.username + "', firstName='" + this.firstName + "', lastName='" + this.lastName +
                 "', email='" + this.email + "'" + ", phoneNumber='" + this.phoneNumber + "'";
    }

    /**
     * Compares this user with another object for equality.
     * Two users are considered equal if their UUID, first name, last name, username, and email are all equal.
     *
     * @param o the object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(uuid, user.uuid) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getEmail(), user.getEmail());
    }

    /**
     * Returns a hash code value for the user, consistent with equals().
     *
     * @return hash code of the user
     */
    @Override
    public int hashCode() {
        return Objects.hash(uuid, getFirstName(), getLastName(), getUsername(), getEmail());
    }


    }


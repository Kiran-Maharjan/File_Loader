/*
 --toStirng() convert every type to string for company object
 */
package file_loader_single_character_reading.entities;

import java.util.Date;

/**
 *
 * @author kiran
 */
public class Company {
    private int id;
    private String name;
    private String description;
    private boolean status;
    private Date addedDate;

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Company(int id, String name, String description, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + ", addedDate=" + addedDate + '}';
    }
    
}

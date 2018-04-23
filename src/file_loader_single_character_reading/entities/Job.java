/*
 */
package file_loader_single_character_reading.entities;

/**
 *
 * @author kiran
 */
public class Job {
    private int  id;
    private String title, description;
    private Company company;  //--one to one mapping
    private boolean status;

    public Job() {
    }

    public Job(int id, String title, String description, Company company, boolean status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}

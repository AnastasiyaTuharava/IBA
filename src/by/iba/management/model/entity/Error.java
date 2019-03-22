package by.iba.management.model.entity;

/**
 * Created by katya on 2/20/2019.
 */
public class Error {
    private String projectNameErr = "Please enter a valid Project name.";
    private String projectDescrErr = "Please enter a valid Project description";

    public Error(String projectDescrErr, String projectNameErr) {
        this.projectDescrErr = projectDescrErr;
        this.projectNameErr = projectNameErr;
    }

    public String getProjectNameErr() {
        return projectNameErr;
    }

    public String getProjectDescrErr() {
        return projectDescrErr;
    }
}

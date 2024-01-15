/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author AMD
 */
@Entity
public class PrintFile extends Entitet {
    
    private String fileType;
    private String filePath;
    private Integer fileVersion;
    private String fileComment;
    @ManyToOne
    @JoinColumn(name = "part", nullable = true)
    private Part part;

    public PrintFile(String fileType, String filePath, Integer fileVersion, String fileComment, Part part, Integer id) {
        super(id);
        this.fileType = fileType;
        this.filePath = filePath;
        this.fileVersion = fileVersion;
        this.fileComment = fileComment;
        this.part = part;
    }

    public PrintFile() {
        super();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(Integer fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getFileComment() {
        return fileComment;
    }

    public void setFileComment(String fileComment) {
        this.fileComment = fileComment;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
    
    
    
}

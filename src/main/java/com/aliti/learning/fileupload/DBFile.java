package com.aliti.learning.fileupload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity
@Table(name = "files")
public class DBFile {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;

    public DBFile(String fileName, String fileType, byte[] data) {
        this.fileName=fileName;
        this.fileType=fileType;
        this.data=data;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.cdi.service;

import gr.codelearn.java.path.jakarta.cdi.domain.Video;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.enterprise.context.SessionScoped;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author giannis
 */
@SessionScoped
public class VideoEditorAviServiceImpl implements VideoEditorService,Serializable {
    private Integer randomViews = (int)(Math.random() * 100000) + 100;

    @Override
    public Video edit(Video file) {
        file.setViews(randomViews);
        System.out.println("Changed the views to "+randomViews);
        return file;
    }

    @Override
    public Video save(Video file) {
        file.setSizeGB(file.getSizeGB().add(BigDecimal.valueOf(2)));
        System.out.println("Changed the file size to "+file.getSizeGB());
        return file;
    }
    
}

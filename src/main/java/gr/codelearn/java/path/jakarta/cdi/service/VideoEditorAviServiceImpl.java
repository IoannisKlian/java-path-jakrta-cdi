/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.cdi.service;

import gr.codelearn.java.path.jakarta.cdi.domain.Video;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author giannis
 */
@RequestScoped
@Slf4j
//@Default
public class VideoEditorAviServiceImpl implements VideoEditorService,Serializable {
    private Integer randomViews;
    
    @PostConstruct
    private void init(){
        randomViews = (int)(Math.random() * 100000) + 100;
        log.info("Class {} has been intiliazed",getClass().getName());
    }
    
    @PreDestroy
    private void destroy(){
        log.info("Class {} is being destroyed",getClass().getName());
    }

    @Override
    public Video edit(Video file) {
        file.setViews(randomViews);
        log.info("Changed AVI views to {}",randomViews);
        return file;
    }

    @Override
    public Video save(Video file) {
        file.setSizeGB(file.getSizeGB().add(BigDecimal.valueOf(2)));
        log.info("Changed AVI file size to {}",file.getSizeGB());
        return file;
    }
    
}

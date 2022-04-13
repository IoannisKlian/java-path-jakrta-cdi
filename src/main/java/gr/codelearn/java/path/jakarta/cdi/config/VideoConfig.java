/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.cdi.config;

import gr.codelearn.java.path.jakarta.cdi.domain.Video;
import gr.codelearn.java.path.jakarta.cdi.qualifier.VideoQual;
import java.math.BigDecimal;
import javax.enterprise.inject.Produces;

/**
 *
 * @author giannis
 */
public class VideoConfig {

    @Produces
    private String randomText = "Random text here";

    @Produces
    @VideoQual
    private Video videoType() {
        Video video = new Video();
        video.setName("Avengers: Endgame");
        video.setSizeGB(BigDecimal.valueOf(100));
        video.setYear(2019);
        video.setViews(10000000);
        return video;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.cdi.service;

import gr.codelearn.java.path.jakarta.cdi.domain.Video;

/**
 *
 * @author giannis
 */
public interface VideoEditorService {
    Video edit(Video file);
    Video save(Video file);
}

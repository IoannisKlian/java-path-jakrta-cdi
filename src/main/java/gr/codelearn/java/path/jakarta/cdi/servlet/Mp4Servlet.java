/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gr.codelearn.java.path.jakarta.cdi.servlet;

import gr.codelearn.java.path.jakarta.cdi.domain.Video;
import gr.codelearn.java.path.jakarta.cdi.qualifier.MP4;
import gr.codelearn.java.path.jakarta.cdi.service.VideoEditorService;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giannis
 */
@WebServlet(name = "Mp4Servlet", value = "/mp4-servlet")
public class Mp4Servlet extends HttpServlet {

    private Video video;
    
    @Inject
    private String randomText;

    @Inject
    @MP4
    //Alternative is used for different deployment scenario
    //@Alternative
    private VideoEditorService videoEditorService;

    @Override
    public void init() {
        video = new Video();
        video.setName(randomText);
        video.setSizeGB(BigDecimal.valueOf(50));
        video.setYear(2000);
        video.setViews(10000);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MP4 Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MP4 Servlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>Video: " + video + "</h1>");
            out.println("<h1>Edited video: " + videoEditorService.edit(video) + "</h1>");
            out.println("<h1>Saved video: " + videoEditorService.save(video) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

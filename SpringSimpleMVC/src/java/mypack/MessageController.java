/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sysadmin
 */
public class MessageController implements Controller {
    
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        String username = req.getParameter("userName");
        String email = req.getParameter("email");
        String msg = req.getParameter("message");
        
        String returnvalue="";
        String[] str = email.split("@");
        if(username == null || "".equals(str) || str.length < 2) {
            System.out.println("...........................................................FAILURE!!");
            returnvalue="/jsp/failure.jsp";
        }
        else {
            System.out.println("...........................................................SUCCESS!!");
            returnvalue="/jsp/success.jsp";
        }
        
        return new ModelAndView(returnvalue, "username", username);

    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author sysadmin
 */
public class LoginController implements Controller {
    
    private LoginService loginService;
    
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        String username = req.getParameter("username");
        
        String returnvalue="/jsp/success.jsp";
        
        return new ModelAndView(returnvalue, "username", username);
        
    }
    
    public void setLoginService(LoginService loginService) {
        System.out.println("Controller Setter invoked");
        this.loginService=loginService;
    }

}

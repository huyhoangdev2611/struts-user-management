package com.example.common.action;

import com.example.common.dao.UserDAO;
import com.example.common.model.User;
import com.example.common.form.UserForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class UserCreateAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        UserForm userForm = (UserForm) form;
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        if (UserDAO.insertUser(user)) {
            request.setAttribute("message", "User added successfully!");
            return mapping.findForward("success");
        } 
        
        request.setAttribute("message", "Failed to add user.");
        return mapping.findForward("failure");
    }
}

package com.example.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.actions.MappingDispatchAction;

import com.example.common.dao.UserDAO;
import com.example.common.form.UserForm;
import com.example.common.model.User;

import org.apache.struts.action.ActionMapping;

public class UserAction extends MappingDispatchAction {

    public ActionForward list(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("userList", UserDAO.getAllUsers());
        return mapping.findForward("list");
    }

    public ActionForward create(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request, HttpServletResponse response) {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            return mapping.findForward("create");
        }

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

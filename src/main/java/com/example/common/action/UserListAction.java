package com.example.common.action;

import com.example.common.dao.UserDAO;
import com.example.common.model.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import java.util.List;

public class UserListAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("userList", UserDAO.getAllUsers());
        return mapping.findForward("success");
    }
}

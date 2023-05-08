package core.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspView implements View{
    private String viewName;
    private static final String REDIRECT_PREFIX = "redirect:";

    public JspView(String viewName){
        this.viewName = viewName;
    }
    @Override
    public void render(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //jsp를 사용자에게 전달
        if (viewName.startsWith(REDIRECT_PREFIX)) {
            response.sendRedirect(viewName.substring(REDIRECT_PREFIX.length()));
            return;
        }

        RequestDispatcher rd = request.getRequestDispatcher(viewName);
        rd.forward(request, response);
    }
}

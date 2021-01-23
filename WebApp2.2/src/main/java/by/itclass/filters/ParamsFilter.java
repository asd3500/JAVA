package by.itclass.filters;

import by.itclass.controller.util.ControllerUtil;

import static by.itclass.Constants.*;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@WebFilter(filterName = "ParamsFilter", urlPatterns = {"/login", "/register"})
public class ParamsFilter implements Filter {
    public void destroy() {
        System.out.println("Filter destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");
        Map<String, String[]> params = req.getParameterMap();
        boolean haveNulls = params.values()
                .stream()
                .flatMap(Arrays::stream)
                .anyMatch(item -> Objects.isNull(item) || item.isEmpty());

        if(haveNulls) {
//            ControllerUtil.jumpMess(LOGIN_JSP, EMPTY_FIELD_MESSAGE, req, resp);
            HttpServletRequest request = (HttpServletRequest) req;
            String url = request.getHeader(REFERER_LABEL);
            System.out.println("url: " + url);
            String[] urlNames = url.split(DELIMITER_URL);
            String urlPage = urlNames[urlNames.length - 1];
            System.out.println("urlPage: " + urlPage);
            ControllerUtil.jumpMess(urlPage, EMPTY_FIELD_MESSAGE, req, resp);
        } else {
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter init");
    }

}

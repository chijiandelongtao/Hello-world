package springmvcchongzhi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 新公司测试提交
 */
public class Handler implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       
        ModelAndView view = new ModelAndView();
        view.setViewName("hello");
        view.addObject("msg", "这是一个spring的程序");
        return view;
    }

}

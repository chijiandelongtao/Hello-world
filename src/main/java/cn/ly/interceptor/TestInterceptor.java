package cn.ly.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 说明：乱码问题，，权限问题（是否登录校验）
 * @version 1.0
 * @date 2017年12月15日
 */
public class TestInterceptor implements HandlerInterceptor{

    /**
     * 返回true 会继续执行
     * 返回false 则会终止
     * Object handler ：public void cn.itcast.note.Conchognzhi.show7(java.lang.String)
     * 多个拦截器工作 
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO Auto-generated method stub
        //解决编码
        //request.setCharacterEncoding("utf-8");
        System.out.println("preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("afterCompletion");
    }

}

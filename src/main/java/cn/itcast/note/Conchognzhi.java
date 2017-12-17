package cn.itcast.note;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.pojo.User;

@Controller
@RequestMapping(value="/user")
public class Conchognzhi {
    @RequestMapping("show")
    public ModelAndView test1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "这里是一个注解的配置");
        return mv;
    }
    
    
    
    @RequestMapping(value="/show1/{user}/show3")
    public ModelAndView test2(@PathVariable("uesr")String user){
        
        ModelAndView m =new ModelAndView();
        m.setViewName("hello");
        m.addObject("msg", user);
        return m;
    }
   
    @RequestMapping(value="/show/{userid}")
    public ModelAndView show3(@PathVariable("userid")String userid){
       
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "show7====真正的高贵是优于过去的自己"+userid);
        return mv;
    }
    
    @RequestMapping(value="show2",params="id")
    public ModelAndView show4(@RequestParam(value="id",defaultValue="100") String id){
        ModelAndView m = new ModelAndView();
        m.setViewName("hello");
        m.addObject("msg", "这样就可以带参数了"+id);
        return m;
    }
    
    @RequestMapping(value="show3")
    public ModelAndView show5(HttpServletRequest request,HttpServletResponse response,HttpSession session){
        ModelAndView m = new ModelAndView("hello");
        StringBuffer s = new StringBuffer();
        s.append(request+"</br>");
        s.append(response+"</br>");
        s.append(session+"</br>");
        m.addObject("msg", s);
        return m;
    }
    
    
    @RequestMapping(value="show4")
    public ModelAndView show6(User user){
        ModelAndView m = new ModelAndView("hello");
        
         m.addObject("msg",user);
         return m;
    }
    
    
    @RequestMapping(value="demo")
    @ResponseStatus(value=HttpStatus.OK)
    public void show7(String name){
        System.out.println(name);
    }
    
    
    
    @RequestMapping("getUser")
    //@ResponseBody
    public User getUser(){
        User user = new User();
        user.setuserName("西门吹牛");
        user.setName("西门吹雪");
        user.setAge(1);
        return user;
    }
    
    @RequestMapping("json")
    public ModelAndView show8(@RequestBody List<User> user){
        
        ModelAndView mo = new ModelAndView("hello");     
        for (User user2 : user) {
            System.out.println(user2);
        }
        return mo;
    }
}

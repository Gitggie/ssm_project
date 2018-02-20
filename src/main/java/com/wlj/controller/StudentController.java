package com.wlj.controller;


import com.wlj.domain.Student;
import com.wlj.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class StudentController {
    Logger logger = Logger.getLogger(StudentController.class);

    //        写了@Resource，这样可不设置set,get方法
    @Resource
    private StudentService studentService;


    // 遍历所有
    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String Show(Map<String, Object> map) {
//            往Map接口实现类map里放入studentAll，方法是getAll
//            getAll方法调用的是接口StudentService啊，没有用他的实现类StudentServiceImpl啊？？？难道是自动用了?
        map.put("studentAll", studentService.getAll());
        return "table";
    }

    //增加
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String Add() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public String Add2(Student student) {
        studentService.insert(student);
        logger.info("something");
        System.out.println("fhhfhf=========================");
        return "redirect:table";
    }
    //这是对应的ajax方法，暂时跑不通
    /*@RequestMapping(value = "/a", method = RequestMethod.PUT)
    @ResponseBody
    public Boolean add(Student student ) {
        logger.info("========="+student);

        return true;
           // studentService.insert(student);
          //  logger.info("add student" + student);

    }*/

    //编辑，不懂用postman怎么测试，Mark一下
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String Edit(Integer id, Model model) {
        Student student = studentService.selectById(id);
        /*按照spring一般的编码习惯,model 应该是contrller里面的Map结构吧.
                Map里面添加key=“student”,value=“student对象”的意思,
                最后把这个model返回一个jsp,在jsp页面上就能得到这个student对象了!
                往前台视图传参数，类似于request.setAttribute("sts",sts)效果一样*/
        model.addAttribute("student", student);
        return "edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String Edit2(Student student) {
        studentService.update(student);
        return "redirect:table";
    }


    //    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public String Shut() {
//        return "shut";
//    }
//这种方法也可以，总之一定要向jsp返回一个suc
    /*@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String Delete(@PathVariable("id") Integer id) {

        boolean result = studentService.delete(id);
        logger.info("delete by id:" + id);
        if (result) {
            return "suc";
        } else {
            return "error";
        }
    }*/
    //删除
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
//    去掉@ResponseBody,删除页面没有反应，要自己刷新一遍，其实已经删除了。
    @ResponseBody
    public void Delete(@PathVariable("id") Integer id, HttpServletResponse response) {
        try {
            response.getWriter().print("suc");
            studentService.delete(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询
    @RequestMapping(value = "/look", method = RequestMethod.GET)
    public String Search() {
        return "search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String Search2(Integer id, Model model) {
        Student student = studentService.selectById(id);
        model.addAttribute("student", student);
        return "result";
    }

    //其他测试，json
    @RequestMapping(value = "/table2", method = RequestMethod.GET)
    public String Show2(Map<String, Object> map) {
        map.put("studentAll", studentService.getAll());
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String Test(Model model) {
        String aaa = "wlj";
        model.addAttribute("AAA", aaa);
        return "test";
    }

    //    test@RequestMapping("filedelete")
//    public String fileDelete(Long fileId) {
//        bizAssetReviewService.deleteFile(fileId);
//        return "biz/asset/assetedit";//回到原来所在的jsp页面
//    }
    /*@RequestMapping(value = "/deleting", method = RequestMethod.GET)
    @ResponseBody
    public String Delete2(Integer id) {
        try {
            studentService.delete(id);
        }catch (IOExceptione e){
            e.printStackTrace();
        }
    }*/
    //原生ajax测试
    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public String ajax() {
        System.out.println("接受到了ajax的请求");
        return "ajax";
    }

    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    public String ajax2() {
        System.out.println("接受到了ajax的请求");
        return null;
    }
}
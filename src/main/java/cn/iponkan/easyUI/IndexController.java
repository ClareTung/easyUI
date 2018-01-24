package cn.iponkan.easyUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"/" ,"","index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/layout")
    public String layout(){
        return "layout";
    }

    @RequestMapping("/layout1")
    public String layout1(){
        return "layout_1";
    }

    @RequestMapping("/mb")
    public String menu_button(){
        return "menu_button";
    }

    @RequestMapping("form")
    public String form(){
        return "form";
    }

    @RequestMapping("window")
    public String window(){
        return "window";
    }

    @RequestMapping("dialog")
    public String dialog(){
        return "dialog";
    }

    @RequestMapping("dg")
    public String dg(){
        return "datagrid";
    }

    @RequestMapping("tree")
    public String tree(){
        return "tree";
    }

    @RequestMapping("portal")
    public String portal(){
        return "portal";
    }
}

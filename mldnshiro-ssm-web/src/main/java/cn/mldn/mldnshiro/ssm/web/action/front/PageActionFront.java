package cn.mldn.mldnshiro.ssm.web.action.front;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageActionFront {
   @RequestMapping("/loginForm")
   public String loginForm() {
	   return "login";
   }
   @RequestMapping("/pages/back/welcome")
   public String welcome() {
	   return "back/welcome";
   }
   @RequestMapping("logout")
   public String logout() {
	   return "login";
   }
   @ResponseBody
   @RequestMapping("/unauth")
   public Object unauth() {
	   return "【Error-auth】没有此类处理权限";
   }
}

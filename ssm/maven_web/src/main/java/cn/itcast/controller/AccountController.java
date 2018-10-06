package cn.itcast.controller;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/*jianghaihua 2018/9/27 0027*/
@Controller
@RequestMapping("/user")
public class AccountController {
    private AccountService accountService;
   @RequestMapping("/findAll")
   public String  findAll(Model model){
       List<Account> all = accountService.findAll();
       Account account = all.get(1);
       model.addAttribute("account",account);
       return "success";
   }
}

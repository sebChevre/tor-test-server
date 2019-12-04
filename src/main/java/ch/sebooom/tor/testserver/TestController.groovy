package ch.sebooom.tor.testserver

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import javax.servlet.http.HttpServletRequest

@Controller
class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String People(Model model,HttpServletRequest request) {
        model.addAttribute"remoteAddress",request.getRemoteAddr()
        model.addAttribute"localAddress",request.getLocalAddr()

        return "test"
    }


}

package org.kndl.warden.controller;

import org.kndl.warden.domain.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public Status test() {
        return new Status(0,"OK");
    }

}

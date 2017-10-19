package com.eric.web.controller;

import com.eric.web.domain.BaseResult;
import com.eric.web.domain.Interviewee;
import com.eric.web.service.InterVieweeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by eric on 2017/10/18.
 */
@RestController
public class InterVieweeController {

    @Autowired
    private InterVieweeService mInterVieweeService;

    @RequestMapping(value = "/api/interviewee", method = RequestMethod.GET)
    public BaseResult<List<Interviewee>> getInterviewees() {
        return mInterVieweeService.getInterviewees();
    }

    @RequestMapping(value = "/api/interviewee/{id}", method = RequestMethod.GET)
    public BaseResult<Interviewee> getInterviewees(@PathVariable("id") long id) {
        return mInterVieweeService.getInterviewee(id);
    }
}

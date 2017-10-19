package com.eric.web.service;

import com.eric.web.domain.BaseResult;
import com.eric.web.domain.Interviewee;

import java.util.List;

/**
 * Created by eric on 2017/10/18.
 */
public interface InterVieweeService {

    BaseResult<List<Interviewee>> getInterviewees();

    BaseResult<Interviewee> getInterviewee(long id);
}

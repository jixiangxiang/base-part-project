package com.eric.web.dao;

import com.eric.web.domain.Interviewee;

import java.util.List;

/**
 * Created by eric on 2017/10/18.
 */
public interface InterVieweeDao {

    List<Interviewee> getInterviewees();

    Interviewee getInterviewee(long id);
}

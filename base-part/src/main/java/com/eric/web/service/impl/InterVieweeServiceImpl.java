package com.eric.web.service.impl;

import com.eric.web.dao.InterVieweeDao;
import com.eric.web.domain.BaseResult;
import com.eric.web.domain.Interviewee;
import com.eric.web.service.InterVieweeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by eric on 2017/10/18.
 */
@Service
public class InterVieweeServiceImpl implements InterVieweeService {
    @Autowired
    private InterVieweeDao mInterVieweeDao;

    @Override
    @Cacheable(value = "intgerviewees")
    public BaseResult<List<Interviewee>> getInterviewees() {
        return BaseResult.newSuccess(mInterVieweeDao.getInterviewees());
    }

    @Override
    @Cacheable(value = "intgerviewee")
    public BaseResult<Interviewee> getInterviewee(long id) {
        return BaseResult.newSuccess(mInterVieweeDao.getInterviewee(id));
    }
}

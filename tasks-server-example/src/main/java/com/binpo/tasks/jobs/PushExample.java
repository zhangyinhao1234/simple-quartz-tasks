package com.binpo.tasks.jobs;

import com.binpo.tasks.AbstractJob;
import com.binpo.tasks.model.ExecuteParams;

public class PushExample extends AbstractJob{

    @Override
    public void execute(ExecuteParams executeParams) {
        System.out.println("定时进行推送。。。。。。。。。。。。");
    }

}

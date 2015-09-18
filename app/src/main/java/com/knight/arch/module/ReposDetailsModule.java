package com.knight.arch.module;

import com.knight.arch.ui.ReposDetailsActivity;
import com.knight.arch.ui.base.InjectableActivity;

import dagger.Module;

/**
 * @author andyiac
 * @date 15-8-4
 * @web http://blog.andyiac.com/
 */

@Module(
        complete = false,
        injects = {
                ReposDetailsActivity.class
//                RankingFragment.class
        }
)
public class ReposDetailsModule {
    InjectableActivity activity;

    public ReposDetailsModule() {
    }

    public ReposDetailsModule(InjectableActivity activity) {
        this.activity = activity;
    }
}

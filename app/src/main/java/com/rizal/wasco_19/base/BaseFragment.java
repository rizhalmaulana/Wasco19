package com.rizal.wasco_19.base;

import com.rizal.wasco_19.utils.DataSource;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {
    public com.rizal.wasco_19.utils.DataSource getDataSources() {
        return new DataSource();
    }
}

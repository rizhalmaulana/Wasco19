package com.rizal.wasco_19.utils;

import com.rizal.wasco_19.model.NewsResponses;

public interface NewsSourceCallback {
    void onSuccess(NewsResponses newsResponses);
    void onFailed(String error);
}

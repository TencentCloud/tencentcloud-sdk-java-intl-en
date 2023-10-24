/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartPublishStreamWithURLRequest extends AbstractModel {

    /**
    * Unique user ID, which is customized by you and is not understood by CAR.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Push address. Only RTMP is supported for push currently.
    */
    @SerializedName("PublishStreamURL")
    @Expose
    private String PublishStreamURL;

    /**
     * Get Unique user ID, which is customized by you and is not understood by CAR. 
     * @return UserId Unique user ID, which is customized by you and is not understood by CAR.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Unique user ID, which is customized by you and is not understood by CAR.
     * @param UserId Unique user ID, which is customized by you and is not understood by CAR.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Push address. Only RTMP is supported for push currently. 
     * @return PublishStreamURL Push address. Only RTMP is supported for push currently.
     */
    public String getPublishStreamURL() {
        return this.PublishStreamURL;
    }

    /**
     * Set Push address. Only RTMP is supported for push currently.
     * @param PublishStreamURL Push address. Only RTMP is supported for push currently.
     */
    public void setPublishStreamURL(String PublishStreamURL) {
        this.PublishStreamURL = PublishStreamURL;
    }

    public StartPublishStreamWithURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishStreamWithURLRequest(StartPublishStreamWithURLRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PublishStreamURL != null) {
            this.PublishStreamURL = new String(source.PublishStreamURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PublishStreamURL", this.PublishStreamURL);

    }
}


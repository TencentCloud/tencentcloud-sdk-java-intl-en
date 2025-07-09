/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * Unique user ID, which is customized by you and is not parsed by CAR.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Streaming address. Only RTMP is supported for streaming currently.
    */
    @SerializedName("PublishStreamURL")
    @Expose
    private String PublishStreamURL;

    /**
     * Get Unique user ID, which is customized by you and is not parsed by CAR. 
     * @return UserId Unique user ID, which is customized by you and is not parsed by CAR.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Unique user ID, which is customized by you and is not parsed by CAR.
     * @param UserId Unique user ID, which is customized by you and is not parsed by CAR.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Streaming address. Only RTMP is supported for streaming currently. 
     * @return PublishStreamURL Streaming address. Only RTMP is supported for streaming currently.
     */
    public String getPublishStreamURL() {
        return this.PublishStreamURL;
    }

    /**
     * Set Streaming address. Only RTMP is supported for streaming currently.
     * @param PublishStreamURL Streaming address. Only RTMP is supported for streaming currently.
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


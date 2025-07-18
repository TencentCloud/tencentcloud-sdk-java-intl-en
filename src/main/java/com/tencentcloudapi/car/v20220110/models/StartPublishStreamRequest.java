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

public class StartPublishStreamRequest extends AbstractModel {

    /**
    * Unique user ID, which is customized by you and is not parsed by CAR. It will be used as the `StreamId` for streaming. For example, if the bound streaming domain is **abc.livepush.myqcloud.com**, the streaming address will be **rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx**.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Streaming parameter, which is a custom parameter carried during streaming.
    */
    @SerializedName("PublishStreamArgs")
    @Expose
    private String PublishStreamArgs;

    /**
     * Get Unique user ID, which is customized by you and is not parsed by CAR. It will be used as the `StreamId` for streaming. For example, if the bound streaming domain is **abc.livepush.myqcloud.com**, the streaming address will be **rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx**. 
     * @return UserId Unique user ID, which is customized by you and is not parsed by CAR. It will be used as the `StreamId` for streaming. For example, if the bound streaming domain is **abc.livepush.myqcloud.com**, the streaming address will be **rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx**.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Unique user ID, which is customized by you and is not parsed by CAR. It will be used as the `StreamId` for streaming. For example, if the bound streaming domain is **abc.livepush.myqcloud.com**, the streaming address will be **rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx**.
     * @param UserId Unique user ID, which is customized by you and is not parsed by CAR. It will be used as the `StreamId` for streaming. For example, if the bound streaming domain is **abc.livepush.myqcloud.com**, the streaming address will be **rtmp://abc.livepush.myqcloud.com/live/UserId?txSecret=xxx&txTime=xxx**.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Streaming parameter, which is a custom parameter carried during streaming. 
     * @return PublishStreamArgs Streaming parameter, which is a custom parameter carried during streaming.
     */
    public String getPublishStreamArgs() {
        return this.PublishStreamArgs;
    }

    /**
     * Set Streaming parameter, which is a custom parameter carried during streaming.
     * @param PublishStreamArgs Streaming parameter, which is a custom parameter carried during streaming.
     */
    public void setPublishStreamArgs(String PublishStreamArgs) {
        this.PublishStreamArgs = PublishStreamArgs;
    }

    public StartPublishStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishStreamRequest(StartPublishStreamRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PublishStreamArgs != null) {
            this.PublishStreamArgs = new String(source.PublishStreamArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PublishStreamArgs", this.PublishStreamArgs);

    }
}


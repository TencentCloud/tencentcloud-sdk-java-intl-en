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

public class VideoEncodeConfig extends AbstractModel {

    /**
    * Streaming GOP length, in seconds.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamPushGOPSeconds")
    @Expose
    private Long StreamPushGOPSeconds;

    /**
     * Get Streaming GOP length, in seconds.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StreamPushGOPSeconds Streaming GOP length, in seconds.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStreamPushGOPSeconds() {
        return this.StreamPushGOPSeconds;
    }

    /**
     * Set Streaming GOP length, in seconds.Note: This field may return null, indicating that no valid values can be obtained.
     * @param StreamPushGOPSeconds Streaming GOP length, in seconds.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamPushGOPSeconds(Long StreamPushGOPSeconds) {
        this.StreamPushGOPSeconds = StreamPushGOPSeconds;
    }

    public VideoEncodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodeConfig(VideoEncodeConfig source) {
        if (source.StreamPushGOPSeconds != null) {
            this.StreamPushGOPSeconds = new Long(source.StreamPushGOPSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamPushGOPSeconds", this.StreamPushGOPSeconds);

    }
}


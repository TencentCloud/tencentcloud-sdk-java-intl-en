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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRTMPPullServerUrl extends AbstractModel {

    /**
    * `tcUrl` of the RTMP pull URL
    */
    @SerializedName("TcUrl")
    @Expose
    private String TcUrl;

    /**
    * Stream key of the RTMP pull URL
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get `tcUrl` of the RTMP pull URL 
     * @return TcUrl `tcUrl` of the RTMP pull URL
     */
    public String getTcUrl() {
        return this.TcUrl;
    }

    /**
     * Set `tcUrl` of the RTMP pull URL
     * @param TcUrl `tcUrl` of the RTMP pull URL
     */
    public void setTcUrl(String TcUrl) {
        this.TcUrl = TcUrl;
    }

    /**
     * Get Stream key of the RTMP pull URL 
     * @return StreamKey Stream key of the RTMP pull URL
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set Stream key of the RTMP pull URL
     * @param StreamKey Stream key of the RTMP pull URL
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    public DescribeOutputRTMPPullServerUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTMPPullServerUrl(DescribeOutputRTMPPullServerUrl source) {
        if (source.TcUrl != null) {
            this.TcUrl = new String(source.TcUrl);
        }
        if (source.StreamKey != null) {
            this.StreamKey = new String(source.StreamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TcUrl", this.TcUrl);
        this.setParamSimple(map, prefix + "StreamKey", this.StreamKey);

    }
}


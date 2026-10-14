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

public class RTMPPullSourceAddress extends AbstractModel {

    /**
    * TcUrl of the RTMP origin server.
    */
    @SerializedName("TcUrl")
    @Expose
    private String TcUrl;

    /**
    * StreamKey information of the RTMP origin server.
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get TcUrl of the RTMP origin server. 
     * @return TcUrl TcUrl of the RTMP origin server.
     */
    public String getTcUrl() {
        return this.TcUrl;
    }

    /**
     * Set TcUrl of the RTMP origin server.
     * @param TcUrl TcUrl of the RTMP origin server.
     */
    public void setTcUrl(String TcUrl) {
        this.TcUrl = TcUrl;
    }

    /**
     * Get StreamKey information of the RTMP origin server. 
     * @return StreamKey StreamKey information of the RTMP origin server.
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set StreamKey information of the RTMP origin server.
     * @param StreamKey StreamKey information of the RTMP origin server.
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    public RTMPPullSourceAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RTMPPullSourceAddress(RTMPPullSourceAddress source) {
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


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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RTMPAddressDestination extends AbstractModel{

    /**
    * Destination URL of RTMP push in the format of 'rtmp://domain/live'.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Destination `StreamKey` of RTMP push in the format of 'streamid?key=value'.
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get Destination URL of RTMP push in the format of 'rtmp://domain/live'. 
     * @return Url Destination URL of RTMP push in the format of 'rtmp://domain/live'.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Destination URL of RTMP push in the format of 'rtmp://domain/live'.
     * @param Url Destination URL of RTMP push in the format of 'rtmp://domain/live'.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Destination `StreamKey` of RTMP push in the format of 'streamid?key=value'. 
     * @return StreamKey Destination `StreamKey` of RTMP push in the format of 'streamid?key=value'.
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set Destination `StreamKey` of RTMP push in the format of 'streamid?key=value'.
     * @param StreamKey Destination `StreamKey` of RTMP push in the format of 'streamid?key=value'.
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StreamKey", this.StreamKey);

    }
}


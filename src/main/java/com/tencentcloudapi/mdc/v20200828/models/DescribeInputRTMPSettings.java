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

public class DescribeInputRTMPSettings extends AbstractModel {

    /**
    * Path for RTMP stream pushing
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * StreamKey for RTMP stream pushing
Format of an RTMP stream pushing URL: rtmp://IP address:1935/AppName/StreamKey
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get Path for RTMP stream pushing
Note: this field may return `null`, indicating that no valid value was found. 
     * @return AppName Path for RTMP stream pushing
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Path for RTMP stream pushing
Note: this field may return `null`, indicating that no valid value was found.
     * @param AppName Path for RTMP stream pushing
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get StreamKey for RTMP stream pushing
Format of an RTMP stream pushing URL: rtmp://IP address:1935/AppName/StreamKey 
     * @return StreamKey StreamKey for RTMP stream pushing
Format of an RTMP stream pushing URL: rtmp://IP address:1935/AppName/StreamKey
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set StreamKey for RTMP stream pushing
Format of an RTMP stream pushing URL: rtmp://IP address:1935/AppName/StreamKey
     * @param StreamKey StreamKey for RTMP stream pushing
Format of an RTMP stream pushing URL: rtmp://IP address:1935/AppName/StreamKey
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    public DescribeInputRTMPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInputRTMPSettings(DescribeInputRTMPSettings source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamKey != null) {
            this.StreamKey = new String(source.StreamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamKey", this.StreamKey);

    }
}


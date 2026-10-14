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

public class CreateOutputRtmpSettingsDestinations extends AbstractModel {

    /**
    * URL for push forwarding, in the format of rtmp://domain/live.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * StreamKey for republishing, in the format of: stream?key=value.
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get URL for push forwarding, in the format of rtmp://domain/live. 
     * @return Url URL for push forwarding, in the format of rtmp://domain/live.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL for push forwarding, in the format of rtmp://domain/live.
     * @param Url URL for push forwarding, in the format of rtmp://domain/live.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get StreamKey for republishing, in the format of: stream?key=value. 
     * @return StreamKey StreamKey for republishing, in the format of: stream?key=value.
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set StreamKey for republishing, in the format of: stream?key=value.
     * @param StreamKey StreamKey for republishing, in the format of: stream?key=value.
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    public CreateOutputRtmpSettingsDestinations() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputRtmpSettingsDestinations(CreateOutputRtmpSettingsDestinations source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StreamKey != null) {
            this.StreamKey = new String(source.StreamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StreamKey", this.StreamKey);

    }
}


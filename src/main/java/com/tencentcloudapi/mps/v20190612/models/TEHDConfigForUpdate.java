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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TEHDConfigForUpdate extends AbstractModel {

    /**
    * Top Speed Codec type. Available values:
<li>TEHD-100: Top Speed Codec-100 (video top speed codec).</li>
<li>TEHD-200: Top Speed Codec-200 (TSC audio).</li>
Leave it blank to keep it unchanged.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Upper limit of video bitrate. Leave blank to keep unchanged.
    */
    @SerializedName("MaxVideoBitrate")
    @Expose
    private Long MaxVideoBitrate;

    /**
     * Get Top Speed Codec type. Available values:
<li>TEHD-100: Top Speed Codec-100 (video top speed codec).</li>
<li>TEHD-200: Top Speed Codec-200 (TSC audio).</li>
Leave it blank to keep it unchanged. 
     * @return Type Top Speed Codec type. Available values:
<li>TEHD-100: Top Speed Codec-100 (video top speed codec).</li>
<li>TEHD-200: Top Speed Codec-200 (TSC audio).</li>
Leave it blank to keep it unchanged.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Top Speed Codec type. Available values:
<li>TEHD-100: Top Speed Codec-100 (video top speed codec).</li>
<li>TEHD-200: Top Speed Codec-200 (TSC audio).</li>
Leave it blank to keep it unchanged.
     * @param Type Top Speed Codec type. Available values:
<li>TEHD-100: Top Speed Codec-100 (video top speed codec).</li>
<li>TEHD-200: Top Speed Codec-200 (TSC audio).</li>
Leave it blank to keep it unchanged.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Upper limit of video bitrate. Leave blank to keep unchanged. 
     * @return MaxVideoBitrate Upper limit of video bitrate. Leave blank to keep unchanged.
     */
    public Long getMaxVideoBitrate() {
        return this.MaxVideoBitrate;
    }

    /**
     * Set Upper limit of video bitrate. Leave blank to keep unchanged.
     * @param MaxVideoBitrate Upper limit of video bitrate. Leave blank to keep unchanged.
     */
    public void setMaxVideoBitrate(Long MaxVideoBitrate) {
        this.MaxVideoBitrate = MaxVideoBitrate;
    }

    public TEHDConfigForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TEHDConfigForUpdate(TEHDConfigForUpdate source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MaxVideoBitrate != null) {
            this.MaxVideoBitrate = new Long(source.MaxVideoBitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxVideoBitrate", this.MaxVideoBitrate);

    }
}


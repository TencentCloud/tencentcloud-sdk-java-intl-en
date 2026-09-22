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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TEHDConfigForUpdate extends AbstractModel {

    /**
    * Top speed Codec type. Available values: <li>TEHD-100: top speed Codec-100;</li> <li>OFF: disables top speed Codec.</li> If not specified, no modification is made.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum video bitrate. If not specified, no modification is made.
    */
    @SerializedName("MaxVideoBitrate")
    @Expose
    private Long MaxVideoBitrate;

    /**
     * Get Top speed Codec type. Available values: <li>TEHD-100: top speed Codec-100;</li> <li>OFF: disables top speed Codec.</li> If not specified, no modification is made. 
     * @return Type Top speed Codec type. Available values: <li>TEHD-100: top speed Codec-100;</li> <li>OFF: disables top speed Codec.</li> If not specified, no modification is made.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Top speed Codec type. Available values: <li>TEHD-100: top speed Codec-100;</li> <li>OFF: disables top speed Codec.</li> If not specified, no modification is made.
     * @param Type Top speed Codec type. Available values: <li>TEHD-100: top speed Codec-100;</li> <li>OFF: disables top speed Codec.</li> If not specified, no modification is made.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Maximum video bitrate. If not specified, no modification is made. 
     * @return MaxVideoBitrate Maximum video bitrate. If not specified, no modification is made.
     */
    public Long getMaxVideoBitrate() {
        return this.MaxVideoBitrate;
    }

    /**
     * Set Maximum video bitrate. If not specified, no modification is made.
     * @param MaxVideoBitrate Maximum video bitrate. If not specified, no modification is made.
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


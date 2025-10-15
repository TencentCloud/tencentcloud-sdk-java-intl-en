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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MotionGraphicsActivateSetting extends AbstractModel {

    /**
    * Duration in ms, valid when MOTION_Graphics_ACTIVATE, required; An integer in the range of 0-86400000, where 0 represents the duration until the end of the live stream.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The address of HTML5 needs to comply with the format specification of http/https.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Duration in ms, valid when MOTION_Graphics_ACTIVATE, required; An integer in the range of 0-86400000, where 0 represents the duration until the end of the live stream. 
     * @return Duration Duration in ms, valid when MOTION_Graphics_ACTIVATE, required; An integer in the range of 0-86400000, where 0 represents the duration until the end of the live stream.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration in ms, valid when MOTION_Graphics_ACTIVATE, required; An integer in the range of 0-86400000, where 0 represents the duration until the end of the live stream.
     * @param Duration Duration in ms, valid when MOTION_Graphics_ACTIVATE, required; An integer in the range of 0-86400000, where 0 represents the duration until the end of the live stream.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The address of HTML5 needs to comply with the format specification of http/https. 
     * @return Url The address of HTML5 needs to comply with the format specification of http/https.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The address of HTML5 needs to comply with the format specification of http/https.
     * @param Url The address of HTML5 needs to comply with the format specification of http/https.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public MotionGraphicsActivateSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MotionGraphicsActivateSetting(MotionGraphicsActivateSetting source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}


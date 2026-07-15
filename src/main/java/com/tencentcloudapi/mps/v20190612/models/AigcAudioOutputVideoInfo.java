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

public class AigcAudioOutputVideoInfo extends AbstractModel {

    /**
    * <p>Video URL.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Video duration.</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get <p>Video URL.</p> 
     * @return Url <p>Video URL.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Video URL.</p>
     * @param Url <p>Video URL.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Video duration.</p> 
     * @return Duration <p>Video duration.</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Video duration.</p>
     * @param Duration <p>Video duration.</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public AigcAudioOutputVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioOutputVideoInfo(AigcAudioOutputVideoInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}


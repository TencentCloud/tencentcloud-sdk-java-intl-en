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

public class ComplexAdaptiveDynamicStreamingTaskSubtitleInput extends AbstractModel {

    /**
    * Subtitle ID. The subtitle must belong to the input main media of the adaptive bitrate task.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Set as the default subtitle for adaptive bitrate. Value:
<li>YES: Set as default subtitle;</li>
<li>NO: Not set as default subtitle (default value).</li>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
     * Get Subtitle ID. The subtitle must belong to the input main media of the adaptive bitrate task. 
     * @return Id Subtitle ID. The subtitle must belong to the input main media of the adaptive bitrate task.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Subtitle ID. The subtitle must belong to the input main media of the adaptive bitrate task.
     * @param Id Subtitle ID. The subtitle must belong to the input main media of the adaptive bitrate task.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Set as the default subtitle for adaptive bitrate. Value:
<li>YES: Set as default subtitle;</li>
<li>NO: Not set as default subtitle (default value).</li> 
     * @return Default Set as the default subtitle for adaptive bitrate. Value:
<li>YES: Set as default subtitle;</li>
<li>NO: Not set as default subtitle (default value).</li>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Set as the default subtitle for adaptive bitrate. Value:
<li>YES: Set as default subtitle;</li>
<li>NO: Not set as default subtitle (default value).</li>
     * @param Default Set as the default subtitle for adaptive bitrate. Value:
<li>YES: Set as default subtitle;</li>
<li>NO: Not set as default subtitle (default value).</li>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput(ComplexAdaptiveDynamicStreamingTaskSubtitleInput source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}


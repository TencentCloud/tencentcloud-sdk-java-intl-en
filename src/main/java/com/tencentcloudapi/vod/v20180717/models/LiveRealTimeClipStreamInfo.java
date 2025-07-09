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

public class LiveRealTimeClipStreamInfo extends AbstractModel {

    /**
    * The type of live stream to clip. Valid values:
<li>Original (<b>default</b>)</li>
<li>Transcoding</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The transcoding template ID.
<b>This is required if `Type` is `Transcoding`.</b>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get The type of live stream to clip. Valid values:
<li>Original (<b>default</b>)</li>
<li>Transcoding</li> 
     * @return Type The type of live stream to clip. Valid values:
<li>Original (<b>default</b>)</li>
<li>Transcoding</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type of live stream to clip. Valid values:
<li>Original (<b>default</b>)</li>
<li>Transcoding</li>
     * @param Type The type of live stream to clip. Valid values:
<li>Original (<b>default</b>)</li>
<li>Transcoding</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The transcoding template ID.
<b>This is required if `Type` is `Transcoding`.</b> 
     * @return TemplateId The transcoding template ID.
<b>This is required if `Type` is `Transcoding`.</b>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The transcoding template ID.
<b>This is required if `Type` is `Transcoding`.</b>
     * @param TemplateId The transcoding template ID.
<b>This is required if `Type` is `Transcoding`.</b>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public LiveRealTimeClipStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipStreamInfo(LiveRealTimeClipStreamInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}


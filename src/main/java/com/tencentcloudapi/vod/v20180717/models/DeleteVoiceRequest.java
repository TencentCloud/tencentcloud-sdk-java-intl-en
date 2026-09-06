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

public class DeleteVoiceRequest extends AbstractModel {

    /**
    * <p>Voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>VOD application ID. From December 25, 2023, customers who activate on-demand services must fill in this field with the app ID when accessing resources in on-demand applications, whether the default application or a newly created application.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
     * Get <p>Voice ID.</p> 
     * @return VoiceId <p>Voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Voice ID.</p>
     * @param VoiceId <p>Voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>VOD application ID. From December 25, 2023, customers who activate on-demand services must fill in this field with the app ID when accessing resources in on-demand applications, whether the default application or a newly created application.</p> 
     * @return SubAppId <p>VOD application ID. From December 25, 2023, customers who activate on-demand services must fill in this field with the app ID when accessing resources in on-demand applications, whether the default application or a newly created application.</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD application ID. From December 25, 2023, customers who activate on-demand services must fill in this field with the app ID when accessing resources in on-demand applications, whether the default application or a newly created application.</p>
     * @param SubAppId <p>VOD application ID. From December 25, 2023, customers who activate on-demand services must fill in this field with the app ID when accessing resources in on-demand applications, whether the default application or a newly created application.</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DeleteVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVoiceRequest(DeleteVoiceRequest source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}


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

public class UpdateVoiceRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("VoiceFields")
    @Expose
    private VoiceUpdateFields VoiceFields;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get  
     * @return VoiceId 
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 
     * @param VoiceId 
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get  
     * @return VoiceFields 
     */
    public VoiceUpdateFields getVoiceFields() {
        return this.VoiceFields;
    }

    /**
     * Set 
     * @param VoiceFields 
     */
    public void setVoiceFields(VoiceUpdateFields VoiceFields) {
        this.VoiceFields = VoiceFields;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return ExtParam 
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 
     * @param ExtParam 
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public UpdateVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateVoiceRequest(UpdateVoiceRequest source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.VoiceFields != null) {
            this.VoiceFields = new VoiceUpdateFields(source.VoiceFields);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamObj(map, prefix + "VoiceFields.", this.VoiceFields);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}


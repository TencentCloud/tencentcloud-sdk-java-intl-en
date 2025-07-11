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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLivePadRuleRequest extends AbstractModel {

    /**
    * Domain name for streaming.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * The streaming path is consistent with the AppName in the streaming and playback address. The default value is live.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name. Note: If this parameter is set to a non-empty string, the rule will only work on this push stream.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get Domain name for streaming. 
     * @return DomainName Domain name for streaming.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name for streaming.
     * @param DomainName Domain name for streaming.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The template ID. 
     * @return TemplateId The template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The template ID.
     * @param TemplateId The template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The streaming path is consistent with the AppName in the streaming and playback address. The default value is live. 
     * @return AppName The streaming path is consistent with the AppName in the streaming and playback address. The default value is live.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The streaming path is consistent with the AppName in the streaming and playback address. The default value is live.
     * @param AppName The streaming path is consistent with the AppName in the streaming and playback address. The default value is live.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name. Note: If this parameter is set to a non-empty string, the rule will only work on this push stream. 
     * @return StreamName Stream name. Note: If this parameter is set to a non-empty string, the rule will only work on this push stream.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name. Note: If this parameter is set to a non-empty string, the rule will only work on this push stream.
     * @param StreamName Stream name. Note: If this parameter is set to a non-empty string, the rule will only work on this push stream.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    public CreateLivePadRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLivePadRuleRequest(CreateLivePadRuleRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}


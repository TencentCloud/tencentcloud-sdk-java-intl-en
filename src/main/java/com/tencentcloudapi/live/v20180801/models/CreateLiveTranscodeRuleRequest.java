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

public class CreateLiveTranscodeRuleRequest extends AbstractModel {

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The push path, which is the same as `AppName` in the push and playback addresses and is `live` by default. If you only want to bind the template to a domain, pass in an empty string.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name. If only the domain name or path is bound, leave this parameter blank.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Designates an existing template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The push path, which is the same as `AppName` in the push and playback addresses and is `live` by default. If you only want to bind the template to a domain, pass in an empty string. 
     * @return AppName The push path, which is the same as `AppName` in the push and playback addresses and is `live` by default. If you only want to bind the template to a domain, pass in an empty string.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path, which is the same as `AppName` in the push and playback addresses and is `live` by default. If you only want to bind the template to a domain, pass in an empty string.
     * @param AppName The push path, which is the same as `AppName` in the push and playback addresses and is `live` by default. If you only want to bind the template to a domain, pass in an empty string.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name. If only the domain name or path is bound, leave this parameter blank. 
     * @return StreamName Stream name. If only the domain name or path is bound, leave this parameter blank.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name. If only the domain name or path is bound, leave this parameter blank.
     * @param StreamName Stream name. If only the domain name or path is bound, leave this parameter blank.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Designates an existing template ID. 
     * @return TemplateId Designates an existing template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Designates an existing template ID.
     * @param TemplateId Designates an existing template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public CreateLiveTranscodeRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveTranscodeRuleRequest(CreateLiveTranscodeRuleRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}


/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveTranscodeRuleRequest extends AbstractModel{

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you only bind a domain name, leave this parameter empty.
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
     * Get Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you only bind a domain name, leave this parameter empty. 
     * @return AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you only bind a domain name, leave this parameter empty.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you only bind a domain name, leave this parameter empty.
     * @param AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. If you only bind a domain name, leave this parameter empty.
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


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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveTimeShiftRuleRequest extends AbstractModel {

    /**
    * The push domain.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The push path, which should be the same as `AppName` in the push and playback URLs. The default value is `live`.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The stream name.
Note: If you pass in a non-empty string, the rule will only be applied to the specified stream.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get The push domain. 
     * @return DomainName The push domain.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The push domain.
     * @param DomainName The push domain.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The push path, which should be the same as `AppName` in the push and playback URLs. The default value is `live`. 
     * @return AppName The push path, which should be the same as `AppName` in the push and playback URLs. The default value is `live`.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path, which should be the same as `AppName` in the push and playback URLs. The default value is `live`.
     * @param AppName The push path, which should be the same as `AppName` in the push and playback URLs. The default value is `live`.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The stream name.
Note: If you pass in a non-empty string, the rule will only be applied to the specified stream. 
     * @return StreamName The stream name.
Note: If you pass in a non-empty string, the rule will only be applied to the specified stream.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
Note: If you pass in a non-empty string, the rule will only be applied to the specified stream.
     * @param StreamName The stream name.
Note: If you pass in a non-empty string, the rule will only be applied to the specified stream.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
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

    public CreateLiveTimeShiftRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveTimeShiftRuleRequest(CreateLiveTimeShiftRuleRequest source) {
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


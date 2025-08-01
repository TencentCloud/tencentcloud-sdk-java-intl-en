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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel {

    /**
    * See [Event Pattern](https://intl.cloud.tencent.com/document/product/1359/56084?from_cn_redirect=1)
    */
    @SerializedName("EventPattern")
    @Expose
    private String EventPattern;

    /**
    * Event bus ID.
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Switch.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Event bus description, which can contain up to 200 characters of any type
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get See [Event Pattern](https://intl.cloud.tencent.com/document/product/1359/56084?from_cn_redirect=1) 
     * @return EventPattern See [Event Pattern](https://intl.cloud.tencent.com/document/product/1359/56084?from_cn_redirect=1)
     */
    public String getEventPattern() {
        return this.EventPattern;
    }

    /**
     * Set See [Event Pattern](https://intl.cloud.tencent.com/document/product/1359/56084?from_cn_redirect=1)
     * @param EventPattern See [Event Pattern](https://intl.cloud.tencent.com/document/product/1359/56084?from_cn_redirect=1)
     */
    public void setEventPattern(String EventPattern) {
        this.EventPattern = EventPattern;
    }

    /**
     * Get Event bus ID. 
     * @return EventBusId Event bus ID.
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID.
     * @param EventBusId Event bus ID.
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter 
     * @return RuleName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     * @param RuleName Event bus name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Switch. 
     * @return Enable Switch.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch.
     * @param Enable Switch.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Event bus description, which can contain up to 200 characters of any type 
     * @return Description Event bus description, which can contain up to 200 characters of any type
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event bus description, which can contain up to 200 characters of any type
     * @param Description Event bus description, which can contain up to 200 characters of any type
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.EventPattern != null) {
            this.EventPattern = new String(source.EventPattern);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventPattern", this.EventPattern);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


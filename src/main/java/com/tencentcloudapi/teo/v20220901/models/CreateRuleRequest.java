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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Rule name. The string length is 1–255.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status. Valid values:
<li> enable: Enable;</li>
<li> disable: disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule content.
    */
    @SerializedName("Rules")
    @Expose
    private Rule [] Rules;

    /**
    * Rule tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Rule name. The string length is 1–255. 
     * @return RuleName Rule name. The string length is 1–255.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. The string length is 1–255.
     * @param RuleName Rule name. The string length is 1–255.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule status. Valid values:
<li> enable: Enable;</li>
<li> disable: disabled.</li> 
     * @return Status Rule status. Valid values:
<li> enable: Enable;</li>
<li> disable: disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values:
<li> enable: Enable;</li>
<li> disable: disabled.</li>
     * @param Status Rule status. Valid values:
<li> enable: Enable;</li>
<li> disable: disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule content. 
     * @return Rules Rule content.
     */
    public Rule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule content.
     * @param Rules Rule content.
     */
    public void setRules(Rule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Rule tag. 
     * @return Tags Rule tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Rule tag.
     * @param Tags Rule tag.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Rules != null) {
            this.Rules = new Rule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Rule(source.Rules[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}


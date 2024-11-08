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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateForwardRuleRequest extends AbstractModel {

    /**
    * Forwarding rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Private domain ID, which can be viewed on the private domain list page.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Endpoint ID.
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
     * Get Forwarding rule name. 
     * @return RuleName Forwarding rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Forwarding rule name.
     * @param RuleName Forwarding rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud. 
     * @return RuleType Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     * @param RuleType Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Private domain ID, which can be viewed on the private domain list page. 
     * @return ZoneId Private domain ID, which can be viewed on the private domain list page.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID, which can be viewed on the private domain list page.
     * @param ZoneId Private domain ID, which can be viewed on the private domain list page.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Endpoint ID. 
     * @return EndPointId Endpoint ID.
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID.
     * @param EndPointId Endpoint ID.
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    public CreateForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardRuleRequest(CreateForwardRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);

    }
}


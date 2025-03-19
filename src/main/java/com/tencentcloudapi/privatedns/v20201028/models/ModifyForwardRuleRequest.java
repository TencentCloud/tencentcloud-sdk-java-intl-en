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

public class ModifyForwardRuleRequest extends AbstractModel {

    /**
    * Forwarding rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Endpoint ID.
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
     * Get Forwarding rule ID. 
     * @return RuleId Forwarding rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID.
     * @param RuleId Forwarding rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

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

    public ModifyForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyForwardRuleRequest(ModifyForwardRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);

    }
}


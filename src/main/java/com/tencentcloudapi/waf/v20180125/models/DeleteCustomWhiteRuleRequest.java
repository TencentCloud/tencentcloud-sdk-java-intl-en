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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomWhiteRuleRequest extends AbstractModel {

    /**
    * Deleted domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Deleted rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Deleted domain 
     * @return Domain Deleted domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Deleted domain
     * @param Domain Deleted domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Deleted rule ID 
     * @return RuleId Deleted rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Deleted rule ID
     * @param RuleId Deleted rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public DeleteCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomWhiteRuleRequest(DeleteCustomWhiteRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}


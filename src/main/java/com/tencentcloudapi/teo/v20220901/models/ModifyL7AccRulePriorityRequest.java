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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyL7AccRulePriorityRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The complete rule ID list under the site ID can be obtained by [Querying the seven-layer acceleration rules](https://intl.cloud.tencent.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, and will be executed from the front to the back.
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

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
     * Get The complete rule ID list under the site ID can be obtained by [Querying the seven-layer acceleration rules](https://intl.cloud.tencent.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, and will be executed from the front to the back. 
     * @return RuleIds The complete rule ID list under the site ID can be obtained by [Querying the seven-layer acceleration rules](https://intl.cloud.tencent.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, and will be executed from the front to the back.
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set The complete rule ID list under the site ID can be obtained by [Querying the seven-layer acceleration rules](https://intl.cloud.tencent.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, and will be executed from the front to the back.
     * @param RuleIds The complete rule ID list under the site ID can be obtained by [Querying the seven-layer acceleration rules](https://intl.cloud.tencent.com/document/product/1552/115820?from_cn_redirect=1). The final priority order will be adjusted to the order of the rule ID list, and will be executed from the front to the back.
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    public ModifyL7AccRulePriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL7AccRulePriorityRequest(ModifyL7AccRulePriorityRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);

    }
}


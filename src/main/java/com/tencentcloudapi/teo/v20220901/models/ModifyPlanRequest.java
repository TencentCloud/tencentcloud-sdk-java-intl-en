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

public class ModifyPlanRequest extends AbstractModel {

    /**
    * Plan ID, formatted as edgeone-2unuvzjmmn2q.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Auto-renewal configuration item in a prepaid plan. If auto-renewal is enabled, the plan will be automatically renewed one day before it expires. This feature is only available for Personal, Basic, and Standard Edition Plans. If this field is not specified, the original configuration will be retained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private RenewFlag RenewFlag;

    /**
     * Get Plan ID, formatted as edgeone-2unuvzjmmn2q. 
     * @return PlanId Plan ID, formatted as edgeone-2unuvzjmmn2q.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Plan ID, formatted as edgeone-2unuvzjmmn2q.
     * @param PlanId Plan ID, formatted as edgeone-2unuvzjmmn2q.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Auto-renewal configuration item in a prepaid plan. If auto-renewal is enabled, the plan will be automatically renewed one day before it expires. This feature is only available for Personal, Basic, and Standard Edition Plans. If this field is not specified, the original configuration will be retained. 
     * @return RenewFlag Auto-renewal configuration item in a prepaid plan. If auto-renewal is enabled, the plan will be automatically renewed one day before it expires. This feature is only available for Personal, Basic, and Standard Edition Plans. If this field is not specified, the original configuration will be retained.
     */
    public RenewFlag getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal configuration item in a prepaid plan. If auto-renewal is enabled, the plan will be automatically renewed one day before it expires. This feature is only available for Personal, Basic, and Standard Edition Plans. If this field is not specified, the original configuration will be retained.
     * @param RenewFlag Auto-renewal configuration item in a prepaid plan. If auto-renewal is enabled, the plan will be automatically renewed one day before it expires. This feature is only available for Personal, Basic, and Standard Edition Plans. If this field is not specified, the original configuration will be retained.
     */
    public void setRenewFlag(RenewFlag RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ModifyPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPlanRequest(ModifyPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new RenewFlag(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamObj(map, prefix + "RenewFlag.", this.RenewFlag);

    }
}


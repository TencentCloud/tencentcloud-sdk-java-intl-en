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

public class IncreasePlanQuotaRequest extends AbstractModel {

    /**
    * Plan ID, formatted as edgeone-2unuvzjmmn2q.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * The types of new plan quotas available include:<li> site: Number of sites;</li><li> precise_access_control_rule: the number of rules under "Web Protection - Custom Rules - Precision Matching Policy";</li><li> rate_limiting_rule: the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module". </li>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * Number of new quotas. The maximum number of quotas that can be added at one time is 100.
    */
    @SerializedName("QuotaNumber")
    @Expose
    private Long QuotaNumber;

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
     * Get The types of new plan quotas available include:<li> site: Number of sites;</li><li> precise_access_control_rule: the number of rules under "Web Protection - Custom Rules - Precision Matching Policy";</li><li> rate_limiting_rule: the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module". </li> 
     * @return QuotaType The types of new plan quotas available include:<li> site: Number of sites;</li><li> precise_access_control_rule: the number of rules under "Web Protection - Custom Rules - Precision Matching Policy";</li><li> rate_limiting_rule: the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module". </li>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set The types of new plan quotas available include:<li> site: Number of sites;</li><li> precise_access_control_rule: the number of rules under "Web Protection - Custom Rules - Precision Matching Policy";</li><li> rate_limiting_rule: the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module". </li>
     * @param QuotaType The types of new plan quotas available include:<li> site: Number of sites;</li><li> precise_access_control_rule: the number of rules under "Web Protection - Custom Rules - Precision Matching Policy";</li><li> rate_limiting_rule: the number of rules under "Web Protection - Rate Limiting - Precision Rate Limiting Module". </li>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get Number of new quotas. The maximum number of quotas that can be added at one time is 100. 
     * @return QuotaNumber Number of new quotas. The maximum number of quotas that can be added at one time is 100.
     */
    public Long getQuotaNumber() {
        return this.QuotaNumber;
    }

    /**
     * Set Number of new quotas. The maximum number of quotas that can be added at one time is 100.
     * @param QuotaNumber Number of new quotas. The maximum number of quotas that can be added at one time is 100.
     */
    public void setQuotaNumber(Long QuotaNumber) {
        this.QuotaNumber = QuotaNumber;
    }

    public IncreasePlanQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncreasePlanQuotaRequest(IncreasePlanQuotaRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaNumber != null) {
            this.QuotaNumber = new Long(source.QuotaNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaNumber", this.QuotaNumber);

    }
}


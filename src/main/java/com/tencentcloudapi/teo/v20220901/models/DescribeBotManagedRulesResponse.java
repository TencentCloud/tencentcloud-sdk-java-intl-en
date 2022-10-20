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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotManagedRulesResponse extends AbstractModel{

    /**
    * Number of bot managed rules returned.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The bot managed rule.
    */
    @SerializedName("BotManagedRuleDetails")
    @Expose
    private BotManagedRuleDetail [] BotManagedRuleDetails;

    /**
    * The total number of bot managed rules.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of bot managed rules returned. 
     * @return Count Number of bot managed rules returned.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of bot managed rules returned.
     * @param Count Number of bot managed rules returned.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get The bot managed rule. 
     * @return BotManagedRuleDetails The bot managed rule.
     */
    public BotManagedRuleDetail [] getBotManagedRuleDetails() {
        return this.BotManagedRuleDetails;
    }

    /**
     * Set The bot managed rule.
     * @param BotManagedRuleDetails The bot managed rule.
     */
    public void setBotManagedRuleDetails(BotManagedRuleDetail [] BotManagedRuleDetails) {
        this.BotManagedRuleDetails = BotManagedRuleDetails;
    }

    /**
     * Get The total number of bot managed rules. 
     * @return Total The total number of bot managed rules.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of bot managed rules.
     * @param Total The total number of bot managed rules.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBotManagedRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotManagedRulesResponse(DescribeBotManagedRulesResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.BotManagedRuleDetails != null) {
            this.BotManagedRuleDetails = new BotManagedRuleDetail[source.BotManagedRuleDetails.length];
            for (int i = 0; i < source.BotManagedRuleDetails.length; i++) {
                this.BotManagedRuleDetails[i] = new BotManagedRuleDetail(source.BotManagedRuleDetails[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "BotManagedRuleDetails.", this.BotManagedRuleDetails);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAgentCreditResponse extends AbstractModel{

    /**
    * Allocated credit
    */
    @SerializedName("AssignedCreditAmount")
    @Expose
    private Float AssignedCreditAmount;

    /**
    * Total credit
    */
    @SerializedName("CustomerCreditAmount")
    @Expose
    private Float CustomerCreditAmount;

    /**
    * Remaining credit
    */
    @SerializedName("RemainingCreditAmount")
    @Expose
    private Float RemainingCreditAmount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Allocated credit 
     * @return AssignedCreditAmount Allocated credit
     */
    public Float getAssignedCreditAmount() {
        return this.AssignedCreditAmount;
    }

    /**
     * Set Allocated credit
     * @param AssignedCreditAmount Allocated credit
     */
    public void setAssignedCreditAmount(Float AssignedCreditAmount) {
        this.AssignedCreditAmount = AssignedCreditAmount;
    }

    /**
     * Get Total credit 
     * @return CustomerCreditAmount Total credit
     */
    public Float getCustomerCreditAmount() {
        return this.CustomerCreditAmount;
    }

    /**
     * Set Total credit
     * @param CustomerCreditAmount Total credit
     */
    public void setCustomerCreditAmount(Float CustomerCreditAmount) {
        this.CustomerCreditAmount = CustomerCreditAmount;
    }

    /**
     * Get Remaining credit 
     * @return RemainingCreditAmount Remaining credit
     */
    public Float getRemainingCreditAmount() {
        return this.RemainingCreditAmount;
    }

    /**
     * Set Remaining credit
     * @param RemainingCreditAmount Remaining credit
     */
    public void setRemainingCreditAmount(Float RemainingCreditAmount) {
        this.RemainingCreditAmount = RemainingCreditAmount;
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

    public QueryAgentCreditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAgentCreditResponse(QueryAgentCreditResponse source) {
        if (source.AssignedCreditAmount != null) {
            this.AssignedCreditAmount = new Float(source.AssignedCreditAmount);
        }
        if (source.CustomerCreditAmount != null) {
            this.CustomerCreditAmount = new Float(source.CustomerCreditAmount);
        }
        if (source.RemainingCreditAmount != null) {
            this.RemainingCreditAmount = new Float(source.RemainingCreditAmount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssignedCreditAmount", this.AssignedCreditAmount);
        this.setParamSimple(map, prefix + "CustomerCreditAmount", this.CustomerCreditAmount);
        this.setParamSimple(map, prefix + "RemainingCreditAmount", this.RemainingCreditAmount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


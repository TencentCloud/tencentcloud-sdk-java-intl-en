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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryPartnerCreditResponse extends AbstractModel {

    /**
    * Allocated credit
    */
    @SerializedName("AllocatedCredit")
    @Expose
    private Float AllocatedCredit;

    /**
    * Total credit
    */
    @SerializedName("TotalCredit")
    @Expose
    private Float TotalCredit;

    /**
    * Remaining credit
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Allocated credit 
     * @return AllocatedCredit Allocated credit
     */
    public Float getAllocatedCredit() {
        return this.AllocatedCredit;
    }

    /**
     * Set Allocated credit
     * @param AllocatedCredit Allocated credit
     */
    public void setAllocatedCredit(Float AllocatedCredit) {
        this.AllocatedCredit = AllocatedCredit;
    }

    /**
     * Get Total credit 
     * @return TotalCredit Total credit
     */
    public Float getTotalCredit() {
        return this.TotalCredit;
    }

    /**
     * Set Total credit
     * @param TotalCredit Total credit
     */
    public void setTotalCredit(Float TotalCredit) {
        this.TotalCredit = TotalCredit;
    }

    /**
     * Get Remaining credit 
     * @return RemainingCredit Remaining credit
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set Remaining credit
     * @param RemainingCredit Remaining credit
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
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

    public QueryPartnerCreditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPartnerCreditResponse(QueryPartnerCreditResponse source) {
        if (source.AllocatedCredit != null) {
            this.AllocatedCredit = new Float(source.AllocatedCredit);
        }
        if (source.TotalCredit != null) {
            this.TotalCredit = new Float(source.TotalCredit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedCredit", this.AllocatedCredit);
        this.setParamSimple(map, prefix + "TotalCredit", this.TotalCredit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


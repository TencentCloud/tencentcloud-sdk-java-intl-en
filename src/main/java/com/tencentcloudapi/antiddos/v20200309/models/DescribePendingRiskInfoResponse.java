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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePendingRiskInfoResponse extends AbstractModel{

    /**
    * Whether the user is a paid user. Values: `true`, `false`.
    */
    @SerializedName("IsPaidUsr")
    @Expose
    private Boolean IsPaidUsr;

    /**
    * Number of resources being attacked
    */
    @SerializedName("AttackingCount")
    @Expose
    private Long AttackingCount;

    /**
    * Number of resource blocked
    */
    @SerializedName("BlockingCount")
    @Expose
    private Long BlockingCount;

    /**
    * Number of expired resources
    */
    @SerializedName("ExpiredCount")
    @Expose
    private Long ExpiredCount;

    /**
    * Total pending risk events
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
     * Get Whether the user is a paid user. Values: `true`, `false`. 
     * @return IsPaidUsr Whether the user is a paid user. Values: `true`, `false`.
     */
    public Boolean getIsPaidUsr() {
        return this.IsPaidUsr;
    }

    /**
     * Set Whether the user is a paid user. Values: `true`, `false`.
     * @param IsPaidUsr Whether the user is a paid user. Values: `true`, `false`.
     */
    public void setIsPaidUsr(Boolean IsPaidUsr) {
        this.IsPaidUsr = IsPaidUsr;
    }

    /**
     * Get Number of resources being attacked 
     * @return AttackingCount Number of resources being attacked
     */
    public Long getAttackingCount() {
        return this.AttackingCount;
    }

    /**
     * Set Number of resources being attacked
     * @param AttackingCount Number of resources being attacked
     */
    public void setAttackingCount(Long AttackingCount) {
        this.AttackingCount = AttackingCount;
    }

    /**
     * Get Number of resource blocked 
     * @return BlockingCount Number of resource blocked
     */
    public Long getBlockingCount() {
        return this.BlockingCount;
    }

    /**
     * Set Number of resource blocked
     * @param BlockingCount Number of resource blocked
     */
    public void setBlockingCount(Long BlockingCount) {
        this.BlockingCount = BlockingCount;
    }

    /**
     * Get Number of expired resources 
     * @return ExpiredCount Number of expired resources
     */
    public Long getExpiredCount() {
        return this.ExpiredCount;
    }

    /**
     * Set Number of expired resources
     * @param ExpiredCount Number of expired resources
     */
    public void setExpiredCount(Long ExpiredCount) {
        this.ExpiredCount = ExpiredCount;
    }

    /**
     * Get Total pending risk events 
     * @return Total Total pending risk events
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total pending risk events
     * @param Total Total pending risk events
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

    public DescribePendingRiskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePendingRiskInfoResponse(DescribePendingRiskInfoResponse source) {
        if (source.IsPaidUsr != null) {
            this.IsPaidUsr = new Boolean(source.IsPaidUsr);
        }
        if (source.AttackingCount != null) {
            this.AttackingCount = new Long(source.AttackingCount);
        }
        if (source.BlockingCount != null) {
            this.BlockingCount = new Long(source.BlockingCount);
        }
        if (source.ExpiredCount != null) {
            this.ExpiredCount = new Long(source.ExpiredCount);
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
        this.setParamSimple(map, prefix + "IsPaidUsr", this.IsPaidUsr);
        this.setParamSimple(map, prefix + "AttackingCount", this.AttackingCount);
        this.setParamSimple(map, prefix + "BlockingCount", this.BlockingCount);
        this.setParamSimple(map, prefix + "ExpiredCount", this.ExpiredCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


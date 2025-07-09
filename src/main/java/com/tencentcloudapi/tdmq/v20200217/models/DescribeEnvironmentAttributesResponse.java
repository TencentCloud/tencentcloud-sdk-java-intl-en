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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvironmentAttributesResponse extends AbstractModel {

    /**
    * TTL for unconsumed messages in seconds. Maximum value: 1296000 seconds (i.e., 15 days).
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Consumption rate limit in bytes/second. 0: unlimited.
    */
    @SerializedName("RateInByte")
    @Expose
    private Long RateInByte;

    /**
    * Consumption rate limit in messages/second. 0: unlimited.
    */
    @SerializedName("RateInSize")
    @Expose
    private Long RateInSize;

    /**
    * Retention policy for consumed messages in hours. 0: deleted immediately after consumption.
    */
    @SerializedName("RetentionHours")
    @Expose
    private Long RetentionHours;

    /**
    * Retention policy for consumed messages in GB. 0: deleted immediately after consumption.
    */
    @SerializedName("RetentionSize")
    @Expose
    private Long RetentionSize;

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Number of replicas.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TTL for unconsumed messages in seconds. Maximum value: 1296000 seconds (i.e., 15 days). 
     * @return MsgTTL TTL for unconsumed messages in seconds. Maximum value: 1296000 seconds (i.e., 15 days).
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set TTL for unconsumed messages in seconds. Maximum value: 1296000 seconds (i.e., 15 days).
     * @param MsgTTL TTL for unconsumed messages in seconds. Maximum value: 1296000 seconds (i.e., 15 days).
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Consumption rate limit in bytes/second. 0: unlimited. 
     * @return RateInByte Consumption rate limit in bytes/second. 0: unlimited.
     */
    public Long getRateInByte() {
        return this.RateInByte;
    }

    /**
     * Set Consumption rate limit in bytes/second. 0: unlimited.
     * @param RateInByte Consumption rate limit in bytes/second. 0: unlimited.
     */
    public void setRateInByte(Long RateInByte) {
        this.RateInByte = RateInByte;
    }

    /**
     * Get Consumption rate limit in messages/second. 0: unlimited. 
     * @return RateInSize Consumption rate limit in messages/second. 0: unlimited.
     */
    public Long getRateInSize() {
        return this.RateInSize;
    }

    /**
     * Set Consumption rate limit in messages/second. 0: unlimited.
     * @param RateInSize Consumption rate limit in messages/second. 0: unlimited.
     */
    public void setRateInSize(Long RateInSize) {
        this.RateInSize = RateInSize;
    }

    /**
     * Get Retention policy for consumed messages in hours. 0: deleted immediately after consumption. 
     * @return RetentionHours Retention policy for consumed messages in hours. 0: deleted immediately after consumption.
     */
    public Long getRetentionHours() {
        return this.RetentionHours;
    }

    /**
     * Set Retention policy for consumed messages in hours. 0: deleted immediately after consumption.
     * @param RetentionHours Retention policy for consumed messages in hours. 0: deleted immediately after consumption.
     */
    public void setRetentionHours(Long RetentionHours) {
        this.RetentionHours = RetentionHours;
    }

    /**
     * Get Retention policy for consumed messages in GB. 0: deleted immediately after consumption. 
     * @return RetentionSize Retention policy for consumed messages in GB. 0: deleted immediately after consumption.
     */
    public Long getRetentionSize() {
        return this.RetentionSize;
    }

    /**
     * Set Retention policy for consumed messages in GB. 0: deleted immediately after consumption.
     * @param RetentionSize Retention policy for consumed messages in GB. 0: deleted immediately after consumption.
     */
    public void setRetentionSize(Long RetentionSize) {
        this.RetentionSize = RetentionSize;
    }

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Number of replicas. 
     * @return Replicas Number of replicas.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Number of replicas.
     * @param Replicas Number of replicas.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    public DescribeEnvironmentAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentAttributesResponse(DescribeEnvironmentAttributesResponse source) {
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.RateInByte != null) {
            this.RateInByte = new Long(source.RateInByte);
        }
        if (source.RateInSize != null) {
            this.RateInSize = new Long(source.RateInSize);
        }
        if (source.RetentionHours != null) {
            this.RetentionHours = new Long(source.RetentionHours);
        }
        if (source.RetentionSize != null) {
            this.RetentionSize = new Long(source.RetentionSize);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "RateInByte", this.RateInByte);
        this.setParamSimple(map, prefix + "RateInSize", this.RateInSize);
        this.setParamSimple(map, prefix + "RetentionHours", this.RetentionHours);
        this.setParamSimple(map, prefix + "RetentionSize", this.RetentionSize);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


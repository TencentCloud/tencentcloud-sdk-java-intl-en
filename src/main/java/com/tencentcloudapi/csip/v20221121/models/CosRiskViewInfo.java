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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosRiskViewInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Policy classification
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy risk level
    */
    @SerializedName("PolicyRiskLevel")
    @Expose
    private Long PolicyRiskLevel;

    /**
    * Policy description
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * Number of buckets to be processed
    */
    @SerializedName("HandleBucketCount")
    @Expose
    private Long HandleBucketCount;

    /**
    * Most recent risk detection time in Unix timestamp in milliseconds
    */
    @SerializedName("LastScanTimestamp")
    @Expose
    private Long LastScanTimestamp;

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Policy name. 
     * @return PolicyName Policy name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name.
     * @param PolicyName Policy name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy classification 
     * @return PolicyType Policy classification
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy classification
     * @param PolicyType Policy classification
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy risk level 
     * @return PolicyRiskLevel Policy risk level
     */
    public Long getPolicyRiskLevel() {
        return this.PolicyRiskLevel;
    }

    /**
     * Set Policy risk level
     * @param PolicyRiskLevel Policy risk level
     */
    public void setPolicyRiskLevel(Long PolicyRiskLevel) {
        this.PolicyRiskLevel = PolicyRiskLevel;
    }

    /**
     * Get Policy description 
     * @return PolicyDescription Policy description
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set Policy description
     * @param PolicyDescription Policy description
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get Number of buckets to be processed 
     * @return HandleBucketCount Number of buckets to be processed
     */
    public Long getHandleBucketCount() {
        return this.HandleBucketCount;
    }

    /**
     * Set Number of buckets to be processed
     * @param HandleBucketCount Number of buckets to be processed
     */
    public void setHandleBucketCount(Long HandleBucketCount) {
        this.HandleBucketCount = HandleBucketCount;
    }

    /**
     * Get Most recent risk detection time in Unix timestamp in milliseconds 
     * @return LastScanTimestamp Most recent risk detection time in Unix timestamp in milliseconds
     */
    public Long getLastScanTimestamp() {
        return this.LastScanTimestamp;
    }

    /**
     * Set Most recent risk detection time in Unix timestamp in milliseconds
     * @param LastScanTimestamp Most recent risk detection time in Unix timestamp in milliseconds
     */
    public void setLastScanTimestamp(Long LastScanTimestamp) {
        this.LastScanTimestamp = LastScanTimestamp;
    }

    public CosRiskViewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskViewInfo(CosRiskViewInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyRiskLevel != null) {
            this.PolicyRiskLevel = new Long(source.PolicyRiskLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.HandleBucketCount != null) {
            this.HandleBucketCount = new Long(source.HandleBucketCount);
        }
        if (source.LastScanTimestamp != null) {
            this.LastScanTimestamp = new Long(source.LastScanTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyRiskLevel", this.PolicyRiskLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "HandleBucketCount", this.HandleBucketCount);
        this.setParamSimple(map, prefix + "LastScanTimestamp", this.LastScanTimestamp);

    }
}


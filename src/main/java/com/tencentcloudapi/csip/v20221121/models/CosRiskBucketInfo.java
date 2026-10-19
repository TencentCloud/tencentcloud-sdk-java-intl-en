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

public class CosRiskBucketInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Bucket name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Bucket region.
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * Bucket remark information
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * Bucket uin
    */
    @SerializedName("BucketUin")
    @Expose
    private String BucketUin;

    /**
    * uin nickname
    */
    @SerializedName("BucketNickName")
    @Expose
    private String BucketNickName;

    /**
    * uin root account nickname
    */
    @SerializedName("BucketMainNickName")
    @Expose
    private String BucketMainNickName;

    /**
    * uin identity
    */
    @SerializedName("BucketIdentify")
    @Expose
    private Long BucketIdentify;

    /**
    * Risk detection time in Unix timestamp in milliseconds
    */
    @SerializedName("LastScanTimestamp")
    @Expose
    private Long LastScanTimestamp;

    /**
    * Status Information
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * Risk name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Risk type
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy level
    */
    @SerializedName("PolicyLevel")
    @Expose
    private Long PolicyLevel;

    /**
    * Policy description
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * Access method
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private String BucketAccessWay;

    /**
    * Tag information.
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * Risk id
    */
    @SerializedName("RiskId")
    @Expose
    private Long RiskId;

    /**
    * cos region code value
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * Whether automatic monitoring is enabled. 0: disabled. 1: enabled.
    */
    @SerializedName("BucketMonitorStatus")
    @Expose
    private Long BucketMonitorStatus;

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
     * Get Bucket name 
     * @return BucketName Bucket name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name
     * @param BucketName Bucket name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Bucket region. 
     * @return BucketRegion Bucket region.
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set Bucket region.
     * @param BucketRegion Bucket region.
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get Bucket remark information 
     * @return BucketMarker Bucket remark information
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set Bucket remark information
     * @param BucketMarker Bucket remark information
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get Bucket uin 
     * @return BucketUin Bucket uin
     */
    public String getBucketUin() {
        return this.BucketUin;
    }

    /**
     * Set Bucket uin
     * @param BucketUin Bucket uin
     */
    public void setBucketUin(String BucketUin) {
        this.BucketUin = BucketUin;
    }

    /**
     * Get uin nickname 
     * @return BucketNickName uin nickname
     */
    public String getBucketNickName() {
        return this.BucketNickName;
    }

    /**
     * Set uin nickname
     * @param BucketNickName uin nickname
     */
    public void setBucketNickName(String BucketNickName) {
        this.BucketNickName = BucketNickName;
    }

    /**
     * Get uin root account nickname 
     * @return BucketMainNickName uin root account nickname
     */
    public String getBucketMainNickName() {
        return this.BucketMainNickName;
    }

    /**
     * Set uin root account nickname
     * @param BucketMainNickName uin root account nickname
     */
    public void setBucketMainNickName(String BucketMainNickName) {
        this.BucketMainNickName = BucketMainNickName;
    }

    /**
     * Get uin identity 
     * @return BucketIdentify uin identity
     */
    public Long getBucketIdentify() {
        return this.BucketIdentify;
    }

    /**
     * Set uin identity
     * @param BucketIdentify uin identity
     */
    public void setBucketIdentify(Long BucketIdentify) {
        this.BucketIdentify = BucketIdentify;
    }

    /**
     * Get Risk detection time in Unix timestamp in milliseconds 
     * @return LastScanTimestamp Risk detection time in Unix timestamp in milliseconds
     */
    public Long getLastScanTimestamp() {
        return this.LastScanTimestamp;
    }

    /**
     * Set Risk detection time in Unix timestamp in milliseconds
     * @param LastScanTimestamp Risk detection time in Unix timestamp in milliseconds
     */
    public void setLastScanTimestamp(Long LastScanTimestamp) {
        this.LastScanTimestamp = LastScanTimestamp;
    }

    /**
     * Get Status Information 
     * @return HandleStatus Status Information
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set Status Information
     * @param HandleStatus Status Information
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get Risk name 
     * @return PolicyName Risk name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Risk name
     * @param PolicyName Risk name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Risk type 
     * @return PolicyType Risk type
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Risk type
     * @param PolicyType Risk type
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy level 
     * @return PolicyLevel Policy level
     */
    public Long getPolicyLevel() {
        return this.PolicyLevel;
    }

    /**
     * Set Policy level
     * @param PolicyLevel Policy level
     */
    public void setPolicyLevel(Long PolicyLevel) {
        this.PolicyLevel = PolicyLevel;
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
     * Get Access method 
     * @return BucketAccessWay Access method
     */
    public String getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set Access method
     * @param BucketAccessWay Access method
     */
    public void setBucketAccessWay(String BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get Tag information. 
     * @return BucketTagInfo Tag information.
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set Tag information.
     * @param BucketTagInfo Tag information.
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get Risk id 
     * @return RiskId Risk id
     */
    public Long getRiskId() {
        return this.RiskId;
    }

    /**
     * Set Risk id
     * @param RiskId Risk id
     */
    public void setRiskId(Long RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get cos region code value 
     * @return BucketRegionCode cos region code value
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set cos region code value
     * @param BucketRegionCode cos region code value
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get Whether automatic monitoring is enabled. 0: disabled. 1: enabled. 
     * @return BucketMonitorStatus Whether automatic monitoring is enabled. 0: disabled. 1: enabled.
     */
    public Long getBucketMonitorStatus() {
        return this.BucketMonitorStatus;
    }

    /**
     * Set Whether automatic monitoring is enabled. 0: disabled. 1: enabled.
     * @param BucketMonitorStatus Whether automatic monitoring is enabled. 0: disabled. 1: enabled.
     */
    public void setBucketMonitorStatus(Long BucketMonitorStatus) {
        this.BucketMonitorStatus = BucketMonitorStatus;
    }

    public CosRiskBucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskBucketInfo(CosRiskBucketInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
        if (source.BucketUin != null) {
            this.BucketUin = new String(source.BucketUin);
        }
        if (source.BucketNickName != null) {
            this.BucketNickName = new String(source.BucketNickName);
        }
        if (source.BucketMainNickName != null) {
            this.BucketMainNickName = new String(source.BucketMainNickName);
        }
        if (source.BucketIdentify != null) {
            this.BucketIdentify = new Long(source.BucketIdentify);
        }
        if (source.LastScanTimestamp != null) {
            this.LastScanTimestamp = new Long(source.LastScanTimestamp);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyLevel != null) {
            this.PolicyLevel = new Long(source.PolicyLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new String(source.BucketAccessWay);
        }
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.RiskId != null) {
            this.RiskId = new Long(source.RiskId);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMonitorStatus != null) {
            this.BucketMonitorStatus = new Long(source.BucketMonitorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketUin", this.BucketUin);
        this.setParamSimple(map, prefix + "BucketNickName", this.BucketNickName);
        this.setParamSimple(map, prefix + "BucketMainNickName", this.BucketMainNickName);
        this.setParamSimple(map, prefix + "BucketIdentify", this.BucketIdentify);
        this.setParamSimple(map, prefix + "LastScanTimestamp", this.LastScanTimestamp);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyLevel", this.PolicyLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "BucketAccessWay", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMonitorStatus", this.BucketMonitorStatus);

    }
}


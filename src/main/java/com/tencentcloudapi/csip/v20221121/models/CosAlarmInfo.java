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

public class CosAlarmInfo extends AbstractModel {

    /**
    * appid

    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy type. 0: Unknown rule category; 1: abnormal behavior; 2: excessive permissions; 3: resource enumeration; 4: anonymous access.

    */
    @SerializedName("PolicyAbnormalType")
    @Expose
    private Long PolicyAbnormalType;

    /**
    * Risk level: 0: Normal, 1: Tip, 2: Low, 3: Middle, 4: High, 5: Critical
    */
    @SerializedName("PolicyRiskLevel")
    @Expose
    private Long PolicyRiskLevel;

    /**
    * Policy information description
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

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
    * Bucket remarks.
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * Bucket tag information
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * Bucket accessible property
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private String BucketAccessWay;

    /**
    * Account uin
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * Account nickname
    */
    @SerializedName("AccountNickName")
    @Expose
    private String AccountNickName;

    /**
    * Identity of the associated account. 1 - Main account. 2 - Sub-account
    */
    @SerializedName("AccountIdentify")
    @Expose
    private Long AccountIdentify;

    /**
    * Nickname of the main account to which the sub-account belongs
    */
    @SerializedName("AccountMainNickName")
    @Expose
    private String AccountMainNickName;

    /**
    * Alarm timestamp in Unix time in milliseconds
    */
    @SerializedName("AlarmTimestamp")
    @Expose
    private Long AlarmTimestamp;

    /**
    * Handling status. 0: unprocessed. 1: tag disposal. 2: marked as ignored.
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * Alarm object id
    */
    @SerializedName("AlarmId")
    @Expose
    private Long AlarmId;

    /**
    * Bucket region code value
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * Data identification and categorization details
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

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
     * Get Policy type. 0: Unknown rule category; 1: abnormal behavior; 2: excessive permissions; 3: resource enumeration; 4: anonymous access.
 
     * @return PolicyAbnormalType Policy type. 0: Unknown rule category; 1: abnormal behavior; 2: excessive permissions; 3: resource enumeration; 4: anonymous access.

     */
    public Long getPolicyAbnormalType() {
        return this.PolicyAbnormalType;
    }

    /**
     * Set Policy type. 0: Unknown rule category; 1: abnormal behavior; 2: excessive permissions; 3: resource enumeration; 4: anonymous access.

     * @param PolicyAbnormalType Policy type. 0: Unknown rule category; 1: abnormal behavior; 2: excessive permissions; 3: resource enumeration; 4: anonymous access.

     */
    public void setPolicyAbnormalType(Long PolicyAbnormalType) {
        this.PolicyAbnormalType = PolicyAbnormalType;
    }

    /**
     * Get Risk level: 0: Normal, 1: Tip, 2: Low, 3: Middle, 4: High, 5: Critical 
     * @return PolicyRiskLevel Risk level: 0: Normal, 1: Tip, 2: Low, 3: Middle, 4: High, 5: Critical
     */
    public Long getPolicyRiskLevel() {
        return this.PolicyRiskLevel;
    }

    /**
     * Set Risk level: 0: Normal, 1: Tip, 2: Low, 3: Middle, 4: High, 5: Critical
     * @param PolicyRiskLevel Risk level: 0: Normal, 1: Tip, 2: Low, 3: Middle, 4: High, 5: Critical
     */
    public void setPolicyRiskLevel(Long PolicyRiskLevel) {
        this.PolicyRiskLevel = PolicyRiskLevel;
    }

    /**
     * Get Policy information description 
     * @return PolicyDescription Policy information description
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set Policy information description
     * @param PolicyDescription Policy information description
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
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
     * Get Bucket remarks. 
     * @return BucketMarker Bucket remarks.
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set Bucket remarks.
     * @param BucketMarker Bucket remarks.
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get Bucket tag information 
     * @return BucketTagInfo Bucket tag information
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set Bucket tag information
     * @param BucketTagInfo Bucket tag information
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get Bucket accessible property 
     * @return BucketAccessWay Bucket accessible property
     */
    public String getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set Bucket accessible property
     * @param BucketAccessWay Bucket accessible property
     */
    public void setBucketAccessWay(String BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get Account uin 
     * @return AccountUin Account uin
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set Account uin
     * @param AccountUin Account uin
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get Account nickname 
     * @return AccountNickName Account nickname
     */
    public String getAccountNickName() {
        return this.AccountNickName;
    }

    /**
     * Set Account nickname
     * @param AccountNickName Account nickname
     */
    public void setAccountNickName(String AccountNickName) {
        this.AccountNickName = AccountNickName;
    }

    /**
     * Get Identity of the associated account. 1 - Main account. 2 - Sub-account 
     * @return AccountIdentify Identity of the associated account. 1 - Main account. 2 - Sub-account
     */
    public Long getAccountIdentify() {
        return this.AccountIdentify;
    }

    /**
     * Set Identity of the associated account. 1 - Main account. 2 - Sub-account
     * @param AccountIdentify Identity of the associated account. 1 - Main account. 2 - Sub-account
     */
    public void setAccountIdentify(Long AccountIdentify) {
        this.AccountIdentify = AccountIdentify;
    }

    /**
     * Get Nickname of the main account to which the sub-account belongs 
     * @return AccountMainNickName Nickname of the main account to which the sub-account belongs
     */
    public String getAccountMainNickName() {
        return this.AccountMainNickName;
    }

    /**
     * Set Nickname of the main account to which the sub-account belongs
     * @param AccountMainNickName Nickname of the main account to which the sub-account belongs
     */
    public void setAccountMainNickName(String AccountMainNickName) {
        this.AccountMainNickName = AccountMainNickName;
    }

    /**
     * Get Alarm timestamp in Unix time in milliseconds 
     * @return AlarmTimestamp Alarm timestamp in Unix time in milliseconds
     */
    public Long getAlarmTimestamp() {
        return this.AlarmTimestamp;
    }

    /**
     * Set Alarm timestamp in Unix time in milliseconds
     * @param AlarmTimestamp Alarm timestamp in Unix time in milliseconds
     */
    public void setAlarmTimestamp(Long AlarmTimestamp) {
        this.AlarmTimestamp = AlarmTimestamp;
    }

    /**
     * Get Handling status. 0: unprocessed. 1: tag disposal. 2: marked as ignored. 
     * @return HandleStatus Handling status. 0: unprocessed. 1: tag disposal. 2: marked as ignored.
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set Handling status. 0: unprocessed. 1: tag disposal. 2: marked as ignored.
     * @param HandleStatus Handling status. 0: unprocessed. 1: tag disposal. 2: marked as ignored.
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get Alarm object id 
     * @return AlarmId Alarm object id
     */
    public Long getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alarm object id
     * @param AlarmId Alarm object id
     */
    public void setAlarmId(Long AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Bucket region code value 
     * @return BucketRegionCode Bucket region code value
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set Bucket region code value
     * @param BucketRegionCode Bucket region code value
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get Data identification and categorization details 
     * @return CategoryDetails Data identification and categorization details
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set Data identification and categorization details
     * @param CategoryDetails Data identification and categorization details
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    public CosAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAlarmInfo(CosAlarmInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyAbnormalType != null) {
            this.PolicyAbnormalType = new Long(source.PolicyAbnormalType);
        }
        if (source.PolicyRiskLevel != null) {
            this.PolicyRiskLevel = new Long(source.PolicyRiskLevel);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
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
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new String(source.BucketAccessWay);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.AccountNickName != null) {
            this.AccountNickName = new String(source.AccountNickName);
        }
        if (source.AccountIdentify != null) {
            this.AccountIdentify = new Long(source.AccountIdentify);
        }
        if (source.AccountMainNickName != null) {
            this.AccountMainNickName = new String(source.AccountMainNickName);
        }
        if (source.AlarmTimestamp != null) {
            this.AlarmTimestamp = new Long(source.AlarmTimestamp);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new Long(source.AlarmId);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyAbnormalType", this.PolicyAbnormalType);
        this.setParamSimple(map, prefix + "PolicyRiskLevel", this.PolicyRiskLevel);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "BucketAccessWay", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "AccountNickName", this.AccountNickName);
        this.setParamSimple(map, prefix + "AccountIdentify", this.AccountIdentify);
        this.setParamSimple(map, prefix + "AccountMainNickName", this.AccountMainNickName);
        this.setParamSimple(map, prefix + "AlarmTimestamp", this.AlarmTimestamp);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);

    }
}


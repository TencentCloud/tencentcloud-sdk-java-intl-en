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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel {

    /**
    * Whether the KMS service has been activated. true: activated
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * Service unavailability type: 0-not purchased, 1-normal, 2-service suspended due to overdue payments, 3-resource release.
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * 0: Basic Edition, 1: Ultimate Edition
    */
    @SerializedName("UserLevel")
    @Expose
    private Long UserLevel;

    /**
    * Specifies the expiry time (Epoch Unix Timestamp) of the flagship edition.
    */
    @SerializedName("ProExpireTime")
    @Expose
    private Long ProExpireTime;

    /**
    * Specifies whether the flagship edition is automatically renewed: 0 - no automatic renewal, 1 - automatic renewal.
    */
    @SerializedName("ProRenewFlag")
    @Expose
    private Long ProRenewFlag;

    /**
    * Unique identifier for the purchase record of the flagship edition. if the flagship edition is enabled, the return value is null.
    */
    @SerializedName("ProResourceId")
    @Expose
    private String ProResourceId;

    /**
    * Whether to enable the KMS-managed version.
    */
    @SerializedName("ExclusiveVSMEnabled")
    @Expose
    private Boolean ExclusiveVSMEnabled;

    /**
    * Whether to enable the exclusive edition of KMS.
    */
    @SerializedName("ExclusiveHSMEnabled")
    @Expose
    private Boolean ExclusiveHSMEnabled;

    /**
    * Specifies the KMS subscription information.
    */
    @SerializedName("SubscriptionInfo")
    @Expose
    private String SubscriptionInfo;

    /**
    * Returns the amount of KMS user secret keys used.
    */
    @SerializedName("CmkUserCount")
    @Expose
    private Long CmkUserCount;

    /**
    * Returns the specification quantity of KMS user secret keys.
    */
    @SerializedName("CmkLimit")
    @Expose
    private Long CmkLimit;

    /**
    * Return dedicated cluster group.
    */
    @SerializedName("ExclusiveHSMList")
    @Expose
    private ExclusiveHSM [] ExclusiveHSMList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the KMS service has been activated. true: activated 
     * @return ServiceEnabled Whether the KMS service has been activated. true: activated
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set Whether the KMS service has been activated. true: activated
     * @param ServiceEnabled Whether the KMS service has been activated. true: activated
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get Service unavailability type: 0-not purchased, 1-normal, 2-service suspended due to overdue payments, 3-resource release. 
     * @return InvalidType Service unavailability type: 0-not purchased, 1-normal, 2-service suspended due to overdue payments, 3-resource release.
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set Service unavailability type: 0-not purchased, 1-normal, 2-service suspended due to overdue payments, 3-resource release.
     * @param InvalidType Service unavailability type: 0-not purchased, 1-normal, 2-service suspended due to overdue payments, 3-resource release.
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get 0: Basic Edition, 1: Ultimate Edition 
     * @return UserLevel 0: Basic Edition, 1: Ultimate Edition
     */
    public Long getUserLevel() {
        return this.UserLevel;
    }

    /**
     * Set 0: Basic Edition, 1: Ultimate Edition
     * @param UserLevel 0: Basic Edition, 1: Ultimate Edition
     */
    public void setUserLevel(Long UserLevel) {
        this.UserLevel = UserLevel;
    }

    /**
     * Get Specifies the expiry time (Epoch Unix Timestamp) of the flagship edition. 
     * @return ProExpireTime Specifies the expiry time (Epoch Unix Timestamp) of the flagship edition.
     */
    public Long getProExpireTime() {
        return this.ProExpireTime;
    }

    /**
     * Set Specifies the expiry time (Epoch Unix Timestamp) of the flagship edition.
     * @param ProExpireTime Specifies the expiry time (Epoch Unix Timestamp) of the flagship edition.
     */
    public void setProExpireTime(Long ProExpireTime) {
        this.ProExpireTime = ProExpireTime;
    }

    /**
     * Get Specifies whether the flagship edition is automatically renewed: 0 - no automatic renewal, 1 - automatic renewal. 
     * @return ProRenewFlag Specifies whether the flagship edition is automatically renewed: 0 - no automatic renewal, 1 - automatic renewal.
     */
    public Long getProRenewFlag() {
        return this.ProRenewFlag;
    }

    /**
     * Set Specifies whether the flagship edition is automatically renewed: 0 - no automatic renewal, 1 - automatic renewal.
     * @param ProRenewFlag Specifies whether the flagship edition is automatically renewed: 0 - no automatic renewal, 1 - automatic renewal.
     */
    public void setProRenewFlag(Long ProRenewFlag) {
        this.ProRenewFlag = ProRenewFlag;
    }

    /**
     * Get Unique identifier for the purchase record of the flagship edition. if the flagship edition is enabled, the return value is null. 
     * @return ProResourceId Unique identifier for the purchase record of the flagship edition. if the flagship edition is enabled, the return value is null.
     */
    public String getProResourceId() {
        return this.ProResourceId;
    }

    /**
     * Set Unique identifier for the purchase record of the flagship edition. if the flagship edition is enabled, the return value is null.
     * @param ProResourceId Unique identifier for the purchase record of the flagship edition. if the flagship edition is enabled, the return value is null.
     */
    public void setProResourceId(String ProResourceId) {
        this.ProResourceId = ProResourceId;
    }

    /**
     * Get Whether to enable the KMS-managed version. 
     * @return ExclusiveVSMEnabled Whether to enable the KMS-managed version.
     */
    public Boolean getExclusiveVSMEnabled() {
        return this.ExclusiveVSMEnabled;
    }

    /**
     * Set Whether to enable the KMS-managed version.
     * @param ExclusiveVSMEnabled Whether to enable the KMS-managed version.
     */
    public void setExclusiveVSMEnabled(Boolean ExclusiveVSMEnabled) {
        this.ExclusiveVSMEnabled = ExclusiveVSMEnabled;
    }

    /**
     * Get Whether to enable the exclusive edition of KMS. 
     * @return ExclusiveHSMEnabled Whether to enable the exclusive edition of KMS.
     */
    public Boolean getExclusiveHSMEnabled() {
        return this.ExclusiveHSMEnabled;
    }

    /**
     * Set Whether to enable the exclusive edition of KMS.
     * @param ExclusiveHSMEnabled Whether to enable the exclusive edition of KMS.
     */
    public void setExclusiveHSMEnabled(Boolean ExclusiveHSMEnabled) {
        this.ExclusiveHSMEnabled = ExclusiveHSMEnabled;
    }

    /**
     * Get Specifies the KMS subscription information. 
     * @return SubscriptionInfo Specifies the KMS subscription information.
     */
    public String getSubscriptionInfo() {
        return this.SubscriptionInfo;
    }

    /**
     * Set Specifies the KMS subscription information.
     * @param SubscriptionInfo Specifies the KMS subscription information.
     */
    public void setSubscriptionInfo(String SubscriptionInfo) {
        this.SubscriptionInfo = SubscriptionInfo;
    }

    /**
     * Get Returns the amount of KMS user secret keys used. 
     * @return CmkUserCount Returns the amount of KMS user secret keys used.
     */
    public Long getCmkUserCount() {
        return this.CmkUserCount;
    }

    /**
     * Set Returns the amount of KMS user secret keys used.
     * @param CmkUserCount Returns the amount of KMS user secret keys used.
     */
    public void setCmkUserCount(Long CmkUserCount) {
        this.CmkUserCount = CmkUserCount;
    }

    /**
     * Get Returns the specification quantity of KMS user secret keys. 
     * @return CmkLimit Returns the specification quantity of KMS user secret keys.
     */
    public Long getCmkLimit() {
        return this.CmkLimit;
    }

    /**
     * Set Returns the specification quantity of KMS user secret keys.
     * @param CmkLimit Returns the specification quantity of KMS user secret keys.
     */
    public void setCmkLimit(Long CmkLimit) {
        this.CmkLimit = CmkLimit;
    }

    /**
     * Get Return dedicated cluster group. 
     * @return ExclusiveHSMList Return dedicated cluster group.
     */
    public ExclusiveHSM [] getExclusiveHSMList() {
        return this.ExclusiveHSMList;
    }

    /**
     * Set Return dedicated cluster group.
     * @param ExclusiveHSMList Return dedicated cluster group.
     */
    public void setExclusiveHSMList(ExclusiveHSM [] ExclusiveHSMList) {
        this.ExclusiveHSMList = ExclusiveHSMList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetServiceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceStatusResponse(GetServiceStatusResponse source) {
        if (source.ServiceEnabled != null) {
            this.ServiceEnabled = new Boolean(source.ServiceEnabled);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new Long(source.InvalidType);
        }
        if (source.UserLevel != null) {
            this.UserLevel = new Long(source.UserLevel);
        }
        if (source.ProExpireTime != null) {
            this.ProExpireTime = new Long(source.ProExpireTime);
        }
        if (source.ProRenewFlag != null) {
            this.ProRenewFlag = new Long(source.ProRenewFlag);
        }
        if (source.ProResourceId != null) {
            this.ProResourceId = new String(source.ProResourceId);
        }
        if (source.ExclusiveVSMEnabled != null) {
            this.ExclusiveVSMEnabled = new Boolean(source.ExclusiveVSMEnabled);
        }
        if (source.ExclusiveHSMEnabled != null) {
            this.ExclusiveHSMEnabled = new Boolean(source.ExclusiveHSMEnabled);
        }
        if (source.SubscriptionInfo != null) {
            this.SubscriptionInfo = new String(source.SubscriptionInfo);
        }
        if (source.CmkUserCount != null) {
            this.CmkUserCount = new Long(source.CmkUserCount);
        }
        if (source.CmkLimit != null) {
            this.CmkLimit = new Long(source.CmkLimit);
        }
        if (source.ExclusiveHSMList != null) {
            this.ExclusiveHSMList = new ExclusiveHSM[source.ExclusiveHSMList.length];
            for (int i = 0; i < source.ExclusiveHSMList.length; i++) {
                this.ExclusiveHSMList[i] = new ExclusiveHSM(source.ExclusiveHSMList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "UserLevel", this.UserLevel);
        this.setParamSimple(map, prefix + "ProExpireTime", this.ProExpireTime);
        this.setParamSimple(map, prefix + "ProRenewFlag", this.ProRenewFlag);
        this.setParamSimple(map, prefix + "ProResourceId", this.ProResourceId);
        this.setParamSimple(map, prefix + "ExclusiveVSMEnabled", this.ExclusiveVSMEnabled);
        this.setParamSimple(map, prefix + "ExclusiveHSMEnabled", this.ExclusiveHSMEnabled);
        this.setParamSimple(map, prefix + "SubscriptionInfo", this.SubscriptionInfo);
        this.setParamSimple(map, prefix + "CmkUserCount", this.CmkUserCount);
        this.setParamSimple(map, prefix + "CmkLimit", this.CmkLimit);
        this.setParamArrayObj(map, prefix + "ExclusiveHSMList.", this.ExclusiveHSMList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


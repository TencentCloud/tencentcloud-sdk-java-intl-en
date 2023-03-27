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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel{

    /**
    * Whether the KMS service has been activated. true: activated
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * Service unavailability type. 0: not purchased; 1: normal; 2: suspended due to arrears; 3: resource released
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
    * Expiration time of the KMS Ultimate edition. It’s represented in a Unix Epoch timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProExpireTime")
    @Expose
    private Long ProExpireTime;

    /**
    * Whether to automatically renew Ultimate Edition. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProRenewFlag")
    @Expose
    private Long ProRenewFlag;

    /**
    * Unique ID of the Ultimate Edition purchase record. If the Ultimate Edition is not activated, the returned value will be null.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProResourceId")
    @Expose
    private String ProResourceId;

    /**
    * Whether to activate Managed KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ExclusiveVSMEnabled")
    @Expose
    private Boolean ExclusiveVSMEnabled;

    /**
    * Whether to activate Exclusive KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ExclusiveHSMEnabled")
    @Expose
    private Boolean ExclusiveHSMEnabled;

    /**
    * KMS subscription information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscriptionInfo")
    @Expose
    private String SubscriptionInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
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
     * Get Service unavailability type. 0: not purchased; 1: normal; 2: suspended due to arrears; 3: resource released 
     * @return InvalidType Service unavailability type. 0: not purchased; 1: normal; 2: suspended due to arrears; 3: resource released
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set Service unavailability type. 0: not purchased; 1: normal; 2: suspended due to arrears; 3: resource released
     * @param InvalidType Service unavailability type. 0: not purchased; 1: normal; 2: suspended due to arrears; 3: resource released
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
     * Get Expiration time of the KMS Ultimate edition. It’s represented in a Unix Epoch timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProExpireTime Expiration time of the KMS Ultimate edition. It’s represented in a Unix Epoch timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProExpireTime() {
        return this.ProExpireTime;
    }

    /**
     * Set Expiration time of the KMS Ultimate edition. It’s represented in a Unix Epoch timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProExpireTime Expiration time of the KMS Ultimate edition. It’s represented in a Unix Epoch timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProExpireTime(Long ProExpireTime) {
        this.ProExpireTime = ProExpireTime;
    }

    /**
     * Get Whether to automatically renew Ultimate Edition. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProRenewFlag Whether to automatically renew Ultimate Edition. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProRenewFlag() {
        return this.ProRenewFlag;
    }

    /**
     * Set Whether to automatically renew Ultimate Edition. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProRenewFlag Whether to automatically renew Ultimate Edition. 0: no, 1: yes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProRenewFlag(Long ProRenewFlag) {
        this.ProRenewFlag = ProRenewFlag;
    }

    /**
     * Get Unique ID of the Ultimate Edition purchase record. If the Ultimate Edition is not activated, the returned value will be null.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProResourceId Unique ID of the Ultimate Edition purchase record. If the Ultimate Edition is not activated, the returned value will be null.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProResourceId() {
        return this.ProResourceId;
    }

    /**
     * Set Unique ID of the Ultimate Edition purchase record. If the Ultimate Edition is not activated, the returned value will be null.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProResourceId Unique ID of the Ultimate Edition purchase record. If the Ultimate Edition is not activated, the returned value will be null.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProResourceId(String ProResourceId) {
        this.ProResourceId = ProResourceId;
    }

    /**
     * Get Whether to activate Managed KMS
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ExclusiveVSMEnabled Whether to activate Managed KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getExclusiveVSMEnabled() {
        return this.ExclusiveVSMEnabled;
    }

    /**
     * Set Whether to activate Managed KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ExclusiveVSMEnabled Whether to activate Managed KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setExclusiveVSMEnabled(Boolean ExclusiveVSMEnabled) {
        this.ExclusiveVSMEnabled = ExclusiveVSMEnabled;
    }

    /**
     * Get Whether to activate Exclusive KMS
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ExclusiveHSMEnabled Whether to activate Exclusive KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getExclusiveHSMEnabled() {
        return this.ExclusiveHSMEnabled;
    }

    /**
     * Set Whether to activate Exclusive KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ExclusiveHSMEnabled Whether to activate Exclusive KMS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setExclusiveHSMEnabled(Boolean ExclusiveHSMEnabled) {
        this.ExclusiveHSMEnabled = ExclusiveHSMEnabled;
    }

    /**
     * Get KMS subscription information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionInfo KMS subscription information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionInfo() {
        return this.SubscriptionInfo;
    }

    /**
     * Set KMS subscription information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionInfo KMS subscription information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscriptionInfo(String SubscriptionInfo) {
        this.SubscriptionInfo = SubscriptionInfo;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


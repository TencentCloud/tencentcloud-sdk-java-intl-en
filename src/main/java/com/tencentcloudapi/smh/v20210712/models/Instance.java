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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Effective time.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Expiration time. if the instance is pay-as-you-go or permanently valid, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Number of users. if the instance uses pay-as-you-go billing or has unlimited users, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserLimit")
    @Expose
    private Long UserLimit;

    /**
    * Storage capacity in Bytes. this field is of String type due to precision limitations of numeric types. this property is null for pay-as-you-go instances or instances with unlimited storage capacity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageLimit")
    @Expose
    private String StorageLimit;

    /**
    * Storage capacity in GB. if the instance uses pay-as-you-go billing or has unlimited storage capacity, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageLimitGB")
    @Expose
    private Long StorageLimitGB;

    /**
    * Is expired isolation.
    */
    @SerializedName("Isolated")
    @Expose
    private Boolean Isolated;

    /**
    * Renewal flag. 0: manual renewal; 1: automatic renewal; 2: non-renewal upon expiration.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Specifies the super administrator account. if no selection query is made for the instance-bound super administrator account or the current instance is not bound to a super administrator account, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperAdminAccount")
    @Expose
    private String SuperAdminAccount;

    /**
    * In selected bucket mode, shows bucket usage.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Specifies the log bucket usage in selected mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogBucket")
    @Expose
    private String LogBucket;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Effective time. 
     * @return EffectiveTime Effective time.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Effective time.
     * @param EffectiveTime Effective time.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Expiration time. if the instance is pay-as-you-go or permanently valid, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time. if the instance is pay-as-you-go or permanently valid, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time. if the instance is pay-as-you-go or permanently valid, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time. if the instance is pay-as-you-go or permanently valid, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Number of users. if the instance uses pay-as-you-go billing or has unlimited users, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserLimit Number of users. if the instance uses pay-as-you-go billing or has unlimited users, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUserLimit() {
        return this.UserLimit;
    }

    /**
     * Set Number of users. if the instance uses pay-as-you-go billing or has unlimited users, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserLimit Number of users. if the instance uses pay-as-you-go billing or has unlimited users, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserLimit(Long UserLimit) {
        this.UserLimit = UserLimit;
    }

    /**
     * Get Storage capacity in Bytes. this field is of String type due to precision limitations of numeric types. this property is null for pay-as-you-go instances or instances with unlimited storage capacity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageLimit Storage capacity in Bytes. this field is of String type due to precision limitations of numeric types. this property is null for pay-as-you-go instances or instances with unlimited storage capacity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage capacity in Bytes. this field is of String type due to precision limitations of numeric types. this property is null for pay-as-you-go instances or instances with unlimited storage capacity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageLimit Storage capacity in Bytes. this field is of String type due to precision limitations of numeric types. this property is null for pay-as-you-go instances or instances with unlimited storage capacity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageLimit(String StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Storage capacity in GB. if the instance uses pay-as-you-go billing or has unlimited storage capacity, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageLimitGB Storage capacity in GB. if the instance uses pay-as-you-go billing or has unlimited storage capacity, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageLimitGB() {
        return this.StorageLimitGB;
    }

    /**
     * Set Storage capacity in GB. if the instance uses pay-as-you-go billing or has unlimited storage capacity, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageLimitGB Storage capacity in GB. if the instance uses pay-as-you-go billing or has unlimited storage capacity, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageLimitGB(Long StorageLimitGB) {
        this.StorageLimitGB = StorageLimitGB;
    }

    /**
     * Get Is expired isolation. 
     * @return Isolated Is expired isolation.
     */
    public Boolean getIsolated() {
        return this.Isolated;
    }

    /**
     * Set Is expired isolation.
     * @param Isolated Is expired isolation.
     */
    public void setIsolated(Boolean Isolated) {
        this.Isolated = Isolated;
    }

    /**
     * Get Renewal flag. 0: manual renewal; 1: automatic renewal; 2: non-renewal upon expiration. 
     * @return AutoRenew Renewal flag. 0: manual renewal; 1: automatic renewal; 2: non-renewal upon expiration.
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Renewal flag. 0: manual renewal; 1: automatic renewal; 2: non-renewal upon expiration.
     * @param AutoRenew Renewal flag. 0: manual renewal; 1: automatic renewal; 2: non-renewal upon expiration.
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Specifies the super administrator account. if no selection query is made for the instance-bound super administrator account or the current instance is not bound to a super administrator account, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperAdminAccount Specifies the super administrator account. if no selection query is made for the instance-bound super administrator account or the current instance is not bound to a super administrator account, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuperAdminAccount() {
        return this.SuperAdminAccount;
    }

    /**
     * Set Specifies the super administrator account. if no selection query is made for the instance-bound super administrator account or the current instance is not bound to a super administrator account, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperAdminAccount Specifies the super administrator account. if no selection query is made for the instance-bound super administrator account or the current instance is not bound to a super administrator account, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperAdminAccount(String SuperAdminAccount) {
        this.SuperAdminAccount = SuperAdminAccount;
    }

    /**
     * Get In selected bucket mode, shows bucket usage. 
     * @return Bucket In selected bucket mode, shows bucket usage.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set In selected bucket mode, shows bucket usage.
     * @param Bucket In selected bucket mode, shows bucket usage.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Specifies the log bucket usage in selected mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogBucket Specifies the log bucket usage in selected mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogBucket() {
        return this.LogBucket;
    }

    /**
     * Set Specifies the log bucket usage in selected mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogBucket Specifies the log bucket usage in selected mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogBucket(String LogBucket) {
        this.LogBucket = LogBucket;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.UserLimit != null) {
            this.UserLimit = new Long(source.UserLimit);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new String(source.StorageLimit);
        }
        if (source.StorageLimitGB != null) {
            this.StorageLimitGB = new Long(source.StorageLimitGB);
        }
        if (source.Isolated != null) {
            this.Isolated = new Boolean(source.Isolated);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.SuperAdminAccount != null) {
            this.SuperAdminAccount = new String(source.SuperAdminAccount);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.LogBucket != null) {
            this.LogBucket = new String(source.LogBucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UserLimit", this.UserLimit);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "StorageLimitGB", this.StorageLimitGB);
        this.setParamSimple(map, prefix + "Isolated", this.Isolated);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "SuperAdminAccount", this.SuperAdminAccount);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "LogBucket", this.LogBucket);

    }
}


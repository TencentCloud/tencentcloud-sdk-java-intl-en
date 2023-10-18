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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Registry extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Instance name
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * Instance specification
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Public access URL of the instance
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * Instance creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Whether to enable anonymity
    */
    @SerializedName("EnableAnonymous")
    @Expose
    private Boolean EnableAnonymous;

    /**
    * Token validity period
    */
    @SerializedName("TokenValidTime")
    @Expose
    private Long TokenValidTime;

    /**
    * Internal access address of the instance
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * Instance expiration time (for prepayment)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * Instance billing mode. Valid values: 0: Postpayment; 1: Prepayment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMod")
    @Expose
    private Long PayMod;

    /**
    * Prepayment renewal flag. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Instance name 
     * @return RegistryName Instance name
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set Instance name
     * @param RegistryName Instance name
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get Instance specification 
     * @return RegistryType Instance specification
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Instance specification
     * @param RegistryType Instance specification
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Instance status 
     * @return Status Instance status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Public access URL of the instance 
     * @return PublicDomain Public access URL of the instance
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set Public access URL of the instance
     * @param PublicDomain Public access URL of the instance
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get Instance creation time 
     * @return CreatedAt Instance creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Instance creation time
     * @param CreatedAt Instance creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Whether to enable anonymity 
     * @return EnableAnonymous Whether to enable anonymity
     */
    public Boolean getEnableAnonymous() {
        return this.EnableAnonymous;
    }

    /**
     * Set Whether to enable anonymity
     * @param EnableAnonymous Whether to enable anonymity
     */
    public void setEnableAnonymous(Boolean EnableAnonymous) {
        this.EnableAnonymous = EnableAnonymous;
    }

    /**
     * Get Token validity period 
     * @return TokenValidTime Token validity period
     */
    public Long getTokenValidTime() {
        return this.TokenValidTime;
    }

    /**
     * Set Token validity period
     * @param TokenValidTime Token validity period
     */
    public void setTokenValidTime(Long TokenValidTime) {
        this.TokenValidTime = TokenValidTime;
    }

    /**
     * Get Internal access address of the instance 
     * @return InternalEndpoint Internal access address of the instance
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set Internal access address of the instance
     * @param InternalEndpoint Internal access address of the instance
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSpecification Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSpecification Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Instance expiration time (for prepayment)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredAt Instance expiration time (for prepayment)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set Instance expiration time (for prepayment)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredAt Instance expiration time (for prepayment)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get Instance billing mode. Valid values: 0: Postpayment; 1: Prepayment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMod Instance billing mode. Valid values: 0: Postpayment; 1: Prepayment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayMod() {
        return this.PayMod;
    }

    /**
     * Set Instance billing mode. Valid values: 0: Postpayment; 1: Prepayment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMod Instance billing mode. Valid values: 0: Postpayment; 1: Prepayment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMod(Long PayMod) {
        this.PayMod = PayMod;
    }

    /**
     * Get Prepayment renewal flag. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Prepayment renewal flag. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Prepayment renewal flag. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Prepayment renewal flag. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public Registry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Registry(Registry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.EnableAnonymous != null) {
            this.EnableAnonymous = new Boolean(source.EnableAnonymous);
        }
        if (source.TokenValidTime != null) {
            this.TokenValidTime = new Long(source.TokenValidTime);
        }
        if (source.InternalEndpoint != null) {
            this.InternalEndpoint = new String(source.InternalEndpoint);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.PayMod != null) {
            this.PayMod = new Long(source.PayMod);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "EnableAnonymous", this.EnableAnonymous);
        this.setParamSimple(map, prefix + "TokenValidTime", this.TokenValidTime);
        this.setParamSimple(map, prefix + "InternalEndpoint", this.InternalEndpoint);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "PayMod", this.PayMod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}


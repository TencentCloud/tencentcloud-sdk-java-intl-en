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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstance extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Product code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Subproduct code
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Region encoding
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Instance status:
NORMAL
ISOLATED Isolated
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Renewal flag:
NOTIFY_AND_MANUAL_RENEW: manual renewal
NOTIFY_AND_AUTO_RENEW: auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Instance expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Instance alias: The name set by the user for the instance in the console, which is empty by default if not set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Product name: Cloud products purchased by users, such as Cloud Virtual Machine (CVM)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Project name: Instance Ownership of the project. User can autonomously assign project to the instance on the console. Default project if not allocated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Automatic renewal cycle length
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewPeriod")
    @Expose
    private Long RenewPeriod;

    /**
    * Automatic renewal cycle unit: y year, m month
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewPeriodUnit")
    @Expose
    private String RenewPeriodUnit;

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
     * Get Product code 
     * @return ProductCode Product code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code
     * @param ProductCode Product code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Subproduct code 
     * @return SubProductCode Subproduct code
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Subproduct code
     * @param SubProductCode Subproduct code
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Region encoding
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionCode Region encoding
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region encoding
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionCode Region encoding
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Instance status:
NORMAL
ISOLATED Isolated
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status:
NORMAL
ISOLATED Isolated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status:
NORMAL
ISOLATED Isolated
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status:
NORMAL
ISOLATED Isolated
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Renewal flag:
NOTIFY_AND_MANUAL_RENEW: manual renewal
NOTIFY_AND_AUTO_RENEW: auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal flag:
NOTIFY_AND_MANUAL_RENEW: manual renewal
NOTIFY_AND_AUTO_RENEW: auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag:
NOTIFY_AND_MANUAL_RENEW: manual renewal
NOTIFY_AND_AUTO_RENEW: auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal flag:
NOTIFY_AND_MANUAL_RENEW: manual renewal
NOTIFY_AND_AUTO_RENEW: auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Instance expiration time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Instance expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Instance expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Instance alias: The name set by the user for the instance in the console, which is empty by default if not set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance alias: The name set by the user for the instance in the console, which is empty by default if not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance alias: The name set by the user for the instance in the console, which is empty by default if not set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance alias: The name set by the user for the instance in the console, which is empty by default if not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Product name: Cloud products purchased by users, such as Cloud Virtual Machine (CVM)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Product name: Cloud products purchased by users, such as Cloud Virtual Machine (CVM)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name: Cloud products purchased by users, such as Cloud Virtual Machine (CVM)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductName Product name: Cloud products purchased by users, such as Cloud Virtual Machine (CVM)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Project name: Instance Ownership of the project. User can autonomously assign project to the instance on the console. Default project if not allocated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name: Instance Ownership of the project. User can autonomously assign project to the instance on the console. Default project if not allocated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name: Instance Ownership of the project. User can autonomously assign project to the instance on the console. Default project if not allocated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name: Instance Ownership of the project. User can autonomously assign project to the instance on the console. Default project if not allocated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Automatic renewal cycle length
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewPeriod Automatic renewal cycle length
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewPeriod() {
        return this.RenewPeriod;
    }

    /**
     * Set Automatic renewal cycle length
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewPeriod Automatic renewal cycle length
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewPeriod(Long RenewPeriod) {
        this.RenewPeriod = RenewPeriod;
    }

    /**
     * Get Automatic renewal cycle unit: y year, m month
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewPeriodUnit Automatic renewal cycle unit: y year, m month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewPeriodUnit() {
        return this.RenewPeriodUnit;
    }

    /**
     * Set Automatic renewal cycle unit: y year, m month
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewPeriodUnit Automatic renewal cycle unit: y year, m month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewPeriodUnit(String RenewPeriodUnit) {
        this.RenewPeriodUnit = RenewPeriodUnit;
    }

    public RenewInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstance(RenewInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RenewPeriod != null) {
            this.RenewPeriod = new Long(source.RenewPeriod);
        }
        if (source.RenewPeriodUnit != null) {
            this.RenewPeriodUnit = new String(source.RenewPeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RenewPeriod", this.RenewPeriod);
        this.setParamSimple(map, prefix + "RenewPeriodUnit", this.RenewPeriodUnit);

    }
}


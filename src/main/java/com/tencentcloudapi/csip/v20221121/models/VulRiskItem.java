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

public class VulRiskItem extends AbstractModel {

    /**
    * Cloud account ID.
    */
    @SerializedName("CloudAccountID")
    @Expose
    private String CloudAccountID;

    /**
    * Instance ID.
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability type.
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * Vulnerability level
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * CVE id.
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * Vulnerability description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Container ID.
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * Vulnerability risk remediation recommendation.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Linux vulnerability.
    */
    @SerializedName("VulCategoryName")
    @Expose
    private String VulCategoryName;

    /**
    * Vulnerability level name.
    */
    @SerializedName("VulLevelName")
    @Expose
    private String VulLevelName;

    /**
    * Instance status chinese information.
    */
    @SerializedName("InstanceStatusName")
    @Expose
    private String InstanceStatusName;

    /**
    * Tenant ID.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
     * Get Cloud account ID. 
     * @return CloudAccountID Cloud account ID.
     */
    public String getCloudAccountID() {
        return this.CloudAccountID;
    }

    /**
     * Set Cloud account ID.
     * @param CloudAccountID Cloud account ID.
     */
    public void setCloudAccountID(String CloudAccountID) {
        this.CloudAccountID = CloudAccountID;
    }

    /**
     * Get Instance ID. 
     * @return AssetID Instance ID.
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set Instance ID.
     * @param AssetID Instance ID.
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get Instance status 
     * @return InstanceStatus Instance status
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
     * @param InstanceStatus Instance status
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Creation time.

 
     * @return CreateTime Creation time.


     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


     * @param CreateTime Creation time.


     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability type. 
     * @return VulCategory Vulnerability type.
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability type.
     * @param VulCategory Vulnerability type.
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Vulnerability level 
     * @return VulLevel Vulnerability level
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Vulnerability level
     * @param VulLevel Vulnerability level
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get CVE id. 
     * @return CveID CVE id.
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set CVE id.
     * @param CveID CVE id.
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get Vulnerability description 
     * @return Description Vulnerability description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vulnerability description
     * @param Description Vulnerability description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Container ID. 
     * @return ContainerID Container ID.
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set Container ID.
     * @param ContainerID Container ID.
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get Vulnerability risk remediation recommendation. 
     * @return Fix Vulnerability risk remediation recommendation.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Vulnerability risk remediation recommendation.
     * @param Fix Vulnerability risk remediation recommendation.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Linux vulnerability. 
     * @return VulCategoryName Linux vulnerability.
     */
    public String getVulCategoryName() {
        return this.VulCategoryName;
    }

    /**
     * Set Linux vulnerability.
     * @param VulCategoryName Linux vulnerability.
     */
    public void setVulCategoryName(String VulCategoryName) {
        this.VulCategoryName = VulCategoryName;
    }

    /**
     * Get Vulnerability level name. 
     * @return VulLevelName Vulnerability level name.
     */
    public String getVulLevelName() {
        return this.VulLevelName;
    }

    /**
     * Set Vulnerability level name.
     * @param VulLevelName Vulnerability level name.
     */
    public void setVulLevelName(String VulLevelName) {
        this.VulLevelName = VulLevelName;
    }

    /**
     * Get Instance status chinese information. 
     * @return InstanceStatusName Instance status chinese information.
     */
    public String getInstanceStatusName() {
        return this.InstanceStatusName;
    }

    /**
     * Set Instance status chinese information.
     * @param InstanceStatusName Instance status chinese information.
     */
    public void setInstanceStatusName(String InstanceStatusName) {
        this.InstanceStatusName = InstanceStatusName;
    }

    /**
     * Get Tenant ID. 
     * @return AppID Tenant ID.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Tenant ID.
     * @param AppID Tenant ID.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    public VulRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulRiskItem(VulRiskItem source) {
        if (source.CloudAccountID != null) {
            this.CloudAccountID = new String(source.CloudAccountID);
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String(source.VulCategory);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new String(source.VulLevel);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.VulCategoryName != null) {
            this.VulCategoryName = new String(source.VulCategoryName);
        }
        if (source.VulLevelName != null) {
            this.VulLevelName = new String(source.VulLevelName);
        }
        if (source.InstanceStatusName != null) {
            this.InstanceStatusName = new String(source.InstanceStatusName);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudAccountID", this.CloudAccountID);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "VulCategoryName", this.VulCategoryName);
        this.setParamSimple(map, prefix + "VulLevelName", this.VulLevelName);
        this.setParamSimple(map, prefix + "InstanceStatusName", this.InstanceStatusName);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}


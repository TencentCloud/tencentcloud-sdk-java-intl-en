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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseClusterInfo extends AbstractModel {

    /**
    * Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster Type, EMR/CDW, etc.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region Chinese
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegionCn")
    @Expose
    private String RegionCn;

    /**
    * Region English
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegionEn")
    @Expose
    private String RegionEn;

    /**
    * RegionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * Whether the Cluster is Used
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Used")
    @Expose
    private Boolean Used;

    /**
    * Cluster StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Cluster State Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * Cluster Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Cluster Computing Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ComputeType")
    @Expose
    private String ComputeType;

    /**
    * Cluster Resource Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterResource")
    @Expose
    private String ClusterResource;

    /**
    * Cluster Payment Method
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Cluster Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Additional Configuration
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraConf")
    @Expose
    private String ExtraConf;

    /**
    * Ranger Account Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RangerUserName")
    @Expose
    private String RangerUserName;

    /**
    * CDW Account (for display)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CdwUserName")
    @Expose
    private String CdwUserName;

    /**
     * Get Cluster ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster Type, EMR/CDW, etc.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterType Cluster Type, EMR/CDW, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster Type, EMR/CDW, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterType Cluster Type, EMR/CDW, etc.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterName Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterName Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region Chinese
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RegionCn Region Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegionCn() {
        return this.RegionCn;
    }

    /**
     * Set Region Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RegionCn Region Chinese
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegionCn(String RegionCn) {
        this.RegionCn = RegionCn;
    }

    /**
     * Get Region English
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RegionEn Region English
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegionEn() {
        return this.RegionEn;
    }

    /**
     * Set Region English
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RegionEn Region English
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegionEn(String RegionEn) {
        this.RegionEn = RegionEn;
    }

    /**
     * Get RegionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RegionArea RegionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set RegionNote: This field may return null, indicating that no valid value can be obtained.
     * @param RegionArea RegionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get Whether the Cluster is Used
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Used Whether the Cluster is Used
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getUsed() {
        return this.Used;
    }

    /**
     * Set Whether the Cluster is Used
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Used Whether the Cluster is Used
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUsed(Boolean Used) {
        this.Used = Used;
    }

    /**
     * Get Cluster StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Cluster StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status Cluster StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster State Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StatusInfo Cluster State Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set Cluster State Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StatusInfo Cluster State Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get Cluster Storage Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StorageType Cluster Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Cluster Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StorageType Cluster Storage Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Cluster Computing Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ComputeType Cluster Computing Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getComputeType() {
        return this.ComputeType;
    }

    /**
     * Set Cluster Computing Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ComputeType Cluster Computing Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComputeType(String ComputeType) {
        this.ComputeType = ComputeType;
    }

    /**
     * Get Cluster Resource Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterResource Cluster Resource Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterResource() {
        return this.ClusterResource;
    }

    /**
     * Set Cluster Resource Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterResource Cluster Resource Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterResource(String ClusterResource) {
        this.ClusterResource = ClusterResource;
    }

    /**
     * Get Cluster Payment Method
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChargeType Cluster Payment Method
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Cluster Payment Method
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChargeType Cluster Payment Method
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Cluster Creation Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Cluster Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Cluster Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Cluster Creation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Additional Configuration
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtraConf Additional Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExtraConf() {
        return this.ExtraConf;
    }

    /**
     * Set Additional Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtraConf Additional Configuration
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtraConf(String ExtraConf) {
        this.ExtraConf = ExtraConf;
    }

    /**
     * Get Ranger Account Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RangerUserName Ranger Account Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRangerUserName() {
        return this.RangerUserName;
    }

    /**
     * Set Ranger Account Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RangerUserName Ranger Account Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRangerUserName(String RangerUserName) {
        this.RangerUserName = RangerUserName;
    }

    /**
     * Get CDW Account (for display)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CdwUserName CDW Account (for display)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCdwUserName() {
        return this.CdwUserName;
    }

    /**
     * Set CDW Account (for display)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CdwUserName CDW Account (for display)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCdwUserName(String CdwUserName) {
        this.CdwUserName = CdwUserName;
    }

    public BaseClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseClusterInfo(BaseClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionCn != null) {
            this.RegionCn = new String(source.RegionCn);
        }
        if (source.RegionEn != null) {
            this.RegionEn = new String(source.RegionEn);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.Used != null) {
            this.Used = new Boolean(source.Used);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new String(source.StatusInfo);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.ComputeType != null) {
            this.ComputeType = new String(source.ComputeType);
        }
        if (source.ClusterResource != null) {
            this.ClusterResource = new String(source.ClusterResource);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExtraConf != null) {
            this.ExtraConf = new String(source.ExtraConf);
        }
        if (source.RangerUserName != null) {
            this.RangerUserName = new String(source.RangerUserName);
        }
        if (source.CdwUserName != null) {
            this.CdwUserName = new String(source.CdwUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionCn", this.RegionCn);
        this.setParamSimple(map, prefix + "RegionEn", this.RegionEn);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusInfo", this.StatusInfo);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "ComputeType", this.ComputeType);
        this.setParamSimple(map, prefix + "ClusterResource", this.ClusterResource);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExtraConf", this.ExtraConf);
        this.setParamSimple(map, prefix + "RangerUserName", this.RangerUserName);
        this.setParamSimple(map, prefix + "CdwUserName", this.CdwUserName);

    }
}


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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CBSInstance extends AbstractModel {

    /**
    * Cloud disk ID.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Cloud disk type.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Cloud disk name.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Cloud disk size.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Cloud disk media type.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Whether to delete it with the instance.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Cloud disk billing type.
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Cloud disk running status.
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * Whether to perform auto-renewal.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Expiration time.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Whether the cloud disk is mounted on the cloud host.
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * Days remaining until disk expiration.
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * InstanceId of the CVM instance to which this cloud disk is currently mounted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * ID of the cloud host to which the Cloud disk is mounted.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the cloud disk is a shared cloud disk.
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
    * EMR node ID.
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * Committed use expiration time.
    */
    @SerializedName("UnderwriteExpiredTime")
    @Expose
    private String UnderwriteExpiredTime;

    /**
     * Get Cloud disk ID. 
     * @return DiskId Cloud disk ID.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Cloud disk ID.
     * @param DiskId Cloud disk ID.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Cloud disk type. 
     * @return DiskUsage Cloud disk type.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Cloud disk type.
     * @param DiskUsage Cloud disk type.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Cloud disk name. 
     * @return DiskName Cloud disk name.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Cloud disk name.
     * @param DiskName Cloud disk name.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Cloud disk size. 
     * @return DiskSize Cloud disk size.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size.
     * @param DiskSize Cloud disk size.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Cloud disk media type. 
     * @return DiskType Cloud disk media type.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk media type.
     * @param DiskType Cloud disk media type.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Whether to delete it with the instance. 
     * @return DeleteWithInstance Whether to delete it with the instance.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether to delete it with the instance.
     * @param DeleteWithInstance Whether to delete it with the instance.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Cloud disk billing type. 
     * @return DiskChargeType Cloud disk billing type.
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Cloud disk billing type.
     * @param DiskChargeType Cloud disk billing type.
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Cloud disk running status. 
     * @return DiskState Cloud disk running status.
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set Cloud disk running status.
     * @param DiskState Cloud disk running status.
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get Whether to perform auto-renewal. 
     * @return RenewFlag Whether to perform auto-renewal.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether to perform auto-renewal.
     * @param RenewFlag Whether to perform auto-renewal.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Expiration time. 
     * @return DeadlineTime Expiration time.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Expiration time.
     * @param DeadlineTime Expiration time.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Whether the cloud disk is mounted on the cloud host. 
     * @return Attached Whether the cloud disk is mounted on the cloud host.
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set Whether the cloud disk is mounted on the cloud host.
     * @param Attached Whether the cloud disk is mounted on the cloud host.
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get Days remaining until disk expiration. 
     * @return DifferDaysOfDeadline Days remaining until disk expiration.
     */
    public Long getDifferDaysOfDeadline() {
        return this.DifferDaysOfDeadline;
    }

    /**
     * Set Days remaining until disk expiration.
     * @param DifferDaysOfDeadline Days remaining until disk expiration.
     */
    public void setDifferDaysOfDeadline(Long DifferDaysOfDeadline) {
        this.DifferDaysOfDeadline = DifferDaysOfDeadline;
    }

    /**
     * Get InstanceId of the CVM instance to which this cloud disk is currently mounted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceIdList InstanceId of the CVM instance to which this cloud disk is currently mounted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set InstanceId of the CVM instance to which this cloud disk is currently mounted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceIdList InstanceId of the CVM instance to which this cloud disk is currently mounted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get ID of the cloud host to which the Cloud disk is mounted. 
     * @return InstanceId ID of the cloud host to which the Cloud disk is mounted.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the cloud host to which the Cloud disk is mounted.
     * @param InstanceId ID of the cloud host to which the Cloud disk is mounted.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether the cloud disk is a shared cloud disk. 
     * @return Shareable Whether the cloud disk is a shared cloud disk.
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set Whether the cloud disk is a shared cloud disk.
     * @param Shareable Whether the cloud disk is a shared cloud disk.
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    /**
     * Get EMR node ID. 
     * @return EmrResourceId EMR node ID.
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set EMR node ID.
     * @param EmrResourceId EMR node ID.
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get Committed use expiration time. 
     * @return UnderwriteExpiredTime Committed use expiration time.
     */
    public String getUnderwriteExpiredTime() {
        return this.UnderwriteExpiredTime;
    }

    /**
     * Set Committed use expiration time.
     * @param UnderwriteExpiredTime Committed use expiration time.
     */
    public void setUnderwriteExpiredTime(String UnderwriteExpiredTime) {
        this.UnderwriteExpiredTime = UnderwriteExpiredTime;
    }

    public CBSInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CBSInstance(CBSInstance source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskState != null) {
            this.DiskState = new String(source.DiskState);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Attached != null) {
            this.Attached = new Boolean(source.Attached);
        }
        if (source.DifferDaysOfDeadline != null) {
            this.DifferDaysOfDeadline = new Long(source.DifferDaysOfDeadline);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Shareable != null) {
            this.Shareable = new Boolean(source.Shareable);
        }
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.UnderwriteExpiredTime != null) {
            this.UnderwriteExpiredTime = new String(source.UnderwriteExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "DifferDaysOfDeadline", this.DifferDaysOfDeadline);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "UnderwriteExpiredTime", this.UnderwriteExpiredTime);

    }
}


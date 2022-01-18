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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel{

    /**
    * Disk ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Disk name
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * Disk type
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Disk media type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk payment type
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Disk status
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * Whether the disk is attached to an instance
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * Whether to release the disk along with the instance
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Last operation
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * Last operation status
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * Last request ID
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration date
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Isolation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
     * Get Disk ID 
     * @return DiskId Disk ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Disk ID
     * @param DiskId Disk ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Disk name 
     * @return DiskName Disk name
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Disk name
     * @param DiskName Disk name
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get Disk type 
     * @return DiskUsage Disk type
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Disk type
     * @param DiskUsage Disk type
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Disk media type 
     * @return DiskType Disk media type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk media type
     * @param DiskType Disk media type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk payment type 
     * @return DiskChargeType Disk payment type
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Disk payment type
     * @param DiskChargeType Disk payment type
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Disk size 
     * @return DiskSize Disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size
     * @param DiskSize Disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Renewal flag 
     * @return RenewFlag Renewal flag
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag
     * @param RenewFlag Renewal flag
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Disk status 
     * @return DiskState Disk status
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set Disk status
     * @param DiskState Disk status
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get Whether the disk is attached to an instance 
     * @return Attached Whether the disk is attached to an instance
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set Whether the disk is attached to an instance
     * @param Attached Whether the disk is attached to an instance
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get Whether to release the disk along with the instance 
     * @return DeleteWithInstance Whether to release the disk along with the instance
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether to release the disk along with the instance
     * @param DeleteWithInstance Whether to release the disk along with the instance
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get Last operation 
     * @return LatestOperation Last operation
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set Last operation
     * @param LatestOperation Last operation
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get Last operation status 
     * @return LatestOperationState Last operation status
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set Last operation status
     * @param LatestOperationState Last operation status
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get Last request ID 
     * @return LatestOperationRequestId Last request ID
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set Last request ID
     * @param LatestOperationRequestId Last request ID
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Expiration date
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime Expiration date
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration date
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime Expiration date
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Isolation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedTime Isolation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsolatedTime Isolation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.DiskState != null) {
            this.DiskState = new String(source.DiskState);
        }
        if (source.Attached != null) {
            this.Attached = new Boolean(source.Attached);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestId != null) {
            this.LatestOperationRequestId = new String(source.LatestOperationRequestId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);

    }
}


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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * Snapshot ID.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Type of the disk for which the snapshot is created. Valid values: <li>SYSTEM_DISK: system disk</li>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * ID of the disk for which the snapshot is created.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Size of the disk in GB for which the snapshot is created.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Snapshot name, which is a custom snapshot alias.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot status. Valid values:
<li>NORMAL: normal </li>
<li>CREATING: creating</li>
<li>ROLLBACKING: rolling back</li>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * Snapshot creation or rollback progress in percentage. After success, the value of this field will become 100.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Last snapshot operation. It is recorded only during snapshot creation and rollback.
Example values: CreateInstanceSnapshot, RollbackInstanceSnapshot.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * Last snapshot operation status. It is recorded only during snapshot creation and rollback.
Valid values:
<li>SUCCESS: operation succeeded</li>
<li>OPERATING: the operation is being executed</li>
<li>FAILED: operation failed</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * Unique request ID for the last snapshot operation. It is recorded only during snapshot creation and rollback.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * Snapshot creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Snapshot ID. 
     * @return SnapshotId Snapshot ID.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID.
     * @param SnapshotId Snapshot ID.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Type of the disk for which the snapshot is created. Valid values: <li>SYSTEM_DISK: system disk</li> 
     * @return DiskUsage Type of the disk for which the snapshot is created. Valid values: <li>SYSTEM_DISK: system disk</li>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Type of the disk for which the snapshot is created. Valid values: <li>SYSTEM_DISK: system disk</li>
     * @param DiskUsage Type of the disk for which the snapshot is created. Valid values: <li>SYSTEM_DISK: system disk</li>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get ID of the disk for which the snapshot is created. 
     * @return DiskId ID of the disk for which the snapshot is created.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the disk for which the snapshot is created.
     * @param DiskId ID of the disk for which the snapshot is created.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Size of the disk in GB for which the snapshot is created. 
     * @return DiskSize Size of the disk in GB for which the snapshot is created.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Size of the disk in GB for which the snapshot is created.
     * @param DiskSize Size of the disk in GB for which the snapshot is created.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Snapshot name, which is a custom snapshot alias. 
     * @return SnapshotName Snapshot name, which is a custom snapshot alias.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name, which is a custom snapshot alias.
     * @param SnapshotName Snapshot name, which is a custom snapshot alias.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot status. Valid values:
<li>NORMAL: normal </li>
<li>CREATING: creating</li>
<li>ROLLBACKING: rolling back</li> 
     * @return SnapshotState Snapshot status. Valid values:
<li>NORMAL: normal </li>
<li>CREATING: creating</li>
<li>ROLLBACKING: rolling back</li>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set Snapshot status. Valid values:
<li>NORMAL: normal </li>
<li>CREATING: creating</li>
<li>ROLLBACKING: rolling back</li>
     * @param SnapshotState Snapshot status. Valid values:
<li>NORMAL: normal </li>
<li>CREATING: creating</li>
<li>ROLLBACKING: rolling back</li>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get Snapshot creation or rollback progress in percentage. After success, the value of this field will become 100. 
     * @return Percent Snapshot creation or rollback progress in percentage. After success, the value of this field will become 100.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Snapshot creation or rollback progress in percentage. After success, the value of this field will become 100.
     * @param Percent Snapshot creation or rollback progress in percentage. After success, the value of this field will become 100.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Last snapshot operation. It is recorded only during snapshot creation and rollback.
Example values: CreateInstanceSnapshot, RollbackInstanceSnapshot.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperation Last snapshot operation. It is recorded only during snapshot creation and rollback.
Example values: CreateInstanceSnapshot, RollbackInstanceSnapshot.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set Last snapshot operation. It is recorded only during snapshot creation and rollback.
Example values: CreateInstanceSnapshot, RollbackInstanceSnapshot.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperation Last snapshot operation. It is recorded only during snapshot creation and rollback.
Example values: CreateInstanceSnapshot, RollbackInstanceSnapshot.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get Last snapshot operation status. It is recorded only during snapshot creation and rollback.
Valid values:
<li>SUCCESS: operation succeeded</li>
<li>OPERATING: the operation is being executed</li>
<li>FAILED: operation failed</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperationState Last snapshot operation status. It is recorded only during snapshot creation and rollback.
Valid values:
<li>SUCCESS: operation succeeded</li>
<li>OPERATING: the operation is being executed</li>
<li>FAILED: operation failed</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set Last snapshot operation status. It is recorded only during snapshot creation and rollback.
Valid values:
<li>SUCCESS: operation succeeded</li>
<li>OPERATING: the operation is being executed</li>
<li>FAILED: operation failed</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperationState Last snapshot operation status. It is recorded only during snapshot creation and rollback.
Valid values:
<li>SUCCESS: operation succeeded</li>
<li>OPERATING: the operation is being executed</li>
<li>FAILED: operation failed</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get Unique request ID for the last snapshot operation. It is recorded only during snapshot creation and rollback.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperationRequestId Unique request ID for the last snapshot operation. It is recorded only during snapshot creation and rollback.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set Unique request ID for the last snapshot operation. It is recorded only during snapshot creation and rollback.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperationRequestId Unique request ID for the last snapshot operation. It is recorded only during snapshot creation and rollback.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get Snapshot creation time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreatedTime Snapshot creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Snapshot creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreatedTime Snapshot creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public Snapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshot(Snapshot source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}


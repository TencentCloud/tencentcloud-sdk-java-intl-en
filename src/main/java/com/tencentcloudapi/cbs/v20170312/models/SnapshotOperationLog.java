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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotOperationLog extends AbstractModel {

    /**
    * Status of operation. Value range:
SUCCESS: Operation successful 
FAILED: Operation failed 
PROCESSING: Operation in process
    */
    @SerializedName("OperationState")
    @Expose
    private String OperationState;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * UIN of operator.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * ID of snapshot being operated.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Operation type. Value range:
SNAP_OPERATION_DELETE: Delete snapshot
SNAP_OPERATION_ROLLBACK: Roll back snapshot
SNAP_OPERATION_MODIFY: Modify snapshot attributes
SNAP_OPERATION_CREATE: Create snapshot
SNAP_OPERATION_COPY: Cross-region replication of snapshot
ASP_OPERATION_CREATE_SNAP: Create snapshot with scheduled snapshot policy
ASP_OPERATION_DELETE_SNAP: Delete snapshot from scheduled snapshot policy
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Status of operation. Value range:
SUCCESS: Operation successful 
FAILED: Operation failed 
PROCESSING: Operation in process 
     * @return OperationState Status of operation. Value range:
SUCCESS: Operation successful 
FAILED: Operation failed 
PROCESSING: Operation in process
     */
    public String getOperationState() {
        return this.OperationState;
    }

    /**
     * Set Status of operation. Value range:
SUCCESS: Operation successful 
FAILED: Operation failed 
PROCESSING: Operation in process
     * @param OperationState Status of operation. Value range:
SUCCESS: Operation successful 
FAILED: Operation failed 
PROCESSING: Operation in process
     */
    public void setOperationState(String OperationState) {
        this.OperationState = OperationState;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get UIN of operator.
Note: This field may return null, indicating that no valid value was found. 
     * @return Operator UIN of operator.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set UIN of operator.
Note: This field may return null, indicating that no valid value was found.
     * @param Operator UIN of operator.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get ID of snapshot being operated. 
     * @return SnapshotId ID of snapshot being operated.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set ID of snapshot being operated.
     * @param SnapshotId ID of snapshot being operated.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Operation type. Value range:
SNAP_OPERATION_DELETE: Delete snapshot
SNAP_OPERATION_ROLLBACK: Roll back snapshot
SNAP_OPERATION_MODIFY: Modify snapshot attributes
SNAP_OPERATION_CREATE: Create snapshot
SNAP_OPERATION_COPY: Cross-region replication of snapshot
ASP_OPERATION_CREATE_SNAP: Create snapshot with scheduled snapshot policy
ASP_OPERATION_DELETE_SNAP: Delete snapshot from scheduled snapshot policy 
     * @return Operation Operation type. Value range:
SNAP_OPERATION_DELETE: Delete snapshot
SNAP_OPERATION_ROLLBACK: Roll back snapshot
SNAP_OPERATION_MODIFY: Modify snapshot attributes
SNAP_OPERATION_CREATE: Create snapshot
SNAP_OPERATION_COPY: Cross-region replication of snapshot
ASP_OPERATION_CREATE_SNAP: Create snapshot with scheduled snapshot policy
ASP_OPERATION_DELETE_SNAP: Delete snapshot from scheduled snapshot policy
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. Value range:
SNAP_OPERATION_DELETE: Delete snapshot
SNAP_OPERATION_ROLLBACK: Roll back snapshot
SNAP_OPERATION_MODIFY: Modify snapshot attributes
SNAP_OPERATION_CREATE: Create snapshot
SNAP_OPERATION_COPY: Cross-region replication of snapshot
ASP_OPERATION_CREATE_SNAP: Create snapshot with scheduled snapshot policy
ASP_OPERATION_DELETE_SNAP: Delete snapshot from scheduled snapshot policy
     * @param Operation Operation type. Value range:
SNAP_OPERATION_DELETE: Delete snapshot
SNAP_OPERATION_ROLLBACK: Roll back snapshot
SNAP_OPERATION_MODIFY: Modify snapshot attributes
SNAP_OPERATION_CREATE: Create snapshot
SNAP_OPERATION_COPY: Cross-region replication of snapshot
ASP_OPERATION_CREATE_SNAP: Create snapshot with scheduled snapshot policy
ASP_OPERATION_DELETE_SNAP: Delete snapshot from scheduled snapshot policy
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public SnapshotOperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotOperationLog(SnapshotOperationLog source) {
        if (source.OperationState != null) {
            this.OperationState = new String(source.OperationState);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationState", this.OperationState);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


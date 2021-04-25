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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotResult extends AbstractModel{

    /**
    * The ID of the table group where the table resides
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Task ID, which is valid for the API that creates one task at a time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * Snapshot name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * The time of the data from which the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * When the snapshot expires
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotDeadTime")
    @Expose
    private String SnapshotDeadTime;

    /**
    * When the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotCreateTime")
    @Expose
    private String SnapshotCreateTime;

    /**
    * Snapshot size
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * Snapshot status. Valid values: `0` (creating), `1` (normal), `2` (deleting), `3` (expired), `4` (rolling back).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotStatus")
    @Expose
    private Long SnapshotStatus;

    /**
     * Get The ID of the table group where the table resides
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TableGroupId The ID of the table group where the table resides
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set The ID of the table group where the table resides
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TableGroupId The ID of the table group where the table resides
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TableName Table name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TableName Table name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Task ID, which is valid for the API that creates one task at a time
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TaskId Task ID, which is valid for the API that creates one task at a time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, which is valid for the API that creates one task at a time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TaskId Task ID, which is valid for the API that creates one task at a time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Error Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Error Error information
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get Snapshot name
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotName Snapshot name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotName Snapshot name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get The time of the data from which the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotTime The time of the data from which the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set The time of the data from which the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotTime The time of the data from which the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get When the snapshot expires
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotDeadTime When the snapshot expires
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSnapshotDeadTime() {
        return this.SnapshotDeadTime;
    }

    /**
     * Set When the snapshot expires
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotDeadTime When the snapshot expires
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotDeadTime(String SnapshotDeadTime) {
        this.SnapshotDeadTime = SnapshotDeadTime;
    }

    /**
     * Get When the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotCreateTime When the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getSnapshotCreateTime() {
        return this.SnapshotCreateTime;
    }

    /**
     * Set When the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotCreateTime When the snapshot was created
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotCreateTime(String SnapshotCreateTime) {
        this.SnapshotCreateTime = SnapshotCreateTime;
    }

    /**
     * Get Snapshot size
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotSize Snapshot size
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set Snapshot size
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotSize Snapshot size
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get Snapshot status. Valid values: `0` (creating), `1` (normal), `2` (deleting), `3` (expired), `4` (rolling back).
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return SnapshotStatus Snapshot status. Valid values: `0` (creating), `1` (normal), `2` (deleting), `3` (expired), `4` (rolling back).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getSnapshotStatus() {
        return this.SnapshotStatus;
    }

    /**
     * Set Snapshot status. Valid values: `0` (creating), `1` (normal), `2` (deleting), `3` (expired), `4` (rolling back).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param SnapshotStatus Snapshot status. Valid values: `0` (creating), `1` (normal), `2` (deleting), `3` (expired), `4` (rolling back).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setSnapshotStatus(Long SnapshotStatus) {
        this.SnapshotStatus = SnapshotStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamSimple(map, prefix + "SnapshotDeadTime", this.SnapshotDeadTime);
        this.setParamSimple(map, prefix + "SnapshotCreateTime", this.SnapshotCreateTime);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "SnapshotStatus", this.SnapshotStatus);

    }
}


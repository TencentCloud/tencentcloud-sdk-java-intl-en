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

public class VulFixTaskDetailItem extends AbstractModel {

    /**
    * <p>Detailed record ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Associated repair task ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Vulnerability ID to be repaired</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>Patch ID of the fixed KB</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Host private IP address.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>Execution status<br>Enumeration value:<br>0: Initial state<br>1: Task issued<br>11: Client confirmed<br>2: Repair completed<br>3: Client offline<br>4: Timeout<br>5: Failure<br>6: Unsupported<br>9: Waiting for snapshot creation<br>10: Snapshot creation failed</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Fix result</p><p>Enumeration values:</p><ul><li>0: initial state</li><li>1: repair successful</li><li>2: fix failure</li><li>3: fix</li></ul>
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * <p>Snapshot status<br>Enumeration value:<br>-1: No need to create a snapshot<br>0: Not started<br>1: In progress<br>2: Completed<br>3: Creation failed</p>
    */
    @SerializedName("SnapshotStatus")
    @Expose
    private Long SnapshotStatus;

    /**
    * <p>Exception prompt message</p>
    */
    @SerializedName("ExceptionMessage")
    @Expose
    private String ExceptionMessage;

    /**
    * <p>Repair startup time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Repair end time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Snapshot creation time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("SnapshotCreateTime")
    @Expose
    private String SnapshotCreateTime;

    /**
    * <p>Snapshot expiration time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("SnapshotExpireTime")
    @Expose
    private String SnapshotExpireTime;

    /**
    * <p>Snapshot creation failure reason (available when SnapshotStatus=3)</p>
    */
    @SerializedName("SnapshotFailReason")
    @Expose
    private String SnapshotFailReason;

    /**
     * Get <p>Detailed record ID</p> 
     * @return Id <p>Detailed record ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Detailed record ID</p>
     * @param Id <p>Detailed record ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Associated repair task ID</p> 
     * @return TaskId <p>Associated repair task ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Associated repair task ID</p>
     * @param TaskId <p>Associated repair task ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Vulnerability ID to be repaired</p> 
     * @return VulId <p>Vulnerability ID to be repaired</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID to be repaired</p>
     * @param VulId <p>Vulnerability ID to be repaired</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Patch ID of the fixed KB</p> 
     * @return KBId <p>Patch ID of the fixed KB</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>Patch ID of the fixed KB</p>
     * @param KBId <p>Patch ID of the fixed KB</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceId <p>Host instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceId <p>Host instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Host name.</p> 
     * @return MachineName <p>Host name.</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Host name.</p>
     * @param MachineName <p>Host name.</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Host private IP address.</p> 
     * @return MachineIp <p>Host private IP address.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Host private IP address.</p>
     * @param MachineIp <p>Host private IP address.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return VulName <p>Vulnerability name</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param VulName <p>Vulnerability name</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>Execution status<br>Enumeration value:<br>0: Initial state<br>1: Task issued<br>11: Client confirmed<br>2: Repair completed<br>3: Client offline<br>4: Timeout<br>5: Failure<br>6: Unsupported<br>9: Waiting for snapshot creation<br>10: Snapshot creation failed</p> 
     * @return Status <p>Execution status<br>Enumeration value:<br>0: Initial state<br>1: Task issued<br>11: Client confirmed<br>2: Repair completed<br>3: Client offline<br>4: Timeout<br>5: Failure<br>6: Unsupported<br>9: Waiting for snapshot creation<br>10: Snapshot creation failed</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Execution status<br>Enumeration value:<br>0: Initial state<br>1: Task issued<br>11: Client confirmed<br>2: Repair completed<br>3: Client offline<br>4: Timeout<br>5: Failure<br>6: Unsupported<br>9: Waiting for snapshot creation<br>10: Snapshot creation failed</p>
     * @param Status <p>Execution status<br>Enumeration value:<br>0: Initial state<br>1: Task issued<br>11: Client confirmed<br>2: Repair completed<br>3: Client offline<br>4: Timeout<br>5: Failure<br>6: Unsupported<br>9: Waiting for snapshot creation<br>10: Snapshot creation failed</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Fix result</p><p>Enumeration values:</p><ul><li>0: initial state</li><li>1: repair successful</li><li>2: fix failure</li><li>3: fix</li></ul> 
     * @return FixStatus <p>Fix result</p><p>Enumeration values:</p><ul><li>0: initial state</li><li>1: repair successful</li><li>2: fix failure</li><li>3: fix</li></ul>
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set <p>Fix result</p><p>Enumeration values:</p><ul><li>0: initial state</li><li>1: repair successful</li><li>2: fix failure</li><li>3: fix</li></ul>
     * @param FixStatus <p>Fix result</p><p>Enumeration values:</p><ul><li>0: initial state</li><li>1: repair successful</li><li>2: fix failure</li><li>3: fix</li></ul>
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get <p>Snapshot status<br>Enumeration value:<br>-1: No need to create a snapshot<br>0: Not started<br>1: In progress<br>2: Completed<br>3: Creation failed</p> 
     * @return SnapshotStatus <p>Snapshot status<br>Enumeration value:<br>-1: No need to create a snapshot<br>0: Not started<br>1: In progress<br>2: Completed<br>3: Creation failed</p>
     */
    public Long getSnapshotStatus() {
        return this.SnapshotStatus;
    }

    /**
     * Set <p>Snapshot status<br>Enumeration value:<br>-1: No need to create a snapshot<br>0: Not started<br>1: In progress<br>2: Completed<br>3: Creation failed</p>
     * @param SnapshotStatus <p>Snapshot status<br>Enumeration value:<br>-1: No need to create a snapshot<br>0: Not started<br>1: In progress<br>2: Completed<br>3: Creation failed</p>
     */
    public void setSnapshotStatus(Long SnapshotStatus) {
        this.SnapshotStatus = SnapshotStatus;
    }

    /**
     * Get <p>Exception prompt message</p> 
     * @return ExceptionMessage <p>Exception prompt message</p>
     */
    public String getExceptionMessage() {
        return this.ExceptionMessage;
    }

    /**
     * Set <p>Exception prompt message</p>
     * @param ExceptionMessage <p>Exception prompt message</p>
     */
    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
    }

    /**
     * Get <p>Repair startup time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return StartTime <p>Repair startup time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Repair startup time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param StartTime <p>Repair startup time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Repair end time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return EndTime <p>Repair end time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Repair end time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param EndTime <p>Repair end time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Snapshot creation time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return SnapshotCreateTime <p>Snapshot creation time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getSnapshotCreateTime() {
        return this.SnapshotCreateTime;
    }

    /**
     * Set <p>Snapshot creation time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param SnapshotCreateTime <p>Snapshot creation time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setSnapshotCreateTime(String SnapshotCreateTime) {
        this.SnapshotCreateTime = SnapshotCreateTime;
    }

    /**
     * Get <p>Snapshot expiration time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return SnapshotExpireTime <p>Snapshot expiration time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getSnapshotExpireTime() {
        return this.SnapshotExpireTime;
    }

    /**
     * Set <p>Snapshot expiration time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param SnapshotExpireTime <p>Snapshot expiration time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setSnapshotExpireTime(String SnapshotExpireTime) {
        this.SnapshotExpireTime = SnapshotExpireTime;
    }

    /**
     * Get <p>Snapshot creation failure reason (available when SnapshotStatus=3)</p> 
     * @return SnapshotFailReason <p>Snapshot creation failure reason (available when SnapshotStatus=3)</p>
     */
    public String getSnapshotFailReason() {
        return this.SnapshotFailReason;
    }

    /**
     * Set <p>Snapshot creation failure reason (available when SnapshotStatus=3)</p>
     * @param SnapshotFailReason <p>Snapshot creation failure reason (available when SnapshotStatus=3)</p>
     */
    public void setSnapshotFailReason(String SnapshotFailReason) {
        this.SnapshotFailReason = SnapshotFailReason;
    }

    public VulFixTaskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskDetailItem(VulFixTaskDetailItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.SnapshotStatus != null) {
            this.SnapshotStatus = new Long(source.SnapshotStatus);
        }
        if (source.ExceptionMessage != null) {
            this.ExceptionMessage = new String(source.ExceptionMessage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SnapshotCreateTime != null) {
            this.SnapshotCreateTime = new String(source.SnapshotCreateTime);
        }
        if (source.SnapshotExpireTime != null) {
            this.SnapshotExpireTime = new String(source.SnapshotExpireTime);
        }
        if (source.SnapshotFailReason != null) {
            this.SnapshotFailReason = new String(source.SnapshotFailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "SnapshotStatus", this.SnapshotStatus);
        this.setParamSimple(map, prefix + "ExceptionMessage", this.ExceptionMessage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SnapshotCreateTime", this.SnapshotCreateTime);
        this.setParamSimple(map, prefix + "SnapshotExpireTime", this.SnapshotExpireTime);
        this.setParamSimple(map, prefix + "SnapshotFailReason", this.SnapshotFailReason);

    }
}


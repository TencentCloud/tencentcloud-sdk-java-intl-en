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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreTask extends AbstractModel {

    /**
    * Target Instance ID
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * Target Instance Name
    */
    @SerializedName("TargetInstanceName")
    @Expose
    private String TargetInstanceName;

    /**
    * Target Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
11: Read-Only
12: Restarting
    */
    @SerializedName("TargetInstanceStatus")
    @Expose
    private Long TargetInstanceStatus;

    /**
    * Target Instance Region
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * Rollback Record ID
    */
    @SerializedName("RestoreId")
    @Expose
    private Long RestoreId;

    /**
    * Restoration target instance type: 0 - current instance, 1 - existing instance, 2 - new instance
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Rollback method: 0 - by point-in-time, 1 - by backup set
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * Rollback Target Time
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Rollback status: 0 - Initialization, 1 - Running, 2 - Success, 3 - Failure
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Rollback Asynchronous Task ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get Target Instance ID 
     * @return TargetInstanceId Target Instance ID
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set Target Instance ID
     * @param TargetInstanceId Target Instance ID
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get Target Instance Name 
     * @return TargetInstanceName Target Instance Name
     */
    public String getTargetInstanceName() {
        return this.TargetInstanceName;
    }

    /**
     * Set Target Instance Name
     * @param TargetInstanceName Target Instance Name
     */
    public void setTargetInstanceName(String TargetInstanceName) {
        this.TargetInstanceName = TargetInstanceName;
    }

    /**
     * Get Target Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
11: Read-Only
12: Restarting 
     * @return TargetInstanceStatus Target Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
11: Read-Only
12: Restarting
     */
    public Long getTargetInstanceStatus() {
        return this.TargetInstanceStatus;
    }

    /**
     * Set Target Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
11: Read-Only
12: Restarting
     * @param TargetInstanceStatus Target Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
11: Read-Only
12: Restarting
     */
    public void setTargetInstanceStatus(Long TargetInstanceStatus) {
        this.TargetInstanceStatus = TargetInstanceStatus;
    }

    /**
     * Get Target Instance Region 
     * @return TargetRegion Target Instance Region
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set Target Instance Region
     * @param TargetRegion Target Instance Region
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get Rollback Record ID 
     * @return RestoreId Rollback Record ID
     */
    public Long getRestoreId() {
        return this.RestoreId;
    }

    /**
     * Set Rollback Record ID
     * @param RestoreId Rollback Record ID
     */
    public void setRestoreId(Long RestoreId) {
        this.RestoreId = RestoreId;
    }

    /**
     * Get Restoration target instance type: 0 - current instance, 1 - existing instance, 2 - new instance 
     * @return TargetType Restoration target instance type: 0 - current instance, 1 - existing instance, 2 - new instance
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Restoration target instance type: 0 - current instance, 1 - existing instance, 2 - new instance
     * @param TargetType Restoration target instance type: 0 - current instance, 1 - existing instance, 2 - new instance
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Rollback method: 0 - by point-in-time, 1 - by backup set 
     * @return RestoreType Rollback method: 0 - by point-in-time, 1 - by backup set
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set Rollback method: 0 - by point-in-time, 1 - by backup set
     * @param RestoreType Rollback method: 0 - by point-in-time, 1 - by backup set
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get Rollback Target Time 
     * @return RestoreTime Rollback Target Time
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set Rollback Target Time
     * @param RestoreTime Rollback Target Time
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get Start Time 
     * @return StartTime Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time
     * @param StartTime Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End Time 
     * @return EndTime End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time
     * @param EndTime End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Rollback status: 0 - Initialization, 1 - Running, 2 - Success, 3 - Failure 
     * @return Status Rollback status: 0 - Initialization, 1 - Running, 2 - Success, 3 - Failure
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rollback status: 0 - Initialization, 1 - Running, 2 - Success, 3 - Failure
     * @param Status Rollback status: 0 - Initialization, 1 - Running, 2 - Success, 3 - Failure
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Rollback Asynchronous Task ID 
     * @return FlowId Rollback Asynchronous Task ID
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Rollback Asynchronous Task ID
     * @param FlowId Rollback Asynchronous Task ID
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.TargetInstanceName != null) {
            this.TargetInstanceName = new String(source.TargetInstanceName);
        }
        if (source.TargetInstanceStatus != null) {
            this.TargetInstanceStatus = new Long(source.TargetInstanceStatus);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.RestoreId != null) {
            this.RestoreId = new Long(source.RestoreId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "TargetInstanceName", this.TargetInstanceName);
        this.setParamSimple(map, prefix + "TargetInstanceStatus", this.TargetInstanceStatus);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "RestoreId", this.RestoreId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}


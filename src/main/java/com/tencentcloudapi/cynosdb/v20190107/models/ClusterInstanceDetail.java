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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstanceDetail extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Engine type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Instance status description
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * Number of CPU cores
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * Memory
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * Disk
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * Instance role
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Execution start time in seconds from 0:00	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * Duration in seconds	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * Execution time. Valid values: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, Sat`, `Sun`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * Serverless instance u200denablement status
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

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
     * Get Engine type 
     * @return InstanceType Engine type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Engine type
     * @param InstanceType Engine type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get Instance status description 
     * @return InstanceStatusDesc Instance status description
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set Instance status description
     * @param InstanceStatusDesc Instance status description
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get Number of CPU cores 
     * @return InstanceCpu Number of CPU cores
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set Number of CPU cores
     * @param InstanceCpu Number of CPU cores
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get Memory 
     * @return InstanceMemory Memory
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set Memory
     * @param InstanceMemory Memory
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get Disk 
     * @return InstanceStorage Disk
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set Disk
     * @param InstanceStorage Disk
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get Instance role 
     * @return InstanceRole Instance role
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance role
     * @param InstanceRole Instance role
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Execution start time in seconds from 0:00	
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaintainStartTime Execution start time in seconds from 0:00	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set Execution start time in seconds from 0:00	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaintainStartTime Execution start time in seconds from 0:00	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get Duration in seconds	
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaintainDuration Duration in seconds	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set Duration in seconds	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaintainDuration Duration in seconds	
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get Execution time. Valid values: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, Sat`, `Sun`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaintainWeekDays Execution time. Valid values: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, Sat`, `Sun`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set Execution time. Valid values: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, Sat`, `Sun`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaintainWeekDays Execution time. Valid values: `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, Sat`, `Sun`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get Serverless instance u200denablement status
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ServerlessStatus Serverless instance u200denablement status
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Serverless instance u200denablement status
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ServerlessStatus Serverless instance u200denablement status
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);

    }
}


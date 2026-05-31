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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSet extends AbstractModel {

    /**
    * Database schema
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Number of CPU cores
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * Instance type
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * memory
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance role
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Status description.
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * hard disk
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * Hard disk type.
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * Engine type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Duration.
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * Execution start time (seconds from 00:00)
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * The time when it can be executed. Enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"].
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * Node list
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * Instance task
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
     * Get Database schema 
     * @return DbMode Database schema
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database schema
     * @param DbMode Database schema
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get Instance type 
     * @return InstanceDeviceType Instance type
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set Instance type
     * @param InstanceDeviceType Instance type
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get memory 
     * @return InstanceMemory memory
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set memory
     * @param InstanceMemory memory
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get Status description. 
     * @return InstanceStatusDesc Status description.
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set Status description.
     * @param InstanceStatusDesc Status description.
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get hard disk 
     * @return InstanceStorage hard disk
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set hard disk
     * @param InstanceStorage hard disk
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get Hard disk type. 
     * @return InstanceStorageType Hard disk type.
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set Hard disk type.
     * @param InstanceStorageType Hard disk type.
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get Engine type. 
     * @return InstanceType Engine type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Engine type.
     * @param InstanceType Engine type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Duration. 
     * @return MaintainDuration Duration.
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set Duration.
     * @param MaintainDuration Duration.
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get Execution start time (seconds from 00:00) 
     * @return MaintainStartTime Execution start time (seconds from 00:00)
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set Execution start time (seconds from 00:00)
     * @param MaintainStartTime Execution start time (seconds from 00:00)
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get The time when it can be executed. Enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]. 
     * @return MaintainWeekDays The time when it can be executed. Enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"].
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set The time when it can be executed. Enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"].
     * @param MaintainWeekDays The time when it can be executed. Enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"].
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get Node list 
     * @return NodeList Node list
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set Node list
     * @param NodeList Node list
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get Instance task 
     * @return InstanceTasks Instance task
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set Instance task
     * @param InstanceTasks Instance task
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    public InstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSet(InstanceSet source) {
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);

    }
}


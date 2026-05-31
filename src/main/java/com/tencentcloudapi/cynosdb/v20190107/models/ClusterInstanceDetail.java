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

public class ClusterInstanceDetail extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Engine type</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Instance status description</p>
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * <p>cpu cores</p>
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * <p>Memory</p>
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * <p>hard disk</p>
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * <p>Instance role</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Execution start time (seconds from 00:00).</p>
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * <p>Duration (unit: s)</p>
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * <p>The time when it can be executed, enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * <p>serverless instance substatus</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>Instance task information</p>
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
    * <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * <p>Instance storage type<br>Description: This parameter returns a value only when the resource belonging to the query is LibraDB.</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Node list<br>Description: This parameter returns a value only when querying resources belonging to LibraDB.</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>AI optimizer status</p>
    */
    @SerializedName("AIOptimizerStatus")
    @Expose
    private AIOptimizerStatus AIOptimizerStatus;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Engine type</p> 
     * @return InstanceType <p>Engine type</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Engine type</p>
     * @param InstanceType <p>Engine type</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Instance status</p> 
     * @return InstanceStatus <p>Instance status</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status</p>
     * @param InstanceStatus <p>Instance status</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Instance status description</p> 
     * @return InstanceStatusDesc <p>Instance status description</p>
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set <p>Instance status description</p>
     * @param InstanceStatusDesc <p>Instance status description</p>
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get <p>cpu cores</p> 
     * @return InstanceCpu <p>cpu cores</p>
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set <p>cpu cores</p>
     * @param InstanceCpu <p>cpu cores</p>
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get <p>Memory</p> 
     * @return InstanceMemory <p>Memory</p>
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set <p>Memory</p>
     * @param InstanceMemory <p>Memory</p>
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get <p>hard disk</p> 
     * @return InstanceStorage <p>hard disk</p>
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set <p>hard disk</p>
     * @param InstanceStorage <p>hard disk</p>
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get <p>Instance role</p> 
     * @return InstanceRole <p>Instance role</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance role</p>
     * @param InstanceRole <p>Instance role</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Execution start time (seconds from 00:00).</p> 
     * @return MaintainStartTime <p>Execution start time (seconds from 00:00).</p>
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set <p>Execution start time (seconds from 00:00).</p>
     * @param MaintainStartTime <p>Execution start time (seconds from 00:00).</p>
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get <p>Duration (unit: s)</p> 
     * @return MaintainDuration <p>Duration (unit: s)</p>
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set <p>Duration (unit: s)</p>
     * @param MaintainDuration <p>Duration (unit: s)</p>
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get <p>The time when it can be executed, enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p> 
     * @return MaintainWeekDays <p>The time when it can be executed, enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set <p>The time when it can be executed, enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     * @param MaintainWeekDays <p>The time when it can be executed, enumeration value: ["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]</p>
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get <p>serverless instance substatus</p> 
     * @return ServerlessStatus <p>serverless instance substatus</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless instance substatus</p>
     * @param ServerlessStatus <p>serverless instance substatus</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>Instance task information</p> 
     * @return InstanceTasks <p>Instance task information</p>
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set <p>Instance task information</p>
     * @param InstanceTasks <p>Instance task information</p>
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    /**
     * Get <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol> 
     * @return InstanceDeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @param InstanceDeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get <p>Instance storage type<br>Description: This parameter returns a value only when the resource belonging to the query is LibraDB.</p> 
     * @return InstanceStorageType <p>Instance storage type<br>Description: This parameter returns a value only when the resource belonging to the query is LibraDB.</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>Instance storage type<br>Description: This parameter returns a value only when the resource belonging to the query is LibraDB.</p>
     * @param InstanceStorageType <p>Instance storage type<br>Description: This parameter returns a value only when the resource belonging to the query is LibraDB.</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>Database type</p> 
     * @return DbMode <p>Database type</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Database type</p>
     * @param DbMode <p>Database type</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Node list<br>Description: This parameter returns a value only when querying resources belonging to LibraDB.</p> 
     * @return NodeList <p>Node list<br>Description: This parameter returns a value only when querying resources belonging to LibraDB.</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>Node list<br>Description: This parameter returns a value only when querying resources belonging to LibraDB.</p>
     * @param NodeList <p>Node list<br>Description: This parameter returns a value only when querying resources belonging to LibraDB.</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>AI optimizer status</p> 
     * @return AIOptimizerStatus <p>AI optimizer status</p>
     */
    public AIOptimizerStatus getAIOptimizerStatus() {
        return this.AIOptimizerStatus;
    }

    /**
     * Set <p>AI optimizer status</p>
     * @param AIOptimizerStatus <p>AI optimizer status</p>
     */
    public void setAIOptimizerStatus(AIOptimizerStatus AIOptimizerStatus) {
        this.AIOptimizerStatus = AIOptimizerStatus;
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
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.AIOptimizerStatus != null) {
            this.AIOptimizerStatus = new AIOptimizerStatus(source.AIOptimizerStatus);
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
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamObj(map, prefix + "AIOptimizerStatus.", this.AIOptimizerStatus);

    }
}


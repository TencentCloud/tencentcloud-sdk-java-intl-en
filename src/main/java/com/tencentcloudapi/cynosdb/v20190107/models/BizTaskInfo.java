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

public class BizTaskInfo extends AbstractModel {

    /**
    * Task id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * User appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * cluster id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Task Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Specifies the delayed execution time.
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * Task failure information.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * asynchronous task flow id
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * task input information
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * instance group id
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * instance group id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * Instance id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task Operation Target id
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Task Operation Target Type
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * Operator uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * task output information
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Task Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * task type
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Parent Task ID that Triggered This Task
    */
    @SerializedName("TriggerTaskId")
    @Expose
    private Long TriggerTaskId;

    /**
    * Update Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Task Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cluster Name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Instance Name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Task Progress
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * Parameter Modification Task Information
    */
    @SerializedName("ModifyParamsData")
    @Expose
    private ModifyParamsData [] ModifyParamsData;

    /**
    * Create cluster task information.
    */
    @SerializedName("CreateClustersData")
    @Expose
    private CreateClustersData CreateClustersData;

    /**
    * Cluster rollback task information.
    */
    @SerializedName("RollbackData")
    @Expose
    private RollbackData RollbackData;

    /**
    * Instance configuration change task information.
    */
    @SerializedName("ModifyInstanceData")
    @Expose
    private ModifyInstanceData ModifyInstanceData;

    /**
    * Manual Backup Task Information
    */
    @SerializedName("ManualBackupData")
    @Expose
    private ManualBackupData ManualBackupData;

    /**
    * Modify kernel version task information.
    */
    @SerializedName("ModifyDbVersionData")
    @Expose
    private ModifyDbVersionData ModifyDbVersionData;

    /**
    * Cluster availability zone information.
    */
    @SerializedName("ClusterSlaveData")
    @Expose
    private ClusterSlaveData ClusterSlaveData;

    /**
    * Cluster Log Conversion
    */
    @SerializedName("SwitchClusterLogBin")
    @Expose
    private SwitchClusterLogBin SwitchClusterLogBin;

    /**
    * Instance Parameter Modification
    */
    @SerializedName("ModifyInstanceParamsData")
    @Expose
    private BizTaskModifyParamsData ModifyInstanceParamsData;

    /**
    * Maintenance time.
    */
    @SerializedName("TaskMaintainInfo")
    @Expose
    private TaskMaintainInfo TaskMaintainInfo;

    /**
    * Instance log delivery information.

    */
    @SerializedName("InstanceCLSDeliveryInfos")
    @Expose
    private InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos;

    /**
    * Task progress information.
    */
    @SerializedName("TaskProgressInfo")
    @Expose
    private TaskProgressInfo TaskProgressInfo;

    /**
     * Get Task id 
     * @return ID Task id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Task id
     * @param ID Task id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get User appid 
     * @return AppId User appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid
     * @param AppId User appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get cluster id 
     * @return ClusterId cluster id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set cluster id
     * @param ClusterId cluster id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Task Creation Time 
     * @return CreateTime Task Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task Creation Time
     * @param CreateTime Task Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies the delayed execution time. 
     * @return DelayTime Specifies the delayed execution time.
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Specifies the delayed execution time.
     * @param DelayTime Specifies the delayed execution time.
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Task failure information. 
     * @return ErrMsg Task failure information.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Task failure information.
     * @param ErrMsg Task failure information.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get asynchronous task flow id 
     * @return FlowId asynchronous task flow id
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set asynchronous task flow id
     * @param FlowId asynchronous task flow id
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get task input information 
     * @return Input task input information
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set task input information
     * @param Input task input information
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get instance group id 
     * @return InstanceGrpId instance group id
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set instance group id
     * @param InstanceGrpId instance group id
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get instance group id 
     * @return InstanceGroupId instance group id
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set instance group id
     * @param InstanceGroupId instance group id
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Instance id 
     * @return InstanceId Instance id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance id
     * @param InstanceId Instance id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Task Operation Target id 
     * @return ObjectId Task Operation Target id
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Task Operation Target id
     * @param ObjectId Task Operation Target id
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Task Operation Target Type 
     * @return ObjectType Task Operation Target Type
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Task Operation Target Type
     * @param ObjectType Task Operation Target Type
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Operator uin 
     * @return Operator Operator uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator uin
     * @param Operator Operator uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get task output information 
     * @return Output task output information
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set task output information
     * @param Output task output information
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Task Status 
     * @return Status Task Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status
     * @param Status Task Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get task type 
     * @return TaskType task type
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set task type
     * @param TaskType task type
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Parent Task ID that Triggered This Task 
     * @return TriggerTaskId Parent Task ID that Triggered This Task
     */
    public Long getTriggerTaskId() {
        return this.TriggerTaskId;
    }

    /**
     * Set Parent Task ID that Triggered This Task
     * @param TriggerTaskId Parent Task ID that Triggered This Task
     */
    public void setTriggerTaskId(Long TriggerTaskId) {
        this.TriggerTaskId = TriggerTaskId;
    }

    /**
     * Get Update Time 
     * @return UpdateTime Update Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update Time
     * @param UpdateTime Update Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Task Start Time 
     * @return StartTime Task Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task Start Time
     * @param StartTime Task Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task End Time 
     * @return EndTime Task End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task End Time
     * @param EndTime Task End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cluster Name 
     * @return ClusterName Cluster Name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster Name
     * @param ClusterName Cluster Name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Instance Name 
     * @return InstanceName Instance Name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance Name
     * @param InstanceName Instance Name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Task Progress 
     * @return Process Task Progress
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set Task Progress
     * @param Process Task Progress
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get Parameter Modification Task Information 
     * @return ModifyParamsData Parameter Modification Task Information
     * @deprecated
     */
    @Deprecated
    public ModifyParamsData [] getModifyParamsData() {
        return this.ModifyParamsData;
    }

    /**
     * Set Parameter Modification Task Information
     * @param ModifyParamsData Parameter Modification Task Information
     * @deprecated
     */
    @Deprecated
    public void setModifyParamsData(ModifyParamsData [] ModifyParamsData) {
        this.ModifyParamsData = ModifyParamsData;
    }

    /**
     * Get Create cluster task information. 
     * @return CreateClustersData Create cluster task information.
     */
    public CreateClustersData getCreateClustersData() {
        return this.CreateClustersData;
    }

    /**
     * Set Create cluster task information.
     * @param CreateClustersData Create cluster task information.
     */
    public void setCreateClustersData(CreateClustersData CreateClustersData) {
        this.CreateClustersData = CreateClustersData;
    }

    /**
     * Get Cluster rollback task information. 
     * @return RollbackData Cluster rollback task information.
     */
    public RollbackData getRollbackData() {
        return this.RollbackData;
    }

    /**
     * Set Cluster rollback task information.
     * @param RollbackData Cluster rollback task information.
     */
    public void setRollbackData(RollbackData RollbackData) {
        this.RollbackData = RollbackData;
    }

    /**
     * Get Instance configuration change task information. 
     * @return ModifyInstanceData Instance configuration change task information.
     */
    public ModifyInstanceData getModifyInstanceData() {
        return this.ModifyInstanceData;
    }

    /**
     * Set Instance configuration change task information.
     * @param ModifyInstanceData Instance configuration change task information.
     */
    public void setModifyInstanceData(ModifyInstanceData ModifyInstanceData) {
        this.ModifyInstanceData = ModifyInstanceData;
    }

    /**
     * Get Manual Backup Task Information 
     * @return ManualBackupData Manual Backup Task Information
     */
    public ManualBackupData getManualBackupData() {
        return this.ManualBackupData;
    }

    /**
     * Set Manual Backup Task Information
     * @param ManualBackupData Manual Backup Task Information
     */
    public void setManualBackupData(ManualBackupData ManualBackupData) {
        this.ManualBackupData = ManualBackupData;
    }

    /**
     * Get Modify kernel version task information. 
     * @return ModifyDbVersionData Modify kernel version task information.
     */
    public ModifyDbVersionData getModifyDbVersionData() {
        return this.ModifyDbVersionData;
    }

    /**
     * Set Modify kernel version task information.
     * @param ModifyDbVersionData Modify kernel version task information.
     */
    public void setModifyDbVersionData(ModifyDbVersionData ModifyDbVersionData) {
        this.ModifyDbVersionData = ModifyDbVersionData;
    }

    /**
     * Get Cluster availability zone information. 
     * @return ClusterSlaveData Cluster availability zone information.
     */
    public ClusterSlaveData getClusterSlaveData() {
        return this.ClusterSlaveData;
    }

    /**
     * Set Cluster availability zone information.
     * @param ClusterSlaveData Cluster availability zone information.
     */
    public void setClusterSlaveData(ClusterSlaveData ClusterSlaveData) {
        this.ClusterSlaveData = ClusterSlaveData;
    }

    /**
     * Get Cluster Log Conversion 
     * @return SwitchClusterLogBin Cluster Log Conversion
     */
    public SwitchClusterLogBin getSwitchClusterLogBin() {
        return this.SwitchClusterLogBin;
    }

    /**
     * Set Cluster Log Conversion
     * @param SwitchClusterLogBin Cluster Log Conversion
     */
    public void setSwitchClusterLogBin(SwitchClusterLogBin SwitchClusterLogBin) {
        this.SwitchClusterLogBin = SwitchClusterLogBin;
    }

    /**
     * Get Instance Parameter Modification 
     * @return ModifyInstanceParamsData Instance Parameter Modification
     */
    public BizTaskModifyParamsData getModifyInstanceParamsData() {
        return this.ModifyInstanceParamsData;
    }

    /**
     * Set Instance Parameter Modification
     * @param ModifyInstanceParamsData Instance Parameter Modification
     */
    public void setModifyInstanceParamsData(BizTaskModifyParamsData ModifyInstanceParamsData) {
        this.ModifyInstanceParamsData = ModifyInstanceParamsData;
    }

    /**
     * Get Maintenance time. 
     * @return TaskMaintainInfo Maintenance time.
     */
    public TaskMaintainInfo getTaskMaintainInfo() {
        return this.TaskMaintainInfo;
    }

    /**
     * Set Maintenance time.
     * @param TaskMaintainInfo Maintenance time.
     */
    public void setTaskMaintainInfo(TaskMaintainInfo TaskMaintainInfo) {
        this.TaskMaintainInfo = TaskMaintainInfo;
    }

    /**
     * Get Instance log delivery information.
 
     * @return InstanceCLSDeliveryInfos Instance log delivery information.

     */
    public InstanceCLSDeliveryInfo [] getInstanceCLSDeliveryInfos() {
        return this.InstanceCLSDeliveryInfos;
    }

    /**
     * Set Instance log delivery information.

     * @param InstanceCLSDeliveryInfos Instance log delivery information.

     */
    public void setInstanceCLSDeliveryInfos(InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos) {
        this.InstanceCLSDeliveryInfos = InstanceCLSDeliveryInfos;
    }

    /**
     * Get Task progress information. 
     * @return TaskProgressInfo Task progress information.
     */
    public TaskProgressInfo getTaskProgressInfo() {
        return this.TaskProgressInfo;
    }

    /**
     * Set Task progress information.
     * @param TaskProgressInfo Task progress information.
     */
    public void setTaskProgressInfo(TaskProgressInfo TaskProgressInfo) {
        this.TaskProgressInfo = TaskProgressInfo;
    }

    public BizTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizTaskInfo(BizTaskInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TriggerTaskId != null) {
            this.TriggerTaskId = new Long(source.TriggerTaskId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.ModifyParamsData != null) {
            this.ModifyParamsData = new ModifyParamsData[source.ModifyParamsData.length];
            for (int i = 0; i < source.ModifyParamsData.length; i++) {
                this.ModifyParamsData[i] = new ModifyParamsData(source.ModifyParamsData[i]);
            }
        }
        if (source.CreateClustersData != null) {
            this.CreateClustersData = new CreateClustersData(source.CreateClustersData);
        }
        if (source.RollbackData != null) {
            this.RollbackData = new RollbackData(source.RollbackData);
        }
        if (source.ModifyInstanceData != null) {
            this.ModifyInstanceData = new ModifyInstanceData(source.ModifyInstanceData);
        }
        if (source.ManualBackupData != null) {
            this.ManualBackupData = new ManualBackupData(source.ManualBackupData);
        }
        if (source.ModifyDbVersionData != null) {
            this.ModifyDbVersionData = new ModifyDbVersionData(source.ModifyDbVersionData);
        }
        if (source.ClusterSlaveData != null) {
            this.ClusterSlaveData = new ClusterSlaveData(source.ClusterSlaveData);
        }
        if (source.SwitchClusterLogBin != null) {
            this.SwitchClusterLogBin = new SwitchClusterLogBin(source.SwitchClusterLogBin);
        }
        if (source.ModifyInstanceParamsData != null) {
            this.ModifyInstanceParamsData = new BizTaskModifyParamsData(source.ModifyInstanceParamsData);
        }
        if (source.TaskMaintainInfo != null) {
            this.TaskMaintainInfo = new TaskMaintainInfo(source.TaskMaintainInfo);
        }
        if (source.InstanceCLSDeliveryInfos != null) {
            this.InstanceCLSDeliveryInfos = new InstanceCLSDeliveryInfo[source.InstanceCLSDeliveryInfos.length];
            for (int i = 0; i < source.InstanceCLSDeliveryInfos.length; i++) {
                this.InstanceCLSDeliveryInfos[i] = new InstanceCLSDeliveryInfo(source.InstanceCLSDeliveryInfos[i]);
            }
        }
        if (source.TaskProgressInfo != null) {
            this.TaskProgressInfo = new TaskProgressInfo(source.TaskProgressInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TriggerTaskId", this.TriggerTaskId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamArrayObj(map, prefix + "ModifyParamsData.", this.ModifyParamsData);
        this.setParamObj(map, prefix + "CreateClustersData.", this.CreateClustersData);
        this.setParamObj(map, prefix + "RollbackData.", this.RollbackData);
        this.setParamObj(map, prefix + "ModifyInstanceData.", this.ModifyInstanceData);
        this.setParamObj(map, prefix + "ManualBackupData.", this.ManualBackupData);
        this.setParamObj(map, prefix + "ModifyDbVersionData.", this.ModifyDbVersionData);
        this.setParamObj(map, prefix + "ClusterSlaveData.", this.ClusterSlaveData);
        this.setParamObj(map, prefix + "SwitchClusterLogBin.", this.SwitchClusterLogBin);
        this.setParamObj(map, prefix + "ModifyInstanceParamsData.", this.ModifyInstanceParamsData);
        this.setParamObj(map, prefix + "TaskMaintainInfo.", this.TaskMaintainInfo);
        this.setParamArrayObj(map, prefix + "InstanceCLSDeliveryInfos.", this.InstanceCLSDeliveryInfos);
        this.setParamObj(map, prefix + "TaskProgressInfo.", this.TaskProgressInfo);

    }
}


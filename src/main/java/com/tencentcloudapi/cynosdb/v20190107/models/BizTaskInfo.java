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
    * 
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 
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
    * 
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
    * 
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 
    */
    @SerializedName("TriggerTaskId")
    @Expose
    private Long TriggerTaskId;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * 
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
    * 
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
    * 
    */
    @SerializedName("SwitchClusterLogBin")
    @Expose
    private SwitchClusterLogBin SwitchClusterLogBin;

    /**
    * 
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
     * Get  
     * @return ID 
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 
     * @param ID 
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get  
     * @return AppId 
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get  
     * @return ClusterId 
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 
     * @param ClusterId 
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
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
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
     * Get  
     * @return FlowId 
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 
     * @param FlowId 
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get  
     * @return Input 
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 
     * @param Input 
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get  
     * @return InstanceGrpId 
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 
     * @param InstanceGrpId 
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get  
     * @return InstanceGroupId 
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 
     * @param InstanceGroupId 
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  
     * @return ObjectId 
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 
     * @param ObjectId 
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get  
     * @return ObjectType 
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 
     * @param ObjectType 
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get  
     * @return Operator 
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 
     * @param Operator 
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get  
     * @return Output 
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return TaskType 
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 
     * @param TaskType 
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get  
     * @return TriggerTaskId 
     */
    public Long getTriggerTaskId() {
        return this.TriggerTaskId;
    }

    /**
     * Set 
     * @param TriggerTaskId 
     */
    public void setTriggerTaskId(Long TriggerTaskId) {
        this.TriggerTaskId = TriggerTaskId;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return ClusterName 
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 
     * @param ClusterName 
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get  
     * @return InstanceName 
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 
     * @param InstanceName 
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get  
     * @return Process 
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set 
     * @param Process 
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get  
     * @return ModifyParamsData 
     * @deprecated
     */
    @Deprecated
    public ModifyParamsData [] getModifyParamsData() {
        return this.ModifyParamsData;
    }

    /**
     * Set 
     * @param ModifyParamsData 
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
     * Get  
     * @return ManualBackupData 
     */
    public ManualBackupData getManualBackupData() {
        return this.ManualBackupData;
    }

    /**
     * Set 
     * @param ManualBackupData 
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
     * Get  
     * @return SwitchClusterLogBin 
     */
    public SwitchClusterLogBin getSwitchClusterLogBin() {
        return this.SwitchClusterLogBin;
    }

    /**
     * Set 
     * @param SwitchClusterLogBin 
     */
    public void setSwitchClusterLogBin(SwitchClusterLogBin SwitchClusterLogBin) {
        this.SwitchClusterLogBin = SwitchClusterLogBin;
    }

    /**
     * Get  
     * @return ModifyInstanceParamsData 
     */
    public BizTaskModifyParamsData getModifyInstanceParamsData() {
        return this.ModifyInstanceParamsData;
    }

    /**
     * Set 
     * @param ModifyInstanceParamsData 
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


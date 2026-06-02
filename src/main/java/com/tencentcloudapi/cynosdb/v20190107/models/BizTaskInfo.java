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
    * <p>Task ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>User appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Task creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Delayed execution time</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * <p>Task failure information</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>Asynchronous task flow id</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>Task input information</p>
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>Instance group id.</p>
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * <p>Instance group id.</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Task operation object id</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>Task operation object type.</p>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>Operator uin</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>Task output information</p>
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>Task status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Task type</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Parent task ID that triggers this task</p>
    */
    @SerializedName("TriggerTaskId")
    @Expose
    private Long TriggerTaskId;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Task start time</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Task end time</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Task progress</p>
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * <p>Modify parameter task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyParamsData")
    @Expose
    private ModifyParamsData [] ModifyParamsData;

    /**
    * <p>Create cluster task information</p>
    */
    @SerializedName("CreateClustersData")
    @Expose
    private CreateClustersData CreateClustersData;

    /**
    * <p>Cluster rollback task information</p>
    */
    @SerializedName("RollbackData")
    @Expose
    private RollbackData RollbackData;

    /**
    * <p>Instance configuration change task information</p>
    */
    @SerializedName("ModifyInstanceData")
    @Expose
    private ModifyInstanceData ModifyInstanceData;

    /**
    * <p>Manual backup task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManualBackupData")
    @Expose
    private ManualBackupData ManualBackupData;

    /**
    * <p>Modify kernel version task information</p>
    */
    @SerializedName("ModifyDbVersionData")
    @Expose
    private ModifyDbVersionData ModifyDbVersionData;

    /**
    * <p>Cluster Availability Zone Information</p>
    */
    @SerializedName("ClusterSlaveData")
    @Expose
    private ClusterSlaveData ClusterSlaveData;

    /**
    * <p>Convert cluster logs</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SwitchClusterLogBin")
    @Expose
    private SwitchClusterLogBin SwitchClusterLogBin;

    /**
    * <p>Modify instance parameter data</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyInstanceParamsData")
    @Expose
    private BizTaskModifyParamsData ModifyInstanceParamsData;

    /**
    * <p>Maintenance time</p>
    */
    @SerializedName("TaskMaintainInfo")
    @Expose
    private TaskMaintainInfo TaskMaintainInfo;

    /**
    * <p>Instance Log Delivery Information</p>
    */
    @SerializedName("InstanceCLSDeliveryInfos")
    @Expose
    private InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos;

    /**
    * <p>Task progress information</p>
    */
    @SerializedName("TaskProgressInfo")
    @Expose
    private TaskProgressInfo TaskProgressInfo;

    /**
    * <p>Global database network task</p>
    */
    @SerializedName("GdnTaskInfo")
    @Expose
    private GdnTaskInfo GdnTaskInfo;

    /**
    * <p>Safe id</p>
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>Safe name</p>
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * <p>AI optimizer task information</p>
    */
    @SerializedName("AIOptimizerTaskData")
    @Expose
    private AIOptimizerTaskData AIOptimizerTaskData;

    /**
     * Get <p>Task ID.</p> 
     * @return ID <p>Task ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Task ID.</p>
     * @param ID <p>Task ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>User appid</p> 
     * @return AppId <p>User appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User appid</p>
     * @param AppId <p>User appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Region</p> 
     * @return Region <p>Region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
     * @param Region <p>Region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Task creation time</p> 
     * @return CreateTime <p>Task creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time</p>
     * @param CreateTime <p>Task creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Delayed execution time</p> 
     * @return DelayTime <p>Delayed execution time</p>
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>Delayed execution time</p>
     * @param DelayTime <p>Delayed execution time</p>
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>Task failure information</p> 
     * @return ErrMsg <p>Task failure information</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Task failure information</p>
     * @param ErrMsg <p>Task failure information</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>Asynchronous task flow id</p> 
     * @return FlowId <p>Asynchronous task flow id</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>Asynchronous task flow id</p>
     * @param FlowId <p>Asynchronous task flow id</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>Task input information</p> 
     * @return Input <p>Task input information</p>
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>Task input information</p>
     * @param Input <p>Task input information</p>
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>Instance group id.</p> 
     * @return InstanceGrpId <p>Instance group id.</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set <p>Instance group id.</p>
     * @param InstanceGrpId <p>Instance group id.</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get <p>Instance group id.</p> 
     * @return InstanceGroupId <p>Instance group id.</p>
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>Instance group id.</p>
     * @param InstanceGroupId <p>Instance group id.</p>
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Task operation object id</p> 
     * @return ObjectId <p>Task operation object id</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>Task operation object id</p>
     * @param ObjectId <p>Task operation object id</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>Task operation object type.</p> 
     * @return ObjectType <p>Task operation object type.</p>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>Task operation object type.</p>
     * @param ObjectType <p>Task operation object type.</p>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>Operator uin</p> 
     * @return Operator <p>Operator uin</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>Operator uin</p>
     * @param Operator <p>Operator uin</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>Task output information</p> 
     * @return Output <p>Task output information</p>
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>Task output information</p>
     * @param Output <p>Task output information</p>
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>Task status</p> 
     * @return Status <p>Task status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status</p>
     * @param Status <p>Task status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task type</p> 
     * @return TaskType <p>Task type</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type</p>
     * @param TaskType <p>Task type</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Parent task ID that triggers this task</p> 
     * @return TriggerTaskId <p>Parent task ID that triggers this task</p>
     */
    public Long getTriggerTaskId() {
        return this.TriggerTaskId;
    }

    /**
     * Set <p>Parent task ID that triggers this task</p>
     * @param TriggerTaskId <p>Parent task ID that triggers this task</p>
     */
    public void setTriggerTaskId(Long TriggerTaskId) {
        this.TriggerTaskId = TriggerTaskId;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Task start time</p> 
     * @return StartTime <p>Task start time</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Task start time</p>
     * @param StartTime <p>Task start time</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Task end time</p> 
     * @return EndTime <p>Task end time</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Task end time</p>
     * @param EndTime <p>Task end time</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get <p>Task progress</p> 
     * @return Process <p>Task progress</p>
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set <p>Task progress</p>
     * @param Process <p>Task progress</p>
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get <p>Modify parameter task information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyParamsData <p>Modify parameter task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public ModifyParamsData [] getModifyParamsData() {
        return this.ModifyParamsData;
    }

    /**
     * Set <p>Modify parameter task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyParamsData <p>Modify parameter task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setModifyParamsData(ModifyParamsData [] ModifyParamsData) {
        this.ModifyParamsData = ModifyParamsData;
    }

    /**
     * Get <p>Create cluster task information</p> 
     * @return CreateClustersData <p>Create cluster task information</p>
     */
    public CreateClustersData getCreateClustersData() {
        return this.CreateClustersData;
    }

    /**
     * Set <p>Create cluster task information</p>
     * @param CreateClustersData <p>Create cluster task information</p>
     */
    public void setCreateClustersData(CreateClustersData CreateClustersData) {
        this.CreateClustersData = CreateClustersData;
    }

    /**
     * Get <p>Cluster rollback task information</p> 
     * @return RollbackData <p>Cluster rollback task information</p>
     */
    public RollbackData getRollbackData() {
        return this.RollbackData;
    }

    /**
     * Set <p>Cluster rollback task information</p>
     * @param RollbackData <p>Cluster rollback task information</p>
     */
    public void setRollbackData(RollbackData RollbackData) {
        this.RollbackData = RollbackData;
    }

    /**
     * Get <p>Instance configuration change task information</p> 
     * @return ModifyInstanceData <p>Instance configuration change task information</p>
     */
    public ModifyInstanceData getModifyInstanceData() {
        return this.ModifyInstanceData;
    }

    /**
     * Set <p>Instance configuration change task information</p>
     * @param ModifyInstanceData <p>Instance configuration change task information</p>
     */
    public void setModifyInstanceData(ModifyInstanceData ModifyInstanceData) {
        this.ModifyInstanceData = ModifyInstanceData;
    }

    /**
     * Get <p>Manual backup task information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManualBackupData <p>Manual backup task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ManualBackupData getManualBackupData() {
        return this.ManualBackupData;
    }

    /**
     * Set <p>Manual backup task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManualBackupData <p>Manual backup task information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManualBackupData(ManualBackupData ManualBackupData) {
        this.ManualBackupData = ManualBackupData;
    }

    /**
     * Get <p>Modify kernel version task information</p> 
     * @return ModifyDbVersionData <p>Modify kernel version task information</p>
     */
    public ModifyDbVersionData getModifyDbVersionData() {
        return this.ModifyDbVersionData;
    }

    /**
     * Set <p>Modify kernel version task information</p>
     * @param ModifyDbVersionData <p>Modify kernel version task information</p>
     */
    public void setModifyDbVersionData(ModifyDbVersionData ModifyDbVersionData) {
        this.ModifyDbVersionData = ModifyDbVersionData;
    }

    /**
     * Get <p>Cluster Availability Zone Information</p> 
     * @return ClusterSlaveData <p>Cluster Availability Zone Information</p>
     */
    public ClusterSlaveData getClusterSlaveData() {
        return this.ClusterSlaveData;
    }

    /**
     * Set <p>Cluster Availability Zone Information</p>
     * @param ClusterSlaveData <p>Cluster Availability Zone Information</p>
     */
    public void setClusterSlaveData(ClusterSlaveData ClusterSlaveData) {
        this.ClusterSlaveData = ClusterSlaveData;
    }

    /**
     * Get <p>Convert cluster logs</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SwitchClusterLogBin <p>Convert cluster logs</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SwitchClusterLogBin getSwitchClusterLogBin() {
        return this.SwitchClusterLogBin;
    }

    /**
     * Set <p>Convert cluster logs</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SwitchClusterLogBin <p>Convert cluster logs</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitchClusterLogBin(SwitchClusterLogBin SwitchClusterLogBin) {
        this.SwitchClusterLogBin = SwitchClusterLogBin;
    }

    /**
     * Get <p>Modify instance parameter data</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyInstanceParamsData <p>Modify instance parameter data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BizTaskModifyParamsData getModifyInstanceParamsData() {
        return this.ModifyInstanceParamsData;
    }

    /**
     * Set <p>Modify instance parameter data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyInstanceParamsData <p>Modify instance parameter data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyInstanceParamsData(BizTaskModifyParamsData ModifyInstanceParamsData) {
        this.ModifyInstanceParamsData = ModifyInstanceParamsData;
    }

    /**
     * Get <p>Maintenance time</p> 
     * @return TaskMaintainInfo <p>Maintenance time</p>
     */
    public TaskMaintainInfo getTaskMaintainInfo() {
        return this.TaskMaintainInfo;
    }

    /**
     * Set <p>Maintenance time</p>
     * @param TaskMaintainInfo <p>Maintenance time</p>
     */
    public void setTaskMaintainInfo(TaskMaintainInfo TaskMaintainInfo) {
        this.TaskMaintainInfo = TaskMaintainInfo;
    }

    /**
     * Get <p>Instance Log Delivery Information</p> 
     * @return InstanceCLSDeliveryInfos <p>Instance Log Delivery Information</p>
     */
    public InstanceCLSDeliveryInfo [] getInstanceCLSDeliveryInfos() {
        return this.InstanceCLSDeliveryInfos;
    }

    /**
     * Set <p>Instance Log Delivery Information</p>
     * @param InstanceCLSDeliveryInfos <p>Instance Log Delivery Information</p>
     */
    public void setInstanceCLSDeliveryInfos(InstanceCLSDeliveryInfo [] InstanceCLSDeliveryInfos) {
        this.InstanceCLSDeliveryInfos = InstanceCLSDeliveryInfos;
    }

    /**
     * Get <p>Task progress information</p> 
     * @return TaskProgressInfo <p>Task progress information</p>
     */
    public TaskProgressInfo getTaskProgressInfo() {
        return this.TaskProgressInfo;
    }

    /**
     * Set <p>Task progress information</p>
     * @param TaskProgressInfo <p>Task progress information</p>
     */
    public void setTaskProgressInfo(TaskProgressInfo TaskProgressInfo) {
        this.TaskProgressInfo = TaskProgressInfo;
    }

    /**
     * Get <p>Global database network task</p> 
     * @return GdnTaskInfo <p>Global database network task</p>
     */
    public GdnTaskInfo getGdnTaskInfo() {
        return this.GdnTaskInfo;
    }

    /**
     * Set <p>Global database network task</p>
     * @param GdnTaskInfo <p>Global database network task</p>
     */
    public void setGdnTaskInfo(GdnTaskInfo GdnTaskInfo) {
        this.GdnTaskInfo = GdnTaskInfo;
    }

    /**
     * Get <p>Safe id</p> 
     * @return VaultId <p>Safe id</p>
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>Safe id</p>
     * @param VaultId <p>Safe id</p>
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>Safe name</p> 
     * @return VaultName <p>Safe name</p>
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set <p>Safe name</p>
     * @param VaultName <p>Safe name</p>
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get <p>AI optimizer task information</p> 
     * @return AIOptimizerTaskData <p>AI optimizer task information</p>
     */
    public AIOptimizerTaskData getAIOptimizerTaskData() {
        return this.AIOptimizerTaskData;
    }

    /**
     * Set <p>AI optimizer task information</p>
     * @param AIOptimizerTaskData <p>AI optimizer task information</p>
     */
    public void setAIOptimizerTaskData(AIOptimizerTaskData AIOptimizerTaskData) {
        this.AIOptimizerTaskData = AIOptimizerTaskData;
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
        if (source.GdnTaskInfo != null) {
            this.GdnTaskInfo = new GdnTaskInfo(source.GdnTaskInfo);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.AIOptimizerTaskData != null) {
            this.AIOptimizerTaskData = new AIOptimizerTaskData(source.AIOptimizerTaskData);
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
        this.setParamObj(map, prefix + "GdnTaskInfo.", this.GdnTaskInfo);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamObj(map, prefix + "AIOptimizerTaskData.", this.AIOptimizerTaskData);

    }
}


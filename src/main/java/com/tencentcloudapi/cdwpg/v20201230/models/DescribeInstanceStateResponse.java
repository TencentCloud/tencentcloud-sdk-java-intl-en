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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceStateResponse extends AbstractModel {

    /**
    * Instance status. Example: serving.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Creation time of instance operation.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowCreateTime")
    @Expose
    private String FlowCreateTime;

    /**
    * Instance operation name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * Instance operation progress.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowProgress")
    @Expose
    private Float FlowProgress;

    /**
    * Cluster status description. Example: running.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStateDesc")
    @Expose
    private String InstanceStateDesc;

    /**
    * Instance process error messages. Example: "Creation failed, insufficient resources."
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * The name of the current step. Example: "Purchasing resources."Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Enabling status of the instance backup task.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance status. Example: serving. 
     * @return InstanceState Instance status. Example: serving.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. Example: serving.
     * @param InstanceState Instance status. Example: serving.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Creation time of instance operation.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowCreateTime Creation time of instance operation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFlowCreateTime() {
        return this.FlowCreateTime;
    }

    /**
     * Set Creation time of instance operation.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowCreateTime Creation time of instance operation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowCreateTime(String FlowCreateTime) {
        this.FlowCreateTime = FlowCreateTime;
    }

    /**
     * Get Instance operation name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowName Instance operation name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set Instance operation name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowName Instance operation name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get Instance operation progress.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowProgress Instance operation progress.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getFlowProgress() {
        return this.FlowProgress;
    }

    /**
     * Set Instance operation progress.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowProgress Instance operation progress.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowProgress(Float FlowProgress) {
        this.FlowProgress = FlowProgress;
    }

    /**
     * Get Cluster status description. Example: running.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStateDesc Cluster status description. Example: running.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceStateDesc() {
        return this.InstanceStateDesc;
    }

    /**
     * Set Cluster status description. Example: running.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStateDesc Cluster status description. Example: running.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStateDesc(String InstanceStateDesc) {
        this.InstanceStateDesc = InstanceStateDesc;
    }

    /**
     * Get Instance process error messages. Example: "Creation failed, insufficient resources."
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FlowMsg Instance process error messages. Example: "Creation failed, insufficient resources."
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set Instance process error messages. Example: "Creation failed, insufficient resources."
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FlowMsg Instance process error messages. Example: "Creation failed, insufficient resources."
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get The name of the current step. Example: "Purchasing resources."Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessName The name of the current step. Example: "Purchasing resources."Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set The name of the current step. Example: "Purchasing resources."Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessName The name of the current step. Example: "Purchasing resources."Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Enabling status of the instance backup task.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupStatus Enabling status of the instance backup task.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Enabling status of the instance backup task.Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupStatus Enabling status of the instance backup task.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceStateResponse(DescribeInstanceStateResponse source) {
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.FlowCreateTime != null) {
            this.FlowCreateTime = new String(source.FlowCreateTime);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowProgress != null) {
            this.FlowProgress = new Float(source.FlowProgress);
        }
        if (source.InstanceStateDesc != null) {
            this.InstanceStateDesc = new String(source.InstanceStateDesc);
        }
        if (source.FlowMsg != null) {
            this.FlowMsg = new String(source.FlowMsg);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "FlowCreateTime", this.FlowCreateTime);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowProgress", this.FlowProgress);
        this.setParamSimple(map, prefix + "InstanceStateDesc", this.InstanceStateDesc);
        this.setParamSimple(map, prefix + "FlowMsg", this.FlowMsg);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


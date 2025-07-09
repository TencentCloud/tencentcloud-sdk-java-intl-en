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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTransformTaskInfo extends AbstractModel {

    /**
    * Data processing task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data processing task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Task type. Valid values: 1 (DSL) and 2 (SQL).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Source log topic
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last enabled time. If you need to rebuild a cluster, modify this time.
    */
    @SerializedName("LastEnableTime")
    @Expose
    private String LastEnableTime;

    /**
    * Log topic name
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Target topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Logical function for data processing
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
     * Get Data processing task name 
     * @return Name Data processing task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data processing task name
     * @param Name Data processing task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data processing task ID 
     * @return TaskId Data processing task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Data processing task ID
     * @param TaskId Data processing task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. Valid values: 1 (enabled) and 2 (disabled). 
     * @return EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task status. Valid values: 1 (enabled) and 2 (disabled).
     * @param EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Task type. Valid values: 1 (DSL) and 2 (SQL). 
     * @return Type Task type. Valid values: 1 (DSL) and 2 (SQL).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Task type. Valid values: 1 (DSL) and 2 (SQL).
     * @param Type Task type. Valid values: 1 (DSL) and 2 (SQL).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Source log topic 
     * @return SrcTopicId Source log topic
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source log topic
     * @param SrcTopicId Source log topic
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped). 
     * @return Status Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     * @param Status Current task status. Valid values: 1 (preparing), 2 (in progress), 3 (being stopped), and 4 (stopped).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time 
     * @return UpdateTime Last modified time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time
     * @param UpdateTime Last modified time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last enabled time. If you need to rebuild a cluster, modify this time. 
     * @return LastEnableTime Last enabled time. If you need to rebuild a cluster, modify this time.
     */
    public String getLastEnableTime() {
        return this.LastEnableTime;
    }

    /**
     * Set Last enabled time. If you need to rebuild a cluster, modify this time.
     * @param LastEnableTime Last enabled time. If you need to rebuild a cluster, modify this time.
     */
    public void setLastEnableTime(String LastEnableTime) {
        this.LastEnableTime = LastEnableTime;
    }

    /**
     * Get Log topic name 
     * @return SrcTopicName Log topic name
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set Log topic name
     * @param SrcTopicName Log topic name
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Target topic ID and alias of the data processing task 
     * @return DstResources Target topic ID and alias of the data processing task
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Target topic ID and alias of the data processing task
     * @param DstResources Target topic ID and alias of the data processing task
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get Logical function for data processing 
     * @return EtlContent Logical function for data processing
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Logical function for data processing
     * @param EtlContent Logical function for data processing
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    public DataTransformTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformTaskInfo(DataTransformTaskInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastEnableTime != null) {
            this.LastEnableTime = new String(source.LastEnableTime);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastEnableTime", this.LastEnableTime);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);

    }
}


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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataTransformRequest extends AbstractModel{

    /**
    * Task type. Valid values: 1 (specified topic) and 2 (dynamically created).
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
    * Source log topic
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Data processing task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data processing statement
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * Data processing type. Valid values: `1`: Use random data from the source log topic for processing preview. `2`: Use user-defined test data for processing preview. `3`: Create a real processing task.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Target topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Test data used for previewing the processing result
    */
    @SerializedName("PreviewLogStatistics")
    @Expose
    private PreviewLogStatistic [] PreviewLogStatistics;

    /**
     * Get Task type. Valid values: 1 (specified topic) and 2 (dynamically created). 
     * @return FuncType Task type. Valid values: 1 (specified topic) and 2 (dynamically created).
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set Task type. Valid values: 1 (specified topic) and 2 (dynamically created).
     * @param FuncType Task type. Valid values: 1 (specified topic) and 2 (dynamically created).
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
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
     * Get Data processing statement 
     * @return EtlContent Data processing statement
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Data processing statement
     * @param EtlContent Data processing statement
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get Data processing type. Valid values: `1`: Use random data from the source log topic for processing preview. `2`: Use user-defined test data for processing preview. `3`: Create a real processing task. 
     * @return TaskType Data processing type. Valid values: `1`: Use random data from the source log topic for processing preview. `2`: Use user-defined test data for processing preview. `3`: Create a real processing task.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Data processing type. Valid values: `1`: Use random data from the source log topic for processing preview. `2`: Use user-defined test data for processing preview. `3`: Create a real processing task.
     * @param TaskType Data processing type. Valid values: `1`: Use random data from the source log topic for processing preview. `2`: Use user-defined test data for processing preview. `3`: Create a real processing task.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
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
     * Get Test data used for previewing the processing result 
     * @return PreviewLogStatistics Test data used for previewing the processing result
     */
    public PreviewLogStatistic [] getPreviewLogStatistics() {
        return this.PreviewLogStatistics;
    }

    /**
     * Set Test data used for previewing the processing result
     * @param PreviewLogStatistics Test data used for previewing the processing result
     */
    public void setPreviewLogStatistics(PreviewLogStatistic [] PreviewLogStatistics) {
        this.PreviewLogStatistics = PreviewLogStatistics;
    }

    public CreateDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataTransformRequest(CreateDataTransformRequest source) {
        if (source.FuncType != null) {
            this.FuncType = new Long(source.FuncType);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.PreviewLogStatistics != null) {
            this.PreviewLogStatistics = new PreviewLogStatistic[source.PreviewLogStatistics.length];
            for (int i = 0; i < source.PreviewLogStatistics.length; i++) {
                this.PreviewLogStatistics[i] = new PreviewLogStatistic(source.PreviewLogStatistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamArrayObj(map, prefix + "PreviewLogStatistics.", this.PreviewLogStatistics);

    }
}


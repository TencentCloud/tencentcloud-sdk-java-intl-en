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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataTransformRequest extends AbstractModel {

    /**
    * Data processing task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Destination topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Whether to enable delivery service log. 1 for disabled, 2 for enabled
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

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
     * Get Destination topic ID and alias of the data processing task 
     * @return DstResources Destination topic ID and alias of the data processing task
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Destination topic ID and alias of the data processing task
     * @param DstResources Destination topic ID and alias of the data processing task
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get Whether to enable delivery service log. 1 for disabled, 2 for enabled 
     * @return HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable delivery service log. 1 for disabled, 2 for enabled
     * @param HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataTransformRequest(ModifyDataTransformRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
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
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}


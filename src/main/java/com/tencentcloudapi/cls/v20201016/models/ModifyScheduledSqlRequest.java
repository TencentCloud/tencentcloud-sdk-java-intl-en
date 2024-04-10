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

public class ModifyScheduledSqlRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Source Log Topic
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Task start status. 1: Enabled, 2: Disabled
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Target log topic for scheduled SQL analysis
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * Queries statements
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * Scheduling interval (minutes)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * Time window for a single query. Example: last 15 minutes
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * Execution delay (seconds)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * Region information of source topic ID 
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * Task Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Source Log Topic 
     * @return SrcTopicId Source Log Topic
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source Log Topic
     * @param SrcTopicId Source Log Topic
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Task start status. 1: Enabled, 2: Disabled 
     * @return EnableFlag Task start status. 1: Enabled, 2: Disabled
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task start status. 1: Enabled, 2: Disabled
     * @param EnableFlag Task start status. 1: Enabled, 2: Disabled
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Target log topic for scheduled SQL analysis 
     * @return DstResource Target log topic for scheduled SQL analysis
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set Target log topic for scheduled SQL analysis
     * @param DstResource Target log topic for scheduled SQL analysis
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get Queries statements 
     * @return ScheduledSqlContent Queries statements
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set Queries statements
     * @param ScheduledSqlContent Queries statements
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get Scheduling interval (minutes) 
     * @return ProcessPeriod Scheduling interval (minutes)
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set Scheduling interval (minutes)
     * @param ProcessPeriod Scheduling interval (minutes)
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get Time window for a single query. Example: last 15 minutes 
     * @return ProcessTimeWindow Time window for a single query. Example: last 15 minutes
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set Time window for a single query. Example: last 15 minutes
     * @param ProcessTimeWindow Time window for a single query. Example: last 15 minutes
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get Execution delay (seconds) 
     * @return ProcessDelay Execution delay (seconds)
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set Execution delay (seconds)
     * @param ProcessDelay Execution delay (seconds)
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get Region information of source topic ID  
     * @return SrcTopicRegion Region information of source topic ID 
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set Region information of source topic ID 
     * @param SrcTopicRegion Region information of source topic ID 
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get Task Name 
     * @return Name Task Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task Name
     * @param Name Task Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax 
     * @return SyntaxRule Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax
     * @param SyntaxRule Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public ModifyScheduledSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyScheduledSqlRequest(ModifyScheduledSqlRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResource != null) {
            this.DstResource = new ScheduledSqlResouceInfo(source.DstResource);
        }
        if (source.ScheduledSqlContent != null) {
            this.ScheduledSqlContent = new String(source.ScheduledSqlContent);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessTimeWindow != null) {
            this.ProcessTimeWindow = new String(source.ProcessTimeWindow);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.SrcTopicRegion != null) {
            this.SrcTopicRegion = new String(source.SrcTopicRegion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamObj(map, prefix + "DstResource.", this.DstResource);
        this.setParamSimple(map, prefix + "ScheduledSqlContent", this.ScheduledSqlContent);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessTimeWindow", this.ProcessTimeWindow);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "SrcTopicRegion", this.SrcTopicRegion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}


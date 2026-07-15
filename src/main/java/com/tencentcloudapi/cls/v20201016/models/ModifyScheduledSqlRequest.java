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

public class ModifyScheduledSqlRequest extends AbstractModel {

    /**
    * <p>Task ID, obtained by <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">searching the scheduled SQL analysis task list</a>.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Source log topic, obtained via <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">search scheduled SQL analysis task list</a></p>
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * <p>Task start status. 1: Enabled, 2: Disabled</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>Target log topic for scheduled SQL analysis</p>
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * <p>Query statement</p>
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>Time window for a single query. Example: last 15 minutes</p>
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * <p>Task name, 0-255 characters</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>Whether to enable delivery service log. 1: Disabled, 2: Enabled.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Full-text search query tag. 1: Off, 2: On.</p>
    */
    @SerializedName("FullQuery")
    @Expose
    private Long FullQuery;

    /**
    * <p>Scheduling period unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
    */
    @SerializedName("ProcessPeriodUnit")
    @Expose
    private Long ProcessPeriodUnit;

    /**
     * Get <p>Task ID, obtained by <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">searching the scheduled SQL analysis task list</a>.</p> 
     * @return TaskId <p>Task ID, obtained by <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">searching the scheduled SQL analysis task list</a>.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID, obtained by <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">searching the scheduled SQL analysis task list</a>.</p>
     * @param TaskId <p>Task ID, obtained by <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">searching the scheduled SQL analysis task list</a>.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Source log topic, obtained via <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">search scheduled SQL analysis task list</a></p> 
     * @return SrcTopicId <p>Source log topic, obtained via <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">search scheduled SQL analysis task list</a></p>
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set <p>Source log topic, obtained via <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">search scheduled SQL analysis task list</a></p>
     * @param SrcTopicId <p>Source log topic, obtained via <a href="https://www.tencentcloud.com/document/product/614/95519?from_cn_redirect=1">search scheduled SQL analysis task list</a></p>
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get <p>Task start status. 1: Enabled, 2: Disabled</p> 
     * @return EnableFlag <p>Task start status. 1: Enabled, 2: Disabled</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>Task start status. 1: Enabled, 2: Disabled</p>
     * @param EnableFlag <p>Task start status. 1: Enabled, 2: Disabled</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>Target log topic for scheduled SQL analysis</p> 
     * @return DstResource <p>Target log topic for scheduled SQL analysis</p>
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set <p>Target log topic for scheduled SQL analysis</p>
     * @param DstResource <p>Target log topic for scheduled SQL analysis</p>
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get <p>Query statement</p> 
     * @return ScheduledSqlContent <p>Query statement</p>
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set <p>Query statement</p>
     * @param ScheduledSqlContent <p>Query statement</p>
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get <p>Scheduling Interval (Minutes), 1-1440 minutes</p> 
     * @return ProcessPeriod <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     * @param ProcessPeriod <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>Time window for a single query. Example: last 15 minutes</p> 
     * @return ProcessTimeWindow <p>Time window for a single query. Example: last 15 minutes</p>
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set <p>Time window for a single query. Example: last 15 minutes</p>
     * @param ProcessTimeWindow <p>Time window for a single query. Example: last 15 minutes</p>
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p> 
     * @return ProcessDelay <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     * @param ProcessDelay <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p> 
     * @return SrcTopicRegion <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     * @param SrcTopicRegion <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get <p>Task name, 0-255 characters</p> 
     * @return Name <p>Task name, 0-255 characters</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name, 0-255 characters</p>
     * @param Name <p>Task name, 0-255 characters</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax</p> 
     * @return SyntaxRule <p>Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax</p>
     * @param SyntaxRule <p>Syntax rules. Default value: 0. 0: Lucene syntax, 1: CQL syntax</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>Whether to enable delivery service log. 1: Disabled, 2: Enabled.</p> 
     * @return HasServicesLog <p>Whether to enable delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable delivery service log. 1: Disabled, 2: Enabled.</p>
     * @param HasServicesLog <p>Whether to enable delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Full-text search query tag. 1: Off, 2: On.</p> 
     * @return FullQuery <p>Full-text search query tag. 1: Off, 2: On.</p>
     */
    public Long getFullQuery() {
        return this.FullQuery;
    }

    /**
     * Set <p>Full-text search query tag. 1: Off, 2: On.</p>
     * @param FullQuery <p>Full-text search query tag. 1: Off, 2: On.</p>
     */
    public void setFullQuery(Long FullQuery) {
        this.FullQuery = FullQuery;
    }

    /**
     * Get <p>Scheduling period unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p> 
     * @return ProcessPeriodUnit <p>Scheduling period unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     */
    public Long getProcessPeriodUnit() {
        return this.ProcessPeriodUnit;
    }

    /**
     * Set <p>Scheduling period unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     * @param ProcessPeriodUnit <p>Scheduling period unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     */
    public void setProcessPeriodUnit(Long ProcessPeriodUnit) {
        this.ProcessPeriodUnit = ProcessPeriodUnit;
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
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.FullQuery != null) {
            this.FullQuery = new Long(source.FullQuery);
        }
        if (source.ProcessPeriodUnit != null) {
            this.ProcessPeriodUnit = new Long(source.ProcessPeriodUnit);
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
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "FullQuery", this.FullQuery);
        this.setParamSimple(map, prefix + "ProcessPeriodUnit", this.ProcessPeriodUnit);

    }
}


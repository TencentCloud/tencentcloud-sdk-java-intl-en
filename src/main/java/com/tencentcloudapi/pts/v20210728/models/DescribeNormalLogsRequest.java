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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNormalLogsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Job ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Context is used when loading more logs. Pass through the Context value returned last time to retrieve subsequent log content. The expiration time is 1 hour.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Log start time.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Log end time.
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
    * Log level, valid values are debug, info, error.
    */
    @SerializedName("SeverityText")
    @Expose
    private String SeverityText;

    /**
    * IP of pressure engine instance.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Region of pressure engine instance, such as ap-shanghai, ap-guangzhou.
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * Type of log, in which 'console' represents user output, 'engine' represents engine output.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Number of returned logs, maximum 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Scenario ID. 
     * @return ScenarioId Scenario ID.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.
     * @param ScenarioId Scenario ID.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Job ID. 
     * @return JobId Job ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID.
     * @param JobId Job ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Context is used when loading more logs. Pass through the Context value returned last time to retrieve subsequent log content. The expiration time is 1 hour. 
     * @return Context Context is used when loading more logs. Pass through the Context value returned last time to retrieve subsequent log content. The expiration time is 1 hour.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context is used when loading more logs. Pass through the Context value returned last time to retrieve subsequent log content. The expiration time is 1 hour.
     * @param Context Context is used when loading more logs. Pass through the Context value returned last time to retrieve subsequent log content. The expiration time is 1 hour.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Log start time. 
     * @return From Log start time.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Log start time.
     * @param From Log start time.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Log end time. 
     * @return To Log end time.
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set Log end time.
     * @param To Log end time.
     */
    public void setTo(String To) {
        this.To = To;
    }

    /**
     * Get Log level, valid values are debug, info, error. 
     * @return SeverityText Log level, valid values are debug, info, error.
     */
    public String getSeverityText() {
        return this.SeverityText;
    }

    /**
     * Set Log level, valid values are debug, info, error.
     * @param SeverityText Log level, valid values are debug, info, error.
     */
    public void setSeverityText(String SeverityText) {
        this.SeverityText = SeverityText;
    }

    /**
     * Get IP of pressure engine instance. 
     * @return Instance IP of pressure engine instance.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set IP of pressure engine instance.
     * @param Instance IP of pressure engine instance.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Region of pressure engine instance, such as ap-shanghai, ap-guangzhou. 
     * @return InstanceRegion Region of pressure engine instance, such as ap-shanghai, ap-guangzhou.
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set Region of pressure engine instance, such as ap-shanghai, ap-guangzhou.
     * @param InstanceRegion Region of pressure engine instance, such as ap-shanghai, ap-guangzhou.
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get Type of log, in which 'console' represents user output, 'engine' represents engine output. 
     * @return LogType Type of log, in which 'console' represents user output, 'engine' represents engine output.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Type of log, in which 'console' represents user output, 'engine' represents engine output.
     * @param LogType Type of log, in which 'console' represents user output, 'engine' represents engine output.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Number of returned logs, maximum 100. 
     * @return Limit Number of returned logs, maximum 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned logs, maximum 100.
     * @param Limit Number of returned logs, maximum 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNormalLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNormalLogsRequest(DescribeNormalLogsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
        if (source.SeverityText != null) {
            this.SeverityText = new String(source.SeverityText);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "SeverityText", this.SeverityText);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


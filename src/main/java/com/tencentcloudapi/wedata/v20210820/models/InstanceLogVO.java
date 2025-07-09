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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLogVO extends AbstractModel {

    /**
    * Unique id of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **Instance status**.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceState")
    @Expose
    private Long InstanceState;

    /**
    * Instance running trigger type.

-RERUN indicates data replenishment.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * Start time of running.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Indicates the operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Run code content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * File size for running code.
Unit: KB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CodeFileSize")
    @Expose
    private String CodeFileSize;

    /**
    * Log node information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Log content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * Log file size.
KB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogFileSize")
    @Expose
    private String LogFileSize;

    /**
    * Row count of returned logs this time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Specifies that you can use the field value of ExtInfo in the returned information from the previous query for the second and subsequent queries.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * Paging query for logs. indicates whether it is the last page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
     * Get Unique id of an instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceKey Unique id of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique id of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceKey Unique id of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **Instance status**.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceState **Instance status**.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set **Instance status**.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceState **Instance status**.

-[0] Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22] indicate running.
-[21] skip running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceState(Long InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Instance running trigger type.

-RERUN indicates data replenishment.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunType Instance running trigger type.

-RERUN indicates data replenishment.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set Instance running trigger type.

-RERUN indicates data replenishment.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunType Instance running trigger type.

-RERUN indicates data replenishment.
-ADDITION indicates supplementary recording.
-PERIODIC indicates a period.
-APERIODIC indicates non-periodic.
-RERUN_SKIP_RUN means empty run for re-run.
-ADDITION_SKIP_RUN indicates data replenishment - empty run.
-PERIODIC_SKIP_RUN indicates an empty run in a periodic cycle.
-APERIODIC_SKIP_RUN indicates a non-periodic empty run.
-MANUAL_TRIGGER indicates manual triggering.
-RERUN_MANUAL_TRIGGER indicates manual triggering - rerun.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get Start time of running.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of running.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Indicates the operation completion time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Indicates the operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Indicates the operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Indicates the operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Run code content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CodeInfo Run code content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set Run code content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CodeInfo Run code content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get File size for running code.
Unit: KB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CodeFileSize File size for running code.
Unit: KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodeFileSize() {
        return this.CodeFileSize;
    }

    /**
     * Set File size for running code.
Unit: KB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CodeFileSize File size for running code.
Unit: KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodeFileSize(String CodeFileSize) {
        this.CodeFileSize = CodeFileSize;
    }

    /**
     * Get Log node information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BrokerIp Log node information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Log node information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BrokerIp Log node information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Log content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogInfo Log content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set Log content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogInfo Log content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get Log file size.
KB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogFileSize Log file size.
KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogFileSize() {
        return this.LogFileSize;
    }

    /**
     * Set Log file size.
KB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogFileSize Log file size.
KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogFileSize(String LogFileSize) {
        this.LogFileSize = LogFileSize;
    }

    /**
     * Get Row count of returned logs this time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineCount Row count of returned logs this time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set Row count of returned logs this time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineCount Row count of returned logs this time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Specifies that you can use the field value of ExtInfo in the returned information from the previous query for the second and subsequent queries.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtInfo Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Specifies that you can use the field value of ExtInfo in the returned information from the previous query for the second and subsequent queries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Specifies that you can use the field value of ExtInfo in the returned information from the previous query for the second and subsequent queries.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtInfo Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Specifies that you can use the field value of ExtInfo in the returned information from the previous query for the second and subsequent queries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get Paging query for logs. indicates whether it is the last page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEnd Paging query for logs. indicates whether it is the last page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set Paging query for logs. indicates whether it is the last page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEnd Paging query for logs. indicates whether it is the last page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    public InstanceLogVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogVO(InstanceLogVO source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new Long(source.InstanceState);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.CodeFileSize != null) {
            this.CodeFileSize = new String(source.CodeFileSize);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.LogFileSize != null) {
            this.LogFileSize = new String(source.LogFileSize);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "CodeFileSize", this.CodeFileSize);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamSimple(map, prefix + "LogFileSize", this.LogFileSize);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);

    }
}


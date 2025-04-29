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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetInstanceLogRequest extends AbstractModel {

    /**
    * **Project ID**.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Unique identifier of an instance.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * Indicates the Ip address of the executor where the log is located.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Log file.
When executionJobId in instance details is empty but originFileName is not empty, originFileName and brokerIp must be included in the input parameters.
If both executionJobId and originFileName are empty, it indicates that the instance has not been dispatched for execution or has not generated logs. for example, branch node or merge node.
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * **Execution ID**.

When executionJobId in instance details is not empty, executionJobId needs to be included in the input parameters. originFileName and brokerIp are not required parameters.
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * Log level.
Default All.

- Info
- Debug
- Warn
- Error
- All
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * Start row number for obtaining logs.
The default is 1.
    */
    @SerializedName("StartLineNum")
    @Expose
    private Long StartLineNum;

    /**
    * End line number for obtaining logs.
The default value is 10000.
    */
    @SerializedName("EndLineCount")
    @Expose
    private Long EndLineCount;

    /**
    * Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Use the ExtInfo field value in the returned information from the previous query for the second and subsequent queries.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get **Project ID**. 
     * @return ProjectId **Project ID**.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **Project ID**.
     * @param ProjectId **Project ID**.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Unique identifier of an instance. 
     * @return InstanceKey Unique identifier of an instance.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique identifier of an instance.
     * @param InstanceKey Unique identifier of an instance.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1. 
     * @return LifeRoundNum Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
     * @param LifeRoundNum Instance lifetime number, which identifies one-time execution of the instance.

For example: the number of the first run of a periodic instance is 0. when the user reruns the instance later, the number of the second execution is 1.
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get Time zone.
Time zone. specifies the time zone. the default value is UTC+8. 
     * @return ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     * @param ScheduleTimeZone Time zone.
Time zone. specifies the time zone. the default value is UTC+8.
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get Indicates the Ip address of the executor where the log is located. 
     * @return BrokerIp Indicates the Ip address of the executor where the log is located.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Indicates the Ip address of the executor where the log is located.
     * @param BrokerIp Indicates the Ip address of the executor where the log is located.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Log file.
When executionJobId in instance details is empty but originFileName is not empty, originFileName and brokerIp must be included in the input parameters.
If both executionJobId and originFileName are empty, it indicates that the instance has not been dispatched for execution or has not generated logs. for example, branch node or merge node. 
     * @return OriginFileName Log file.
When executionJobId in instance details is empty but originFileName is not empty, originFileName and brokerIp must be included in the input parameters.
If both executionJobId and originFileName are empty, it indicates that the instance has not been dispatched for execution or has not generated logs. for example, branch node or merge node.
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set Log file.
When executionJobId in instance details is empty but originFileName is not empty, originFileName and brokerIp must be included in the input parameters.
If both executionJobId and originFileName are empty, it indicates that the instance has not been dispatched for execution or has not generated logs. for example, branch node or merge node.
     * @param OriginFileName Log file.
When executionJobId in instance details is empty but originFileName is not empty, originFileName and brokerIp must be included in the input parameters.
If both executionJobId and originFileName are empty, it indicates that the instance has not been dispatched for execution or has not generated logs. for example, branch node or merge node.
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get **Execution ID**.

When executionJobId in instance details is not empty, executionJobId needs to be included in the input parameters. originFileName and brokerIp are not required parameters. 
     * @return ExecutionJobId **Execution ID**.

When executionJobId in instance details is not empty, executionJobId needs to be included in the input parameters. originFileName and brokerIp are not required parameters.
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set **Execution ID**.

When executionJobId in instance details is not empty, executionJobId needs to be included in the input parameters. originFileName and brokerIp are not required parameters.
     * @param ExecutionJobId **Execution ID**.

When executionJobId in instance details is not empty, executionJobId needs to be included in the input parameters. originFileName and brokerIp are not required parameters.
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get Log level.
Default All.

- Info
- Debug
- Warn
- Error
- All 
     * @return LogLevel Log level.
Default All.

- Info
- Debug
- Warn
- Error
- All
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set Log level.
Default All.

- Info
- Debug
- Warn
- Error
- All
     * @param LogLevel Log level.
Default All.

- Info
- Debug
- Warn
- Error
- All
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get Start row number for obtaining logs.
The default is 1. 
     * @return StartLineNum Start row number for obtaining logs.
The default is 1.
     */
    public Long getStartLineNum() {
        return this.StartLineNum;
    }

    /**
     * Set Start row number for obtaining logs.
The default is 1.
     * @param StartLineNum Start row number for obtaining logs.
The default is 1.
     */
    public void setStartLineNum(Long StartLineNum) {
        this.StartLineNum = StartLineNum;
    }

    /**
     * Get End line number for obtaining logs.
The default value is 10000. 
     * @return EndLineCount End line number for obtaining logs.
The default value is 10000.
     */
    public Long getEndLineCount() {
        return this.EndLineCount;
    }

    /**
     * Set End line number for obtaining logs.
The default value is 10000.
     * @param EndLineCount End line number for obtaining logs.
The default value is 10000.
     */
    public void setEndLineCount(Long EndLineCount) {
        this.EndLineCount = EndLineCount;
    }

    /**
     * Get Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Use the ExtInfo field value in the returned information from the previous query for the second and subsequent queries. 
     * @return ExtInfo Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Use the ExtInfo field value in the returned information from the previous query for the second and subsequent queries.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Use the ExtInfo field value in the returned information from the previous query for the second and subsequent queries.
     * @param ExtInfo Used when performing a paging query for logs. it has no specific business meaning.

Specifies that the value is null for the first query. 
Use the ExtInfo field value in the returned information from the previous query for the second and subsequent queries.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public GetInstanceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetInstanceLogRequest(GetInstanceLogRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.StartLineNum != null) {
            this.StartLineNum = new Long(source.StartLineNum);
        }
        if (source.EndLineCount != null) {
            this.EndLineCount = new Long(source.EndLineCount);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "StartLineNum", this.StartLineNum);
        this.setParamSimple(map, prefix + "EndLineCount", this.EndLineCount);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}


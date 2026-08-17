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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportTaskRequest extends AbstractModel {

    /**
    * <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Set the log filter field to filter and download qualified logs.</p>
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
    * <p>Custom log fields for download, multiple fields separated by commas, such as "timestamp,operation,user". Only the data of selected fields will be downloaded when specified. The parameter defaults to downloading all fields when not passed.</p>
    */
    @SerializedName("ColumnFilter")
    @Expose
    private String [] ColumnFilter;

    /**
     * Get <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul> 
     * @return LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     * @param LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p> 
     * @return StartTime <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     * @param StartTime <p>Start time of retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 00:00:00. The returned result contains only the logs at this time point and afterward.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p> 
     * @return EndTime <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     * @param EndTime <p>End time of log retrieval.</p><p>Parameter format: YYYY-MM-DD HH:mm:ss, for example 2026-03-06 23:59:59. The returned result contains only the logs at this time point and earlier.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Set the log filter field to filter and download qualified logs.</p> 
     * @return LogFilter <p>Set the log filter field to filter and download qualified logs.</p>
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set <p>Set the log filter field to filter and download qualified logs.</p>
     * @param LogFilter <p>Set the log filter field to filter and download qualified logs.</p>
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get <p>Custom log fields for download, multiple fields separated by commas, such as "timestamp,operation,user". Only the data of selected fields will be downloaded when specified. The parameter defaults to downloading all fields when not passed.</p> 
     * @return ColumnFilter <p>Custom log fields for download, multiple fields separated by commas, such as "timestamp,operation,user". Only the data of selected fields will be downloaded when specified. The parameter defaults to downloading all fields when not passed.</p>
     */
    public String [] getColumnFilter() {
        return this.ColumnFilter;
    }

    /**
     * Set <p>Custom log fields for download, multiple fields separated by commas, such as "timestamp,operation,user". Only the data of selected fields will be downloaded when specified. The parameter defaults to downloading all fields when not passed.</p>
     * @param ColumnFilter <p>Custom log fields for download, multiple fields separated by commas, such as "timestamp,operation,user". Only the data of selected fields will be downloaded when specified. The parameter defaults to downloading all fields when not passed.</p>
     */
    public void setColumnFilter(String [] ColumnFilter) {
        this.ColumnFilter = ColumnFilter;
    }

    public CreateExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportTaskRequest(CreateExportTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
            }
        }
        if (source.ColumnFilter != null) {
            this.ColumnFilter = new String[source.ColumnFilter.length];
            for (int i = 0; i < source.ColumnFilter.length; i++) {
                this.ColumnFilter[i] = new String(source.ColumnFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamArraySimple(map, prefix + "ColumnFilter.", this.ColumnFilter);

    }
}


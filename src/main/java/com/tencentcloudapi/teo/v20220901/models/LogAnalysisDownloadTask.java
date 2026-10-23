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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogAnalysisDownloadTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Data ownership region. Valid values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Start time, example value: 2020-04-29T00:00:00Z.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time. Example value: 2020-04-30T00:00:00Z.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Log type. Valid values: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: Managed rule log.</li></ul></p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>File format, valid values:</p><ul><li>csv.</li></ul>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>Whether raw logs are returned in time sequence. Valid values: <ul><li>asc: ascending order;</li><li>desc: descending order.</li></ul></p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Task status, valid values: <ul><li>loading: being processed, waiting to generate download link;</li><li> failed: processing failure, current task cannot be downloaded;</li><li>completed: packaging completed, ready for download.</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Task creation time. After successful task creation, the retention period is 3 days.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Download link, only returned when Status = completed.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Task expiration time. After expiry, the download address will be unavailable. Please obtain a new download address through this API.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Data ownership region. Valid values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p> 
     * @return Area <p>Data ownership region. Valid values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data ownership region. Valid values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     * @param Area <p>Data ownership region. Valid values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Start time, example value: 2020-04-29T00:00:00Z.</p> 
     * @return StartTime <p>Start time, example value: 2020-04-29T00:00:00Z.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time, example value: 2020-04-29T00:00:00Z.</p>
     * @param StartTime <p>Start time, example value: 2020-04-29T00:00:00Z.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time. Example value: 2020-04-30T00:00:00Z.</p> 
     * @return EndTime <p>End time. Example value: 2020-04-30T00:00:00Z.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time. Example value: 2020-04-30T00:00:00Z.</p>
     * @param EndTime <p>End time. Example value: 2020-04-30T00:00:00Z.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Log type. Valid values: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: Managed rule log.</li></ul></p> 
     * @return LogType <p>Log type. Valid values: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: Managed rule log.</li></ul></p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type. Valid values: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: Managed rule log.</li></ul></p>
     * @param LogType <p>Log type. Valid values: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: Managed rule log.</li></ul></p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p> 
     * @return Condition <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     * @param Condition <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>File format, valid values:</p><ul><li>csv.</li></ul> 
     * @return Format <p>File format, valid values:</p><ul><li>csv.</li></ul>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>File format, valid values:</p><ul><li>csv.</li></ul>
     * @param Format <p>File format, valid values:</p><ul><li>csv.</li></ul>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Whether raw logs are returned in time sequence. Valid values: <ul><li>asc: ascending order;</li><li>desc: descending order.</li></ul></p> 
     * @return Sort <p>Whether raw logs are returned in time sequence. Valid values: <ul><li>asc: ascending order;</li><li>desc: descending order.</li></ul></p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Whether raw logs are returned in time sequence. Valid values: <ul><li>asc: ascending order;</li><li>desc: descending order.</li></ul></p>
     * @param Sort <p>Whether raw logs are returned in time sequence. Valid values: <ul><li>asc: ascending order;</li><li>desc: descending order.</li></ul></p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Task status, valid values: <ul><li>loading: being processed, waiting to generate download link;</li><li> failed: processing failure, current task cannot be downloaded;</li><li>completed: packaging completed, ready for download.</li></ul></p> 
     * @return Status <p>Task status, valid values: <ul><li>loading: being processed, waiting to generate download link;</li><li> failed: processing failure, current task cannot be downloaded;</li><li>completed: packaging completed, ready for download.</li></ul></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status, valid values: <ul><li>loading: being processed, waiting to generate download link;</li><li> failed: processing failure, current task cannot be downloaded;</li><li>completed: packaging completed, ready for download.</li></ul></p>
     * @param Status <p>Task status, valid values: <ul><li>loading: being processed, waiting to generate download link;</li><li> failed: processing failure, current task cannot be downloaded;</li><li>completed: packaging completed, ready for download.</li></ul></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task creation time. After successful task creation, the retention period is 3 days.</p> 
     * @return CreateTime <p>Task creation time. After successful task creation, the retention period is 3 days.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time. After successful task creation, the retention period is 3 days.</p>
     * @param CreateTime <p>Task creation time. After successful task creation, the retention period is 3 days.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Download link, only returned when Status = completed.</p> 
     * @return Url <p>Download link, only returned when Status = completed.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Download link, only returned when Status = completed.</p>
     * @param Url <p>Download link, only returned when Status = completed.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Task expiration time. After expiry, the download address will be unavailable. Please obtain a new download address through this API.</p> 
     * @return ExpireTime <p>Task expiration time. After expiry, the download address will be unavailable. Please obtain a new download address through this API.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Task expiration time. After expiry, the download address will be unavailable. Please obtain a new download address through this API.</p>
     * @param ExpireTime <p>Task expiration time. After expiry, the download address will be unavailable. Please obtain a new download address through this API.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public LogAnalysisDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogAnalysisDownloadTask(LogAnalysisDownloadTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}


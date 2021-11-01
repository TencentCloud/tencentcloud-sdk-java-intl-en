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

public class AsyncSearchTask extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Offline search task ID
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
    * Query statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Start time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Log scan order. Valid values: `asc`: ascending; `desc`: descending
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Total number of logs matched in offline search task
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * Task completion time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

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
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed 
     * @return Status Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed
     * @param Status Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Offline search task ID 
     * @return AsyncSearchTaskId Offline search task ID
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set Offline search task ID
     * @param AsyncSearchTaskId Offline search task ID
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    /**
     * Get Query statement 
     * @return Query Query statement
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement
     * @param Query Query statement
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Start time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Log scan order. Valid values: `asc`: ascending; `desc`: descending 
     * @return Sort Log scan order. Valid values: `asc`: ascending; `desc`: descending
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Log scan order. Valid values: `asc`: ascending; `desc`: descending
     * @param Sort Log scan order. Valid values: `asc`: ascending; `desc`: descending
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ErrorMessage Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ErrorMessage Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Total number of logs matched in offline search task
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LogCount Total number of logs matched in offline search task
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set Total number of logs matched in offline search task
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LogCount Total number of logs matched in offline search task
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get Task completion time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FinishTime Task completion time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task completion time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FinishTime Task completion time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AsyncSearchTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncSearchTask(AsyncSearchTask source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.LogCount != null) {
            this.LogCount = new Long(source.LogCount);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "LogCount", this.LogCount);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}


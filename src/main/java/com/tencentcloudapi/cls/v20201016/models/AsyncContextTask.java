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

public class AsyncContextTask extends AbstractModel{

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
    * Creation time, which is a timestamp accurate down to the millisecond
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Status. Valid values: `0`: to be started; `1`: running; `2`: completed; `-1`: failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Offline context search task ID
    */
    @SerializedName("AsyncContextTaskId")
    @Expose
    private String AsyncContextTaskId;

    /**
    * Error message of task failure
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Log package number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Log number in log package
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * Log time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Task completion time, which is a timestamp accurate down to the millisecond
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

    /**
    * Associated offline search ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

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
     * Get Creation time, which is a timestamp accurate down to the millisecond 
     * @return CreateTime Creation time, which is a timestamp accurate down to the millisecond
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, which is a timestamp accurate down to the millisecond
     * @param CreateTime Creation time, which is a timestamp accurate down to the millisecond
     */
    public void setCreateTime(Long CreateTime) {
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
     * Get Offline context search task ID 
     * @return AsyncContextTaskId Offline context search task ID
     */
    public String getAsyncContextTaskId() {
        return this.AsyncContextTaskId;
    }

    /**
     * Set Offline context search task ID
     * @param AsyncContextTaskId Offline context search task ID
     */
    public void setAsyncContextTaskId(String AsyncContextTaskId) {
        this.AsyncContextTaskId = AsyncContextTaskId;
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
     * Get Log package number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PkgId Log package number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log package number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PkgId Log package number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Log number in log package
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PkgLogId Log number in log package
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Log number in log package
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PkgLogId Log number in log package
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get Log time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Time Log time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Log time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Time Log time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Task completion time, which is a timestamp accurate down to the millisecond
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FinishTime Task completion time, which is a timestamp accurate down to the millisecond
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task completion time, which is a timestamp accurate down to the millisecond
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FinishTime Task completion time, which is a timestamp accurate down to the millisecond
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Associated offline search ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AsyncSearchTaskId Associated offline search ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set Associated offline search ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AsyncSearchTaskId Associated offline search ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    public AsyncContextTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncContextTask(AsyncContextTask source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AsyncContextTaskId != null) {
            this.AsyncContextTaskId = new String(source.AsyncContextTaskId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
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
        this.setParamSimple(map, prefix + "AsyncContextTaskId", this.AsyncContextTaskId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);

    }
}


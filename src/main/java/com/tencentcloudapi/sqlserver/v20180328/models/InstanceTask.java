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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTask extends AbstractModel {

    /**
    * Unique id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Job Type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Job Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Progress Percentage 0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Error Code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Error Message Description
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Unique id 
     * @return Id Unique id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique id
     * @param Id Unique id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Job Type 
     * @return Type Job Type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Job Type
     * @param Type Job Type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Job Status 
     * @return Status Job Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Job Status
     * @param Status Job Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Progress Percentage 0~100 
     * @return Progress Progress Percentage 0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress Percentage 0~100
     * @param Progress Progress Percentage 0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Start Time 
     * @return StartTime Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time
     * @param StartTime Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End Time 
     * @return EndTime End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time
     * @param EndTime End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Error Code 
     * @return ErrorCode Error Code
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Error Code
     * @param ErrorCode Error Code
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Error Message Description 
     * @return Message Error Message Description
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error Message Description
     * @param Message Error Message Description
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public InstanceTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTask(InstanceTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}


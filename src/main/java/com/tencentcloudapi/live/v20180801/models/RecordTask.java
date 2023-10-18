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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordTask extends AbstractModel {

    /**
    * Recording task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The start time of the recording task in Unix timestamp. 
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time of the recording task in Unix timestamp. 
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Recording template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * The StopRecordTask API call stops the task at the Unix timestamp. A value of 0 indicates that the API has not been called to stop the task.
    */
    @SerializedName("Stopped")
    @Expose
    private Long Stopped;

    /**
     * Get Recording task ID. 
     * @return TaskId Recording task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Recording task ID.
     * @param TaskId Recording task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Push domain name. 
     * @return DomainName Push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name.
     * @param DomainName Push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Push path. 
     * @return AppName Push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path.
     * @param AppName Push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The start time of the recording task in Unix timestamp.  
     * @return StartTime The start time of the recording task in Unix timestamp. 
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time of the recording task in Unix timestamp. 
     * @param StartTime The start time of the recording task in Unix timestamp. 
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of the recording task in Unix timestamp.  
     * @return EndTime The end time of the recording task in Unix timestamp. 
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the recording task in Unix timestamp. 
     * @param EndTime The end time of the recording task in Unix timestamp. 
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Recording template ID. 
     * @return TemplateId Recording template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Recording template ID.
     * @param TemplateId Recording template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The StopRecordTask API call stops the task at the Unix timestamp. A value of 0 indicates that the API has not been called to stop the task. 
     * @return Stopped The StopRecordTask API call stops the task at the Unix timestamp. A value of 0 indicates that the API has not been called to stop the task.
     */
    public Long getStopped() {
        return this.Stopped;
    }

    /**
     * Set The StopRecordTask API call stops the task at the Unix timestamp. A value of 0 indicates that the API has not been called to stop the task.
     * @param Stopped The StopRecordTask API call stops the task at the Unix timestamp. A value of 0 indicates that the API has not been called to stop the task.
     */
    public void setStopped(Long Stopped) {
        this.Stopped = Stopped;
    }

    public RecordTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTask(RecordTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Stopped != null) {
            this.Stopped = new Long(source.Stopped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Stopped", this.Stopped);

    }
}


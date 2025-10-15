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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlarmMessagesRequest extends AbstractModel {

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number for pagination, minimum value is 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of items displayed per page. maximum value: 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Starting Alarm time. format: yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specifies the Alarm end time in the format yyyy-MM-dd HH:MM:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Alarm level.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alert recipient Id.
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * For incoming and returned filter time zone, default UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Project id. 
     * @return ProjectId Project id.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id.
     * @param ProjectId Project id.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page number for pagination, minimum value is 1. 
     * @return PageNumber Page number for pagination, minimum value is 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number for pagination, minimum value is 1.
     * @param PageNumber Page number for pagination, minimum value is 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of items displayed per page. maximum value: 100. 
     * @return PageSize Specifies the number of items displayed per page. maximum value: 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of items displayed per page. maximum value: 100.
     * @param PageSize Specifies the number of items displayed per page. maximum value: 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Starting Alarm time. format: yyyy-MM-dd HH:MM:ss. 
     * @return StartTime Starting Alarm time. format: yyyy-MM-dd HH:MM:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting Alarm time. format: yyyy-MM-dd HH:MM:ss.
     * @param StartTime Starting Alarm time. format: yyyy-MM-dd HH:MM:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the Alarm end time in the format yyyy-MM-dd HH:MM:ss. 
     * @return EndTime Specifies the Alarm end time in the format yyyy-MM-dd HH:MM:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the Alarm end time in the format yyyy-MM-dd HH:MM:ss.
     * @param EndTime Specifies the Alarm end time in the format yyyy-MM-dd HH:MM:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Alarm level. 
     * @return AlarmLevel Alarm level.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level.
     * @param AlarmLevel Alarm level.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alert recipient Id. 
     * @return AlarmRecipientId Alert recipient Id.
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set Alert recipient Id.
     * @param AlarmRecipientId Alert recipient Id.
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get For incoming and returned filter time zone, default UTC+8. 
     * @return TimeZone For incoming and returned filter time zone, default UTC+8.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set For incoming and returned filter time zone, default UTC+8.
     * @param TimeZone For incoming and returned filter time zone, default UTC+8.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public ListAlarmMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlarmMessagesRequest(ListAlarmMessagesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}


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

public class DescribeAlarmReceiverRequest extends AbstractModel {

    /**
    * Alert ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Current Page
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of records per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Type
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Alarm Recipient ID (comma-separated)
    */
    @SerializedName("AlarmRecipient")
    @Expose
    private String AlarmRecipient;

    /**
    * Name of alarm recipient (comma-separated)
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * Alarm Time
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * Message ID
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Alert Record ID
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
     * Get Alert ID 
     * @return AlarmId Alert ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alert ID
     * @param AlarmId Alert ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Current Page 
     * @return PageNumber Current Page
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current Page
     * @param PageNumber Current Page
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of records per page 
     * @return PageSize Number of records per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page
     * @param PageSize Number of records per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Type 
     * @return TaskType Type
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Type
     * @param TaskType Type
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Alarm Recipient ID (comma-separated) 
     * @return AlarmRecipient Alarm Recipient ID (comma-separated)
     */
    public String getAlarmRecipient() {
        return this.AlarmRecipient;
    }

    /**
     * Set Alarm Recipient ID (comma-separated)
     * @param AlarmRecipient Alarm Recipient ID (comma-separated)
     */
    public void setAlarmRecipient(String AlarmRecipient) {
        this.AlarmRecipient = AlarmRecipient;
    }

    /**
     * Get Name of alarm recipient (comma-separated) 
     * @return AlarmRecipientName Name of alarm recipient (comma-separated)
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set Name of alarm recipient (comma-separated)
     * @param AlarmRecipientName Name of alarm recipient (comma-separated)
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get Alarm Time 
     * @return AlarmTime Alarm Time
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set Alarm Time
     * @param AlarmTime Alarm Time
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get Message ID 
     * @return MessageId Message ID
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Message ID
     * @param MessageId Message ID
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Alert Record ID 
     * @return RecordId Alert Record ID
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Alert Record ID
     * @param RecordId Alert Record ID
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group) 
     * @return MonitorType Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     * @param MonitorType Monitored Object Type (1: All Tasks, 2: Assigned Task, 3: Designated Responsible Person, 4: Specified Resource Group)
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    public DescribeAlarmReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmReceiverRequest(DescribeAlarmReceiverRequest source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.AlarmRecipient != null) {
            this.AlarmRecipient = new String(source.AlarmRecipient);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "AlarmRecipient", this.AlarmRecipient);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}


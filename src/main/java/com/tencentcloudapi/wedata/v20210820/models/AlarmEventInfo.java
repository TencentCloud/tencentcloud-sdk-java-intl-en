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

public class AlarmEventInfo extends AbstractModel {

    /**
    * Alert ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alarm Time
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Rule name
    */
    @SerializedName("RegularName")
    @Expose
    private String RegularName;

    /**
    * Alert level, 0 for normal, 1 for important, 2 for urgent
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
    */
    @SerializedName("AlarmWay")
    @Expose
    private Long AlarmWay;

    /**
    * Alert Recipient ID, separated by commas
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * Metric threshold, 1 indicates the first run failure of the offline task, 2 indicates failure after all retries of the offline task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Estimated timeout, minute level
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 0: Partial Success, 1: Complete Success, 2: Complete Failure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsSendSuccess")
    @Expose
    private Long IsSendSuccess;

    /**
    * During Do Not Disturb time, 0: No, 1: Yes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InQuitePeriods")
    @Expose
    private Long InQuitePeriods;

    /**
    * Alert Record ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * Message ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Threshold Calculation Operator, 1: Greater than, 2: Less than
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * Alert Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegularId")
    @Expose
    private String RegularId;

    /**
    * Alert Recipient Nickname
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * Alert Task Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Send Result
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SendResult")
    @Expose
    private String SendResult;

    /**
    * Monitoring Object ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorObjectId")
    @Expose
    private String MonitorObjectId;

    /**
    * Monitoring Object Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorObjectName")
    @Expose
    private String MonitorObjectName;

    /**
    * Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

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
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Rule name 
     * @return RegularName Rule name
     */
    public String getRegularName() {
        return this.RegularName;
    }

    /**
     * Set Rule name
     * @param RegularName Rule name
     */
    public void setRegularName(String RegularName) {
        this.RegularName = RegularName;
    }

    /**
     * Get Alert level, 0 for normal, 1 for important, 2 for urgent 
     * @return AlarmLevel Alert level, 0 for normal, 1 for important, 2 for urgent
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alert level, 0 for normal, 1 for important, 2 for urgent
     * @param AlarmLevel Alert level, 0 for normal, 1 for important, 2 for urgent
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http) 
     * @return AlarmWay Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     */
    public Long getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     * @param AlarmWay Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     */
    public void setAlarmWay(Long AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get Alert Recipient ID, separated by commas 
     * @return AlarmRecipientId Alert Recipient ID, separated by commas
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set Alert Recipient ID, separated by commas
     * @param AlarmRecipientId Alert Recipient ID, separated by commas
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
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
     * Get Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause 
     * @return AlarmIndicator Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause
     * @param AlarmIndicator Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmIndicatorDesc Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmIndicatorDesc() {
        return this.AlarmIndicatorDesc;
    }

    /**
     * Set Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmIndicatorDesc Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmIndicatorDesc(String AlarmIndicatorDesc) {
        this.AlarmIndicatorDesc = AlarmIndicatorDesc;
    }

    /**
     * Get Metric threshold, 1 indicates the first run failure of the offline task, 2 indicates failure after all retries of the offline task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerType Metric threshold, 1 indicates the first run failure of the offline task, 2 indicates failure after all retries of the offline task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Metric threshold, 1 indicates the first run failure of the offline task, 2 indicates failure after all retries of the offline task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerType Metric threshold, 1 indicates the first run failure of the offline task, 2 indicates failure after all retries of the offline task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Estimated timeout, minute level
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EstimatedTime Estimated timeout, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set Estimated timeout, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EstimatedTime Estimated timeout, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 0: Partial Success, 1: Complete Success, 2: Complete Failure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsSendSuccess 0: Partial Success, 1: Complete Success, 2: Complete Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIsSendSuccess() {
        return this.IsSendSuccess;
    }

    /**
     * Set 0: Partial Success, 1: Complete Success, 2: Complete Failure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsSendSuccess 0: Partial Success, 1: Complete Success, 2: Complete Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsSendSuccess(Long IsSendSuccess) {
        this.IsSendSuccess = IsSendSuccess;
    }

    /**
     * Get During Do Not Disturb time, 0: No, 1: Yes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InQuitePeriods During Do Not Disturb time, 0: No, 1: Yes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInQuitePeriods() {
        return this.InQuitePeriods;
    }

    /**
     * Set During Do Not Disturb time, 0: No, 1: Yes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InQuitePeriods During Do Not Disturb time, 0: No, 1: Yes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInQuitePeriods(Long InQuitePeriods) {
        this.InQuitePeriods = InQuitePeriods;
    }

    /**
     * Get Alert Record ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RecordId Alert Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Alert Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RecordId Alert Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Message ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MessageId Message ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Message ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MessageId Message ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Threshold Calculation Operator, 1: Greater than, 2: Less than
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Threshold Calculation Operator, 1: Greater than, 2: Less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set Threshold Calculation Operator, 1: Greater than, 2: Less than
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Threshold Calculation Operator, 1: Greater than, 2: Less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Alert Rule ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RegularId Alert Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegularId() {
        return this.RegularId;
    }

    /**
     * Set Alert Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RegularId Alert Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegularId(String RegularId) {
        this.RegularId = RegularId;
    }

    /**
     * Get Alert Recipient Nickname
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmRecipientName Alert Recipient Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set Alert Recipient Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmRecipientName Alert Recipient Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
    }

    /**
     * Get Alert Task Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskType Alert Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Alert Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskType Alert Task Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Send Result
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SendResult Send Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSendResult() {
        return this.SendResult;
    }

    /**
     * Set Send Result
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SendResult Send Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSendResult(String SendResult) {
        this.SendResult = SendResult;
    }

    /**
     * Get Monitoring Object ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorObjectId Monitoring Object ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMonitorObjectId() {
        return this.MonitorObjectId;
    }

    /**
     * Set Monitoring Object ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorObjectId Monitoring Object ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorObjectId(String MonitorObjectId) {
        this.MonitorObjectId = MonitorObjectId;
    }

    /**
     * Get Monitoring Object Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorObjectName Monitoring Object Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMonitorObjectName() {
        return this.MonitorObjectName;
    }

    /**
     * Set Monitoring Object Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorObjectName Monitoring Object Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorObjectName(String MonitorObjectName) {
        this.MonitorObjectName = MonitorObjectName;
    }

    /**
     * Get Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Threshold Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Threshold Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    public AlarmEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmEventInfo(AlarmEventInfo source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RegularName != null) {
            this.RegularName = new String(source.RegularName);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new Long(source.AlarmWay);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.IsSendSuccess != null) {
            this.IsSendSuccess = new Long(source.IsSendSuccess);
        }
        if (source.InQuitePeriods != null) {
            this.InQuitePeriods = new Long(source.InQuitePeriods);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.RegularId != null) {
            this.RegularId = new String(source.RegularId);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.SendResult != null) {
            this.SendResult = new String(source.SendResult);
        }
        if (source.MonitorObjectId != null) {
            this.MonitorObjectId = new String(source.MonitorObjectId);
        }
        if (source.MonitorObjectName != null) {
            this.MonitorObjectName = new String(source.MonitorObjectName);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RegularName", this.RegularName);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "IsSendSuccess", this.IsSendSuccess);
        this.setParamSimple(map, prefix + "InQuitePeriods", this.InQuitePeriods);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RegularId", this.RegularId);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "SendResult", this.SendResult);
        this.setParamSimple(map, prefix + "MonitorObjectId", this.MonitorObjectId);
        this.setParamSimple(map, prefix + "MonitorObjectName", this.MonitorObjectName);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}


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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertHistoryRecord extends AbstractModel {

    /**
    * Alarm record ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Alarm policy ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alarm policy name
    */
    @SerializedName("AlarmName")
    @Expose
    private String AlarmName;

    /**
    * ID of the monitored object
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Name of the monitored object
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Region of the monitored object
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Trigger condition
    */
    @SerializedName("Trigger")
    @Expose
    private String Trigger;

    /**
    * Number of cycles for which the alarm lasts. An alarm will be triggered only after the trigger condition is met for the number of cycles specified by `TriggerCount`.
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * Alarm notification frequency (minutes)
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * Notification group
    */
    @SerializedName("Notices")
    @Expose
    private AlertHistoryNotice [] Notices;

    /**
    * Alarm duration (minutes)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Alarm status. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Alarm generation time, which is a Unix timestamp in ms
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Group information corresponding to triggering by group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private GroupTriggerConditionInfo [] GroupTriggerCondition;

    /**
    * Alarm severity. Valid values: `0` (Warn), `1` (Info), `2` (Critical)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Type of the monitored object
`0`: The same object is specified for all statements. `1`: An object is separately specified for each statement. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
     * Get Alarm record ID 
     * @return RecordId Alarm record ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Alarm record ID
     * @param RecordId Alarm record ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Alarm policy ID 
     * @return AlarmId Alarm policy ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alarm policy ID
     * @param AlarmId Alarm policy ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Alarm policy name 
     * @return AlarmName Alarm policy name
     */
    public String getAlarmName() {
        return this.AlarmName;
    }

    /**
     * Set Alarm policy name
     * @param AlarmName Alarm policy name
     */
    public void setAlarmName(String AlarmName) {
        this.AlarmName = AlarmName;
    }

    /**
     * Get ID of the monitored object 
     * @return TopicId ID of the monitored object
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the monitored object
     * @param TopicId ID of the monitored object
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Name of the monitored object 
     * @return TopicName Name of the monitored object
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Name of the monitored object
     * @param TopicName Name of the monitored object
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Region of the monitored object 
     * @return Region Region of the monitored object
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the monitored object
     * @param Region Region of the monitored object
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Trigger condition 
     * @return Trigger Trigger condition
     */
    public String getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Trigger condition
     * @param Trigger Trigger condition
     */
    public void setTrigger(String Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Number of cycles for which the alarm lasts. An alarm will be triggered only after the trigger condition is met for the number of cycles specified by `TriggerCount`. 
     * @return TriggerCount Number of cycles for which the alarm lasts. An alarm will be triggered only after the trigger condition is met for the number of cycles specified by `TriggerCount`.
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set Number of cycles for which the alarm lasts. An alarm will be triggered only after the trigger condition is met for the number of cycles specified by `TriggerCount`.
     * @param TriggerCount Number of cycles for which the alarm lasts. An alarm will be triggered only after the trigger condition is met for the number of cycles specified by `TriggerCount`.
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get Alarm notification frequency (minutes) 
     * @return AlarmPeriod Alarm notification frequency (minutes)
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set Alarm notification frequency (minutes)
     * @param AlarmPeriod Alarm notification frequency (minutes)
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get Notification group 
     * @return Notices Notification group
     */
    public AlertHistoryNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set Notification group
     * @param Notices Notification group
     */
    public void setNotices(AlertHistoryNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get Alarm duration (minutes) 
     * @return Duration Alarm duration (minutes)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Alarm duration (minutes)
     * @param Duration Alarm duration (minutes)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Alarm status. Valid values: `0` (uncleared), `1` (cleared), `2` (expired) 
     * @return Status Alarm status. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Alarm status. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
     * @param Status Alarm status. Valid values: `0` (uncleared), `1` (cleared), `2` (expired)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Alarm generation time, which is a Unix timestamp in ms 
     * @return CreateTime Alarm generation time, which is a Unix timestamp in ms
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Alarm generation time, which is a Unix timestamp in ms
     * @param CreateTime Alarm generation time, which is a Unix timestamp in ms
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Group information corresponding to triggering by group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupTriggerCondition Group information corresponding to triggering by group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GroupTriggerConditionInfo [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set Group information corresponding to triggering by group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupTriggerCondition Group information corresponding to triggering by group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupTriggerCondition(GroupTriggerConditionInfo [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get Alarm severity. Valid values: `0` (Warn), `1` (Info), `2` (Critical)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmLevel Alarm severity. Valid values: `0` (Warn), `1` (Info), `2` (Critical)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm severity. Valid values: `0` (Warn), `1` (Info), `2` (Critical)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmLevel Alarm severity. Valid values: `0` (Warn), `1` (Info), `2` (Critical)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Type of the monitored object
`0`: The same object is specified for all statements. `1`: An object is separately specified for each statement. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MonitorObjectType Type of the monitored object
`0`: The same object is specified for all statements. `1`: An object is separately specified for each statement. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set Type of the monitored object
`0`: The same object is specified for all statements. `1`: An object is separately specified for each statement. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MonitorObjectType Type of the monitored object
`0`: The same object is specified for all statements. `1`: An object is separately specified for each statement. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    public AlertHistoryRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertHistoryRecord(AlertHistoryRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmName != null) {
            this.AlarmName = new String(source.AlarmName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Trigger != null) {
            this.Trigger = new String(source.Trigger);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.Notices != null) {
            this.Notices = new AlertHistoryNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new AlertHistoryNotice(source.Notices[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.GroupTriggerCondition != null) {
            this.GroupTriggerCondition = new GroupTriggerConditionInfo[source.GroupTriggerCondition.length];
            for (int i = 0; i < source.GroupTriggerCondition.length; i++) {
                this.GroupTriggerCondition[i] = new GroupTriggerConditionInfo(source.GroupTriggerCondition[i]);
            }
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmName", this.AlarmName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Trigger", this.Trigger);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);

    }
}


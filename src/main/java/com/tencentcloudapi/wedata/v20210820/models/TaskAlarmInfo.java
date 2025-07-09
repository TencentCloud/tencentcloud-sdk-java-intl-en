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

public class TaskAlarmInfo extends AbstractModel {

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
    * Rule Status (0 for off, 1 for on)
    */
    @SerializedName("RegularStatus")
    @Expose
    private Long RegularStatus;

    /**
    * Alert Level (0 for general, 1 for critical, 2 for urgent)
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * Task Type (201 for real-time, 202 for offline)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Rule ID
    */
    @SerializedName("RegularId")
    @Expose
    private String RegularId;

    /**
    * Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause,4 Write Speed, 5 Read Speed, 6 Read Throughput, 7 Write Throughput, 8 Dirty Data Byte Count, 9 Number of Dirty Data Entries
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * Metric Threshold (1 for the first run failure of an offline task, 2 for all retries failed of an offline task)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Estimated Timeout Duration (Minute Level)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * Alert Recipient ID, separated by commas
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * CreatorNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * Alert Recipient Nickname, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmRecipientName")
    @Expose
    private String AlarmRecipientName;

    /**
    * Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * Parameters needed for real-time task alerts, 1 is greater than, 2 is less than
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * Node ID, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node name, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Metric List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicatorInfos")
    @Expose
    private AlarmIndicatorInfo [] AlarmIndicatorInfos;

    /**
    * Alert Recipient Type, 0 is designated person; 1 is task responsible person
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * Do not disturb time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QuietPeriods")
    @Expose
    private QuietPeriod [] QuietPeriods;

    /**
    * Enterprise WeChat Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WeComHook")
    @Expose
    private String WeComHook;

    /**
    * Last Operation Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last Operator Uin
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * Associated Task Count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Monitored Object Type, 1: all tasks, 2: specified tasks, 3: specified responsible person
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * Monitoring Object List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorObjectIds")
    @Expose
    private String [] MonitorObjectIds;

    /**
    * Instance ID of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LatestAlarmInstanceId")
    @Expose
    private String LatestAlarmInstanceId;

    /**
    * Time of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LatestAlarmTime")
    @Expose
    private String LatestAlarmTime;

    /**
    * Alert Rule Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * FeiShu Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LarkWebHooks")
    @Expose
    private String LarkWebHooks;

    /**
    * DingTalk Group Hook addresses, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DingDingWebHooks")
    @Expose
    private String DingDingWebHooks;

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
     * Get Rule Status (0 for off, 1 for on) 
     * @return RegularStatus Rule Status (0 for off, 1 for on)
     */
    public Long getRegularStatus() {
        return this.RegularStatus;
    }

    /**
     * Set Rule Status (0 for off, 1 for on)
     * @param RegularStatus Rule Status (0 for off, 1 for on)
     */
    public void setRegularStatus(Long RegularStatus) {
        this.RegularStatus = RegularStatus;
    }

    /**
     * Get Alert Level (0 for general, 1 for critical, 2 for urgent) 
     * @return AlarmLevel Alert Level (0 for general, 1 for critical, 2 for urgent)
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alert Level (0 for general, 1 for critical, 2 for urgent)
     * @param AlarmLevel Alert Level (0 for general, 1 for critical, 2 for urgent)
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http) 
     * @return AlarmWay Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     * @param AlarmWay Alert Method, separated by commas (1: email, 2: SMS, 3: WeChat, 4: voice call, 5: represents WeCom, 6: http)
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get Task Type (201 for real-time, 202 for offline) 
     * @return TaskType Task Type (201 for real-time, 202 for offline)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type (201 for real-time, 202 for offline)
     * @param TaskType Task Type (201 for real-time, 202 for offline)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Rule ID 
     * @return RegularId Rule ID
     */
    public String getRegularId() {
        return this.RegularId;
    }

    /**
     * Set Rule ID
     * @param RegularId Rule ID
     */
    public void setRegularId(String RegularId) {
        this.RegularId = RegularId;
    }

    /**
     * Get Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause,4 Write Speed, 5 Read Speed, 6 Read Throughput, 7 Write Throughput, 8 Dirty Data Byte Count, 9 Number of Dirty Data Entries 
     * @return AlarmIndicator Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause,4 Write Speed, 5 Read Speed, 6 Read Throughput, 7 Write Throughput, 8 Dirty Data Byte Count, 9 Number of Dirty Data Entries
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause,4 Write Speed, 5 Read Speed, 6 Read Throughput, 7 Write Throughput, 8 Dirty Data Byte Count, 9 Number of Dirty Data Entries
     * @param AlarmIndicator Alert Metrics, 0 for task failure, 1 for task run timeout, 2 for task stop, 3 for task pause,4 Write Speed, 5 Read Speed, 6 Read Throughput, 7 Write Throughput, 8 Dirty Data Byte Count, 9 Number of Dirty Data Entries
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get Metric Threshold (1 for the first run failure of an offline task, 2 for all retries failed of an offline task)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerType Metric Threshold (1 for the first run failure of an offline task, 2 for all retries failed of an offline task)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Metric Threshold (1 for the first run failure of an offline task, 2 for all retries failed of an offline task)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerType Metric Threshold (1 for the first run failure of an offline task, 2 for all retries failed of an offline task)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Estimated Timeout Duration (Minute Level)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EstimatedTime Estimated Timeout Duration (Minute Level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set Estimated Timeout Duration (Minute Level)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EstimatedTime Estimated Timeout Duration (Minute Level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
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
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get CreatorNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Creater CreatorNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set CreatorNote: This field may return null, indicating that no valid value can be obtained.
     * @param Creater CreatorNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get Alert Recipient Nickname, separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmRecipientName Alert Recipient Nickname, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmRecipientName() {
        return this.AlarmRecipientName;
    }

    /**
     * Set Alert Recipient Nickname, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmRecipientName Alert Recipient Nickname, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmRecipientName(String AlarmRecipientName) {
        this.AlarmRecipientName = AlarmRecipientName;
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
     * Get Parameters needed for real-time task alerts, 1 is greater than, 2 is less than
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Parameters needed for real-time task alerts, 1 is greater than, 2 is less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set Parameters needed for real-time task alerts, 1 is greater than, 2 is less than
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Parameters needed for real-time task alerts, 1 is greater than, 2 is less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Node ID, separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeId Node ID, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeId Node ID, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node name, separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeName Node name, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeName Node name, separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Metric List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmIndicatorInfos Metric List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AlarmIndicatorInfo [] getAlarmIndicatorInfos() {
        return this.AlarmIndicatorInfos;
    }

    /**
     * Set Metric List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmIndicatorInfos Metric List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmIndicatorInfos(AlarmIndicatorInfo [] AlarmIndicatorInfos) {
        this.AlarmIndicatorInfos = AlarmIndicatorInfos;
    }

    /**
     * Get Alert Recipient Type, 0 is designated person; 1 is task responsible person
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmRecipientType Alert Recipient Type, 0 is designated person; 1 is task responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set Alert Recipient Type, 0 is designated person; 1 is task responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmRecipientType Alert Recipient Type, 0 is designated person; 1 is task responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get Do not disturb time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QuietPeriods Do not disturb time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public QuietPeriod [] getQuietPeriods() {
        return this.QuietPeriods;
    }

    /**
     * Set Do not disturb time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QuietPeriods Do not disturb time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQuietPeriods(QuietPeriod [] QuietPeriods) {
        this.QuietPeriods = QuietPeriods;
    }

    /**
     * Get Enterprise WeChat Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WeComHook Enterprise WeChat Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWeComHook() {
        return this.WeComHook;
    }

    /**
     * Set Enterprise WeChat Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WeComHook Enterprise WeChat Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWeComHook(String WeComHook) {
        this.WeComHook = WeComHook;
    }

    /**
     * Get Last Operation Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Last Operation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last Operation Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Last Operation Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last Operator Uin
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUin Last Operator Uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set Last Operator Uin
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUin Last Operator Uin
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Associated Task Count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskCount Associated Task Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Associated Task Count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskCount Associated Task Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Monitored Object Type, 1: all tasks, 2: specified tasks, 3: specified responsible person
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorType Monitored Object Type, 1: all tasks, 2: specified tasks, 3: specified responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitored Object Type, 1: all tasks, 2: specified tasks, 3: specified responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorType Monitored Object Type, 1: all tasks, 2: specified tasks, 3: specified responsible person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Monitoring Object List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorObjectIds Monitoring Object List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getMonitorObjectIds() {
        return this.MonitorObjectIds;
    }

    /**
     * Set Monitoring Object List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorObjectIds Monitoring Object List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorObjectIds(String [] MonitorObjectIds) {
        this.MonitorObjectIds = MonitorObjectIds;
    }

    /**
     * Get Instance ID of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LatestAlarmInstanceId Instance ID of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLatestAlarmInstanceId() {
        return this.LatestAlarmInstanceId;
    }

    /**
     * Set Instance ID of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LatestAlarmInstanceId Instance ID of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLatestAlarmInstanceId(String LatestAlarmInstanceId) {
        this.LatestAlarmInstanceId = LatestAlarmInstanceId;
    }

    /**
     * Get Time of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LatestAlarmTime Time of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLatestAlarmTime() {
        return this.LatestAlarmTime;
    }

    /**
     * Set Time of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LatestAlarmTime Time of the Last Alert
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLatestAlarmTime(String LatestAlarmTime) {
        this.LatestAlarmTime = LatestAlarmTime;
    }

    /**
     * Get Alert Rule Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Alert Rule Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Alert Rule Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Alert Rule Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get FeiShu Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LarkWebHooks FeiShu Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLarkWebHooks() {
        return this.LarkWebHooks;
    }

    /**
     * Set FeiShu Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LarkWebHooks FeiShu Group Hook Address, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLarkWebHooks(String LarkWebHooks) {
        this.LarkWebHooks = LarkWebHooks;
    }

    /**
     * Get DingTalk Group Hook addresses, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DingDingWebHooks DingTalk Group Hook addresses, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDingDingWebHooks() {
        return this.DingDingWebHooks;
    }

    /**
     * Set DingTalk Group Hook addresses, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DingDingWebHooks DingTalk Group Hook addresses, multiple hook addresses separated by commas
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDingDingWebHooks(String DingDingWebHooks) {
        this.DingDingWebHooks = DingDingWebHooks;
    }

    public TaskAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskAlarmInfo(TaskAlarmInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RegularName != null) {
            this.RegularName = new String(source.RegularName);
        }
        if (source.RegularStatus != null) {
            this.RegularStatus = new Long(source.RegularStatus);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RegularId != null) {
            this.RegularId = new String(source.RegularId);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.AlarmRecipientName != null) {
            this.AlarmRecipientName = new String(source.AlarmRecipientName);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.AlarmIndicatorInfos != null) {
            this.AlarmIndicatorInfos = new AlarmIndicatorInfo[source.AlarmIndicatorInfos.length];
            for (int i = 0; i < source.AlarmIndicatorInfos.length; i++) {
                this.AlarmIndicatorInfos[i] = new AlarmIndicatorInfo(source.AlarmIndicatorInfos[i]);
            }
        }
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.QuietPeriods != null) {
            this.QuietPeriods = new QuietPeriod[source.QuietPeriods.length];
            for (int i = 0; i < source.QuietPeriods.length; i++) {
                this.QuietPeriods[i] = new QuietPeriod(source.QuietPeriods[i]);
            }
        }
        if (source.WeComHook != null) {
            this.WeComHook = new String(source.WeComHook);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.MonitorObjectIds != null) {
            this.MonitorObjectIds = new String[source.MonitorObjectIds.length];
            for (int i = 0; i < source.MonitorObjectIds.length; i++) {
                this.MonitorObjectIds[i] = new String(source.MonitorObjectIds[i]);
            }
        }
        if (source.LatestAlarmInstanceId != null) {
            this.LatestAlarmInstanceId = new String(source.LatestAlarmInstanceId);
        }
        if (source.LatestAlarmTime != null) {
            this.LatestAlarmTime = new String(source.LatestAlarmTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LarkWebHooks != null) {
            this.LarkWebHooks = new String(source.LarkWebHooks);
        }
        if (source.DingDingWebHooks != null) {
            this.DingDingWebHooks = new String(source.DingDingWebHooks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RegularName", this.RegularName);
        this.setParamSimple(map, prefix + "RegularStatus", this.RegularStatus);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegularId", this.RegularId);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "AlarmRecipientName", this.AlarmRecipientName);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "AlarmIndicatorInfos.", this.AlarmIndicatorInfos);
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamArrayObj(map, prefix + "QuietPeriods.", this.QuietPeriods);
        this.setParamSimple(map, prefix + "WeComHook", this.WeComHook);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamArraySimple(map, prefix + "MonitorObjectIds.", this.MonitorObjectIds);
        this.setParamSimple(map, prefix + "LatestAlarmInstanceId", this.LatestAlarmInstanceId);
        this.setParamSimple(map, prefix + "LatestAlarmTime", this.LatestAlarmTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LarkWebHooks", this.LarkWebHooks);
        this.setParamSimple(map, prefix + "DingDingWebHooks", this.DingDingWebHooks);

    }
}


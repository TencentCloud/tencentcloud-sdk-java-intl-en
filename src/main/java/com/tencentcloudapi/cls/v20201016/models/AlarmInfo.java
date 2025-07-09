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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfo extends AbstractModel {

    /**
    * Alarm policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Monitoring object list
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTargetInfo [] AlarmTargets;

    /**
    * Monitoring task running time point
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * Single trigger condition. Mutually exclusive with the MultiConditions parameter.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10.
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * Repeated alarm interval in minutes. Value range: 0–1440.
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * List of associated alarm notification templates
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * Enablement status
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Alarm policy ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Custom notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * Custom callback template
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * Multi-Dimensional analysis settings
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * Group trigger status. 1: Enabled, 0: Disabled (default)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * Group Trigger ConditionsNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * Type of the monitored object. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * Alarm severity. 0: warning (Warn); 1: Reminder (Info); 2: urgent (Critical).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Multiple trigger conditions. Exclusive with Condition.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
     * Get Alarm policy name 
     * @return Name Alarm policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm policy name
     * @param Name Alarm policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Monitoring object list 
     * @return AlarmTargets Monitoring object list
     */
    public AlarmTargetInfo [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set Monitoring object list
     * @param AlarmTargets Monitoring object list
     */
    public void setAlarmTargets(AlarmTargetInfo [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get Monitoring task running time point 
     * @return MonitorTime Monitoring task running time point
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set Monitoring task running time point
     * @param MonitorTime Monitoring task running time point
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get Single trigger condition. Mutually exclusive with the MultiConditions parameter. 
     * @return Condition Single trigger condition. Mutually exclusive with the MultiConditions parameter.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Single trigger condition. Mutually exclusive with the MultiConditions parameter.
     * @param Condition Single trigger condition. Mutually exclusive with the MultiConditions parameter.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10. 
     * @return TriggerCount Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10.
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10.
     * @param TriggerCount Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10.
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get Repeated alarm interval in minutes. Value range: 0–1440. 
     * @return AlarmPeriod Repeated alarm interval in minutes. Value range: 0–1440.
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set Repeated alarm interval in minutes. Value range: 0–1440.
     * @param AlarmPeriod Repeated alarm interval in minutes. Value range: 0–1440.
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get List of associated alarm notification templates 
     * @return AlarmNoticeIds List of associated alarm notification templates
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set List of associated alarm notification templates
     * @param AlarmNoticeIds List of associated alarm notification templates
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get Enablement status 
     * @return Status Enablement status
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Enablement status
     * @param Status Enablement status
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
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
     * Get Last update time 
     * @return UpdateTime Last update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time
     * @param UpdateTime Last update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Custom notification template
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageTemplate Custom notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set Custom notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageTemplate Custom notification template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get Custom callback template
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CallBack Custom callback template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set Custom callback template
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CallBack Custom callback template
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get Multi-Dimensional analysis settings
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Analysis Multi-Dimensional analysis settings
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Multi-Dimensional analysis settings
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Analysis Multi-Dimensional analysis settings
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get Group trigger status. 1: Enabled, 0: Disabled (default)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupTriggerStatus Group trigger status. 1: Enabled, 0: Disabled (default)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set Group trigger status. 1: Enabled, 0: Disabled (default)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupTriggerStatus Group trigger status. 1: Enabled, 0: Disabled (default)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get Group Trigger ConditionsNote: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupTriggerCondition Group Trigger ConditionsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set Group Trigger ConditionsNote: This field may return null, indicating that no valid values can be obtained.
     * @param GroupTriggerCondition Group Trigger ConditionsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get Type of the monitored object. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MonitorObjectType Type of the monitored object. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set Type of the monitored object. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MonitorObjectType Type of the monitored object. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get Alarm severity. 0: warning (Warn); 1: Reminder (Info); 2: urgent (Critical).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmLevel Alarm severity. 0: warning (Warn); 1: Reminder (Info); 2: urgent (Critical).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm severity. 0: warning (Warn); 1: Reminder (Info); 2: urgent (Critical).Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmLevel Alarm severity. 0: warning (Warn); 1: Reminder (Info); 2: urgent (Critical).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Multiple trigger conditions. Exclusive with Condition.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MultiConditions Multiple trigger conditions. Exclusive with Condition.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set Multiple trigger conditions. Exclusive with Condition.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MultiConditions Multiple trigger conditions. Exclusive with Condition.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTargetInfo[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTargetInfo(source.AlarmTargets[i]);
            }
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MessageTemplate != null) {
            this.MessageTemplate = new String(source.MessageTemplate);
        }
        if (source.CallBack != null) {
            this.CallBack = new CallBackInfo(source.CallBack);
        }
        if (source.Analysis != null) {
            this.Analysis = new AnalysisDimensional[source.Analysis.length];
            for (int i = 0; i < source.Analysis.length; i++) {
                this.Analysis[i] = new AnalysisDimensional(source.Analysis[i]);
            }
        }
        if (source.GroupTriggerStatus != null) {
            this.GroupTriggerStatus = new Boolean(source.GroupTriggerStatus);
        }
        if (source.GroupTriggerCondition != null) {
            this.GroupTriggerCondition = new String[source.GroupTriggerCondition.length];
            for (int i = 0; i < source.GroupTriggerCondition.length; i++) {
                this.GroupTriggerCondition[i] = new String(source.GroupTriggerCondition[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);
        this.setParamSimple(map, prefix + "GroupTriggerStatus", this.GroupTriggerStatus);
        this.setParamArraySimple(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);

    }
}


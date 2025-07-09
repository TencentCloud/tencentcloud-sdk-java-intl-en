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

public class CreateAlarmRequest extends AbstractModel {

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
    private AlarmTarget [] AlarmTargets;

    /**
    * Monitoring task running time point
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * Alarm persistence cycle. An alarm will be triggered only after the corresponding trigger condition is met for the number of times specified by `TriggerCount`. Value range: 1–10.
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * Alarm repeat interval in minutes. The value range is 0~1440.
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
    * Trigger ConditionNote:- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Alarm Level0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).
Note:- If not specified, the default is 0.
- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Multiple trigger conditions
Note:- Condition and AlarmLevel form one set of configurations, while MultiConditions form another set of configurations, and the two sets are mutually exclusive.



    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * Whether to enable the alarm policyThe default value is true
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Custom alarm content
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * Custom callback
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * Multi-Dimensional analysis
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * Group trigger status.
Default value is false
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * Grouping Trigger Conditions.
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * Tag description list, by specifying this parameter, you can simultaneously bind Tag to the corresponding alarm policy.Supports up to 10 Tag key-value pairs, and the pairs must be unique.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Monitored Object Type. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.If not specified, the default value is 0.When the value is 1, the number of AlarmTargets Elements (XML) cannot exceed 10, and the Numbers in AlarmTargets must be continuous positive integers starting from 1, without duplication.

    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * Alarms additional classification information listThe number of Classifications elements cannot exceed 20.The Key of Classifications element must not be empty and duplicated, and its length cannot exceed 50 characters, complying with the regular expression ^[a-z]([a-z0-9_]{0,49})$.The Value length of Classifications element cannot exceed 200 characters.
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

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
    public AlarmTarget [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set Monitoring object list
     * @param AlarmTargets Monitoring object list
     */
    public void setAlarmTargets(AlarmTarget [] AlarmTargets) {
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
     * Get Alarm repeat interval in minutes. The value range is 0~1440. 
     * @return AlarmPeriod Alarm repeat interval in minutes. The value range is 0~1440.
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set Alarm repeat interval in minutes. The value range is 0~1440.
     * @param AlarmPeriod Alarm repeat interval in minutes. The value range is 0~1440.
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
     * Get Trigger ConditionNote:- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive. 
     * @return Condition Trigger ConditionNote:- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Trigger ConditionNote:- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     * @param Condition Trigger ConditionNote:- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Alarm Level0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).
Note:- If not specified, the default is 0.
- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive. 
     * @return AlarmLevel Alarm Level0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).
Note:- If not specified, the default is 0.
- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm Level0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).
Note:- If not specified, the default is 0.
- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     * @param AlarmLevel Alarm Level0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).
Note:- If not specified, the default is 0.
- Condition and AlarmLevel are one set of configurations, MultiConditions is another set of configurations. The two sets of configurations are mutually exclusive.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Multiple trigger conditions
Note:- Condition and AlarmLevel form one set of configurations, while MultiConditions form another set of configurations, and the two sets are mutually exclusive.


 
     * @return MultiConditions Multiple trigger conditions
Note:- Condition and AlarmLevel form one set of configurations, while MultiConditions form another set of configurations, and the two sets are mutually exclusive.



     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set Multiple trigger conditions
Note:- Condition and AlarmLevel form one set of configurations, while MultiConditions form another set of configurations, and the two sets are mutually exclusive.



     * @param MultiConditions Multiple trigger conditions
Note:- Condition and AlarmLevel form one set of configurations, while MultiConditions form another set of configurations, and the two sets are mutually exclusive.



     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get Whether to enable the alarm policyThe default value is true 
     * @return Status Whether to enable the alarm policyThe default value is true
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable the alarm policyThe default value is true
     * @param Status Whether to enable the alarm policyThe default value is true
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy. 
     * @return Enable This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.
     * @param Enable This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Custom alarm content 
     * @return MessageTemplate Custom alarm content
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set Custom alarm content
     * @param MessageTemplate Custom alarm content
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get Custom callback 
     * @return CallBack Custom callback
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set Custom callback
     * @param CallBack Custom callback
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get Multi-Dimensional analysis 
     * @return Analysis Multi-Dimensional analysis
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Multi-Dimensional analysis
     * @param Analysis Multi-Dimensional analysis
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get Group trigger status.
Default value is false 
     * @return GroupTriggerStatus Group trigger status.
Default value is false
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set Group trigger status.
Default value is false
     * @param GroupTriggerStatus Group trigger status.
Default value is false
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get Grouping Trigger Conditions. 
     * @return GroupTriggerCondition Grouping Trigger Conditions.
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set Grouping Trigger Conditions.
     * @param GroupTriggerCondition Grouping Trigger Conditions.
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get Tag description list, by specifying this parameter, you can simultaneously bind Tag to the corresponding alarm policy.Supports up to 10 Tag key-value pairs, and the pairs must be unique. 
     * @return Tags Tag description list, by specifying this parameter, you can simultaneously bind Tag to the corresponding alarm policy.Supports up to 10 Tag key-value pairs, and the pairs must be unique.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list, by specifying this parameter, you can simultaneously bind Tag to the corresponding alarm policy.Supports up to 10 Tag key-value pairs, and the pairs must be unique.
     * @param Tags Tag description list, by specifying this parameter, you can simultaneously bind Tag to the corresponding alarm policy.Supports up to 10 Tag key-value pairs, and the pairs must be unique.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Monitored Object Type. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.If not specified, the default value is 0.When the value is 1, the number of AlarmTargets Elements (XML) cannot exceed 10, and the Numbers in AlarmTargets must be continuous positive integers starting from 1, without duplication.
 
     * @return MonitorObjectType Monitored Object Type. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.If not specified, the default value is 0.When the value is 1, the number of AlarmTargets Elements (XML) cannot exceed 10, and the Numbers in AlarmTargets must be continuous positive integers starting from 1, without duplication.

     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set Monitored Object Type. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.If not specified, the default value is 0.When the value is 1, the number of AlarmTargets Elements (XML) cannot exceed 10, and the Numbers in AlarmTargets must be continuous positive integers starting from 1, without duplication.

     * @param MonitorObjectType Monitored Object Type. 0: common monitoring objects for execution statements; 1: separately selected monitoring objects for each execution statement.If not specified, the default value is 0.When the value is 1, the number of AlarmTargets Elements (XML) cannot exceed 10, and the Numbers in AlarmTargets must be continuous positive integers starting from 1, without duplication.

     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get Alarms additional classification information listThe number of Classifications elements cannot exceed 20.The Key of Classifications element must not be empty and duplicated, and its length cannot exceed 50 characters, complying with the regular expression ^[a-z]([a-z0-9_]{0,49})$.The Value length of Classifications element cannot exceed 200 characters. 
     * @return Classifications Alarms additional classification information listThe number of Classifications elements cannot exceed 20.The Key of Classifications element must not be empty and duplicated, and its length cannot exceed 50 characters, complying with the regular expression ^[a-z]([a-z0-9_]{0,49})$.The Value length of Classifications element cannot exceed 200 characters.
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set Alarms additional classification information listThe number of Classifications elements cannot exceed 20.The Key of Classifications element must not be empty and duplicated, and its length cannot exceed 50 characters, complying with the regular expression ^[a-z]([a-z0-9_]{0,49})$.The Value length of Classifications element cannot exceed 200 characters.
     * @param Classifications Alarms additional classification information listThe number of Classifications elements cannot exceed 20.The Key of Classifications element must not be empty and duplicated, and its length cannot exceed 50 characters, complying with the regular expression ^[a-z]([a-z0-9_]{0,49})$.The Value length of Classifications element cannot exceed 200 characters.
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    public CreateAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmRequest(CreateAlarmRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTarget[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTarget(source.AlarmTargets[i]);
            }
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
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
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
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
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.Classifications != null) {
            this.Classifications = new AlarmClassification[source.Classifications.length];
            for (int i = 0; i < source.Classifications.length; i++) {
                this.Classifications[i] = new AlarmClassification(source.Classifications[i]);
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
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);
        this.setParamSimple(map, prefix + "GroupTriggerStatus", this.GroupTriggerStatus);
        this.setParamArraySimple(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArrayObj(map, prefix + "Classifications.", this.Classifications);

    }
}


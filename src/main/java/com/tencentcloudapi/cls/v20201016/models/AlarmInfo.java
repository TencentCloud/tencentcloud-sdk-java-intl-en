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
    * Single trigger condition for whether to trigger alarm. Mutually exclusive with the MultiConditions parameter.
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
    * List of associated alarm notification channel groups. - Search the list of associated alarm notification channel groups via [Query notification channel group list](https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1). It is mutually exclusive with MonitorNotice.
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
    * Creation time. Format: YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time. Format: YYYY-MM-DD HH:MM:SS
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
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * Multidimensional analysis settings
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * Group trigger status. true: enabled, false: disabled (default)
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
    * Tag information bound to the alarm policy.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Monitored object type. 0: shared monitored object for execution statements; 1: separate monitored object for each execution statement. 
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * Alarm level. 0: Warn; 1: Information; 2: Critical.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Additional classification field for alerts.
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
    * Multiple trigger conditions.
Mutually exclusive conditions.
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * Tencent Cloud observability platform channel-related information, mutually exclusive with AlarmNoticeIds
    */
    @SerializedName("MonitorNotice")
    @Expose
    private MonitorNotice MonitorNotice;

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
     * Get Single trigger condition for whether to trigger alarm. Mutually exclusive with the MultiConditions parameter. 
     * @return Condition Single trigger condition for whether to trigger alarm. Mutually exclusive with the MultiConditions parameter.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Single trigger condition for whether to trigger alarm. Mutually exclusive with the MultiConditions parameter.
     * @param Condition Single trigger condition for whether to trigger alarm. Mutually exclusive with the MultiConditions parameter.
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
     * Get List of associated alarm notification channel groups. - Search the list of associated alarm notification channel groups via [Query notification channel group list](https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1). It is mutually exclusive with MonitorNotice. 
     * @return AlarmNoticeIds List of associated alarm notification channel groups. - Search the list of associated alarm notification channel groups via [Query notification channel group list](https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1). It is mutually exclusive with MonitorNotice.
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set List of associated alarm notification channel groups. - Search the list of associated alarm notification channel groups via [Query notification channel group list](https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1). It is mutually exclusive with MonitorNotice.
     * @param AlarmNoticeIds List of associated alarm notification channel groups. - Search the list of associated alarm notification channel groups via [Query notification channel group list](https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1). It is mutually exclusive with MonitorNotice.
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
     * Get Creation time. Format: YYYY-MM-DD HH:MM:SS 
     * @return CreateTime Creation time. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Format: YYYY-MM-DD HH:MM:SS
     * @param CreateTime Creation time. Format: YYYY-MM-DD HH:MM:SS
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest update time. Format: YYYY-MM-DD HH:MM:SS 
     * @return UpdateTime Latest update time. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time. Format: YYYY-MM-DD HH:MM:SS
     * @param UpdateTime Latest update time. Format: YYYY-MM-DD HH:MM:SS
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
     * @return CallBack Custom callback template
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set Custom callback template
     * @param CallBack Custom callback template
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get Multidimensional analysis settings 
     * @return Analysis Multidimensional analysis settings
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Multidimensional analysis settings
     * @param Analysis Multidimensional analysis settings
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get Group trigger status. true: enabled, false: disabled (default) 
     * @return GroupTriggerStatus Group trigger status. true: enabled, false: disabled (default)
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set Group trigger status. true: enabled, false: disabled (default)
     * @param GroupTriggerStatus Group trigger status. true: enabled, false: disabled (default)
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
     * Get Tag information bound to the alarm policy. 
     * @return Tags Tag information bound to the alarm policy.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information bound to the alarm policy.
     * @param Tags Tag information bound to the alarm policy.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Monitored object type. 0: shared monitored object for execution statements; 1: separate monitored object for each execution statement.  
     * @return MonitorObjectType Monitored object type. 0: shared monitored object for execution statements; 1: separate monitored object for each execution statement. 
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set Monitored object type. 0: shared monitored object for execution statements; 1: separate monitored object for each execution statement. 
     * @param MonitorObjectType Monitored object type. 0: shared monitored object for execution statements; 1: separate monitored object for each execution statement. 
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get Alarm level. 0: Warn; 1: Information; 2: Critical. 
     * @return AlarmLevel Alarm level. 0: Warn; 1: Information; 2: Critical.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. 0: Warn; 1: Information; 2: Critical.
     * @param AlarmLevel Alarm level. 0: Warn; 1: Information; 2: Critical.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Additional classification field for alerts. 
     * @return Classifications Additional classification field for alerts.
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set Additional classification field for alerts.
     * @param Classifications Additional classification field for alerts.
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    /**
     * Get Multiple trigger conditions.
Mutually exclusive conditions. 
     * @return MultiConditions Multiple trigger conditions.
Mutually exclusive conditions.
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set Multiple trigger conditions.
Mutually exclusive conditions.
     * @param MultiConditions Multiple trigger conditions.
Mutually exclusive conditions.
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get Tencent Cloud observability platform channel-related information, mutually exclusive with AlarmNoticeIds 
     * @return MonitorNotice Tencent Cloud observability platform channel-related information, mutually exclusive with AlarmNoticeIds
     */
    public MonitorNotice getMonitorNotice() {
        return this.MonitorNotice;
    }

    /**
     * Set Tencent Cloud observability platform channel-related information, mutually exclusive with AlarmNoticeIds
     * @param MonitorNotice Tencent Cloud observability platform channel-related information, mutually exclusive with AlarmNoticeIds
     */
    public void setMonitorNotice(MonitorNotice MonitorNotice) {
        this.MonitorNotice = MonitorNotice;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.Classifications != null) {
            this.Classifications = new AlarmClassification[source.Classifications.length];
            for (int i = 0; i < source.Classifications.length; i++) {
                this.Classifications[i] = new AlarmClassification(source.Classifications[i]);
            }
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
        if (source.MonitorNotice != null) {
            this.MonitorNotice = new MonitorNotice(source.MonitorNotice);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "Classifications.", this.Classifications);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);
        this.setParamObj(map, prefix + "MonitorNotice.", this.MonitorNotice);

    }
}


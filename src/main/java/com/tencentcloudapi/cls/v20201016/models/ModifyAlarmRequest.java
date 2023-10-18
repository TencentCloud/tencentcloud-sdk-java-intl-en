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

public class ModifyAlarmRequest extends AbstractModel {

    /**
    * Alarm policy ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alarm policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Monitoring task running time point
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * Trigger condition
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
    * Monitoring object list
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTarget [] AlarmTargets;

    /**
    * Whether to enable the alarm policy
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

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
     * Get Trigger condition 
     * @return Condition Trigger condition
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Trigger condition
     * @param Condition Trigger condition
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
     * Get Whether to enable the alarm policy 
     * @return Status Whether to enable the alarm policy
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable the alarm policy
     * @param Status Whether to enable the alarm policy
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
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

    public ModifyAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmRequest(ModifyAlarmRequest source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTarget[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTarget(source.AlarmTargets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);

    }
}


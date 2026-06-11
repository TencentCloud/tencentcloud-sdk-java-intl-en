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

public class ModifyAlarmRequest extends AbstractModel {

    /**
    * <p>Alert policy ID. - Search the alert policy ID by <a href="https://www.tencentcloud.com/document/product/614/56461?from_cn_redirect=1">obtaining the alarm policy list</a>.</p>
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * <p>Alarm policy name. Supports a maximum of 255 bytes. The '|' character is unsupported.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Monitoring task execution time point.</p>
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * <p>Trigger condition for sending alarm information.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions is another set of configurations. The two sets are mutually exclusive.</li></ul>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>Alarm level.</p><p>0: Warning (Warn); 1: Reminder (Info); 2: Emergency (Critical)</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets are mutually exclusive.</li></ul>
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * <p>Multiple trigger conditions.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets of configurations are mutually exclusive.</li></ul>
    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * <p>Duration cycle. An alarm is triggered after the trigger conditions are constantly met for TriggerCount cycles. The minimum value is 1, and the maximum value is 2000.</p>
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * <p>Alarm repeat cycle. In minutes. Value ranges from 0 to 1440.</p>
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * <p>Monitoring object list.</p>
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTarget [] AlarmTargets;

    /**
    * <p>Whether to enable alarm policy.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>User-defined alarm content</p>
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * <p>user-defined callback</p>
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * <p>Multi-dimensional analysis</p>
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * <p>Group trigger status. true: enabled, false: disabled (default)</p>
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * <p>Group trigger conditions.</p>
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding alarm policy. Up to 10 tag key-value pairs are supported, and no duplicate key-value pairs are allowed.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Monitored object type. 0: Common monitoring object for execution statements; 1: Each execution statement selects its own monitored object.<br>When the value is 1, the number of elements in AlarmTargets cannot exceed 10. The Number in AlarmTargets must be consecutive positive integers starting from 1 and must be unique.</p>
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * <p>Alert additional classification information list.<br>Number of Classifications Elements cannot exceed 20.<br>The Key of Classifications elements cannot be empty, must be unique, length cannot exceed 50 characters, and complies with the regular expression <code>^[a-z]([a-z0-9_]{0,49})$</code>.<br>Value of Classifications elements cannot exceed 200 characters.</p>
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
    * <p>List of associated CLS alarm notification channel groups. - Search the list of associated alarm notification channel groups via <a href="https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1">Query notification channel group list</a>. It is mutually exclusive with MonitorNotice.</p>
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * <p>The associated observability platform notification template is mutually exclusive with the AlarmNoticeIds parameter and cannot include both.</p>
    */
    @SerializedName("MonitorNotice")
    @Expose
    private MonitorNotice MonitorNotice;

    /**
     * Get <p>Alert policy ID. - Search the alert policy ID by <a href="https://www.tencentcloud.com/document/product/614/56461?from_cn_redirect=1">obtaining the alarm policy list</a>.</p> 
     * @return AlarmId <p>Alert policy ID. - Search the alert policy ID by <a href="https://www.tencentcloud.com/document/product/614/56461?from_cn_redirect=1">obtaining the alarm policy list</a>.</p>
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set <p>Alert policy ID. - Search the alert policy ID by <a href="https://www.tencentcloud.com/document/product/614/56461?from_cn_redirect=1">obtaining the alarm policy list</a>.</p>
     * @param AlarmId <p>Alert policy ID. - Search the alert policy ID by <a href="https://www.tencentcloud.com/document/product/614/56461?from_cn_redirect=1">obtaining the alarm policy list</a>.</p>
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get <p>Alarm policy name. Supports a maximum of 255 bytes. The '|' character is unsupported.</p> 
     * @return Name <p>Alarm policy name. Supports a maximum of 255 bytes. The '|' character is unsupported.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Alarm policy name. Supports a maximum of 255 bytes. The '|' character is unsupported.</p>
     * @param Name <p>Alarm policy name. Supports a maximum of 255 bytes. The '|' character is unsupported.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Monitoring task execution time point.</p> 
     * @return MonitorTime <p>Monitoring task execution time point.</p>
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set <p>Monitoring task execution time point.</p>
     * @param MonitorTime <p>Monitoring task execution time point.</p>
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get <p>Trigger condition for sending alarm information.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions is another set of configurations. The two sets are mutually exclusive.</li></ul> 
     * @return Condition <p>Trigger condition for sending alarm information.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions is another set of configurations. The two sets are mutually exclusive.</li></ul>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>Trigger condition for sending alarm information.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions is another set of configurations. The two sets are mutually exclusive.</li></ul>
     * @param Condition <p>Trigger condition for sending alarm information.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions is another set of configurations. The two sets are mutually exclusive.</li></ul>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>Alarm level.</p><p>0: Warning (Warn); 1: Reminder (Info); 2: Emergency (Critical)</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets are mutually exclusive.</li></ul> 
     * @return AlarmLevel <p>Alarm level.</p><p>0: Warning (Warn); 1: Reminder (Info); 2: Emergency (Critical)</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets are mutually exclusive.</li></ul>
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>Alarm level.</p><p>0: Warning (Warn); 1: Reminder (Info); 2: Emergency (Critical)</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets are mutually exclusive.</li></ul>
     * @param AlarmLevel <p>Alarm level.</p><p>0: Warning (Warn); 1: Reminder (Info); 2: Emergency (Critical)</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets are mutually exclusive.</li></ul>
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>Multiple trigger conditions.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets of configurations are mutually exclusive.</li></ul> 
     * @return MultiConditions <p>Multiple trigger conditions.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets of configurations are mutually exclusive.</li></ul>
     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set <p>Multiple trigger conditions.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets of configurations are mutually exclusive.</li></ul>
     * @param MultiConditions <p>Multiple trigger conditions.</p><p>Note:</p><ul><li>Condition and AlarmLevel are one set of configurations, and MultiConditions are another set of configurations. The two sets of configurations are mutually exclusive.</li></ul>
     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get <p>Duration cycle. An alarm is triggered after the trigger conditions are constantly met for TriggerCount cycles. The minimum value is 1, and the maximum value is 2000.</p> 
     * @return TriggerCount <p>Duration cycle. An alarm is triggered after the trigger conditions are constantly met for TriggerCount cycles. The minimum value is 1, and the maximum value is 2000.</p>
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set <p>Duration cycle. An alarm is triggered after the trigger conditions are constantly met for TriggerCount cycles. The minimum value is 1, and the maximum value is 2000.</p>
     * @param TriggerCount <p>Duration cycle. An alarm is triggered after the trigger conditions are constantly met for TriggerCount cycles. The minimum value is 1, and the maximum value is 2000.</p>
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get <p>Alarm repeat cycle. In minutes. Value ranges from 0 to 1440.</p> 
     * @return AlarmPeriod <p>Alarm repeat cycle. In minutes. Value ranges from 0 to 1440.</p>
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set <p>Alarm repeat cycle. In minutes. Value ranges from 0 to 1440.</p>
     * @param AlarmPeriod <p>Alarm repeat cycle. In minutes. Value ranges from 0 to 1440.</p>
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get <p>Monitoring object list.</p> 
     * @return AlarmTargets <p>Monitoring object list.</p>
     */
    public AlarmTarget [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set <p>Monitoring object list.</p>
     * @param AlarmTargets <p>Monitoring object list.</p>
     */
    public void setAlarmTargets(AlarmTarget [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get <p>Whether to enable alarm policy.</p> 
     * @return Status <p>Whether to enable alarm policy.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether to enable alarm policy.</p>
     * @param Status <p>Whether to enable alarm policy.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.</p> 
     * @return Enable <p>This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.</p>
     * @param Enable <p>This parameter has been deprecated, please use the Status parameter to control whether to enable the alarm policy.</p>
     * @deprecated
     */
    @Deprecated
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>User-defined alarm content</p> 
     * @return MessageTemplate <p>User-defined alarm content</p>
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set <p>User-defined alarm content</p>
     * @param MessageTemplate <p>User-defined alarm content</p>
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get <p>user-defined callback</p> 
     * @return CallBack <p>user-defined callback</p>
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set <p>user-defined callback</p>
     * @param CallBack <p>user-defined callback</p>
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get <p>Multi-dimensional analysis</p> 
     * @return Analysis <p>Multi-dimensional analysis</p>
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>Multi-dimensional analysis</p>
     * @param Analysis <p>Multi-dimensional analysis</p>
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>Group trigger status. true: enabled, false: disabled (default)</p> 
     * @return GroupTriggerStatus <p>Group trigger status. true: enabled, false: disabled (default)</p>
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set <p>Group trigger status. true: enabled, false: disabled (default)</p>
     * @param GroupTriggerStatus <p>Group trigger status. true: enabled, false: disabled (default)</p>
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get <p>Group trigger conditions.</p> 
     * @return GroupTriggerCondition <p>Group trigger conditions.</p>
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set <p>Group trigger conditions.</p>
     * @param GroupTriggerCondition <p>Group trigger conditions.</p>
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding alarm policy. Up to 10 tag key-value pairs are supported, and no duplicate key-value pairs are allowed.</p> 
     * @return Tags <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding alarm policy. Up to 10 tag key-value pairs are supported, and no duplicate key-value pairs are allowed.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding alarm policy. Up to 10 tag key-value pairs are supported, and no duplicate key-value pairs are allowed.</p>
     * @param Tags <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding alarm policy. Up to 10 tag key-value pairs are supported, and no duplicate key-value pairs are allowed.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Monitored object type. 0: Common monitoring object for execution statements; 1: Each execution statement selects its own monitored object.<br>When the value is 1, the number of elements in AlarmTargets cannot exceed 10. The Number in AlarmTargets must be consecutive positive integers starting from 1 and must be unique.</p> 
     * @return MonitorObjectType <p>Monitored object type. 0: Common monitoring object for execution statements; 1: Each execution statement selects its own monitored object.<br>When the value is 1, the number of elements in AlarmTargets cannot exceed 10. The Number in AlarmTargets must be consecutive positive integers starting from 1 and must be unique.</p>
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set <p>Monitored object type. 0: Common monitoring object for execution statements; 1: Each execution statement selects its own monitored object.<br>When the value is 1, the number of elements in AlarmTargets cannot exceed 10. The Number in AlarmTargets must be consecutive positive integers starting from 1 and must be unique.</p>
     * @param MonitorObjectType <p>Monitored object type. 0: Common monitoring object for execution statements; 1: Each execution statement selects its own monitored object.<br>When the value is 1, the number of elements in AlarmTargets cannot exceed 10. The Number in AlarmTargets must be consecutive positive integers starting from 1 and must be unique.</p>
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get <p>Alert additional classification information list.<br>Number of Classifications Elements cannot exceed 20.<br>The Key of Classifications elements cannot be empty, must be unique, length cannot exceed 50 characters, and complies with the regular expression <code>^[a-z]([a-z0-9_]{0,49})$</code>.<br>Value of Classifications elements cannot exceed 200 characters.</p> 
     * @return Classifications <p>Alert additional classification information list.<br>Number of Classifications Elements cannot exceed 20.<br>The Key of Classifications elements cannot be empty, must be unique, length cannot exceed 50 characters, and complies with the regular expression <code>^[a-z]([a-z0-9_]{0,49})$</code>.<br>Value of Classifications elements cannot exceed 200 characters.</p>
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set <p>Alert additional classification information list.<br>Number of Classifications Elements cannot exceed 20.<br>The Key of Classifications elements cannot be empty, must be unique, length cannot exceed 50 characters, and complies with the regular expression <code>^[a-z]([a-z0-9_]{0,49})$</code>.<br>Value of Classifications elements cannot exceed 200 characters.</p>
     * @param Classifications <p>Alert additional classification information list.<br>Number of Classifications Elements cannot exceed 20.<br>The Key of Classifications elements cannot be empty, must be unique, length cannot exceed 50 characters, and complies with the regular expression <code>^[a-z]([a-z0-9_]{0,49})$</code>.<br>Value of Classifications elements cannot exceed 200 characters.</p>
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    /**
     * Get <p>List of associated CLS alarm notification channel groups. - Search the list of associated alarm notification channel groups via <a href="https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1">Query notification channel group list</a>. It is mutually exclusive with MonitorNotice.</p> 
     * @return AlarmNoticeIds <p>List of associated CLS alarm notification channel groups. - Search the list of associated alarm notification channel groups via <a href="https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1">Query notification channel group list</a>. It is mutually exclusive with MonitorNotice.</p>
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set <p>List of associated CLS alarm notification channel groups. - Search the list of associated alarm notification channel groups via <a href="https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1">Query notification channel group list</a>. It is mutually exclusive with MonitorNotice.</p>
     * @param AlarmNoticeIds <p>List of associated CLS alarm notification channel groups. - Search the list of associated alarm notification channel groups via <a href="https://www.tencentcloud.com/document/product/614/56462?from_cn_redirect=1">Query notification channel group list</a>. It is mutually exclusive with MonitorNotice.</p>
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get <p>The associated observability platform notification template is mutually exclusive with the AlarmNoticeIds parameter and cannot include both.</p> 
     * @return MonitorNotice <p>The associated observability platform notification template is mutually exclusive with the AlarmNoticeIds parameter and cannot include both.</p>
     */
    public MonitorNotice getMonitorNotice() {
        return this.MonitorNotice;
    }

    /**
     * Set <p>The associated observability platform notification template is mutually exclusive with the AlarmNoticeIds parameter and cannot include both.</p>
     * @param MonitorNotice <p>The associated observability platform notification template is mutually exclusive with the AlarmNoticeIds parameter and cannot include both.</p>
     */
    public void setMonitorNotice(MonitorNotice MonitorNotice) {
        this.MonitorNotice = MonitorNotice;
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
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
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
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
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
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
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
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamObj(map, prefix + "MonitorNotice.", this.MonitorNotice);

    }
}


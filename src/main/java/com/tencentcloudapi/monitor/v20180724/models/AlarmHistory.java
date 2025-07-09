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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmHistory extends AbstractModel {

    /**
    * Alarm record ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Monitor type
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Policy type
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Alarm object
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * Alarm content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Timestamp of the first occurrence
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private Long FirstOccurTime;

    /**
    * Timestamp of the last occurrence
    */
    @SerializedName("LastOccurTime")
    @Expose
    private Long LastOccurTime;

    /**
    * Alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data)
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String AlarmStatus;

    /**
    * Alarm policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * VPC of alarm object for basic product alarm
    */
    @SerializedName("VPC")
    @Expose
    private String VPC;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Instance group of alarm object
    */
    @SerializedName("InstanceGroup")
    @Expose
    private InstanceGroups [] InstanceGroup;

    /**
    * Recipient list
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * Recipient group list
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * Alarm channel list. Valid values: SMS (SMS), EMAIL (email), CALL (phone), WECHAT (WeChat)
    */
    @SerializedName("NoticeWays")
    @Expose
    private String [] NoticeWays;

    /**
    * Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * Alarm type
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Whether the policy exists. Valid values: 0 (no), 1 (yes)
    */
    @SerializedName("PolicyExists")
    @Expose
    private Long PolicyExists;

    /**
    * Metric information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricsInfo")
    @Expose
    private AlarmHistoryMetric [] MetricsInfo;

    /**
    * Dimension information of an instance that triggered alarms.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
     * Get Alarm record ID 
     * @return AlarmId Alarm record ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Alarm record ID
     * @param AlarmId Alarm record ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Monitor type 
     * @return MonitorType Monitor type
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitor type
     * @param MonitorType Monitor type
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Policy type 
     * @return Namespace Policy type
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Policy type
     * @param Namespace Policy type
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Alarm object 
     * @return AlarmObject Alarm object
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set Alarm object
     * @param AlarmObject Alarm object
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get Alarm content 
     * @return Content Alarm content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Alarm content
     * @param Content Alarm content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Timestamp of the first occurrence 
     * @return FirstOccurTime Timestamp of the first occurrence
     */
    public Long getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set Timestamp of the first occurrence
     * @param FirstOccurTime Timestamp of the first occurrence
     */
    public void setFirstOccurTime(Long FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get Timestamp of the last occurrence 
     * @return LastOccurTime Timestamp of the last occurrence
     */
    public Long getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set Timestamp of the last occurrence
     * @param LastOccurTime Timestamp of the last occurrence
     */
    public void setLastOccurTime(Long LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get Alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data) 
     * @return AlarmStatus Alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data)
     */
    public String getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set Alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data)
     * @param AlarmStatus Alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data)
     */
    public void setAlarmStatus(String AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get Alarm policy ID 
     * @return PolicyId Alarm policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID
     * @param PolicyId Alarm policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get VPC of alarm object for basic product alarm 
     * @return VPC VPC of alarm object for basic product alarm
     */
    public String getVPC() {
        return this.VPC;
    }

    /**
     * Set VPC of alarm object for basic product alarm
     * @param VPC VPC of alarm object for basic product alarm
     */
    public void setVPC(String VPC) {
        this.VPC = VPC;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Instance group of alarm object 
     * @return InstanceGroup Instance group of alarm object
     */
    public InstanceGroups [] getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set Instance group of alarm object
     * @param InstanceGroup Instance group of alarm object
     */
    public void setInstanceGroup(InstanceGroups [] InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Get Recipient list 
     * @return ReceiverUids Recipient list
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set Recipient list
     * @param ReceiverUids Recipient list
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get Recipient group list 
     * @return ReceiverGroups Recipient group list
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set Recipient group list
     * @param ReceiverGroups Recipient group list
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get Alarm channel list. Valid values: SMS (SMS), EMAIL (email), CALL (phone), WECHAT (WeChat) 
     * @return NoticeWays Alarm channel list. Valid values: SMS (SMS), EMAIL (email), CALL (phone), WECHAT (WeChat)
     */
    public String [] getNoticeWays() {
        return this.NoticeWays;
    }

    /**
     * Set Alarm channel list. Valid values: SMS (SMS), EMAIL (email), CALL (phone), WECHAT (WeChat)
     * @param NoticeWays Alarm channel list. Valid values: SMS (SMS), EMAIL (email), CALL (phone), WECHAT (WeChat)
     */
    public void setNoticeWays(String [] NoticeWays) {
        this.NoticeWays = NoticeWays;
    }

    /**
     * Get Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy 
     * @return OriginId Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     * @param OriginId Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get Alarm type 
     * @return AlarmType Alarm type
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm type
     * @param AlarmType Alarm type
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Whether the policy exists. Valid values: 0 (no), 1 (yes) 
     * @return PolicyExists Whether the policy exists. Valid values: 0 (no), 1 (yes)
     */
    public Long getPolicyExists() {
        return this.PolicyExists;
    }

    /**
     * Set Whether the policy exists. Valid values: 0 (no), 1 (yes)
     * @param PolicyExists Whether the policy exists. Valid values: 0 (no), 1 (yes)
     */
    public void setPolicyExists(Long PolicyExists) {
        this.PolicyExists = PolicyExists;
    }

    /**
     * Get Metric information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MetricsInfo Metric information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AlarmHistoryMetric [] getMetricsInfo() {
        return this.MetricsInfo;
    }

    /**
     * Set Metric information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MetricsInfo Metric information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMetricsInfo(AlarmHistoryMetric [] MetricsInfo) {
        this.MetricsInfo = MetricsInfo;
    }

    /**
     * Get Dimension information of an instance that triggered alarms.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Dimensions Dimension information of an instance that triggered alarms.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension information of an instance that triggered alarms.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Dimensions Dimension information of an instance that triggered alarms.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    public AlarmHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHistory(AlarmHistory source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.AlarmObject != null) {
            this.AlarmObject = new String(source.AlarmObject);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FirstOccurTime != null) {
            this.FirstOccurTime = new Long(source.FirstOccurTime);
        }
        if (source.LastOccurTime != null) {
            this.LastOccurTime = new Long(source.LastOccurTime);
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new String(source.AlarmStatus);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.VPC != null) {
            this.VPC = new String(source.VPC);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.InstanceGroup != null) {
            this.InstanceGroup = new InstanceGroups[source.InstanceGroup.length];
            for (int i = 0; i < source.InstanceGroup.length; i++) {
                this.InstanceGroup[i] = new InstanceGroups(source.InstanceGroup[i]);
            }
        }
        if (source.ReceiverUids != null) {
            this.ReceiverUids = new Long[source.ReceiverUids.length];
            for (int i = 0; i < source.ReceiverUids.length; i++) {
                this.ReceiverUids[i] = new Long(source.ReceiverUids[i]);
            }
        }
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new Long[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new Long(source.ReceiverGroups[i]);
            }
        }
        if (source.NoticeWays != null) {
            this.NoticeWays = new String[source.NoticeWays.length];
            for (int i = 0; i < source.NoticeWays.length; i++) {
                this.NoticeWays[i] = new String(source.NoticeWays[i]);
            }
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PolicyExists != null) {
            this.PolicyExists = new Long(source.PolicyExists);
        }
        if (source.MetricsInfo != null) {
            this.MetricsInfo = new AlarmHistoryMetric[source.MetricsInfo.length];
            for (int i = 0; i < source.MetricsInfo.length; i++) {
                this.MetricsInfo[i] = new AlarmHistoryMetric(source.MetricsInfo[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FirstOccurTime", this.FirstOccurTime);
        this.setParamSimple(map, prefix + "LastOccurTime", this.LastOccurTime);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "VPC", this.VPC);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamArrayObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "NoticeWays.", this.NoticeWays);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PolicyExists", this.PolicyExists);
        this.setParamArrayObj(map, prefix + "MetricsInfo.", this.MetricsInfo);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);

    }
}


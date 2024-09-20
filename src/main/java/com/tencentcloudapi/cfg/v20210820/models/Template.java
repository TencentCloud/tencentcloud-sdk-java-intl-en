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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Template extends AbstractModel {

    /**
    * Template library ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template library name
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * Template library description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateTag")
    @Expose
    private String TemplateTag;

    /**
    * Usage status. 1: in use; 2: not in use.
    */
    @SerializedName("TemplateIsUsed")
    @Expose
    private Long TemplateIsUsed;

    /**
    * Template library creation time
    */
    @SerializedName("TemplateCreateTime")
    @Expose
    private String TemplateCreateTime;

    /**
    * Template library update time
    */
    @SerializedName("TemplateUpdateTime")
    @Expose
    private String TemplateUpdateTime;

    /**
    * Template library mode. 1: manual execution; 2: automatic execution.
    */
    @SerializedName("TemplateMode")
    @Expose
    private Long TemplateMode;

    /**
    * Automatic pause duration. Unit: minutes.
    */
    @SerializedName("TemplatePauseDuration")
    @Expose
    private Long TemplatePauseDuration;

    /**
    * Main account that creates the experiment
    */
    @SerializedName("TemplateOwnerUin")
    @Expose
    private String TemplateOwnerUin;

    /**
    * Region ID
    */
    @SerializedName("TemplateRegionId")
    @Expose
    private Long TemplateRegionId;

    /**
    * Action group
    */
    @SerializedName("TemplateGroups")
    @Expose
    private TemplateGroup [] TemplateGroups;

    /**
    * Monitoring metrics
    */
    @SerializedName("TemplateMonitors")
    @Expose
    private TemplateMonitor [] TemplateMonitors;

    /**
    * Guardrail monitoring
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplatePolicy")
    @Expose
    private TemplatePolicy TemplatePolicy;

    /**
    * Tag list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateSource")
    @Expose
    private Long TemplateSource;

    /**
    * Application information on Application Performance Monitoring
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApmServiceList")
    @Expose
    private ApmServiceInfo [] ApmServiceList;

    /**
    * Alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private String [] AlarmPolicy;

    /**
    * Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyDealType")
    @Expose
    private Long PolicyDealType;

    /**
     * Get Template library ID 
     * @return TemplateId Template library ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template library ID
     * @param TemplateId Template library ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template library name 
     * @return TemplateTitle Template library name
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set Template library name
     * @param TemplateTitle Template library name
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get Template library description 
     * @return TemplateDescription Template library description
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Template library description
     * @param TemplateDescription Template library description
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get Custom tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateTag Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateTag() {
        return this.TemplateTag;
    }

    /**
     * Set Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateTag Custom tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateTag(String TemplateTag) {
        this.TemplateTag = TemplateTag;
    }

    /**
     * Get Usage status. 1: in use; 2: not in use. 
     * @return TemplateIsUsed Usage status. 1: in use; 2: not in use.
     */
    public Long getTemplateIsUsed() {
        return this.TemplateIsUsed;
    }

    /**
     * Set Usage status. 1: in use; 2: not in use.
     * @param TemplateIsUsed Usage status. 1: in use; 2: not in use.
     */
    public void setTemplateIsUsed(Long TemplateIsUsed) {
        this.TemplateIsUsed = TemplateIsUsed;
    }

    /**
     * Get Template library creation time 
     * @return TemplateCreateTime Template library creation time
     */
    public String getTemplateCreateTime() {
        return this.TemplateCreateTime;
    }

    /**
     * Set Template library creation time
     * @param TemplateCreateTime Template library creation time
     */
    public void setTemplateCreateTime(String TemplateCreateTime) {
        this.TemplateCreateTime = TemplateCreateTime;
    }

    /**
     * Get Template library update time 
     * @return TemplateUpdateTime Template library update time
     */
    public String getTemplateUpdateTime() {
        return this.TemplateUpdateTime;
    }

    /**
     * Set Template library update time
     * @param TemplateUpdateTime Template library update time
     */
    public void setTemplateUpdateTime(String TemplateUpdateTime) {
        this.TemplateUpdateTime = TemplateUpdateTime;
    }

    /**
     * Get Template library mode. 1: manual execution; 2: automatic execution. 
     * @return TemplateMode Template library mode. 1: manual execution; 2: automatic execution.
     */
    public Long getTemplateMode() {
        return this.TemplateMode;
    }

    /**
     * Set Template library mode. 1: manual execution; 2: automatic execution.
     * @param TemplateMode Template library mode. 1: manual execution; 2: automatic execution.
     */
    public void setTemplateMode(Long TemplateMode) {
        this.TemplateMode = TemplateMode;
    }

    /**
     * Get Automatic pause duration. Unit: minutes. 
     * @return TemplatePauseDuration Automatic pause duration. Unit: minutes.
     */
    public Long getTemplatePauseDuration() {
        return this.TemplatePauseDuration;
    }

    /**
     * Set Automatic pause duration. Unit: minutes.
     * @param TemplatePauseDuration Automatic pause duration. Unit: minutes.
     */
    public void setTemplatePauseDuration(Long TemplatePauseDuration) {
        this.TemplatePauseDuration = TemplatePauseDuration;
    }

    /**
     * Get Main account that creates the experiment 
     * @return TemplateOwnerUin Main account that creates the experiment
     */
    public String getTemplateOwnerUin() {
        return this.TemplateOwnerUin;
    }

    /**
     * Set Main account that creates the experiment
     * @param TemplateOwnerUin Main account that creates the experiment
     */
    public void setTemplateOwnerUin(String TemplateOwnerUin) {
        this.TemplateOwnerUin = TemplateOwnerUin;
    }

    /**
     * Get Region ID 
     * @return TemplateRegionId Region ID
     */
    public Long getTemplateRegionId() {
        return this.TemplateRegionId;
    }

    /**
     * Set Region ID
     * @param TemplateRegionId Region ID
     */
    public void setTemplateRegionId(Long TemplateRegionId) {
        this.TemplateRegionId = TemplateRegionId;
    }

    /**
     * Get Action group 
     * @return TemplateGroups Action group
     */
    public TemplateGroup [] getTemplateGroups() {
        return this.TemplateGroups;
    }

    /**
     * Set Action group
     * @param TemplateGroups Action group
     */
    public void setTemplateGroups(TemplateGroup [] TemplateGroups) {
        this.TemplateGroups = TemplateGroups;
    }

    /**
     * Get Monitoring metrics 
     * @return TemplateMonitors Monitoring metrics
     */
    public TemplateMonitor [] getTemplateMonitors() {
        return this.TemplateMonitors;
    }

    /**
     * Set Monitoring metrics
     * @param TemplateMonitors Monitoring metrics
     */
    public void setTemplateMonitors(TemplateMonitor [] TemplateMonitors) {
        this.TemplateMonitors = TemplateMonitors;
    }

    /**
     * Get Guardrail monitoring
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplatePolicy Guardrail monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TemplatePolicy getTemplatePolicy() {
        return this.TemplatePolicy;
    }

    /**
     * Set Guardrail monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplatePolicy Guardrail monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplatePolicy(TemplatePolicy TemplatePolicy) {
        this.TemplatePolicy = TemplatePolicy;
    }

    /**
     * Get Tag list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateSource Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTemplateSource() {
        return this.TemplateSource;
    }

    /**
     * Set Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateSource Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateSource(Long TemplateSource) {
        this.TemplateSource = TemplateSource;
    }

    /**
     * Get Application information on Application Performance Monitoring
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApmServiceList Application information on Application Performance Monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmServiceInfo [] getApmServiceList() {
        return this.ApmServiceList;
    }

    /**
     * Set Application information on Application Performance Monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApmServiceList Application information on Application Performance Monitoring
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApmServiceList(ApmServiceInfo [] ApmServiceList) {
        this.ApmServiceList = ApmServiceList;
    }

    /**
     * Get Alarm metrics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmPolicy Alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set Alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmPolicy Alarm metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmPolicy(String [] AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    /**
     * Get Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyDealType() {
        return this.PolicyDealType;
    }

    /**
     * Set Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyDealType Guardrail processing method. 1: roll back sequentially; 2: pause experiment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyDealType(Long PolicyDealType) {
        this.PolicyDealType = PolicyDealType;
    }

    public Template() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Template(Template source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateTag != null) {
            this.TemplateTag = new String(source.TemplateTag);
        }
        if (source.TemplateIsUsed != null) {
            this.TemplateIsUsed = new Long(source.TemplateIsUsed);
        }
        if (source.TemplateCreateTime != null) {
            this.TemplateCreateTime = new String(source.TemplateCreateTime);
        }
        if (source.TemplateUpdateTime != null) {
            this.TemplateUpdateTime = new String(source.TemplateUpdateTime);
        }
        if (source.TemplateMode != null) {
            this.TemplateMode = new Long(source.TemplateMode);
        }
        if (source.TemplatePauseDuration != null) {
            this.TemplatePauseDuration = new Long(source.TemplatePauseDuration);
        }
        if (source.TemplateOwnerUin != null) {
            this.TemplateOwnerUin = new String(source.TemplateOwnerUin);
        }
        if (source.TemplateRegionId != null) {
            this.TemplateRegionId = new Long(source.TemplateRegionId);
        }
        if (source.TemplateGroups != null) {
            this.TemplateGroups = new TemplateGroup[source.TemplateGroups.length];
            for (int i = 0; i < source.TemplateGroups.length; i++) {
                this.TemplateGroups[i] = new TemplateGroup(source.TemplateGroups[i]);
            }
        }
        if (source.TemplateMonitors != null) {
            this.TemplateMonitors = new TemplateMonitor[source.TemplateMonitors.length];
            for (int i = 0; i < source.TemplateMonitors.length; i++) {
                this.TemplateMonitors[i] = new TemplateMonitor(source.TemplateMonitors[i]);
            }
        }
        if (source.TemplatePolicy != null) {
            this.TemplatePolicy = new TemplatePolicy(source.TemplatePolicy);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.TemplateSource != null) {
            this.TemplateSource = new Long(source.TemplateSource);
        }
        if (source.ApmServiceList != null) {
            this.ApmServiceList = new ApmServiceInfo[source.ApmServiceList.length];
            for (int i = 0; i < source.ApmServiceList.length; i++) {
                this.ApmServiceList[i] = new ApmServiceInfo(source.ApmServiceList[i]);
            }
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new String[source.AlarmPolicy.length];
            for (int i = 0; i < source.AlarmPolicy.length; i++) {
                this.AlarmPolicy[i] = new String(source.AlarmPolicy[i]);
            }
        }
        if (source.PolicyDealType != null) {
            this.PolicyDealType = new Long(source.PolicyDealType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateTag", this.TemplateTag);
        this.setParamSimple(map, prefix + "TemplateIsUsed", this.TemplateIsUsed);
        this.setParamSimple(map, prefix + "TemplateCreateTime", this.TemplateCreateTime);
        this.setParamSimple(map, prefix + "TemplateUpdateTime", this.TemplateUpdateTime);
        this.setParamSimple(map, prefix + "TemplateMode", this.TemplateMode);
        this.setParamSimple(map, prefix + "TemplatePauseDuration", this.TemplatePauseDuration);
        this.setParamSimple(map, prefix + "TemplateOwnerUin", this.TemplateOwnerUin);
        this.setParamSimple(map, prefix + "TemplateRegionId", this.TemplateRegionId);
        this.setParamArrayObj(map, prefix + "TemplateGroups.", this.TemplateGroups);
        this.setParamArrayObj(map, prefix + "TemplateMonitors.", this.TemplateMonitors);
        this.setParamObj(map, prefix + "TemplatePolicy.", this.TemplatePolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TemplateSource", this.TemplateSource);
        this.setParamArrayObj(map, prefix + "ApmServiceList.", this.ApmServiceList);
        this.setParamArraySimple(map, prefix + "AlarmPolicy.", this.AlarmPolicy);
        this.setParamSimple(map, prefix + "PolicyDealType", this.PolicyDealType);

    }
}


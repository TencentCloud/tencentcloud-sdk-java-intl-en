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

public class PrometheusAlertGroupSet extends AbstractModel {

    /**
    * Alert group ID. must match the regular expression `alert-[a-z0-9]{8}`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Alert group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Alert template ID of tencent cloud observability platform (tcop). returns the converted notice ID of the Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AMPReceivers")
    @Expose
    private String [] AMPReceivers;

    /**
    * Custom Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomReceiver")
    @Expose
    private PrometheusAlertCustomReceiver CustomReceiver;

    /**
    * Alert notification interval.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * If the Alert group is created via template, returns the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Alert rule details within the group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertGroupRuleSet [] Rules;

    /**
    * Group creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Group update time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Alert group ID. must match the regular expression `alert-[a-z0-9]{8}`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId Alert group ID. must match the regular expression `alert-[a-z0-9]{8}`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Alert group ID. must match the regular expression `alert-[a-z0-9]{8}`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId Alert group ID. must match the regular expression `alert-[a-z0-9]{8}`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alert group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Alert group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Alert group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Alert group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Alert template ID of tencent cloud observability platform (tcop). returns the converted notice ID of the Alert template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AMPReceivers Alert template ID of tencent cloud observability platform (tcop). returns the converted notice ID of the Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAMPReceivers() {
        return this.AMPReceivers;
    }

    /**
     * Set Alert template ID of tencent cloud observability platform (tcop). returns the converted notice ID of the Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AMPReceivers Alert template ID of tencent cloud observability platform (tcop). returns the converted notice ID of the Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAMPReceivers(String [] AMPReceivers) {
        this.AMPReceivers = AMPReceivers;
    }

    /**
     * Get Custom Alert template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomReceiver Custom Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAlertCustomReceiver getCustomReceiver() {
        return this.CustomReceiver;
    }

    /**
     * Set Custom Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomReceiver Custom Alert template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomReceiver(PrometheusAlertCustomReceiver CustomReceiver) {
        this.CustomReceiver = CustomReceiver;
    }

    /**
     * Get Alert notification interval.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RepeatInterval Alert notification interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set Alert notification interval.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RepeatInterval Alert notification interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get If the Alert group is created via template, returns the template ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateId If the Alert group is created via template, returns the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set If the Alert group is created via template, returns the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateId If the Alert group is created via template, returns the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Alert rule details within the group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rules Alert rule details within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAlertGroupRuleSet [] getRules() {
        return this.Rules;
    }

    /**
     * Set Alert rule details within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rules Alert rule details within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(PrometheusAlertGroupRuleSet [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Group creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Group creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Group creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Group creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Group update time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Group update time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Group update time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Group update time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrometheusAlertGroupSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertGroupSet(PrometheusAlertGroupSet source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AMPReceivers != null) {
            this.AMPReceivers = new String[source.AMPReceivers.length];
            for (int i = 0; i < source.AMPReceivers.length; i++) {
                this.AMPReceivers[i] = new String(source.AMPReceivers[i]);
            }
        }
        if (source.CustomReceiver != null) {
            this.CustomReceiver = new PrometheusAlertCustomReceiver(source.CustomReceiver);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new String(source.RepeatInterval);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertGroupRuleSet[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertGroupRuleSet(source.Rules[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "AMPReceivers.", this.AMPReceivers);
        this.setParamObj(map, prefix + "CustomReceiver.", this.CustomReceiver);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}


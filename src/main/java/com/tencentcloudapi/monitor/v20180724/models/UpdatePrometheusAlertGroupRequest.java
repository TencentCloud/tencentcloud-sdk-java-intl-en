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

public class UpdatePrometheusAlertGroupRequest extends AbstractModel {

    /**
    * prometheus instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Alert group ID, such as alert-xxxx.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Alert group name. not allowed to have the same name as other alert groups.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Alert group status.
2 - enable.
3 - disabled.
Specifies the Alert rule status under the `Rules` field to be overwritten when not empty.
    */
    @SerializedName("GroupState")
    @Expose
    private Long GroupState;

    /**
    * Alert notification template ID list of tencent cloud observability platform, such as Consumer-xxxx or notice-xxxx.
    */
    @SerializedName("AMPReceivers")
    @Expose
    private String [] AMPReceivers;

    /**
    * Specifies the custom Alert notification template.
    */
    @SerializedName("CustomReceiver")
    @Expose
    private PrometheusAlertCustomReceiver CustomReceiver;

    /**
    * Alert notification cycle (convergence time). defaults to 1h if left empty.
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * Specifies the Alert rule list to be created.
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertGroupRuleSet [] Rules;

    /**
     * Get prometheus instance ID. 
     * @return InstanceId prometheus instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set prometheus instance ID.
     * @param InstanceId prometheus instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Alert group ID, such as alert-xxxx. 
     * @return GroupId Alert group ID, such as alert-xxxx.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Alert group ID, such as alert-xxxx.
     * @param GroupId Alert group ID, such as alert-xxxx.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alert group name. not allowed to have the same name as other alert groups. 
     * @return GroupName Alert group name. not allowed to have the same name as other alert groups.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Alert group name. not allowed to have the same name as other alert groups.
     * @param GroupName Alert group name. not allowed to have the same name as other alert groups.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Alert group status.
2 - enable.
3 - disabled.
Specifies the Alert rule status under the `Rules` field to be overwritten when not empty. 
     * @return GroupState Alert group status.
2 - enable.
3 - disabled.
Specifies the Alert rule status under the `Rules` field to be overwritten when not empty.
     */
    public Long getGroupState() {
        return this.GroupState;
    }

    /**
     * Set Alert group status.
2 - enable.
3 - disabled.
Specifies the Alert rule status under the `Rules` field to be overwritten when not empty.
     * @param GroupState Alert group status.
2 - enable.
3 - disabled.
Specifies the Alert rule status under the `Rules` field to be overwritten when not empty.
     */
    public void setGroupState(Long GroupState) {
        this.GroupState = GroupState;
    }

    /**
     * Get Alert notification template ID list of tencent cloud observability platform, such as Consumer-xxxx or notice-xxxx. 
     * @return AMPReceivers Alert notification template ID list of tencent cloud observability platform, such as Consumer-xxxx or notice-xxxx.
     */
    public String [] getAMPReceivers() {
        return this.AMPReceivers;
    }

    /**
     * Set Alert notification template ID list of tencent cloud observability platform, such as Consumer-xxxx or notice-xxxx.
     * @param AMPReceivers Alert notification template ID list of tencent cloud observability platform, such as Consumer-xxxx or notice-xxxx.
     */
    public void setAMPReceivers(String [] AMPReceivers) {
        this.AMPReceivers = AMPReceivers;
    }

    /**
     * Get Specifies the custom Alert notification template. 
     * @return CustomReceiver Specifies the custom Alert notification template.
     */
    public PrometheusAlertCustomReceiver getCustomReceiver() {
        return this.CustomReceiver;
    }

    /**
     * Set Specifies the custom Alert notification template.
     * @param CustomReceiver Specifies the custom Alert notification template.
     */
    public void setCustomReceiver(PrometheusAlertCustomReceiver CustomReceiver) {
        this.CustomReceiver = CustomReceiver;
    }

    /**
     * Get Alert notification cycle (convergence time). defaults to 1h if left empty. 
     * @return RepeatInterval Alert notification cycle (convergence time). defaults to 1h if left empty.
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set Alert notification cycle (convergence time). defaults to 1h if left empty.
     * @param RepeatInterval Alert notification cycle (convergence time). defaults to 1h if left empty.
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get Specifies the Alert rule list to be created. 
     * @return Rules Specifies the Alert rule list to be created.
     */
    public PrometheusAlertGroupRuleSet [] getRules() {
        return this.Rules;
    }

    /**
     * Set Specifies the Alert rule list to be created.
     * @param Rules Specifies the Alert rule list to be created.
     */
    public void setRules(PrometheusAlertGroupRuleSet [] Rules) {
        this.Rules = Rules;
    }

    public UpdatePrometheusAlertGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAlertGroupRequest(UpdatePrometheusAlertGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupState != null) {
            this.GroupState = new Long(source.GroupState);
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
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertGroupRuleSet[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertGroupRuleSet(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupState", this.GroupState);
        this.setParamArraySimple(map, prefix + "AMPReceivers.", this.AMPReceivers);
        this.setParamObj(map, prefix + "CustomReceiver.", this.CustomReceiver);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}


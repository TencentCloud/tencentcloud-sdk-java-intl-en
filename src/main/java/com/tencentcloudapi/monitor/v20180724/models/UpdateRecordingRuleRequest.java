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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordingRuleRequest extends AbstractModel {

    /**
    * Recording rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Recording rule group content, which is in YAML format and is Base64-encoded.
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Prometheus instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Prometheus recording rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule status code. Valid values:
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
Default value: 2 (enabled).
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
     * Get Recording rule name 
     * @return Name Recording rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recording rule name
     * @param Name Recording rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Recording rule group content, which is in YAML format and is Base64-encoded. 
     * @return Group Recording rule group content, which is in YAML format and is Base64-encoded.
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Recording rule group content, which is in YAML format and is Base64-encoded.
     * @param Group Recording rule group content, which is in YAML format and is Base64-encoded.
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Prometheus instance ID 
     * @return InstanceId Prometheus instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus instance ID
     * @param InstanceId Prometheus instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Prometheus recording rule ID 
     * @return RuleId Prometheus recording rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Prometheus recording rule ID
     * @param RuleId Prometheus recording rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule status code. Valid values:
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
Default value: 2 (enabled). 
     * @return RuleState Rule status code. Valid values:
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
Default value: 2 (enabled).
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set Rule status code. Valid values:
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
Default value: 2 (enabled).
     * @param RuleState Rule status code. Valid values:
<li>1=RuleDeleted</li>
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
Default value: 2 (enabled).
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    public UpdateRecordingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordingRuleRequest(UpdateRecordingRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);

    }
}


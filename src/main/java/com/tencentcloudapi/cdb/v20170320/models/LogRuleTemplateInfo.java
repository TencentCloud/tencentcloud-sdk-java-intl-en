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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogRuleTemplateInfo extends AbstractModel {

    /**
    * Template ID. 
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private String RuleTemplateId;

    /**
    * Template name.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * Alarm level. Valid values: 1: Low risk; 2: Medium risk; 3: High risk. 
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private String AlarmLevel;

    /**
    * Template change status. Valid values: 0: Unchanged; 1: Changed; 2: Deleted.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("RuleTemplateStatus")
    @Expose
    private Long RuleTemplateStatus;

    /**
     * Get Template ID. 
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return RuleTemplateId Template ID. 
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Template ID. 
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param RuleTemplateId Template ID. 
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setRuleTemplateId(String RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Template name.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return RuleTemplateName Template name.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set Template name.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param RuleTemplateName Template name.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get Alarm level. Valid values: 1: Low risk; 2: Medium risk; 3: High risk. 
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return AlarmLevel Alarm level. Valid values: 1: Low risk; 2: Medium risk; 3: High risk. 
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm level. Valid values: 1: Low risk; 2: Medium risk; 3: High risk. 
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param AlarmLevel Alarm level. Valid values: 1: Low risk; 2: Medium risk; 3: High risk. 
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setAlarmLevel(String AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Template change status. Valid values: 0: Unchanged; 1: Changed; 2: Deleted.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return RuleTemplateStatus Template change status. Valid values: 0: Unchanged; 1: Changed; 2: Deleted.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public Long getRuleTemplateStatus() {
        return this.RuleTemplateStatus;
    }

    /**
     * Set Template change status. Valid values: 0: Unchanged; 1: Changed; 2: Deleted.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param RuleTemplateStatus Template change status. Valid values: 0: Unchanged; 1: Changed; 2: Deleted.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setRuleTemplateStatus(Long RuleTemplateStatus) {
        this.RuleTemplateStatus = RuleTemplateStatus;
    }

    public LogRuleTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogRuleTemplateInfo(LogRuleTemplateInfo source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new String(source.RuleTemplateId);
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new String(source.AlarmLevel);
        }
        if (source.RuleTemplateStatus != null) {
            this.RuleTemplateStatus = new Long(source.RuleTemplateStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "RuleTemplateStatus", this.RuleTemplateStatus);

    }
}


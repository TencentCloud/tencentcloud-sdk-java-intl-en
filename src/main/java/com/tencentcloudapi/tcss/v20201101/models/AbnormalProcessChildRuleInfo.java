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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessChildRuleInfo extends AbstractModel{

    /**
    * Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block.
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Sub-policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Severity. Valid values: `HIGH` (high); `MIDDLE` (medium); `LOW` (low).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleLevel")
    @Expose
    private String RuleLevel;

    /**
     * Get Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block. 
     * @return RuleMode Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block.
     */
    public String getRuleMode() {
        return this.RuleMode;
    }

    /**
     * Set Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block.
     * @param RuleMode Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block.
     */
    public void setRuleMode(String RuleMode) {
        this.RuleMode = RuleMode;
    }

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Sub-policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Sub-policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Sub-policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Sub-policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Severity. Valid values: `HIGH` (high); `MIDDLE` (medium); `LOW` (low).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleLevel Severity. Valid values: `HIGH` (high); `MIDDLE` (medium); `LOW` (low).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set Severity. Valid values: `HIGH` (high); `MIDDLE` (medium); `LOW` (low).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleLevel Severity. Valid values: `HIGH` (high); `MIDDLE` (medium); `LOW` (low).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleLevel(String RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    public AbnormalProcessChildRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessChildRuleInfo(AbnormalProcessChildRuleInfo source) {
        if (source.RuleMode != null) {
            this.RuleMode = new String(source.RuleMode);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new String(source.RuleLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);

    }
}


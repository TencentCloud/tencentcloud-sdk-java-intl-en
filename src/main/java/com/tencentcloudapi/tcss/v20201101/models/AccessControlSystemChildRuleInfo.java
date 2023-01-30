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

public class AccessControlSystemChildRuleInfo extends AbstractModel{

    /**
    * Sub-policy ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Policy mode. `RULE_MODE_RELEASE`: Allow.
   `RULE_MODE_ALERT`: Alert.
   `RULE_MODE_HOLDUP`: Block.
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * Sub-policy status. Valid values: `true` (enabled); `false` (disabled).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * Intrusion behavior type detected by the sub-policy
`CHANGE_CRONTAB`: Tampering with the scheduled task.
`CHANGE_SYS_BIN`: Tampering with the system program.
`CHANGE_USRCFG`: Tampering with user configuration.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get Sub-policy ID 
     * @return RuleId Sub-policy ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Sub-policy ID
     * @param RuleId Sub-policy ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

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
     * Get Sub-policy status. Valid values: `true` (enabled); `false` (disabled). 
     * @return IsEnable Sub-policy status. Valid values: `true` (enabled); `false` (disabled).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Sub-policy status. Valid values: `true` (enabled); `false` (disabled).
     * @param IsEnable Sub-policy status. Valid values: `true` (enabled); `false` (disabled).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get Intrusion behavior type detected by the sub-policy
`CHANGE_CRONTAB`: Tampering with the scheduled task.
`CHANGE_SYS_BIN`: Tampering with the system program.
`CHANGE_USRCFG`: Tampering with user configuration. 
     * @return RuleType Intrusion behavior type detected by the sub-policy
`CHANGE_CRONTAB`: Tampering with the scheduled task.
`CHANGE_SYS_BIN`: Tampering with the system program.
`CHANGE_USRCFG`: Tampering with user configuration.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Intrusion behavior type detected by the sub-policy
`CHANGE_CRONTAB`: Tampering with the scheduled task.
`CHANGE_SYS_BIN`: Tampering with the system program.
`CHANGE_USRCFG`: Tampering with user configuration.
     * @param RuleType Intrusion behavior type detected by the sub-policy
`CHANGE_CRONTAB`: Tampering with the scheduled task.
`CHANGE_SYS_BIN`: Tampering with the system program.
`CHANGE_USRCFG`: Tampering with user configuration.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    public AccessControlSystemChildRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlSystemChildRuleInfo(AccessControlSystemChildRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleMode != null) {
            this.RuleMode = new String(source.RuleMode);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}


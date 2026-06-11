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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleScopeInfo extends AbstractModel {

    /**
    * <p>Execution action. The blocklist rule only supports RULE_MODE_ALERT (alert) and no longer supports RULE_MODE_RELEASE/PASS (allow). To allow, use the allowlist API ModifyK8sApiAbnormalWhitelist.</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Scope.<br>System events:<br>ANONYMOUS_ACCESS: anonymous access<br>ABNORMAL_UA_REQ: abnormal UA request<br>ANONYMOUS_ABNORMAL_PERMISSION: anonymous user permission change<br>GET_CREDENTIALS: credential information acquisition<br>MOUNT_SENSITIVE_PATH: sensitive path mounting<br>COMMAND_RUN: command execution<br>PRIVILEGE_CONTAINER: privileged container<br>EXCEPTION_CRONTAB_TASK: abnormal scheduled task<br>STATICS_POD: static Pod creation<br>ABNORMAL_CREATE_POD: abnormal Pod creation<br>USER_DEFINED: user-defined</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>Whether it has been deleted.</p>
    */
    @SerializedName("IsDelete")
    @Expose
    private Boolean IsDelete;

    /**
    * <p>Threat level: HIGH, MIDDLE, LOW, and NOTICE.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Description of the rule type.</p>
    */
    @SerializedName("RuleTypeZH")
    @Expose
    private String RuleTypeZH;

    /**
    * <p>Switch status (true: on, false: off) applicable to system rules.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get <p>Execution action. The blocklist rule only supports RULE_MODE_ALERT (alert) and no longer supports RULE_MODE_RELEASE/PASS (allow). To allow, use the allowlist API ModifyK8sApiAbnormalWhitelist.</p> 
     * @return Action <p>Execution action. The blocklist rule only supports RULE_MODE_ALERT (alert) and no longer supports RULE_MODE_RELEASE/PASS (allow). To allow, use the allowlist API ModifyK8sApiAbnormalWhitelist.</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Execution action. The blocklist rule only supports RULE_MODE_ALERT (alert) and no longer supports RULE_MODE_RELEASE/PASS (allow). To allow, use the allowlist API ModifyK8sApiAbnormalWhitelist.</p>
     * @param Action <p>Execution action. The blocklist rule only supports RULE_MODE_ALERT (alert) and no longer supports RULE_MODE_RELEASE/PASS (allow). To allow, use the allowlist API ModifyK8sApiAbnormalWhitelist.</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Scope.<br>System events:<br>ANONYMOUS_ACCESS: anonymous access<br>ABNORMAL_UA_REQ: abnormal UA request<br>ANONYMOUS_ABNORMAL_PERMISSION: anonymous user permission change<br>GET_CREDENTIALS: credential information acquisition<br>MOUNT_SENSITIVE_PATH: sensitive path mounting<br>COMMAND_RUN: command execution<br>PRIVILEGE_CONTAINER: privileged container<br>EXCEPTION_CRONTAB_TASK: abnormal scheduled task<br>STATICS_POD: static Pod creation<br>ABNORMAL_CREATE_POD: abnormal Pod creation<br>USER_DEFINED: user-defined</p> 
     * @return Scope <p>Scope.<br>System events:<br>ANONYMOUS_ACCESS: anonymous access<br>ABNORMAL_UA_REQ: abnormal UA request<br>ANONYMOUS_ABNORMAL_PERMISSION: anonymous user permission change<br>GET_CREDENTIALS: credential information acquisition<br>MOUNT_SENSITIVE_PATH: sensitive path mounting<br>COMMAND_RUN: command execution<br>PRIVILEGE_CONTAINER: privileged container<br>EXCEPTION_CRONTAB_TASK: abnormal scheduled task<br>STATICS_POD: static Pod creation<br>ABNORMAL_CREATE_POD: abnormal Pod creation<br>USER_DEFINED: user-defined</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Scope.<br>System events:<br>ANONYMOUS_ACCESS: anonymous access<br>ABNORMAL_UA_REQ: abnormal UA request<br>ANONYMOUS_ABNORMAL_PERMISSION: anonymous user permission change<br>GET_CREDENTIALS: credential information acquisition<br>MOUNT_SENSITIVE_PATH: sensitive path mounting<br>COMMAND_RUN: command execution<br>PRIVILEGE_CONTAINER: privileged container<br>EXCEPTION_CRONTAB_TASK: abnormal scheduled task<br>STATICS_POD: static Pod creation<br>ABNORMAL_CREATE_POD: abnormal Pod creation<br>USER_DEFINED: user-defined</p>
     * @param Scope <p>Scope.<br>System events:<br>ANONYMOUS_ACCESS: anonymous access<br>ABNORMAL_UA_REQ: abnormal UA request<br>ANONYMOUS_ABNORMAL_PERMISSION: anonymous user permission change<br>GET_CREDENTIALS: credential information acquisition<br>MOUNT_SENSITIVE_PATH: sensitive path mounting<br>COMMAND_RUN: command execution<br>PRIVILEGE_CONTAINER: privileged container<br>EXCEPTION_CRONTAB_TASK: abnormal scheduled task<br>STATICS_POD: static Pod creation<br>ABNORMAL_CREATE_POD: abnormal Pod creation<br>USER_DEFINED: user-defined</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Whether it has been deleted.</p> 
     * @return IsDelete <p>Whether it has been deleted.</p>
     */
    public Boolean getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set <p>Whether it has been deleted.</p>
     * @param IsDelete <p>Whether it has been deleted.</p>
     */
    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get <p>Threat level: HIGH, MIDDLE, LOW, and NOTICE.</p> 
     * @return RiskLevel <p>Threat level: HIGH, MIDDLE, LOW, and NOTICE.</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Threat level: HIGH, MIDDLE, LOW, and NOTICE.</p>
     * @param RiskLevel <p>Threat level: HIGH, MIDDLE, LOW, and NOTICE.</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Description of the rule type.</p> 
     * @return RuleTypeZH <p>Description of the rule type.</p>
     */
    public String getRuleTypeZH() {
        return this.RuleTypeZH;
    }

    /**
     * Set <p>Description of the rule type.</p>
     * @param RuleTypeZH <p>Description of the rule type.</p>
     */
    public void setRuleTypeZH(String RuleTypeZH) {
        this.RuleTypeZH = RuleTypeZH;
    }

    /**
     * Get <p>Switch status (true: on, false: off) applicable to system rules.</p> 
     * @return Status <p>Switch status (true: on, false: off) applicable to system rules.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Switch status (true: on, false: off) applicable to system rules.</p>
     * @param Status <p>Switch status (true: on, false: off) applicable to system rules.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public K8sApiAbnormalRuleScopeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleScopeInfo(K8sApiAbnormalRuleScopeInfo source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Boolean(source.IsDelete);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RuleTypeZH != null) {
            this.RuleTypeZH = new String(source.RuleTypeZH);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleTypeZH", this.RuleTypeZH);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


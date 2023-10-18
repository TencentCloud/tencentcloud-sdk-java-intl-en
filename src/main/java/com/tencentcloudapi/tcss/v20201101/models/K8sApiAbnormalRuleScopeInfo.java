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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleScopeInfo extends AbstractModel {

    /**
    * Range
System event:
ANONYMOUS_ACCESS: Anonymous access
ABNORMAL_UA_REQ: Abnormal UA request
ANONYMOUS_ABNORMAL_PERMISSION: Abnormal changes on permissions of an anonymous user
GET_CREDENTIALS: Credential information acquisition
MOUNT_SENSITIVE_PATH: Sensitive path mounting
COMMAND_RUN: Command execution
PRIVILEGE_CONTAINER: Privilege container
EXCEPTION_CRONTAB_TASK: Aabnormal scheduled task
STATICS_POD: Static pod creation
ABNORMAL_CREATE_POD: Abnormal pod creation
USER_DEFINED: User defined
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Action (RULE_MODE_ALERT: Alarm RULE_MODE_RELEASE: Release)
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Threat level: "HIGH": High-risk level; "MIDDLE": Middle-risk level; "LOW": Low-risk level; "NOTICE": Notice level
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Switch status (true: On; false: Off): applicable to system rules.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Whether to delete: applicable to custom rule input parameters.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("IsDelete")
    @Expose
    private Boolean IsDelete;

    /**
     * Get Range
System event:
ANONYMOUS_ACCESS: Anonymous access
ABNORMAL_UA_REQ: Abnormal UA request
ANONYMOUS_ABNORMAL_PERMISSION: Abnormal changes on permissions of an anonymous user
GET_CREDENTIALS: Credential information acquisition
MOUNT_SENSITIVE_PATH: Sensitive path mounting
COMMAND_RUN: Command execution
PRIVILEGE_CONTAINER: Privilege container
EXCEPTION_CRONTAB_TASK: Aabnormal scheduled task
STATICS_POD: Static pod creation
ABNORMAL_CREATE_POD: Abnormal pod creation
USER_DEFINED: User defined 
     * @return Scope Range
System event:
ANONYMOUS_ACCESS: Anonymous access
ABNORMAL_UA_REQ: Abnormal UA request
ANONYMOUS_ABNORMAL_PERMISSION: Abnormal changes on permissions of an anonymous user
GET_CREDENTIALS: Credential information acquisition
MOUNT_SENSITIVE_PATH: Sensitive path mounting
COMMAND_RUN: Command execution
PRIVILEGE_CONTAINER: Privilege container
EXCEPTION_CRONTAB_TASK: Aabnormal scheduled task
STATICS_POD: Static pod creation
ABNORMAL_CREATE_POD: Abnormal pod creation
USER_DEFINED: User defined
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Range
System event:
ANONYMOUS_ACCESS: Anonymous access
ABNORMAL_UA_REQ: Abnormal UA request
ANONYMOUS_ABNORMAL_PERMISSION: Abnormal changes on permissions of an anonymous user
GET_CREDENTIALS: Credential information acquisition
MOUNT_SENSITIVE_PATH: Sensitive path mounting
COMMAND_RUN: Command execution
PRIVILEGE_CONTAINER: Privilege container
EXCEPTION_CRONTAB_TASK: Aabnormal scheduled task
STATICS_POD: Static pod creation
ABNORMAL_CREATE_POD: Abnormal pod creation
USER_DEFINED: User defined
     * @param Scope Range
System event:
ANONYMOUS_ACCESS: Anonymous access
ABNORMAL_UA_REQ: Abnormal UA request
ANONYMOUS_ABNORMAL_PERMISSION: Abnormal changes on permissions of an anonymous user
GET_CREDENTIALS: Credential information acquisition
MOUNT_SENSITIVE_PATH: Sensitive path mounting
COMMAND_RUN: Command execution
PRIVILEGE_CONTAINER: Privilege container
EXCEPTION_CRONTAB_TASK: Aabnormal scheduled task
STATICS_POD: Static pod creation
ABNORMAL_CREATE_POD: Abnormal pod creation
USER_DEFINED: User defined
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Action (RULE_MODE_ALERT: Alarm RULE_MODE_RELEASE: Release) 
     * @return Action Action (RULE_MODE_ALERT: Alarm RULE_MODE_RELEASE: Release)
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action (RULE_MODE_ALERT: Alarm RULE_MODE_RELEASE: Release)
     * @param Action Action (RULE_MODE_ALERT: Alarm RULE_MODE_RELEASE: Release)
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Threat level: "HIGH": High-risk level; "MIDDLE": Middle-risk level; "LOW": Low-risk level; "NOTICE": Notice level
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RiskLevel Threat level: "HIGH": High-risk level; "MIDDLE": Middle-risk level; "LOW": Low-risk level; "NOTICE": Notice level
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat level: "HIGH": High-risk level; "MIDDLE": Middle-risk level; "LOW": Low-risk level; "NOTICE": Notice level
Note: This field may return `null`, indicating that no valid value was found.
     * @param RiskLevel Threat level: "HIGH": High-risk level; "MIDDLE": Middle-risk level; "LOW": Low-risk level; "NOTICE": Notice level
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Switch status (true: On; false: Off): applicable to system rules.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Status Switch status (true: On; false: Off): applicable to system rules.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Switch status (true: On; false: Off): applicable to system rules.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Status Switch status (true: On; false: Off): applicable to system rules.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to delete: applicable to custom rule input parameters.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return IsDelete Whether to delete: applicable to custom rule input parameters.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set Whether to delete: applicable to custom rule input parameters.
Note: This field may return `null`, indicating that no valid value was found.
     * @param IsDelete Whether to delete: applicable to custom rule input parameters.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    public K8sApiAbnormalRuleScopeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleScopeInfo(K8sApiAbnormalRuleScopeInfo source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Boolean(source.IsDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);

    }
}


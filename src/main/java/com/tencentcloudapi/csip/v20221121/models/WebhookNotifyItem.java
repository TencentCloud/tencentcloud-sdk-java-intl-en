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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookNotifyItem extends AbstractModel {

    /**
    * <p>Module code (shares enumeration with ModifyNotifySettingAlert)<br>Enumeration values:<br>Vul: vulnerability and cloud security posture<br>Alert: alarm center<br>AkSk: Cloud API Risk Governance<br>Agent: client/host asset<br>LogAnalysis: log analysis</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>Submodule code<br>Enumeration values (partial):<br>MALWARE_FILE: MALICIOUS FILE<br>MALWARE_PROCESS: MALICIOUS PROCESS<br>RISK_LOGIN: abnormal LOGIN<br>BRUTE_FORCE: password cracking<br>MALICIOUS_REQUEST: MALICIOUS REQUEST<br>HIGH_RISK_COMMAND: HIGH-RISK COMMAND<br>PRIVILEGE_ESCALATION: local PRIVILEGE ESCALATION<br>REVERSE_SHELL: REVERSE SHELL<br>NETWORK_ATTACK: NETWORK ATTACK<br>MULTI_BEHAVIOR_ATTACK: MULTI-BEHAVIOR ATTACK<br>AGENT_OFFLINE: client OFFLINE<br>AGENT_UNINSTALL: client uninstallation<br>For the complete enumeration, see DescribeWebhookNotifyItemTree</p>
    */
    @SerializedName("SubModule")
    @Expose
    private String SubModule;

    /**
    * <p>Risk level collection<br>Enumeration values:<br>CRITICAL: Critical<br>HIGH: High risk<br>MEDIUM: Medium risk<br>LOW: Low risk<br>INFO: Notification<br>Submodules with unsupported levels pass an empty array</p>
    */
    @SerializedName("Levels")
    @Expose
    private String [] Levels;

    /**
    * <p>Processing status</p>
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
     * Get <p>Module code (shares enumeration with ModifyNotifySettingAlert)<br>Enumeration values:<br>Vul: vulnerability and cloud security posture<br>Alert: alarm center<br>AkSk: Cloud API Risk Governance<br>Agent: client/host asset<br>LogAnalysis: log analysis</p> 
     * @return Module <p>Module code (shares enumeration with ModifyNotifySettingAlert)<br>Enumeration values:<br>Vul: vulnerability and cloud security posture<br>Alert: alarm center<br>AkSk: Cloud API Risk Governance<br>Agent: client/host asset<br>LogAnalysis: log analysis</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>Module code (shares enumeration with ModifyNotifySettingAlert)<br>Enumeration values:<br>Vul: vulnerability and cloud security posture<br>Alert: alarm center<br>AkSk: Cloud API Risk Governance<br>Agent: client/host asset<br>LogAnalysis: log analysis</p>
     * @param Module <p>Module code (shares enumeration with ModifyNotifySettingAlert)<br>Enumeration values:<br>Vul: vulnerability and cloud security posture<br>Alert: alarm center<br>AkSk: Cloud API Risk Governance<br>Agent: client/host asset<br>LogAnalysis: log analysis</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>Submodule code<br>Enumeration values (partial):<br>MALWARE_FILE: MALICIOUS FILE<br>MALWARE_PROCESS: MALICIOUS PROCESS<br>RISK_LOGIN: abnormal LOGIN<br>BRUTE_FORCE: password cracking<br>MALICIOUS_REQUEST: MALICIOUS REQUEST<br>HIGH_RISK_COMMAND: HIGH-RISK COMMAND<br>PRIVILEGE_ESCALATION: local PRIVILEGE ESCALATION<br>REVERSE_SHELL: REVERSE SHELL<br>NETWORK_ATTACK: NETWORK ATTACK<br>MULTI_BEHAVIOR_ATTACK: MULTI-BEHAVIOR ATTACK<br>AGENT_OFFLINE: client OFFLINE<br>AGENT_UNINSTALL: client uninstallation<br>For the complete enumeration, see DescribeWebhookNotifyItemTree</p> 
     * @return SubModule <p>Submodule code<br>Enumeration values (partial):<br>MALWARE_FILE: MALICIOUS FILE<br>MALWARE_PROCESS: MALICIOUS PROCESS<br>RISK_LOGIN: abnormal LOGIN<br>BRUTE_FORCE: password cracking<br>MALICIOUS_REQUEST: MALICIOUS REQUEST<br>HIGH_RISK_COMMAND: HIGH-RISK COMMAND<br>PRIVILEGE_ESCALATION: local PRIVILEGE ESCALATION<br>REVERSE_SHELL: REVERSE SHELL<br>NETWORK_ATTACK: NETWORK ATTACK<br>MULTI_BEHAVIOR_ATTACK: MULTI-BEHAVIOR ATTACK<br>AGENT_OFFLINE: client OFFLINE<br>AGENT_UNINSTALL: client uninstallation<br>For the complete enumeration, see DescribeWebhookNotifyItemTree</p>
     */
    public String getSubModule() {
        return this.SubModule;
    }

    /**
     * Set <p>Submodule code<br>Enumeration values (partial):<br>MALWARE_FILE: MALICIOUS FILE<br>MALWARE_PROCESS: MALICIOUS PROCESS<br>RISK_LOGIN: abnormal LOGIN<br>BRUTE_FORCE: password cracking<br>MALICIOUS_REQUEST: MALICIOUS REQUEST<br>HIGH_RISK_COMMAND: HIGH-RISK COMMAND<br>PRIVILEGE_ESCALATION: local PRIVILEGE ESCALATION<br>REVERSE_SHELL: REVERSE SHELL<br>NETWORK_ATTACK: NETWORK ATTACK<br>MULTI_BEHAVIOR_ATTACK: MULTI-BEHAVIOR ATTACK<br>AGENT_OFFLINE: client OFFLINE<br>AGENT_UNINSTALL: client uninstallation<br>For the complete enumeration, see DescribeWebhookNotifyItemTree</p>
     * @param SubModule <p>Submodule code<br>Enumeration values (partial):<br>MALWARE_FILE: MALICIOUS FILE<br>MALWARE_PROCESS: MALICIOUS PROCESS<br>RISK_LOGIN: abnormal LOGIN<br>BRUTE_FORCE: password cracking<br>MALICIOUS_REQUEST: MALICIOUS REQUEST<br>HIGH_RISK_COMMAND: HIGH-RISK COMMAND<br>PRIVILEGE_ESCALATION: local PRIVILEGE ESCALATION<br>REVERSE_SHELL: REVERSE SHELL<br>NETWORK_ATTACK: NETWORK ATTACK<br>MULTI_BEHAVIOR_ATTACK: MULTI-BEHAVIOR ATTACK<br>AGENT_OFFLINE: client OFFLINE<br>AGENT_UNINSTALL: client uninstallation<br>For the complete enumeration, see DescribeWebhookNotifyItemTree</p>
     */
    public void setSubModule(String SubModule) {
        this.SubModule = SubModule;
    }

    /**
     * Get <p>Risk level collection<br>Enumeration values:<br>CRITICAL: Critical<br>HIGH: High risk<br>MEDIUM: Medium risk<br>LOW: Low risk<br>INFO: Notification<br>Submodules with unsupported levels pass an empty array</p> 
     * @return Levels <p>Risk level collection<br>Enumeration values:<br>CRITICAL: Critical<br>HIGH: High risk<br>MEDIUM: Medium risk<br>LOW: Low risk<br>INFO: Notification<br>Submodules with unsupported levels pass an empty array</p>
     */
    public String [] getLevels() {
        return this.Levels;
    }

    /**
     * Set <p>Risk level collection<br>Enumeration values:<br>CRITICAL: Critical<br>HIGH: High risk<br>MEDIUM: Medium risk<br>LOW: Low risk<br>INFO: Notification<br>Submodules with unsupported levels pass an empty array</p>
     * @param Levels <p>Risk level collection<br>Enumeration values:<br>CRITICAL: Critical<br>HIGH: High risk<br>MEDIUM: Medium risk<br>LOW: Low risk<br>INFO: Notification<br>Submodules with unsupported levels pass an empty array</p>
     */
    public void setLevels(String [] Levels) {
        this.Levels = Levels;
    }

    /**
     * Get <p>Processing status</p> 
     * @return Items <p>Processing status</p>
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>Processing status</p>
     * @param Items <p>Processing status</p>
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    public WebhookNotifyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookNotifyItem(WebhookNotifyItem source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.SubModule != null) {
            this.SubModule = new String(source.SubModule);
        }
        if (source.Levels != null) {
            this.Levels = new String[source.Levels.length];
            for (int i = 0; i < source.Levels.length; i++) {
                this.Levels[i] = new String(source.Levels[i]);
            }
        }
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "SubModule", this.SubModule);
        this.setParamArraySimple(map, prefix + "Levels.", this.Levels);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);

    }
}


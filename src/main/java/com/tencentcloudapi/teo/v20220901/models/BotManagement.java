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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagement extends AbstractModel {

    /**
    * Whether Bot management is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Custom rule for Bot management combines various types of crawlers and request behavior characteristics to precisely define bots and configure customized handling methods.
    */
    @SerializedName("CustomRules")
    @Expose
    private BotManagementCustomRules CustomRules;

    /**
    * Basic configuration of Bot management, which takes effect on all domains associated with the policy. It can be customized through CustomRules.
    */
    @SerializedName("BasicBotSettings")
    @Expose
    private BasicBotSettings BasicBotSettings;

    /**
    * Definition list of client authentication rules. This feature is in beta test. If needed, submit a ticket.
    */
    @SerializedName("ClientAttestationRules")
    @Expose
    private ClientAttestationRules ClientAttestationRules;

    /**
    * Configure browser spoofing identification rules (formerly active feature detection rules). Set the response page range for JavaScript injection, browser check options, and handling method for non-browser clients.
    */
    @SerializedName("BrowserImpersonationDetection")
    @Expose
    private BrowserImpersonationDetection BrowserImpersonationDetection;

    /**
     * Get Whether Bot management is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li> 
     * @return Enabled Whether Bot management is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether Bot management is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     * @param Enabled Whether Bot management is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Custom rule for Bot management combines various types of crawlers and request behavior characteristics to precisely define bots and configure customized handling methods. 
     * @return CustomRules Custom rule for Bot management combines various types of crawlers and request behavior characteristics to precisely define bots and configure customized handling methods.
     */
    public BotManagementCustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set Custom rule for Bot management combines various types of crawlers and request behavior characteristics to precisely define bots and configure customized handling methods.
     * @param CustomRules Custom rule for Bot management combines various types of crawlers and request behavior characteristics to precisely define bots and configure customized handling methods.
     */
    public void setCustomRules(BotManagementCustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get Basic configuration of Bot management, which takes effect on all domains associated with the policy. It can be customized through CustomRules. 
     * @return BasicBotSettings Basic configuration of Bot management, which takes effect on all domains associated with the policy. It can be customized through CustomRules.
     */
    public BasicBotSettings getBasicBotSettings() {
        return this.BasicBotSettings;
    }

    /**
     * Set Basic configuration of Bot management, which takes effect on all domains associated with the policy. It can be customized through CustomRules.
     * @param BasicBotSettings Basic configuration of Bot management, which takes effect on all domains associated with the policy. It can be customized through CustomRules.
     */
    public void setBasicBotSettings(BasicBotSettings BasicBotSettings) {
        this.BasicBotSettings = BasicBotSettings;
    }

    /**
     * Get Definition list of client authentication rules. This feature is in beta test. If needed, submit a ticket. 
     * @return ClientAttestationRules Definition list of client authentication rules. This feature is in beta test. If needed, submit a ticket.
     */
    public ClientAttestationRules getClientAttestationRules() {
        return this.ClientAttestationRules;
    }

    /**
     * Set Definition list of client authentication rules. This feature is in beta test. If needed, submit a ticket.
     * @param ClientAttestationRules Definition list of client authentication rules. This feature is in beta test. If needed, submit a ticket.
     */
    public void setClientAttestationRules(ClientAttestationRules ClientAttestationRules) {
        this.ClientAttestationRules = ClientAttestationRules;
    }

    /**
     * Get Configure browser spoofing identification rules (formerly active feature detection rules). Set the response page range for JavaScript injection, browser check options, and handling method for non-browser clients. 
     * @return BrowserImpersonationDetection Configure browser spoofing identification rules (formerly active feature detection rules). Set the response page range for JavaScript injection, browser check options, and handling method for non-browser clients.
     */
    public BrowserImpersonationDetection getBrowserImpersonationDetection() {
        return this.BrowserImpersonationDetection;
    }

    /**
     * Set Configure browser spoofing identification rules (formerly active feature detection rules). Set the response page range for JavaScript injection, browser check options, and handling method for non-browser clients.
     * @param BrowserImpersonationDetection Configure browser spoofing identification rules (formerly active feature detection rules). Set the response page range for JavaScript injection, browser check options, and handling method for non-browser clients.
     */
    public void setBrowserImpersonationDetection(BrowserImpersonationDetection BrowserImpersonationDetection) {
        this.BrowserImpersonationDetection = BrowserImpersonationDetection;
    }

    public BotManagement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagement(BotManagement source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.CustomRules != null) {
            this.CustomRules = new BotManagementCustomRules(source.CustomRules);
        }
        if (source.BasicBotSettings != null) {
            this.BasicBotSettings = new BasicBotSettings(source.BasicBotSettings);
        }
        if (source.ClientAttestationRules != null) {
            this.ClientAttestationRules = new ClientAttestationRules(source.ClientAttestationRules);
        }
        if (source.BrowserImpersonationDetection != null) {
            this.BrowserImpersonationDetection = new BrowserImpersonationDetection(source.BrowserImpersonationDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamObj(map, prefix + "BasicBotSettings.", this.BasicBotSettings);
        this.setParamObj(map, prefix + "ClientAttestationRules.", this.ClientAttestationRules);
        this.setParamObj(map, prefix + "BrowserImpersonationDetection.", this.BrowserImpersonationDetection);

    }
}


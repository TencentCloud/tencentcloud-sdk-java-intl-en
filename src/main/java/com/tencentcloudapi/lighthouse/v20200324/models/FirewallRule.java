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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallRule extends AbstractModel {

    /**
    * Protocol. Valid values: TCP, UDP, ICMP, ALL.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port. Valid values: ALL, one single port, multiple ports separated by commas, or port range indicated by a minus sign
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IP range or IP (mutually exclusive). Default value: 0.0.0.0/0, which indicates all sources.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Valid values: ACCEPT, DROP. Default value: ACCEPT.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Firewall rule description.
    */
    @SerializedName("FirewallRuleDescription")
    @Expose
    private String FirewallRuleDescription;

    /**
     * Get Protocol. Valid values: TCP, UDP, ICMP, ALL. 
     * @return Protocol Protocol. Valid values: TCP, UDP, ICMP, ALL.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: TCP, UDP, ICMP, ALL.
     * @param Protocol Protocol. Valid values: TCP, UDP, ICMP, ALL.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port. Valid values: ALL, one single port, multiple ports separated by commas, or port range indicated by a minus sign 
     * @return Port Port. Valid values: ALL, one single port, multiple ports separated by commas, or port range indicated by a minus sign
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port. Valid values: ALL, one single port, multiple ports separated by commas, or port range indicated by a minus sign
     * @param Port Port. Valid values: ALL, one single port, multiple ports separated by commas, or port range indicated by a minus sign
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IP range or IP (mutually exclusive). Default value: 0.0.0.0/0, which indicates all sources. 
     * @return CidrBlock IP range or IP (mutually exclusive). Default value: 0.0.0.0/0, which indicates all sources.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set IP range or IP (mutually exclusive). Default value: 0.0.0.0/0, which indicates all sources.
     * @param CidrBlock IP range or IP (mutually exclusive). Default value: 0.0.0.0/0, which indicates all sources.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Valid values: ACCEPT, DROP. Default value: ACCEPT. 
     * @return Action Valid values: ACCEPT, DROP. Default value: ACCEPT.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Valid values: ACCEPT, DROP. Default value: ACCEPT.
     * @param Action Valid values: ACCEPT, DROP. Default value: ACCEPT.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Firewall rule description. 
     * @return FirewallRuleDescription Firewall rule description.
     */
    public String getFirewallRuleDescription() {
        return this.FirewallRuleDescription;
    }

    /**
     * Set Firewall rule description.
     * @param FirewallRuleDescription Firewall rule description.
     */
    public void setFirewallRuleDescription(String FirewallRuleDescription) {
        this.FirewallRuleDescription = FirewallRuleDescription;
    }

    public FirewallRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallRule(FirewallRule source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.FirewallRuleDescription != null) {
            this.FirewallRuleDescription = new String(source.FirewallRuleDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FirewallRuleDescription", this.FirewallRuleDescription);

    }
}


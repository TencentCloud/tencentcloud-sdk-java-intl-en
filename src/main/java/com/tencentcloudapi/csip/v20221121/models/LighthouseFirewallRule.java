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

public class LighthouseFirewallRule extends AbstractModel {

    /**
    * <p>Application type.</p>
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * <p>Protocol</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Port</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>Address</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>ipv6 address</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Description.</p>
    */
    @SerializedName("FirewallRuleDescription")
    @Expose
    private String FirewallRuleDescription;

    /**
     * Get <p>Application type.</p> 
     * @return AppType <p>Application type.</p>
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>Application type.</p>
     * @param AppType <p>Application type.</p>
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>Protocol</p> 
     * @return Protocol <p>Protocol</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Protocol</p>
     * @param Protocol <p>Protocol</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Port</p> 
     * @return Port <p>Port</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port</p>
     * @param Port <p>Port</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Address</p> 
     * @return CidrBlock <p>Address</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>Address</p>
     * @param CidrBlock <p>Address</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>ipv6 address</p> 
     * @return Ipv6CidrBlock <p>ipv6 address</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>ipv6 address</p>
     * @param Ipv6CidrBlock <p>ipv6 address</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>Status.</p> 
     * @return Action <p>Status.</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Status.</p>
     * @param Action <p>Status.</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Description.</p> 
     * @return FirewallRuleDescription <p>Description.</p>
     */
    public String getFirewallRuleDescription() {
        return this.FirewallRuleDescription;
    }

    /**
     * Set <p>Description.</p>
     * @param FirewallRuleDescription <p>Description.</p>
     */
    public void setFirewallRuleDescription(String FirewallRuleDescription) {
        this.FirewallRuleDescription = FirewallRuleDescription;
    }

    public LighthouseFirewallRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LighthouseFirewallRule(LighthouseFirewallRule source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
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
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FirewallRuleDescription", this.FirewallRuleDescription);

    }
}


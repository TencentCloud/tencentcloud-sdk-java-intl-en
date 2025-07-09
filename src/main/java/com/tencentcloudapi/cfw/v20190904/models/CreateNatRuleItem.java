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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNatRuleItem extends AbstractModel {

    /**
    * Access source. Example: `net: IP/CIDR(192.168.0.2)`
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Access source type. Values for inbound rules: `ip`, `net`, `template`, and `location`. Values for outbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Access target. Example: `net: IP/CIDR(192.168.0.2); domain: domain name rule, e.g., *.qq.com
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * Access target type. Values for inbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. Values for outbound rules: `ip`, `net`, `domain`, `template`, and `location`.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Protocol. Values: `TCP`, `UDP`, `ICMP`, `ANY`, `HTTP`, `HTTPS`, `HTTP/HTTPS`, `SMTP`, `SMTPS`, `SMTP/SMTPS`, `FTP`, and `DNS`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Specify how the CFW instance deals with the traffic hit the access control rule. Values: `accept` (allow), `drop` (reject), and `log` (observe).
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * The port of the access control rule. Values: `-1/-1` (all ports) and `80` (Port 80)
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Rule direction. Values: `1` (Inbound) and `0` (Outbound)
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Rule sequence number
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Rule status. `true` (Enabled); `false` (Disabled)
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * The unique ID of the rule, which is not required when you create a rule.
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Access source. Example: `net: IP/CIDR(192.168.0.2)` 
     * @return SourceContent Access source. Example: `net: IP/CIDR(192.168.0.2)`
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Access source. Example: `net: IP/CIDR(192.168.0.2)`
     * @param SourceContent Access source. Example: `net: IP/CIDR(192.168.0.2)`
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Access source type. Values for inbound rules: `ip`, `net`, `template`, and `location`. Values for outbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. 
     * @return SourceType Access source type. Values for inbound rules: `ip`, `net`, `template`, and `location`. Values for outbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. Values for inbound rules: `ip`, `net`, `template`, and `location`. Values for outbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`.
     * @param SourceType Access source type. Values for inbound rules: `ip`, `net`, `template`, and `location`. Values for outbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Access target. Example: `net: IP/CIDR(192.168.0.2); domain: domain name rule, e.g., *.qq.com 
     * @return TargetContent Access target. Example: `net: IP/CIDR(192.168.0.2); domain: domain name rule, e.g., *.qq.com
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set Access target. Example: `net: IP/CIDR(192.168.0.2); domain: domain name rule, e.g., *.qq.com
     * @param TargetContent Access target. Example: `net: IP/CIDR(192.168.0.2); domain: domain name rule, e.g., *.qq.com
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get Access target type. Values for inbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. Values for outbound rules: `ip`, `net`, `domain`, `template`, and `location`. 
     * @return TargetType Access target type. Values for inbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. Values for outbound rules: `ip`, `net`, `domain`, `template`, and `location`.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Access target type. Values for inbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. Values for outbound rules: `ip`, `net`, `domain`, `template`, and `location`.
     * @param TargetType Access target type. Values for inbound rules: `ip`, `net`, `template`, `instance`, `group`, and `tag`. Values for outbound rules: `ip`, `net`, `domain`, `template`, and `location`.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Protocol. Values: `TCP`, `UDP`, `ICMP`, `ANY`, `HTTP`, `HTTPS`, `HTTP/HTTPS`, `SMTP`, `SMTPS`, `SMTP/SMTPS`, `FTP`, and `DNS`. 
     * @return Protocol Protocol. Values: `TCP`, `UDP`, `ICMP`, `ANY`, `HTTP`, `HTTPS`, `HTTP/HTTPS`, `SMTP`, `SMTPS`, `SMTP/SMTPS`, `FTP`, and `DNS`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Values: `TCP`, `UDP`, `ICMP`, `ANY`, `HTTP`, `HTTPS`, `HTTP/HTTPS`, `SMTP`, `SMTPS`, `SMTP/SMTPS`, `FTP`, and `DNS`.
     * @param Protocol Protocol. Values: `TCP`, `UDP`, `ICMP`, `ANY`, `HTTP`, `HTTPS`, `HTTP/HTTPS`, `SMTP`, `SMTPS`, `SMTP/SMTPS`, `FTP`, and `DNS`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Specify how the CFW instance deals with the traffic hit the access control rule. Values: `accept` (allow), `drop` (reject), and `log` (observe). 
     * @return RuleAction Specify how the CFW instance deals with the traffic hit the access control rule. Values: `accept` (allow), `drop` (reject), and `log` (observe).
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Specify how the CFW instance deals with the traffic hit the access control rule. Values: `accept` (allow), `drop` (reject), and `log` (observe).
     * @param RuleAction Specify how the CFW instance deals with the traffic hit the access control rule. Values: `accept` (allow), `drop` (reject), and `log` (observe).
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get The port of the access control rule. Values: `-1/-1` (all ports) and `80` (Port 80) 
     * @return Port The port of the access control rule. Values: `-1/-1` (all ports) and `80` (Port 80)
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set The port of the access control rule. Values: `-1/-1` (all ports) and `80` (Port 80)
     * @param Port The port of the access control rule. Values: `-1/-1` (all ports) and `80` (Port 80)
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Rule direction. Values: `1` (Inbound) and `0` (Outbound) 
     * @return Direction Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     * @param Direction Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Rule sequence number 
     * @return OrderIndex Rule sequence number
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Rule sequence number
     * @param OrderIndex Rule sequence number
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Rule status. `true` (Enabled); `false` (Disabled) 
     * @return Enable Rule status. `true` (Enabled); `false` (Disabled)
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Rule status. `true` (Enabled); `false` (Disabled)
     * @param Enable Rule status. `true` (Enabled); `false` (Disabled)
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get The unique ID of the rule, which is not required when you create a rule. 
     * @return Uuid The unique ID of the rule, which is not required when you create a rule.
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set The unique ID of the rule, which is not required when you create a rule.
     * @param Uuid The unique ID of the rule, which is not required when you create a rule.
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateNatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatRuleItem(CreateNatRuleItem source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAcRuleRequest extends AbstractModel {

    /**
    * -1: lowest priority; 1: highest priority
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
log: observe
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * The traffic direction for access control rules. Valid values:
in: incoming traffic access control
out: outgoing traffic access control
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * The description of access control rules.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The type of source address in access control rules. Valid values:
net: source IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * The source address in the access control policy. 
When `SourceType` is `net`, `SourceContent` is the source IP or CIDR block.
For example: 1.1.1.0/24

When `SourceType` is `template`, `SourceContent` must be the source address template ID.

When `SourceType` is `location`, `SourceContent` is the source region. 
For example, ["BJ11", "ZB"]

When `SourceType` is `instance`, `SourceContent` is the public IP of the instance.
For example, ins-xxxxx

When `SourceType` is `vendor`, `SourceContent` is the cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * The type of destination address in access control rules. Valid values:
net: destination IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
domain: Domain name or IP.
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * The destination address in the access control policy. 
When `DestType` is `net`, `DestContent` is the destination IP or CIDR block.
For example: 1.1.1.0/24

When `DestType` is `template`, `DestContent` is the destination address template ID.

When `DestType` is `location`, `DestContent` is the destination region. 
For example, ["BJ11", "ZB"]

When `DestType` is `instance`, `DestContent` is the public IP of the instance.
For example, ins-xxxxx

When `DestType` is `domain`, `DestContent` is the domain name associated with the instance.
For example, *.qq.com

When `DestType`, `DestContent` is the selected cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * The port to apply access control rules. Valid values:
-1/-1: all ports
80,443: 80 or 443
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * The protocol type of traffic in access control rules. Valid value: TCP. Only TCP is supported for edge firewall rules. If this parameter is not specified, it defaults to TCP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The Layer 7 protocol. Valid values:
HTTP/HTTPS
TLS/SSL
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
     * Get -1: lowest priority; 1: highest priority 
     * @return OrderIndex -1: lowest priority; 1: highest priority
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set -1: lowest priority; 1: highest priority
     * @param OrderIndex -1: lowest priority; 1: highest priority
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
log: observe 
     * @return RuleAction The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
log: observe
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
log: observe
     * @param RuleAction The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
log: observe
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get The traffic direction for access control rules. Valid values:
in: incoming traffic access control
out: outgoing traffic access control 
     * @return Direction The traffic direction for access control rules. Valid values:
in: incoming traffic access control
out: outgoing traffic access control
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set The traffic direction for access control rules. Valid values:
in: incoming traffic access control
out: outgoing traffic access control
     * @param Direction The traffic direction for access control rules. Valid values:
in: incoming traffic access control
out: outgoing traffic access control
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get The description of access control rules. 
     * @return Description The description of access control rules.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of access control rules.
     * @param Description The description of access control rules.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The type of source address in access control rules. Valid values:
net: source IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor 
     * @return SourceType The type of source address in access control rules. Valid values:
net: source IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set The type of source address in access control rules. Valid values:
net: source IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
     * @param SourceType The type of source address in access control rules. Valid values:
net: source IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get The source address in the access control policy. 
When `SourceType` is `net`, `SourceContent` is the source IP or CIDR block.
For example: 1.1.1.0/24

When `SourceType` is `template`, `SourceContent` must be the source address template ID.

When `SourceType` is `location`, `SourceContent` is the source region. 
For example, ["BJ11", "ZB"]

When `SourceType` is `instance`, `SourceContent` is the public IP of the instance.
For example, ins-xxxxx

When `SourceType` is `vendor`, `SourceContent` is the cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`.  
     * @return SourceContent The source address in the access control policy. 
When `SourceType` is `net`, `SourceContent` is the source IP or CIDR block.
For example: 1.1.1.0/24

When `SourceType` is `template`, `SourceContent` must be the source address template ID.

When `SourceType` is `location`, `SourceContent` is the source region. 
For example, ["BJ11", "ZB"]

When `SourceType` is `instance`, `SourceContent` is the public IP of the instance.
For example, ins-xxxxx

When `SourceType` is `vendor`, `SourceContent` is the cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set The source address in the access control policy. 
When `SourceType` is `net`, `SourceContent` is the source IP or CIDR block.
For example: 1.1.1.0/24

When `SourceType` is `template`, `SourceContent` must be the source address template ID.

When `SourceType` is `location`, `SourceContent` is the source region. 
For example, ["BJ11", "ZB"]

When `SourceType` is `instance`, `SourceContent` is the public IP of the instance.
For example, ins-xxxxx

When `SourceType` is `vendor`, `SourceContent` is the cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     * @param SourceContent The source address in the access control policy. 
When `SourceType` is `net`, `SourceContent` is the source IP or CIDR block.
For example: 1.1.1.0/24

When `SourceType` is `template`, `SourceContent` must be the source address template ID.

When `SourceType` is `location`, `SourceContent` is the source region. 
For example, ["BJ11", "ZB"]

When `SourceType` is `instance`, `SourceContent` is the public IP of the instance.
For example, ins-xxxxx

When `SourceType` is `vendor`, `SourceContent` is the cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get The type of destination address in access control rules. Valid values:
net: destination IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
domain: Domain name or IP. 
     * @return DestType The type of destination address in access control rules. Valid values:
net: destination IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
domain: Domain name or IP.
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set The type of destination address in access control rules. Valid values:
net: destination IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
domain: Domain name or IP.
     * @param DestType The type of destination address in access control rules. Valid values:
net: destination IP or range (IP or CIDR)
location: source region
template: CFW address template
instance: instance ID
vendor: Cloud vendor
domain: Domain name or IP.
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get The destination address in the access control policy. 
When `DestType` is `net`, `DestContent` is the destination IP or CIDR block.
For example: 1.1.1.0/24

When `DestType` is `template`, `DestContent` is the destination address template ID.

When `DestType` is `location`, `DestContent` is the destination region. 
For example, ["BJ11", "ZB"]

When `DestType` is `instance`, `DestContent` is the public IP of the instance.
For example, ins-xxxxx

When `DestType` is `domain`, `DestContent` is the domain name associated with the instance.
For example, *.qq.com

When `DestType`, `DestContent` is the selected cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`.  
     * @return DestContent The destination address in the access control policy. 
When `DestType` is `net`, `DestContent` is the destination IP or CIDR block.
For example: 1.1.1.0/24

When `DestType` is `template`, `DestContent` is the destination address template ID.

When `DestType` is `location`, `DestContent` is the destination region. 
For example, ["BJ11", "ZB"]

When `DestType` is `instance`, `DestContent` is the public IP of the instance.
For example, ins-xxxxx

When `DestType` is `domain`, `DestContent` is the domain name associated with the instance.
For example, *.qq.com

When `DestType`, `DestContent` is the selected cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set The destination address in the access control policy. 
When `DestType` is `net`, `DestContent` is the destination IP or CIDR block.
For example: 1.1.1.0/24

When `DestType` is `template`, `DestContent` is the destination address template ID.

When `DestType` is `location`, `DestContent` is the destination region. 
For example, ["BJ11", "ZB"]

When `DestType` is `instance`, `DestContent` is the public IP of the instance.
For example, ins-xxxxx

When `DestType` is `domain`, `DestContent` is the domain name associated with the instance.
For example, *.qq.com

When `DestType`, `DestContent` is the selected cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     * @param DestContent The destination address in the access control policy. 
When `DestType` is `net`, `DestContent` is the destination IP or CIDR block.
For example: 1.1.1.0/24

When `DestType` is `template`, `DestContent` is the destination address template ID.

When `DestType` is `location`, `DestContent` is the destination region. 
For example, ["BJ11", "ZB"]

When `DestType` is `instance`, `DestContent` is the public IP of the instance.
For example, ins-xxxxx

When `DestType` is `domain`, `DestContent` is the domain name associated with the instance.
For example, *.qq.com

When `DestType`, `DestContent` is the selected cloud service provider.
Values: `aws`, `huawei`, `tencent`, `aliyun`, `azure` and `all`. 
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get The port to apply access control rules. Valid values:
-1/-1: all ports
80,443: 80 or 443 
     * @return Port The port to apply access control rules. Valid values:
-1/-1: all ports
80,443: 80 or 443
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set The port to apply access control rules. Valid values:
-1/-1: all ports
80,443: 80 or 443
     * @param Port The port to apply access control rules. Valid values:
-1/-1: all ports
80,443: 80 or 443
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get The protocol type of traffic in access control rules. Valid value: TCP. Only TCP is supported for edge firewall rules. If this parameter is not specified, it defaults to TCP. 
     * @return Protocol The protocol type of traffic in access control rules. Valid value: TCP. Only TCP is supported for edge firewall rules. If this parameter is not specified, it defaults to TCP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type of traffic in access control rules. Valid value: TCP. Only TCP is supported for edge firewall rules. If this parameter is not specified, it defaults to TCP.
     * @param Protocol The protocol type of traffic in access control rules. Valid value: TCP. Only TCP is supported for edge firewall rules. If this parameter is not specified, it defaults to TCP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The Layer 7 protocol. Valid values:
HTTP/HTTPS
TLS/SSL 
     * @return ApplicationName The Layer 7 protocol. Valid values:
HTTP/HTTPS
TLS/SSL
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set The Layer 7 protocol. Valid values:
HTTP/HTTPS
TLS/SSL
     * @param ApplicationName The Layer 7 protocol. Valid values:
HTTP/HTTPS
TLS/SSL
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable 
     * @return Enable Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable
     * @param Enable Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    public AddAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAcRuleRequest(AddAcRuleRequest source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new String(source.OrderIndex);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}


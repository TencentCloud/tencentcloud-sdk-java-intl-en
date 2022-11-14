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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupRule extends AbstractModel{

    /**
    * Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Access source type. Valid values: net|template|instance|resourcegroup|tag|region
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * Access destination type. Valid values: net|template|instance|resourcegroup|tag|region
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule priority. -1: lowest; 1: highest
    */
    @SerializedName("OrderIndex")
    @Expose
    private String OrderIndex;

    /**
    * Protocol. TCP/UDP/ICMP/ANY
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * The unique ID of the rule
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Rule status. true: enabled; false: disabled
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
     * Get Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou) 
     * @return SourceContent Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     * @param SourceContent Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Access source type. Valid values: net|template|instance|resourcegroup|tag|region 
     * @return SourceType Access source type. Valid values: net|template|instance|resourcegroup|tag|region
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type. Valid values: net|template|instance|resourcegroup|tag|region
     * @param SourceType Access source type. Valid values: net|template|instance|resourcegroup|tag|region
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou) 
     * @return DestContent Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     * @param DestContent Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get Access destination type. Valid values: net|template|instance|resourcegroup|tag|region 
     * @return DestType Access destination type. Valid values: net|template|instance|resourcegroup|tag|region
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set Access destination type. Valid values: net|template|instance|resourcegroup|tag|region
     * @param DestType Access destination type. Valid values: net|template|instance|resourcegroup|tag|region
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny 
     * @return RuleAction The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
     * @param RuleAction The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
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

    /**
     * Get Rule priority. -1: lowest; 1: highest 
     * @return OrderIndex Rule priority. -1: lowest; 1: highest
     */
    public String getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Rule priority. -1: lowest; 1: highest
     * @param OrderIndex Rule priority. -1: lowest; 1: highest
     */
    public void setOrderIndex(String OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Protocol. TCP/UDP/ICMP/ANY
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Protocol Protocol. TCP/UDP/ICMP/ANY
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. TCP/UDP/ICMP/ANY
Note: This field may return `null`, indicating that no valid value was found.
     * @param Protocol Protocol. TCP/UDP/ICMP/ANY
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Port The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
Note: This field may return `null`, indicating that no valid value was found.
     * @param Port The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ServiceTemplateId Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
Note: This field may return `null`, indicating that no valid value was found.
     * @param ServiceTemplateId Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get The unique ID of the rule 
     * @return Id The unique ID of the rule
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The unique ID of the rule
     * @param Id The unique ID of the rule
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Rule status. true: enabled; false: disabled 
     * @return Enable Rule status. true: enabled; false: disabled
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Rule status. true: enabled; false: disabled
     * @param Enable Rule status. true: enabled; false: disabled
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    public SecurityGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRule(SecurityGroupRule source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new String(source.OrderIndex);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}


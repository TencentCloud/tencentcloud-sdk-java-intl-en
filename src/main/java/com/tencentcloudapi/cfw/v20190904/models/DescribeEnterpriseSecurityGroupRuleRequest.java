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

public class DescribeEnterpriseSecurityGroupRuleRequest extends AbstractModel {

    /**
    * Page number of the current page displayed for query by page number.

1 by default.
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
    * Maximum number of entries per page displayed for query by page number.

Maximum value: 50.
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * Rule description. Wildcards are supported.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The action that Cloud Firewall performs on the traffic. Valid values:
accept: allow
drop: deny
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Indicates whether to enable the rules. Default: enable. Valid values:
true: enable; false: disable
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol. TCP/UDP/ICMP/ANY
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
     * Get Page number of the current page displayed for query by page number.

1 by default. 
     * @return PageNo Page number of the current page displayed for query by page number.

1 by default.
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number of the current page displayed for query by page number.

1 by default.
     * @param PageNo Page number of the current page displayed for query by page number.

1 by default.
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Maximum number of entries per page displayed for query by page number.

Maximum value: 50. 
     * @return PageSize Maximum number of entries per page displayed for query by page number.

Maximum value: 50.
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Maximum number of entries per page displayed for query by page number.

Maximum value: 50.
     * @param PageSize Maximum number of entries per page displayed for query by page number.

Maximum value: 50.
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported. 
     * @return SourceContent Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
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
Wildcards are supported.
     * @param SourceContent Source example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported. 
     * @return DestContent Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
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
Wildcards are supported.
     * @param DestContent Destination example:
net: IP/CIDR (192.168.0.2)
template: parameter template (ipm-dyodhpby)
instance: asset instance (ins-123456)
resourcegroup: asset group (/all groups/group 1/subgroup 1)
tag: resource tag ({"Key":"tag key","Value":"tag value"})
region: region (ap-gaungzhou)
Wildcards are supported.
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get Rule description. Wildcards are supported. 
     * @return Description Rule description. Wildcards are supported.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description. Wildcards are supported.
     * @param Description Rule description. Wildcards are supported.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * Get The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80 
     * @return Port The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
     * @param Port The port to apply access control rules. Valid values:
-1/-1: all ports
80: port 80
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol. TCP/UDP/ICMP/ANY 
     * @return Protocol Protocol. TCP/UDP/ICMP/ANY
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. TCP/UDP/ICMP/ANY
     * @param Protocol Protocol. TCP/UDP/ICMP/ANY
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port 
     * @return ServiceTemplateId Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
     * @param ServiceTemplateId Parameter template ID of port and protocol type; mutually exclusive with Protocol and Port
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    public DescribeEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleRequest(DescribeEnterpriseSecurityGroupRuleRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.DestContent != null) {
            this.DestContent = new String(source.DestContent);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "DestContent", this.DestContent);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);

    }
}


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

public class VpcRuleItem extends AbstractModel {

    /**
    * Access source example:

net: IP/CIDR (192.168.0.2)
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Access source type, which can be: net
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Access destination example:

net: IP/CIDR (192.168.0.2)

domain: domain name rules, for example *.qq.com
    */
    @SerializedName("DestContent")
    @Expose
    private String DestContent;

    /**
    * Access destination type, which can be: net, domain, dnsparse
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * Protocol, optional values:

TCP

UDP

ICMP

ANY

HTTP

HTTPS

HTTP/HTTPS

SMTP

SMTPS

SMTP/SMTPS

FTP

DNS

TLS/SSL
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * How traffic set in the access control policy passes through CFW. Values:

accept: allow

drop: deny

log: observe
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * Access control policy ports. Values:

-1/-1: all ports

80: port 80
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule order, where -1 indicates the lowest and 1 indicates the highest.
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Rule status, where true indicates enabled and false indicates disabled.
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * The scope of effect for the rule, specifying whether it applies between a specific pair of VPCs or across all VPCs.
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * The unique id corresponding to the rule. This field is ignored when adding a rule; when modifying the rule, the Uuid needs to be filled in. This parameter will be returned in query results.
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * The hit count of the rule. This parameter does not need to be passed during CRUD operations and is mainly used for returning query result data.
    */
    @SerializedName("DetectedTimes")
    @Expose
    private Long DetectedTimes;

    /**
    * Description of the firewall between the pair of VPCs corresponding to EdgeId
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * Internal-use uuid, generally not used
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * Rule deletion status: 1 indicates deleted; 0 indicates not deleted
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * The firewall instance ID where the rule takes effect
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * Firewall name
    */
    @SerializedName("FwGroupName")
    @Expose
    private String FwGroupName;

    /**
    * beta task details
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * Port Protocol Group ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * Port Protocol Group Name
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * Access destination name
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Access source name
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Ip version, 0: IPv4, 1: IPv6, default is IPv4
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
    * Whether the rule is invalid, where 0 indicates a valid rule and 1 indicates an invalid rule, used in output parameters.
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
     * Get Access source example:

net: IP/CIDR (192.168.0.2) 
     * @return SourceContent Access source example:

net: IP/CIDR (192.168.0.2)
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Access source example:

net: IP/CIDR (192.168.0.2)
     * @param SourceContent Access source example:

net: IP/CIDR (192.168.0.2)
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Access source type, which can be: net 
     * @return SourceType Access source type, which can be: net
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Access source type, which can be: net
     * @param SourceType Access source type, which can be: net
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Access destination example:

net: IP/CIDR (192.168.0.2)

domain: domain name rules, for example *.qq.com 
     * @return DestContent Access destination example:

net: IP/CIDR (192.168.0.2)

domain: domain name rules, for example *.qq.com
     */
    public String getDestContent() {
        return this.DestContent;
    }

    /**
     * Set Access destination example:

net: IP/CIDR (192.168.0.2)

domain: domain name rules, for example *.qq.com
     * @param DestContent Access destination example:

net: IP/CIDR (192.168.0.2)

domain: domain name rules, for example *.qq.com
     */
    public void setDestContent(String DestContent) {
        this.DestContent = DestContent;
    }

    /**
     * Get Access destination type, which can be: net, domain, dnsparse 
     * @return DestType Access destination type, which can be: net, domain, dnsparse
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set Access destination type, which can be: net, domain, dnsparse
     * @param DestType Access destination type, which can be: net, domain, dnsparse
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get Protocol, optional values:

TCP

UDP

ICMP

ANY

HTTP

HTTPS

HTTP/HTTPS

SMTP

SMTPS

SMTP/SMTPS

FTP

DNS

TLS/SSL 
     * @return Protocol Protocol, optional values:

TCP

UDP

ICMP

ANY

HTTP

HTTPS

HTTP/HTTPS

SMTP

SMTPS

SMTP/SMTPS

FTP

DNS

TLS/SSL
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol, optional values:

TCP

UDP

ICMP

ANY

HTTP

HTTPS

HTTP/HTTPS

SMTP

SMTPS

SMTP/SMTPS

FTP

DNS

TLS/SSL
     * @param Protocol Protocol, optional values:

TCP

UDP

ICMP

ANY

HTTP

HTTPS

HTTP/HTTPS

SMTP

SMTPS

SMTP/SMTPS

FTP

DNS

TLS/SSL
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get How traffic set in the access control policy passes through CFW. Values:

accept: allow

drop: deny

log: observe 
     * @return RuleAction How traffic set in the access control policy passes through CFW. Values:

accept: allow

drop: deny

log: observe
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set How traffic set in the access control policy passes through CFW. Values:

accept: allow

drop: deny

log: observe
     * @param RuleAction How traffic set in the access control policy passes through CFW. Values:

accept: allow

drop: deny

log: observe
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get Access control policy ports. Values:

-1/-1: all ports

80: port 80 
     * @return Port Access control policy ports. Values:

-1/-1: all ports

80: port 80
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Access control policy ports. Values:

-1/-1: all ports

80: port 80
     * @param Port Access control policy ports. Values:

-1/-1: all ports

80: port 80
     */
    public void setPort(String Port) {
        this.Port = Port;
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
     * Get Rule order, where -1 indicates the lowest and 1 indicates the highest. 
     * @return OrderIndex Rule order, where -1 indicates the lowest and 1 indicates the highest.
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Rule order, where -1 indicates the lowest and 1 indicates the highest.
     * @param OrderIndex Rule order, where -1 indicates the lowest and 1 indicates the highest.
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Rule status, where true indicates enabled and false indicates disabled. 
     * @return Enable Rule status, where true indicates enabled and false indicates disabled.
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Rule status, where true indicates enabled and false indicates disabled.
     * @param Enable Rule status, where true indicates enabled and false indicates disabled.
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get The scope of effect for the rule, specifying whether it applies between a specific pair of VPCs or across all VPCs. 
     * @return EdgeId The scope of effect for the rule, specifying whether it applies between a specific pair of VPCs or across all VPCs.
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set The scope of effect for the rule, specifying whether it applies between a specific pair of VPCs or across all VPCs.
     * @param EdgeId The scope of effect for the rule, specifying whether it applies between a specific pair of VPCs or across all VPCs.
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get The unique id corresponding to the rule. This field is ignored when adding a rule; when modifying the rule, the Uuid needs to be filled in. This parameter will be returned in query results. 
     * @return Uuid The unique id corresponding to the rule. This field is ignored when adding a rule; when modifying the rule, the Uuid needs to be filled in. This parameter will be returned in query results.
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set The unique id corresponding to the rule. This field is ignored when adding a rule; when modifying the rule, the Uuid needs to be filled in. This parameter will be returned in query results.
     * @param Uuid The unique id corresponding to the rule. This field is ignored when adding a rule; when modifying the rule, the Uuid needs to be filled in. This parameter will be returned in query results.
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get The hit count of the rule. This parameter does not need to be passed during CRUD operations and is mainly used for returning query result data. 
     * @return DetectedTimes The hit count of the rule. This parameter does not need to be passed during CRUD operations and is mainly used for returning query result data.
     */
    public Long getDetectedTimes() {
        return this.DetectedTimes;
    }

    /**
     * Set The hit count of the rule. This parameter does not need to be passed during CRUD operations and is mainly used for returning query result data.
     * @param DetectedTimes The hit count of the rule. This parameter does not need to be passed during CRUD operations and is mainly used for returning query result data.
     */
    public void setDetectedTimes(Long DetectedTimes) {
        this.DetectedTimes = DetectedTimes;
    }

    /**
     * Get Description of the firewall between the pair of VPCs corresponding to EdgeId 
     * @return EdgeName Description of the firewall between the pair of VPCs corresponding to EdgeId
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set Description of the firewall between the pair of VPCs corresponding to EdgeId
     * @param EdgeName Description of the firewall between the pair of VPCs corresponding to EdgeId
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get Internal-use uuid, generally not used 
     * @return InternalUuid Internal-use uuid, generally not used
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set Internal-use uuid, generally not used
     * @param InternalUuid Internal-use uuid, generally not used
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get Rule deletion status: 1 indicates deleted; 0 indicates not deleted 
     * @return Deleted Rule deletion status: 1 indicates deleted; 0 indicates not deleted
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Rule deletion status: 1 indicates deleted; 0 indicates not deleted
     * @param Deleted Rule deletion status: 1 indicates deleted; 0 indicates not deleted
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get The firewall instance ID where the rule takes effect 
     * @return FwGroupId The firewall instance ID where the rule takes effect
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set The firewall instance ID where the rule takes effect
     * @param FwGroupId The firewall instance ID where the rule takes effect
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get Firewall name 
     * @return FwGroupName Firewall name
     */
    public String getFwGroupName() {
        return this.FwGroupName;
    }

    /**
     * Set Firewall name
     * @param FwGroupName Firewall name
     */
    public void setFwGroupName(String FwGroupName) {
        this.FwGroupName = FwGroupName;
    }

    /**
     * Get beta task details 
     * @return BetaList beta task details
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set beta task details
     * @param BetaList beta task details
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get Port Protocol Group ID 
     * @return ParamTemplateId Port Protocol Group ID
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Port Protocol Group ID
     * @param ParamTemplateId Port Protocol Group ID
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Port Protocol Group Name 
     * @return ParamTemplateName Port Protocol Group Name
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set Port Protocol Group Name
     * @param ParamTemplateName Port Protocol Group Name
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get Access destination name 
     * @return TargetName Access destination name
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Access destination name
     * @param TargetName Access destination name
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Access source name 
     * @return SourceName Access source name
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Access source name
     * @param SourceName Access source name
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Ip version, 0: IPv4, 1: IPv6, default is IPv4 
     * @return IpVersion Ip version, 0: IPv4, 1: IPv6, default is IPv4
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set Ip version, 0: IPv4, 1: IPv6, default is IPv4
     * @param IpVersion Ip version, 0: IPv4, 1: IPv6, default is IPv4
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get Whether the rule is invalid, where 0 indicates a valid rule and 1 indicates an invalid rule, used in output parameters. 
     * @return Invalid Whether the rule is invalid, where 0 indicates a valid rule and 1 indicates an invalid rule, used in output parameters.
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set Whether the rule is invalid, where 0 indicates a valid rule and 1 indicates an invalid rule, used in output parameters.
     * @param Invalid Whether the rule is invalid, where 0 indicates a valid rule and 1 indicates an invalid rule, used in output parameters.
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    public VpcRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcRuleItem(VpcRuleItem source) {
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.DetectedTimes != null) {
            this.DetectedTimes = new Long(source.DetectedTimes);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Deleted != null) {
            this.Deleted = new Long(source.Deleted);
        }
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.FwGroupName != null) {
            this.FwGroupName = new String(source.FwGroupName);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "DetectedTimes", this.DetectedTimes);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "FwGroupName", this.FwGroupName);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);

    }
}


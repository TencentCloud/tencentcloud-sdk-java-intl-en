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

public class L4ProxyRule extends AbstractModel {

    /**
    * Forwarding rule ID.
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it must be filled in when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("PortRange")
    @Expose
    private String [] PortRange;

    /**
    * Origin server type. Valid values:
<li>IP_DOMAIN: IP/Domain name origin server;</li>
<li>ORIGIN_GROUP: Origin server group;</li>
<li>LB: Cloud Load Balancer, currently only open to the allowlist.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address.
<li>When OriginType is set to IP_DOMAIN, enter the IP address or domain name, such as 8.8.8.8 or test.com;</li>
<li>When OriginType is set to ORIGIN_GROUP, enter the origin server group ID, such as og-537y24vf5b41;</li>
<li>When OriginType is set to LB, enter the Cloud Load Balancer instance ID, such as lb-2qwk30xf7s9g.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Origin server port, which can be set as follows:<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85. When inputting a range of ports, ensure that the length corresponds with that of the forwarding port range. For example, if the forwarding port range is 80-90, this port range should be 90-100.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("OriginPortRange")
    @Expose
    private String OriginPortRange;

    /**
    * Transmission of the client IP address. Valid values:<li>TOA: Available only when Protocol=TCP;</li> 
<li>PPV1: Transmission via Proxy Protocol V1. Available only when Protocol=TCP;</li>
<li>PPV2: Transmission via Proxy Protocol V2;</li> 
<li>SPP: Transmission via Simple Proxy Protocol. Available only when Protocol=UDP;</li> 
<li>OFF: No transmission.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value OFF will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("ClientIPPassThroughMode")
    @Expose
    private String ClientIPPassThroughMode;

    /**
    * Specifies whether to enable session persistence. Valid values:
<li>on: Enable;</li>
<li>off: Disable.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value off will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("SessionPersist")
    @Expose
    private String SessionPersist;

    /**
    * Session persistence period, with a range of 30-3600, measured in seconds.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist is set to on and defaults to 3600 if not specified. It is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Rule tag. Accepts 1-50 arbitrary characters.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
    * Rule status. Valid values:<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>
<li>stopping: Disabling;</li>
<li>fail: Failed to deploy or disable.</li>
Note: Do not set this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules and ModifyL4ProxyRules.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * BuID.
    */
    @SerializedName("BuId")
    @Expose
    private String BuId;

    /**
    * Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("RemoteAuth")
    @Expose
    private L4ProxyRemoteAuth RemoteAuth;

    /**
     * Get Forwarding rule ID.
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it must be filled in when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. 
     * @return RuleId Forwarding rule ID.
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it must be filled in when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID.
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it must be filled in when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules.
     * @param RuleId Forwarding rule ID.
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it must be filled in when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return Protocol Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param Protocol Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return PortRange Forwarding port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String [] getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Forwarding port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param PortRange Forwarding port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setPortRange(String [] PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Origin server type. Valid values:
<li>IP_DOMAIN: IP/Domain name origin server;</li>
<li>ORIGIN_GROUP: Origin server group;</li>
<li>LB: Cloud Load Balancer, currently only open to the allowlist.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IP/Domain name origin server;</li>
<li>ORIGIN_GROUP: Origin server group;</li>
<li>LB: Cloud Load Balancer, currently only open to the allowlist.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>IP_DOMAIN: IP/Domain name origin server;</li>
<li>ORIGIN_GROUP: Origin server group;</li>
<li>LB: Cloud Load Balancer, currently only open to the allowlist.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IP/Domain name origin server;</li>
<li>ORIGIN_GROUP: Origin server group;</li>
<li>LB: Cloud Load Balancer, currently only open to the allowlist.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address.
<li>When OriginType is set to IP_DOMAIN, enter the IP address or domain name, such as 8.8.8.8 or test.com;</li>
<li>When OriginType is set to ORIGIN_GROUP, enter the origin server group ID, such as og-537y24vf5b41;</li>
<li>When OriginType is set to LB, enter the Cloud Load Balancer instance ID, such as lb-2qwk30xf7s9g.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return OriginValue Origin server address.
<li>When OriginType is set to IP_DOMAIN, enter the IP address or domain name, such as 8.8.8.8 or test.com;</li>
<li>When OriginType is set to ORIGIN_GROUP, enter the origin server group ID, such as og-537y24vf5b41;</li>
<li>When OriginType is set to LB, enter the Cloud Load Balancer instance ID, such as lb-2qwk30xf7s9g.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server address.
<li>When OriginType is set to IP_DOMAIN, enter the IP address or domain name, such as 8.8.8.8 or test.com;</li>
<li>When OriginType is set to ORIGIN_GROUP, enter the origin server group ID, such as og-537y24vf5b41;</li>
<li>When OriginType is set to LB, enter the Cloud Load Balancer instance ID, such as lb-2qwk30xf7s9g.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param OriginValue Origin server address.
<li>When OriginType is set to IP_DOMAIN, enter the IP address or domain name, such as 8.8.8.8 or test.com;</li>
<li>When OriginType is set to ORIGIN_GROUP, enter the origin server group ID, such as og-537y24vf5b41;</li>
<li>When OriginType is set to LB, enter the Cloud Load Balancer instance ID, such as lb-2qwk30xf7s9g.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Origin server port, which can be set as follows:<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85. When inputting a range of ports, ensure that the length corresponds with that of the forwarding port range. For example, if the forwarding port range is 80-90, this port range should be 90-100.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return OriginPortRange Origin server port, which can be set as follows:<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85. When inputting a range of ports, ensure that the length corresponds with that of the forwarding port range. For example, if the forwarding port range is 80-90, this port range should be 90-100.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getOriginPortRange() {
        return this.OriginPortRange;
    }

    /**
     * Set Origin server port, which can be set as follows:<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85. When inputting a range of ports, ensure that the length corresponds with that of the forwarding port range. For example, if the forwarding port range is 80-90, this port range should be 90-100.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param OriginPortRange Origin server port, which can be set as follows:<li>A single port, such as 80;</li>
<li>A range of ports, such as 81-85, representing ports 81, 82, 83, 84, 85. When inputting a range of ports, ensure that the length corresponds with that of the forwarding port range. For example, if the forwarding port range is 80-90, this port range should be 90-100.</li>
Note: This parameter must be filled in when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setOriginPortRange(String OriginPortRange) {
        this.OriginPortRange = OriginPortRange;
    }

    /**
     * Get Transmission of the client IP address. Valid values:<li>TOA: Available only when Protocol=TCP;</li> 
<li>PPV1: Transmission via Proxy Protocol V1. Available only when Protocol=TCP;</li>
<li>PPV2: Transmission via Proxy Protocol V2;</li> 
<li>SPP: Transmission via Simple Proxy Protocol. Available only when Protocol=UDP;</li> 
<li>OFF: No transmission.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value OFF will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return ClientIPPassThroughMode Transmission of the client IP address. Valid values:<li>TOA: Available only when Protocol=TCP;</li> 
<li>PPV1: Transmission via Proxy Protocol V1. Available only when Protocol=TCP;</li>
<li>PPV2: Transmission via Proxy Protocol V2;</li> 
<li>SPP: Transmission via Simple Proxy Protocol. Available only when Protocol=UDP;</li> 
<li>OFF: No transmission.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value OFF will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getClientIPPassThroughMode() {
        return this.ClientIPPassThroughMode;
    }

    /**
     * Set Transmission of the client IP address. Valid values:<li>TOA: Available only when Protocol=TCP;</li> 
<li>PPV1: Transmission via Proxy Protocol V1. Available only when Protocol=TCP;</li>
<li>PPV2: Transmission via Proxy Protocol V2;</li> 
<li>SPP: Transmission via Simple Proxy Protocol. Available only when Protocol=UDP;</li> 
<li>OFF: No transmission.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value OFF will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param ClientIPPassThroughMode Transmission of the client IP address. Valid values:<li>TOA: Available only when Protocol=TCP;</li> 
<li>PPV1: Transmission via Proxy Protocol V1. Available only when Protocol=TCP;</li>
<li>PPV2: Transmission via Proxy Protocol V2;</li> 
<li>SPP: Transmission via Simple Proxy Protocol. Available only when Protocol=UDP;</li> 
<li>OFF: No transmission.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value OFF will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setClientIPPassThroughMode(String ClientIPPassThroughMode) {
        this.ClientIPPassThroughMode = ClientIPPassThroughMode;
    }

    /**
     * Get Specifies whether to enable session persistence. Valid values:
<li>on: Enable;</li>
<li>off: Disable.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value off will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return SessionPersist Specifies whether to enable session persistence. Valid values:
<li>on: Enable;</li>
<li>off: Disable.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value off will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Specifies whether to enable session persistence. Valid values:
<li>on: Enable;</li>
<li>off: Disable.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value off will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param SessionPersist Specifies whether to enable session persistence. Valid values:
<li>on: Enable;</li>
<li>off: Disable.</li>
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules, and if not specified, the default value off will be used; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setSessionPersist(String SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Session persistence period, with a range of 30-3600, measured in seconds.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist is set to on and defaults to 3600 if not specified. It is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return SessionPersistTime Session persistence period, with a range of 30-3600, measured in seconds.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist is set to on and defaults to 3600 if not specified. It is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session persistence period, with a range of 30-3600, measured in seconds.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist is set to on and defaults to 3600 if not specified. It is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param SessionPersistTime Session persistence period, with a range of 30-3600, measured in seconds.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist is set to on and defaults to 3600 if not specified. It is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Rule tag. Accepts 1-50 arbitrary characters.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value. 
     * @return RuleTag Rule tag. Accepts 1-50 arbitrary characters.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Rule tag. Accepts 1-50 arbitrary characters.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     * @param RuleTag Rule tag. Accepts 1-50 arbitrary characters.
Note: This parameter is optional when L4ProxyRule is used as an input parameter in CreateL4ProxyRules; it is optional when L4ProxyRule is used as an input parameter in ModifyL4ProxyRules. If not specified, it will retain its existing value.
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    /**
     * Get Rule status. Valid values:<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>
<li>stopping: Disabling;</li>
<li>fail: Failed to deploy or disable.</li>
Note: Do not set this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules and ModifyL4ProxyRules. 
     * @return Status Rule status. Valid values:<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>
<li>stopping: Disabling;</li>
<li>fail: Failed to deploy or disable.</li>
Note: Do not set this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules and ModifyL4ProxyRules.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values:<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>
<li>stopping: Disabling;</li>
<li>fail: Failed to deploy or disable.</li>
Note: Do not set this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules and ModifyL4ProxyRules.
     * @param Status Rule status. Valid values:<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>
<li>stopping: Disabling;</li>
<li>fail: Failed to deploy or disable.</li>
Note: Do not set this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules and ModifyL4ProxyRules.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get BuID. 
     * @return BuId BuID.
     */
    public String getBuId() {
        return this.BuId;
    }

    /**
     * Set BuID.
     * @param BuId BuID.
     */
    public void setBuId(String BuId) {
        this.BuId = BuId;
    }

    /**
     * Get Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return RemoteAuth Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public L4ProxyRemoteAuth getRemoteAuth() {
        return this.RemoteAuth;
    }

    /**
     * Set Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param RemoteAuth Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setRemoteAuth(L4ProxyRemoteAuth RemoteAuth) {
        this.RemoteAuth = RemoteAuth;
    }

    public L4ProxyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4ProxyRule(L4ProxyRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PortRange != null) {
            this.PortRange = new String[source.PortRange.length];
            for (int i = 0; i < source.PortRange.length; i++) {
                this.PortRange[i] = new String(source.PortRange[i]);
            }
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginValue != null) {
            this.OriginValue = new String[source.OriginValue.length];
            for (int i = 0; i < source.OriginValue.length; i++) {
                this.OriginValue[i] = new String(source.OriginValue[i]);
            }
        }
        if (source.OriginPortRange != null) {
            this.OriginPortRange = new String(source.OriginPortRange);
        }
        if (source.ClientIPPassThroughMode != null) {
            this.ClientIPPassThroughMode = new String(source.ClientIPPassThroughMode);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new String(source.SessionPersist);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BuId != null) {
            this.BuId = new String(source.BuId);
        }
        if (source.RemoteAuth != null) {
            this.RemoteAuth = new L4ProxyRemoteAuth(source.RemoteAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "PortRange.", this.PortRange);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "OriginPortRange", this.OriginPortRange);
        this.setParamSimple(map, prefix + "ClientIPPassThroughMode", this.ClientIPPassThroughMode);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BuId", this.BuId);
        this.setParamObj(map, prefix + "RemoteAuth.", this.RemoteAuth);

    }
}


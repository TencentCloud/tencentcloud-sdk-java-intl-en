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
Note: Do not fill in L4ProxyRule as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, this parameter is required.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding port. You can fill it in based on the following format:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("PortRange")
    @Expose
    private String [] PortRange;

    /**
    * Origin server type. Valid values:
<li>IP_DOMAIN: IP/domain origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address:
<li>When OriginType is IP_DOMAIN, enter an IP address or domain name, for example, 8.8.8.8 or test.com;</li>
<li>When OriginType is ORIGIN_GROUP, fill in the origin server group ID, such as og-537y24vf5b41; if referencing an origin server group from another site, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType is LB, fill in the Cloud Load Balancer instance ID, for example, lb-2qwk30xf7s9g. If a load balancer from another site is referenced, the format is {Cloud Load Balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.

    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Origin server port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85. When entering a port range, ensure the length corresponds with the forwarding port range. For example, if the forwarding port is 80-90, the forwarding port should be 90-100.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("OriginPortRange")
    @Expose
    private String OriginPortRange;

    /**
    * Transmission of the client IP address. Valid values:
<li>TOA: TOA (selectable only when Protocol = TCP);</li> 
<li>PPV1: passing via Proxy Protocol V1, available only when Protocol = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li> 
<li>SPP: transmission via Simple Proxy Protocol (selectable only when Protocol = UDP);</li> 
<li>`OFF`: Do not pass the client IP.</li>
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. If not specified, it defaults to OFF. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("ClientIPPassThroughMode")
    @Expose
    private String ClientIPPassThroughMode;

    /**
    * Whether to enable session persistence. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Note: When L4ProxyRule is used as an input parameter in CreateL4ProxyRules, this parameter is optional and defaults to off if left empty. When used as an input parameter in ModifyL4ProxyRules, this parameter is optional and retains its existing value if not specified.
    */
    @SerializedName("SessionPersist")
    @Expose
    private String SessionPersist;

    /**
    * Session persistence duration, in seconds. Value range: 30-3600.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist = on. If not specified when SessionPersist = on, it defaults to 3600. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Rule tag. Enter 1-50 characters.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
    * Rule status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules.
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
    */
    @SerializedName("RemoteAuth")
    @Expose
    private L4ProxyRemoteAuth RemoteAuth;

    /**
     * Get Forwarding rule ID.
Note: Do not fill in L4ProxyRule as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, this parameter is required. 
     * @return RuleId Forwarding rule ID.
Note: Do not fill in L4ProxyRule as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, this parameter is required.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID.
Note: Do not fill in L4ProxyRule as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, this parameter is required.
     * @param RuleId Forwarding rule ID.
Note: Do not fill in L4ProxyRule as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, this parameter is required.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return Protocol Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param Protocol Forwarding protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding port. You can fill it in based on the following format:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return PortRange Forwarding port. You can fill it in based on the following format:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String [] getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Forwarding port. You can fill it in based on the following format:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param PortRange Forwarding port. You can fill it in based on the following format:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setPortRange(String [] PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Origin server type. Valid values:
<li>IP_DOMAIN: IP/domain origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IP/domain origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>IP_DOMAIN: IP/domain origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IP/domain origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address:
<li>When OriginType is IP_DOMAIN, enter an IP address or domain name, for example, 8.8.8.8 or test.com;</li>
<li>When OriginType is ORIGIN_GROUP, fill in the origin server group ID, such as og-537y24vf5b41; if referencing an origin server group from another site, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType is LB, fill in the Cloud Load Balancer instance ID, for example, lb-2qwk30xf7s9g. If a load balancer from another site is referenced, the format is {Cloud Load Balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
 
     * @return OriginValue Origin server address:
<li>When OriginType is IP_DOMAIN, enter an IP address or domain name, for example, 8.8.8.8 or test.com;</li>
<li>When OriginType is ORIGIN_GROUP, fill in the origin server group ID, such as og-537y24vf5b41; if referencing an origin server group from another site, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType is LB, fill in the Cloud Load Balancer instance ID, for example, lb-2qwk30xf7s9g. If a load balancer from another site is referenced, the format is {Cloud Load Balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.

     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server address:
<li>When OriginType is IP_DOMAIN, enter an IP address or domain name, for example, 8.8.8.8 or test.com;</li>
<li>When OriginType is ORIGIN_GROUP, fill in the origin server group ID, such as og-537y24vf5b41; if referencing an origin server group from another site, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType is LB, fill in the Cloud Load Balancer instance ID, for example, lb-2qwk30xf7s9g. If a load balancer from another site is referenced, the format is {Cloud Load Balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.

     * @param OriginValue Origin server address:
<li>When OriginType is IP_DOMAIN, enter an IP address or domain name, for example, 8.8.8.8 or test.com;</li>
<li>When OriginType is ORIGIN_GROUP, fill in the origin server group ID, such as og-537y24vf5b41; if referencing an origin server group from another site, the format is {origin server group ID}@{ZoneID}. For example: og-testorigin@zone-38moq1z10wwwy;</li>
<li>When OriginType is LB, fill in the Cloud Load Balancer instance ID, for example, lb-2qwk30xf7s9g. If a load balancer from another site is referenced, the format is {Cloud Load Balancer ID}@{ZoneID}. For example: lb-2rxpamcyqfzg@zone-38moq1z10wwwy.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.

     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Origin server port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85. When entering a port range, ensure the length corresponds with the forwarding port range. For example, if the forwarding port is 80-90, the forwarding port should be 90-100.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return OriginPortRange Origin server port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85. When entering a port range, ensure the length corresponds with the forwarding port range. For example, if the forwarding port is 80-90, the forwarding port should be 90-100.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String getOriginPortRange() {
        return this.OriginPortRange;
    }

    /**
     * Set Origin server port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85. When entering a port range, ensure the length corresponds with the forwarding port range. For example, if the forwarding port is 80-90, the forwarding port should be 90-100.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param OriginPortRange Origin server port, which can be set as follows:
<li>A single port, such as 80;</li>
<li>A port range, such as 81-85, indicating five ports 81, 82, 83, 84, and 85. When entering a port range, ensure the length corresponds with the forwarding port range. For example, if the forwarding port is 80-90, the forwarding port should be 90-100.</li>
Note: L4ProxyRule is required as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setOriginPortRange(String OriginPortRange) {
        this.OriginPortRange = OriginPortRange;
    }

    /**
     * Get Transmission of the client IP address. Valid values:
<li>TOA: TOA (selectable only when Protocol = TCP);</li> 
<li>PPV1: passing via Proxy Protocol V1, available only when Protocol = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li> 
<li>SPP: transmission via Simple Proxy Protocol (selectable only when Protocol = UDP);</li> 
<li>`OFF`: Do not pass the client IP.</li>
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. If not specified, it defaults to OFF. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return ClientIPPassThroughMode Transmission of the client IP address. Valid values:
<li>TOA: TOA (selectable only when Protocol = TCP);</li> 
<li>PPV1: passing via Proxy Protocol V1, available only when Protocol = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li> 
<li>SPP: transmission via Simple Proxy Protocol (selectable only when Protocol = UDP);</li> 
<li>`OFF`: Do not pass the client IP.</li>
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. If not specified, it defaults to OFF. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String getClientIPPassThroughMode() {
        return this.ClientIPPassThroughMode;
    }

    /**
     * Set Transmission of the client IP address. Valid values:
<li>TOA: TOA (selectable only when Protocol = TCP);</li> 
<li>PPV1: passing via Proxy Protocol V1, available only when Protocol = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li> 
<li>SPP: transmission via Simple Proxy Protocol (selectable only when Protocol = UDP);</li> 
<li>`OFF`: Do not pass the client IP.</li>
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. If not specified, it defaults to OFF. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param ClientIPPassThroughMode Transmission of the client IP address. Valid values:
<li>TOA: TOA (selectable only when Protocol = TCP);</li> 
<li>PPV1: passing via Proxy Protocol V1, available only when Protocol = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li> 
<li>SPP: transmission via Simple Proxy Protocol (selectable only when Protocol = UDP);</li> 
<li>`OFF`: Do not pass the client IP.</li>
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. If not specified, it defaults to OFF. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setClientIPPassThroughMode(String ClientIPPassThroughMode) {
        this.ClientIPPassThroughMode = ClientIPPassThroughMode;
    }

    /**
     * Get Whether to enable session persistence. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Note: When L4ProxyRule is used as an input parameter in CreateL4ProxyRules, this parameter is optional and defaults to off if left empty. When used as an input parameter in ModifyL4ProxyRules, this parameter is optional and retains its existing value if not specified. 
     * @return SessionPersist Whether to enable session persistence. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Note: When L4ProxyRule is used as an input parameter in CreateL4ProxyRules, this parameter is optional and defaults to off if left empty. When used as an input parameter in ModifyL4ProxyRules, this parameter is optional and retains its existing value if not specified.
     */
    public String getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Whether to enable session persistence. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Note: When L4ProxyRule is used as an input parameter in CreateL4ProxyRules, this parameter is optional and defaults to off if left empty. When used as an input parameter in ModifyL4ProxyRules, this parameter is optional and retains its existing value if not specified.
     * @param SessionPersist Whether to enable session persistence. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
Note: When L4ProxyRule is used as an input parameter in CreateL4ProxyRules, this parameter is optional and defaults to off if left empty. When used as an input parameter in ModifyL4ProxyRules, this parameter is optional and retains its existing value if not specified.
     */
    public void setSessionPersist(String SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Session persistence duration, in seconds. Value range: 30-3600.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist = on. If not specified when SessionPersist = on, it defaults to 3600. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return SessionPersistTime Session persistence duration, in seconds. Value range: 30-3600.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist = on. If not specified when SessionPersist = on, it defaults to 3600. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Session persistence duration, in seconds. Value range: 30-3600.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist = on. If not specified when SessionPersist = on, it defaults to 3600. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param SessionPersistTime Session persistence duration, in seconds. Value range: 30-3600.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. It is valid only when SessionPersist = on. If not specified when SessionPersist = on, it defaults to 3600. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Rule tag. Enter 1-50 characters.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value. 
     * @return RuleTag Rule tag. Enter 1-50 characters.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Rule tag. Enter 1-50 characters.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     * @param RuleTag Rule tag. Enter 1-50 characters.
Note: L4ProxyRule is optional as an input parameter in CreateL4ProxyRules. In ModifyL4ProxyRules, it is optional. If not specified, it will retain its existing value.
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    /**
     * Get Rule status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. 
     * @return Status Rule status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules.
     * @param Status Rule status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
Note: Do not fill in this parameter when L4ProxyRule is used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules.
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
     * @return RemoteAuth Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
     */
    public L4ProxyRemoteAuth getRemoteAuth() {
        return this.RemoteAuth;
    }

    /**
     * Set Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
     * @param RemoteAuth Remote authentication information.
Note: RemoteAuth cannot be used as an input parameter in CreateL4ProxyRules or ModifyL4ProxyRules. If this parameter is input, it will be ignored. If the returned data of DescribeL4ProxyRules is empty, it indicates that remote authentication is disabled.
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


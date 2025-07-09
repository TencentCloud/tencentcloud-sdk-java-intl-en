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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnConnection extends AbstractModel {

    /**
    * Tunnel instance ID.
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * Tunnel name.
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The ID of the VPN gateway instance.
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * Customer gateway instance ID.
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * The pre-shared key.
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * Tunnel transmission protocol.
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;

    /**
    * Tunnel encryption protocol.
    */
    @SerializedName("EncryptProto")
    @Expose
    private String EncryptProto;

    /**
    * Route Type.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Connection status of the tunnel. AVAILABLE: Connected.
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * SPD.
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;

    /**
    * IKE options.
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSEC options.
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * Whether the health check is supported.
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * Local IP address for the health check
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * Peer IP address for the health check
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * Tunnel health check status. Valid values: AVAILABLE: healthy; UNAVAILABLE: unhealthy. This parameter will be returned only after health check is enabled.
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
    * Whether to enable DPD. Values: `0` (Disable) and `1` (Enable)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * DPD timeout period. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DpdTimeout")
    @Expose
    private String DpdTimeout;

    /**
    * The action to take in case of DPD timeout. Values: `clear` (Disconnect) and `restart` (retry). This parameter only takes effect when `DpdEnable` is set to `1`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DpdAction")
    @Expose
    private String DpdAction;

    /**
    * Array of tag key-value pairs
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Negotiation type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
     * Get Tunnel instance ID. 
     * @return VpnConnectionId Tunnel instance ID.
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set Tunnel instance ID.
     * @param VpnConnectionId Tunnel instance ID.
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get Tunnel name. 
     * @return VpnConnectionName Tunnel name.
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set Tunnel name.
     * @param VpnConnectionName Tunnel name.
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
    }

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The ID of the VPN gateway instance. 
     * @return VpnGatewayId The ID of the VPN gateway instance.
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set The ID of the VPN gateway instance.
     * @param VpnGatewayId The ID of the VPN gateway instance.
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get Customer gateway instance ID. 
     * @return CustomerGatewayId Customer gateway instance ID.
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set Customer gateway instance ID.
     * @param CustomerGatewayId Customer gateway instance ID.
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get The pre-shared key. 
     * @return PreShareKey The pre-shared key.
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * Set The pre-shared key.
     * @param PreShareKey The pre-shared key.
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * Get Tunnel transmission protocol. 
     * @return VpnProto Tunnel transmission protocol.
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * Set Tunnel transmission protocol.
     * @param VpnProto Tunnel transmission protocol.
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * Get Tunnel encryption protocol. 
     * @return EncryptProto Tunnel encryption protocol.
     */
    public String getEncryptProto() {
        return this.EncryptProto;
    }

    /**
     * Set Tunnel encryption protocol.
     * @param EncryptProto Tunnel encryption protocol.
     */
    public void setEncryptProto(String EncryptProto) {
        this.EncryptProto = EncryptProto;
    }

    /**
     * Get Route Type. 
     * @return RouteType Route Type.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Route Type.
     * @param RouteType Route Type.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting. 
     * @return State Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     * @param State Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Connection status of the tunnel. AVAILABLE: Connected. 
     * @return NetStatus Connection status of the tunnel. AVAILABLE: Connected.
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set Connection status of the tunnel. AVAILABLE: Connected.
     * @param NetStatus Connection status of the tunnel. AVAILABLE: Connected.
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get SPD. 
     * @return SecurityPolicyDatabaseSet SPD.
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * Set SPD.
     * @param SecurityPolicyDatabaseSet SPD.
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * Get IKE options. 
     * @return IKEOptionsSpecification IKE options.
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set IKE options.
     * @param IKEOptionsSpecification IKE options.
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get IPSEC options. 
     * @return IPSECOptionsSpecification IPSEC options.
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set IPSEC options.
     * @param IPSECOptionsSpecification IPSEC options.
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get Whether the health check is supported. 
     * @return EnableHealthCheck Whether the health check is supported.
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set Whether the health check is supported.
     * @param EnableHealthCheck Whether the health check is supported.
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get Local IP address for the health check 
     * @return HealthCheckLocalIp Local IP address for the health check
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set Local IP address for the health check
     * @param HealthCheckLocalIp Local IP address for the health check
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get Peer IP address for the health check 
     * @return HealthCheckRemoteIp Peer IP address for the health check
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set Peer IP address for the health check
     * @param HealthCheckRemoteIp Peer IP address for the health check
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get Tunnel health check status. Valid values: AVAILABLE: healthy; UNAVAILABLE: unhealthy. This parameter will be returned only after health check is enabled. 
     * @return HealthCheckStatus Tunnel health check status. Valid values: AVAILABLE: healthy; UNAVAILABLE: unhealthy. This parameter will be returned only after health check is enabled.
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set Tunnel health check status. Valid values: AVAILABLE: healthy; UNAVAILABLE: unhealthy. This parameter will be returned only after health check is enabled.
     * @param HealthCheckStatus Tunnel health check status. Valid values: AVAILABLE: healthy; UNAVAILABLE: unhealthy. This parameter will be returned only after health check is enabled.
     */
    public void setHealthCheckStatus(String HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    /**
     * Get Whether to enable DPD. Values: `0` (Disable) and `1` (Enable)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DpdEnable Whether to enable DPD. Values: `0` (Disable) and `1` (Enable)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDpdEnable() {
        return this.DpdEnable;
    }

    /**
     * Set Whether to enable DPD. Values: `0` (Disable) and `1` (Enable)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DpdEnable Whether to enable DPD. Values: `0` (Disable) and `1` (Enable)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDpdEnable(Long DpdEnable) {
        this.DpdEnable = DpdEnable;
    }

    /**
     * Get DPD timeout period. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DpdTimeout DPD timeout period. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set DPD timeout period. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DpdTimeout DPD timeout period. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDpdTimeout(String DpdTimeout) {
        this.DpdTimeout = DpdTimeout;
    }

    /**
     * Get The action to take in case of DPD timeout. Values: `clear` (Disconnect) and `restart` (retry). This parameter only takes effect when `DpdEnable` is set to `1`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DpdAction The action to take in case of DPD timeout. Values: `clear` (Disconnect) and `restart` (retry). This parameter only takes effect when `DpdEnable` is set to `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDpdAction() {
        return this.DpdAction;
    }

    /**
     * Set The action to take in case of DPD timeout. Values: `clear` (Disconnect) and `restart` (retry). This parameter only takes effect when `DpdEnable` is set to `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DpdAction The action to take in case of DPD timeout. Values: `clear` (Disconnect) and `restart` (retry). This parameter only takes effect when `DpdEnable` is set to `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDpdAction(String DpdAction) {
        this.DpdAction = DpdAction;
    }

    /**
     * Get Array of tag key-value pairs 
     * @return TagSet Array of tag key-value pairs
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Array of tag key-value pairs
     * @param TagSet Array of tag key-value pairs
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Negotiation type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NegotiationType Negotiation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set Negotiation type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NegotiationType Negotiation type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
    }

    public VpnConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnConnection(VpnConnection source) {
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.VpnProto != null) {
            this.VpnProto = new String(source.VpnProto);
        }
        if (source.EncryptProto != null) {
            this.EncryptProto = new String(source.EncryptProto);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.SecurityPolicyDatabaseSet != null) {
            this.SecurityPolicyDatabaseSet = new SecurityPolicyDatabase[source.SecurityPolicyDatabaseSet.length];
            for (int i = 0; i < source.SecurityPolicyDatabaseSet.length; i++) {
                this.SecurityPolicyDatabaseSet[i] = new SecurityPolicyDatabase(source.SecurityPolicyDatabaseSet[i]);
            }
        }
        if (source.IKEOptionsSpecification != null) {
            this.IKEOptionsSpecification = new IKEOptionsSpecification(source.IKEOptionsSpecification);
        }
        if (source.IPSECOptionsSpecification != null) {
            this.IPSECOptionsSpecification = new IPSECOptionsSpecification(source.IPSECOptionsSpecification);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheckLocalIp != null) {
            this.HealthCheckLocalIp = new String(source.HealthCheckLocalIp);
        }
        if (source.HealthCheckRemoteIp != null) {
            this.HealthCheckRemoteIp = new String(source.HealthCheckRemoteIp);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new String(source.HealthCheckStatus);
        }
        if (source.DpdEnable != null) {
            this.DpdEnable = new Long(source.DpdEnable);
        }
        if (source.DpdTimeout != null) {
            this.DpdTimeout = new String(source.DpdTimeout);
        }
        if (source.DpdAction != null) {
            this.DpdAction = new String(source.DpdAction);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.NegotiationType != null) {
            this.NegotiationType = new String(source.NegotiationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpnProto", this.VpnProto);
        this.setParamSimple(map, prefix + "EncryptProto", this.EncryptProto);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabaseSet.", this.SecurityPolicyDatabaseSet);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);

    }
}


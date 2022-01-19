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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpnConnectionAttributeRequest extends AbstractModel{

    /**
    * The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`.
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * VPN tunnel can be named freely, but the maximum length is 60 characters.
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * The pre-shared key.
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC.
    */
    @SerializedName("SecurityPolicyDatabases")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabases;

    /**
    * IKE (Internet Key Exchange) configuration. IKE comes with a self-protection mechanism. The network security protocol is configured by the user.
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSec configuration. The IPSec secure session configuration is provided by Tencent Cloud.
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * Whether to enable the tunnel health check.
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * Local IP address for the tunnel health check
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * Peer IP address for the tunnel health check
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * Negotiation type. Valid values: `active` (default value), `passive` and `flowTrigger`.
    */
    @SerializedName("NegotiationType")
    @Expose
    private String NegotiationType;

    /**
    * Specifies whether to enable DPD. Valid values: `0` (disable) and `1` (enable)
    */
    @SerializedName("DpdEnable")
    @Expose
    private Long DpdEnable;

    /**
    * DPD timeout period. Default: 30; unit: second. If the request is not responded within this period, the peer end is considered not exists. This parameter is valid when the value of `DpdEnable` is 1. 
    */
    @SerializedName("DpdTimeout")
    @Expose
    private String DpdTimeout;

    /**
    * The action after DPD timeout. Valid values: `clear` (disconnect) and `restart` (try again). It’s valid when `DpdEnable` is `1`. 
    */
    @SerializedName("DpdAction")
    @Expose
    private String DpdAction;

    /**
     * Get The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`. 
     * @return VpnConnectionId The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`.
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`.
     * @param VpnConnectionId The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`.
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get VPN tunnel can be named freely, but the maximum length is 60 characters. 
     * @return VpnConnectionName VPN tunnel can be named freely, but the maximum length is 60 characters.
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set VPN tunnel can be named freely, but the maximum length is 60 characters.
     * @param VpnConnectionName VPN tunnel can be named freely, but the maximum length is 60 characters.
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
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
     * Get The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC. 
     * @return SecurityPolicyDatabases The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC.
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabases() {
        return this.SecurityPolicyDatabases;
    }

    /**
     * Set The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC.
     * @param SecurityPolicyDatabases The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC.
     */
    public void setSecurityPolicyDatabases(SecurityPolicyDatabase [] SecurityPolicyDatabases) {
        this.SecurityPolicyDatabases = SecurityPolicyDatabases;
    }

    /**
     * Get IKE (Internet Key Exchange) configuration. IKE comes with a self-protection mechanism. The network security protocol is configured by the user. 
     * @return IKEOptionsSpecification IKE (Internet Key Exchange) configuration. IKE comes with a self-protection mechanism. The network security protocol is configured by the user.
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set IKE (Internet Key Exchange) configuration. IKE comes with a self-protection mechanism. The network security protocol is configured by the user.
     * @param IKEOptionsSpecification IKE (Internet Key Exchange) configuration. IKE comes with a self-protection mechanism. The network security protocol is configured by the user.
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get IPSec configuration. The IPSec secure session configuration is provided by Tencent Cloud. 
     * @return IPSECOptionsSpecification IPSec configuration. The IPSec secure session configuration is provided by Tencent Cloud.
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set IPSec configuration. The IPSec secure session configuration is provided by Tencent Cloud.
     * @param IPSECOptionsSpecification IPSec configuration. The IPSec secure session configuration is provided by Tencent Cloud.
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Get Whether to enable the tunnel health check. 
     * @return EnableHealthCheck Whether to enable the tunnel health check.
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set Whether to enable the tunnel health check.
     * @param EnableHealthCheck Whether to enable the tunnel health check.
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get Local IP address for the tunnel health check 
     * @return HealthCheckLocalIp Local IP address for the tunnel health check
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set Local IP address for the tunnel health check
     * @param HealthCheckLocalIp Local IP address for the tunnel health check
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get Peer IP address for the tunnel health check 
     * @return HealthCheckRemoteIp Peer IP address for the tunnel health check
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set Peer IP address for the tunnel health check
     * @param HealthCheckRemoteIp Peer IP address for the tunnel health check
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get Negotiation type. Valid values: `active` (default value), `passive` and `flowTrigger`. 
     * @return NegotiationType Negotiation type. Valid values: `active` (default value), `passive` and `flowTrigger`.
     */
    public String getNegotiationType() {
        return this.NegotiationType;
    }

    /**
     * Set Negotiation type. Valid values: `active` (default value), `passive` and `flowTrigger`.
     * @param NegotiationType Negotiation type. Valid values: `active` (default value), `passive` and `flowTrigger`.
     */
    public void setNegotiationType(String NegotiationType) {
        this.NegotiationType = NegotiationType;
    }

    /**
     * Get Specifies whether to enable DPD. Valid values: `0` (disable) and `1` (enable) 
     * @return DpdEnable Specifies whether to enable DPD. Valid values: `0` (disable) and `1` (enable)
     */
    public Long getDpdEnable() {
        return this.DpdEnable;
    }

    /**
     * Set Specifies whether to enable DPD. Valid values: `0` (disable) and `1` (enable)
     * @param DpdEnable Specifies whether to enable DPD. Valid values: `0` (disable) and `1` (enable)
     */
    public void setDpdEnable(Long DpdEnable) {
        this.DpdEnable = DpdEnable;
    }

    /**
     * Get DPD timeout period. Default: 30; unit: second. If the request is not responded within this period, the peer end is considered not exists. This parameter is valid when the value of `DpdEnable` is 1.  
     * @return DpdTimeout DPD timeout period. Default: 30; unit: second. If the request is not responded within this period, the peer end is considered not exists. This parameter is valid when the value of `DpdEnable` is 1. 
     */
    public String getDpdTimeout() {
        return this.DpdTimeout;
    }

    /**
     * Set DPD timeout period. Default: 30; unit: second. If the request is not responded within this period, the peer end is considered not exists. This parameter is valid when the value of `DpdEnable` is 1. 
     * @param DpdTimeout DPD timeout period. Default: 30; unit: second. If the request is not responded within this period, the peer end is considered not exists. This parameter is valid when the value of `DpdEnable` is 1. 
     */
    public void setDpdTimeout(String DpdTimeout) {
        this.DpdTimeout = DpdTimeout;
    }

    /**
     * Get The action after DPD timeout. Valid values: `clear` (disconnect) and `restart` (try again). It’s valid when `DpdEnable` is `1`.  
     * @return DpdAction The action after DPD timeout. Valid values: `clear` (disconnect) and `restart` (try again). It’s valid when `DpdEnable` is `1`. 
     */
    public String getDpdAction() {
        return this.DpdAction;
    }

    /**
     * Set The action after DPD timeout. Valid values: `clear` (disconnect) and `restart` (try again). It’s valid when `DpdEnable` is `1`. 
     * @param DpdAction The action after DPD timeout. Valid values: `clear` (disconnect) and `restart` (try again). It’s valid when `DpdEnable` is `1`. 
     */
    public void setDpdAction(String DpdAction) {
        this.DpdAction = DpdAction;
    }

    public ModifyVpnConnectionAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnConnectionAttributeRequest(ModifyVpnConnectionAttributeRequest source) {
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.SecurityPolicyDatabases != null) {
            this.SecurityPolicyDatabases = new SecurityPolicyDatabase[source.SecurityPolicyDatabases.length];
            for (int i = 0; i < source.SecurityPolicyDatabases.length; i++) {
                this.SecurityPolicyDatabases[i] = new SecurityPolicyDatabase(source.SecurityPolicyDatabases[i]);
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
        if (source.NegotiationType != null) {
            this.NegotiationType = new String(source.NegotiationType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabases.", this.SecurityPolicyDatabases);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);

    }
}


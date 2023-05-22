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

public class CreateVpnConnectionRequest extends AbstractModel{

    /**
    * The ID of the VPN gateway instance.
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * The ID of the customer gateway, such as `cgw-2wqq41m9`. You can query the customer gateway by using the [DescribeCustomerGateways](https://intl.cloud.tencent.com/document/product/215/17516?from_cn_redirect=1) API.
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * Gateway can be named freely, but the maximum length is 60 characters.
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
    * VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
This parameter is optional for a CCN-based VPN tunnel.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The SPD policy group, for example: {"10.0.0.5/24":["172.123.10.5/16"]}. 10.0.0.5/24 is the VPC internal IP range, and 172.123.10.5/16 is the IDC IP range. The user specifies the IP range in the VPC that can communicate with the IP range in the IDC.
    */
    @SerializedName("SecurityPolicyDatabases")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabases;

    /**
    * Internet Key Exchange (IKE) configuration. IKE has a self-protection mechanism. The network security protocol is configured by the user.
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
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether the tunnel health check is supported. The default value is `False`.
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * Local IP of health check. It defaults to a random IP within 169.254.128.0/17.
    */
    @SerializedName("HealthCheckLocalIp")
    @Expose
    private String HealthCheckLocalIp;

    /**
    * Peer IP of health check. It defaults to a random IP within 169.254.128.0/17.
    */
    @SerializedName("HealthCheckRemoteIp")
    @Expose
    private String HealthCheckRemoteIp;

    /**
    * Tunnel type. Valid values: `STATIC`, `StaticRoute`, and `Policy`.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

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
     * Get The ID of the customer gateway, such as `cgw-2wqq41m9`. You can query the customer gateway by using the [DescribeCustomerGateways](https://intl.cloud.tencent.com/document/product/215/17516?from_cn_redirect=1) API. 
     * @return CustomerGatewayId The ID of the customer gateway, such as `cgw-2wqq41m9`. You can query the customer gateway by using the [DescribeCustomerGateways](https://intl.cloud.tencent.com/document/product/215/17516?from_cn_redirect=1) API.
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set The ID of the customer gateway, such as `cgw-2wqq41m9`. You can query the customer gateway by using the [DescribeCustomerGateways](https://intl.cloud.tencent.com/document/product/215/17516?from_cn_redirect=1) API.
     * @param CustomerGatewayId The ID of the customer gateway, such as `cgw-2wqq41m9`. You can query the customer gateway by using the [DescribeCustomerGateways](https://intl.cloud.tencent.com/document/product/215/17516?from_cn_redirect=1) API.
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get Gateway can be named freely, but the maximum length is 60 characters. 
     * @return VpnConnectionName Gateway can be named freely, but the maximum length is 60 characters.
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set Gateway can be named freely, but the maximum length is 60 characters.
     * @param VpnConnectionName Gateway can be named freely, but the maximum length is 60 characters.
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
     * Get VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
This parameter is optional for a CCN-based VPN tunnel. 
     * @return VpcId VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
This parameter is optional for a CCN-based VPN tunnel.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
This parameter is optional for a CCN-based VPN tunnel.
     * @param VpcId VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
This parameter is optional for a CCN-based VPN tunnel.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get Internet Key Exchange (IKE) configuration. IKE has a self-protection mechanism. The network security protocol is configured by the user. 
     * @return IKEOptionsSpecification Internet Key Exchange (IKE) configuration. IKE has a self-protection mechanism. The network security protocol is configured by the user.
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set Internet Key Exchange (IKE) configuration. IKE has a self-protection mechanism. The network security protocol is configured by the user.
     * @param IKEOptionsSpecification Internet Key Exchange (IKE) configuration. IKE has a self-protection mechanism. The network security protocol is configured by the user.
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
     * Get Bound tags, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     * @param Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether the tunnel health check is supported. The default value is `False`. 
     * @return EnableHealthCheck Whether the tunnel health check is supported. The default value is `False`.
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set Whether the tunnel health check is supported. The default value is `False`.
     * @param EnableHealthCheck Whether the tunnel health check is supported. The default value is `False`.
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get Local IP of health check. It defaults to a random IP within 169.254.128.0/17. 
     * @return HealthCheckLocalIp Local IP of health check. It defaults to a random IP within 169.254.128.0/17.
     */
    public String getHealthCheckLocalIp() {
        return this.HealthCheckLocalIp;
    }

    /**
     * Set Local IP of health check. It defaults to a random IP within 169.254.128.0/17.
     * @param HealthCheckLocalIp Local IP of health check. It defaults to a random IP within 169.254.128.0/17.
     */
    public void setHealthCheckLocalIp(String HealthCheckLocalIp) {
        this.HealthCheckLocalIp = HealthCheckLocalIp;
    }

    /**
     * Get Peer IP of health check. It defaults to a random IP within 169.254.128.0/17. 
     * @return HealthCheckRemoteIp Peer IP of health check. It defaults to a random IP within 169.254.128.0/17.
     */
    public String getHealthCheckRemoteIp() {
        return this.HealthCheckRemoteIp;
    }

    /**
     * Set Peer IP of health check. It defaults to a random IP within 169.254.128.0/17.
     * @param HealthCheckRemoteIp Peer IP of health check. It defaults to a random IP within 169.254.128.0/17.
     */
    public void setHealthCheckRemoteIp(String HealthCheckRemoteIp) {
        this.HealthCheckRemoteIp = HealthCheckRemoteIp;
    }

    /**
     * Get Tunnel type. Valid values: `STATIC`, `StaticRoute`, and `Policy`. 
     * @return RouteType Tunnel type. Valid values: `STATIC`, `StaticRoute`, and `Policy`.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Tunnel type. Valid values: `STATIC`, `StaticRoute`, and `Policy`.
     * @param RouteType Tunnel type. Valid values: `STATIC`, `StaticRoute`, and `Policy`.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
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

    public CreateVpnConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnConnectionRequest(CreateVpnConnectionRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
        if (source.VpnConnectionName != null) {
            this.VpnConnectionName = new String(source.VpnConnectionName);
        }
        if (source.PreShareKey != null) {
            this.PreShareKey = new String(source.PreShareKey);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
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
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabases.", this.SecurityPolicyDatabases);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "HealthCheckLocalIp", this.HealthCheckLocalIp);
        this.setParamSimple(map, prefix + "HealthCheckRemoteIp", this.HealthCheckRemoteIp);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "NegotiationType", this.NegotiationType);
        this.setParamSimple(map, prefix + "DpdEnable", this.DpdEnable);
        this.setParamSimple(map, prefix + "DpdTimeout", this.DpdTimeout);
        this.setParamSimple(map, prefix + "DpdAction", this.DpdAction);

    }
}


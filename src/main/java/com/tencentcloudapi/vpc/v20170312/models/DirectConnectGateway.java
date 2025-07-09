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

public class DirectConnectGateway extends AbstractModel {

    /**
    * Direct Connect `ID`.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * Direct Connect gateway name.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * The `ID` of the `VPC` instance associated with the Direct Connect gateway.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The associated network type:
<li>`VPC` - VPC</li>
<li>`CCN` - CCN</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * The `ID` of the associated network instance:
<li>When the NetworkType is `VPC`, this value is the VPC instance `ID`</li>
<li>When the NetworkType is `CCN`, this value is the CCN instance `ID`</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * Gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>
NAT type supports network address switch configuration. After the type is confirmed, it cannot be modified. A VPC can create one NAT-type Direct Connect gateway and one non-NAT-type Direct Connect gateway
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Creation Time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Direct Connect gateway IP.
    */
    @SerializedName("DirectConnectGatewayIp")
    @Expose
    private String DirectConnectGatewayIp;

    /**
    * The `ID` of the `CCN` instance associated with the Direct Connect gateway.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The route-learning type of the CCN:
<li>`BGP` - Automatic learning.</li>
<li>`STATIC` - Static, that is, user-configured.</li>
    */
    @SerializedName("CcnRouteType")
    @Expose
    private String CcnRouteType;

    /**
    * Whether BGP is enabled.
    */
    @SerializedName("EnableBGP")
    @Expose
    private Boolean EnableBGP;

    /**
    * Whether to enable BGP's `community` attribute. Valid values: enable, disable
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
    * ID of the NAT gateway bound.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Whether the direct connect gateway supports the VXLAN architecture.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VXLANSupport")
    @Expose
    private Boolean [] VXLANSupport;

    /**
    * CCN route publishing mode. Valid values: `standard` and `exquisite`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ModeType")
    @Expose
    private String ModeType;

    /**
    * Whether the direct connect gateway is for an edge zone.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * Availability zone where the direct connect gateway resides.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The status of gateway traffic monitoring
0: disable
1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableFlowDetails")
    @Expose
    private Long EnableFlowDetails;

    /**
    * The last time when the gateway traffic monitoring is enabled/disabled
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowDetailsUpdateTime")
    @Expose
    private String FlowDetailsUpdateTime;

    /**
    * Whether gateway traffic monitoring is supported
0: No
1: Yes
Note: this field may return `null`, indicating that no valid values can be found.
    */
    @SerializedName("NewAfc")
    @Expose
    private Long NewAfc;

    /**
    * Direct connect gateway access network types:
<li>`VXLAN` - VXLAN type.</li>
<li>`MPLS` - MPLS type.</li>
<li>`Hybrid` - Hybrid type.</li>
Note: this field may return `null`, indicating that no valid values can be found.
    */
    @SerializedName("AccessNetworkType")
    @Expose
    private String AccessNetworkType;

    /**
    * AZ list of direct connect gateway with cross-AZ placement groups
Note: this field may return `null`, indicating that no valid values can be found.
    */
    @SerializedName("HaZoneList")
    @Expose
    private String [] HaZoneList;

    /**
     * Get Direct Connect `ID`. 
     * @return DirectConnectGatewayId Direct Connect `ID`.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set Direct Connect `ID`.
     * @param DirectConnectGatewayId Direct Connect `ID`.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get Direct Connect gateway name. 
     * @return DirectConnectGatewayName Direct Connect gateway name.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set Direct Connect gateway name.
     * @param DirectConnectGatewayName Direct Connect gateway name.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get The `ID` of the `VPC` instance associated with the Direct Connect gateway. 
     * @return VpcId The `ID` of the `VPC` instance associated with the Direct Connect gateway.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the `VPC` instance associated with the Direct Connect gateway.
     * @param VpcId The `ID` of the `VPC` instance associated with the Direct Connect gateway.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The associated network type:
<li>`VPC` - VPC</li>
<li>`CCN` - CCN</li> 
     * @return NetworkType The associated network type:
<li>`VPC` - VPC</li>
<li>`CCN` - CCN</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The associated network type:
<li>`VPC` - VPC</li>
<li>`CCN` - CCN</li>
     * @param NetworkType The associated network type:
<li>`VPC` - VPC</li>
<li>`CCN` - CCN</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get The `ID` of the associated network instance:
<li>When the NetworkType is `VPC`, this value is the VPC instance `ID`</li>
<li>When the NetworkType is `CCN`, this value is the CCN instance `ID`</li> 
     * @return NetworkInstanceId The `ID` of the associated network instance:
<li>When the NetworkType is `VPC`, this value is the VPC instance `ID`</li>
<li>When the NetworkType is `CCN`, this value is the CCN instance `ID`</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set The `ID` of the associated network instance:
<li>When the NetworkType is `VPC`, this value is the VPC instance `ID`</li>
<li>When the NetworkType is `CCN`, this value is the CCN instance `ID`</li>
     * @param NetworkInstanceId The `ID` of the associated network instance:
<li>When the NetworkType is `VPC`, this value is the VPC instance `ID`</li>
<li>When the NetworkType is `CCN`, this value is the CCN instance `ID`</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get Gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>
NAT type supports network address switch configuration. After the type is confirmed, it cannot be modified. A VPC can create one NAT-type Direct Connect gateway and one non-NAT-type Direct Connect gateway 
     * @return GatewayType Gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>
NAT type supports network address switch configuration. After the type is confirmed, it cannot be modified. A VPC can create one NAT-type Direct Connect gateway and one non-NAT-type Direct Connect gateway
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>
NAT type supports network address switch configuration. After the type is confirmed, it cannot be modified. A VPC can create one NAT-type Direct Connect gateway and one non-NAT-type Direct Connect gateway
     * @param GatewayType Gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>
NAT type supports network address switch configuration. After the type is confirmed, it cannot be modified. A VPC can create one NAT-type Direct Connect gateway and one non-NAT-type Direct Connect gateway
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Creation Time. 
     * @return CreateTime Creation Time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time.
     * @param CreateTime Creation Time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Direct Connect gateway IP. 
     * @return DirectConnectGatewayIp Direct Connect gateway IP.
     */
    public String getDirectConnectGatewayIp() {
        return this.DirectConnectGatewayIp;
    }

    /**
     * Set Direct Connect gateway IP.
     * @param DirectConnectGatewayIp Direct Connect gateway IP.
     */
    public void setDirectConnectGatewayIp(String DirectConnectGatewayIp) {
        this.DirectConnectGatewayIp = DirectConnectGatewayIp;
    }

    /**
     * Get The `ID` of the `CCN` instance associated with the Direct Connect gateway. 
     * @return CcnId The `ID` of the `CCN` instance associated with the Direct Connect gateway.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The `ID` of the `CCN` instance associated with the Direct Connect gateway.
     * @param CcnId The `ID` of the `CCN` instance associated with the Direct Connect gateway.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The route-learning type of the CCN:
<li>`BGP` - Automatic learning.</li>
<li>`STATIC` - Static, that is, user-configured.</li> 
     * @return CcnRouteType The route-learning type of the CCN:
<li>`BGP` - Automatic learning.</li>
<li>`STATIC` - Static, that is, user-configured.</li>
     */
    public String getCcnRouteType() {
        return this.CcnRouteType;
    }

    /**
     * Set The route-learning type of the CCN:
<li>`BGP` - Automatic learning.</li>
<li>`STATIC` - Static, that is, user-configured.</li>
     * @param CcnRouteType The route-learning type of the CCN:
<li>`BGP` - Automatic learning.</li>
<li>`STATIC` - Static, that is, user-configured.</li>
     */
    public void setCcnRouteType(String CcnRouteType) {
        this.CcnRouteType = CcnRouteType;
    }

    /**
     * Get Whether BGP is enabled. 
     * @return EnableBGP Whether BGP is enabled.
     */
    public Boolean getEnableBGP() {
        return this.EnableBGP;
    }

    /**
     * Set Whether BGP is enabled.
     * @param EnableBGP Whether BGP is enabled.
     */
    public void setEnableBGP(Boolean EnableBGP) {
        this.EnableBGP = EnableBGP;
    }

    /**
     * Get Whether to enable BGP's `community` attribute. Valid values: enable, disable 
     * @return EnableBGPCommunity Whether to enable BGP's `community` attribute. Valid values: enable, disable
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set Whether to enable BGP's `community` attribute. Valid values: enable, disable
     * @param EnableBGPCommunity Whether to enable BGP's `community` attribute. Valid values: enable, disable
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
    }

    /**
     * Get ID of the NAT gateway bound.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return NatGatewayId ID of the NAT gateway bound.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set ID of the NAT gateway bound.
Note: this field may return `null`, indicating that no valid value was found.
     * @param NatGatewayId ID of the NAT gateway bound.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Whether the direct connect gateway supports the VXLAN architecture.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VXLANSupport Whether the direct connect gateway supports the VXLAN architecture.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean [] getVXLANSupport() {
        return this.VXLANSupport;
    }

    /**
     * Set Whether the direct connect gateway supports the VXLAN architecture.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VXLANSupport Whether the direct connect gateway supports the VXLAN architecture.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVXLANSupport(Boolean [] VXLANSupport) {
        this.VXLANSupport = VXLANSupport;
    }

    /**
     * Get CCN route publishing mode. Valid values: `standard` and `exquisite`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ModeType CCN route publishing mode. Valid values: `standard` and `exquisite`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModeType() {
        return this.ModeType;
    }

    /**
     * Set CCN route publishing mode. Valid values: `standard` and `exquisite`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ModeType CCN route publishing mode. Valid values: `standard` and `exquisite`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModeType(String ModeType) {
        this.ModeType = ModeType;
    }

    /**
     * Get Whether the direct connect gateway is for an edge zone.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LocalZone Whether the direct connect gateway is for an edge zone.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set Whether the direct connect gateway is for an edge zone.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LocalZone Whether the direct connect gateway is for an edge zone.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get Availability zone where the direct connect gateway resides.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Zone Availability zone where the direct connect gateway resides.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone where the direct connect gateway resides.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Zone Availability zone where the direct connect gateway resides.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The status of gateway traffic monitoring
0: disable
1: enable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableFlowDetails The status of gateway traffic monitoring
0: disable
1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEnableFlowDetails() {
        return this.EnableFlowDetails;
    }

    /**
     * Set The status of gateway traffic monitoring
0: disable
1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EnableFlowDetails The status of gateway traffic monitoring
0: disable
1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableFlowDetails(Long EnableFlowDetails) {
        this.EnableFlowDetails = EnableFlowDetails;
    }

    /**
     * Get The last time when the gateway traffic monitoring is enabled/disabled
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FlowDetailsUpdateTime The last time when the gateway traffic monitoring is enabled/disabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFlowDetailsUpdateTime() {
        return this.FlowDetailsUpdateTime;
    }

    /**
     * Set The last time when the gateway traffic monitoring is enabled/disabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FlowDetailsUpdateTime The last time when the gateway traffic monitoring is enabled/disabled
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFlowDetailsUpdateTime(String FlowDetailsUpdateTime) {
        this.FlowDetailsUpdateTime = FlowDetailsUpdateTime;
    }

    /**
     * Get Whether gateway traffic monitoring is supported
0: No
1: Yes
Note: this field may return `null`, indicating that no valid values can be found. 
     * @return NewAfc Whether gateway traffic monitoring is supported
0: No
1: Yes
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public Long getNewAfc() {
        return this.NewAfc;
    }

    /**
     * Set Whether gateway traffic monitoring is supported
0: No
1: Yes
Note: this field may return `null`, indicating that no valid values can be found.
     * @param NewAfc Whether gateway traffic monitoring is supported
0: No
1: Yes
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public void setNewAfc(Long NewAfc) {
        this.NewAfc = NewAfc;
    }

    /**
     * Get Direct connect gateway access network types:
<li>`VXLAN` - VXLAN type.</li>
<li>`MPLS` - MPLS type.</li>
<li>`Hybrid` - Hybrid type.</li>
Note: this field may return `null`, indicating that no valid values can be found. 
     * @return AccessNetworkType Direct connect gateway access network types:
<li>`VXLAN` - VXLAN type.</li>
<li>`MPLS` - MPLS type.</li>
<li>`Hybrid` - Hybrid type.</li>
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public String getAccessNetworkType() {
        return this.AccessNetworkType;
    }

    /**
     * Set Direct connect gateway access network types:
<li>`VXLAN` - VXLAN type.</li>
<li>`MPLS` - MPLS type.</li>
<li>`Hybrid` - Hybrid type.</li>
Note: this field may return `null`, indicating that no valid values can be found.
     * @param AccessNetworkType Direct connect gateway access network types:
<li>`VXLAN` - VXLAN type.</li>
<li>`MPLS` - MPLS type.</li>
<li>`Hybrid` - Hybrid type.</li>
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public void setAccessNetworkType(String AccessNetworkType) {
        this.AccessNetworkType = AccessNetworkType;
    }

    /**
     * Get AZ list of direct connect gateway with cross-AZ placement groups
Note: this field may return `null`, indicating that no valid values can be found. 
     * @return HaZoneList AZ list of direct connect gateway with cross-AZ placement groups
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public String [] getHaZoneList() {
        return this.HaZoneList;
    }

    /**
     * Set AZ list of direct connect gateway with cross-AZ placement groups
Note: this field may return `null`, indicating that no valid values can be found.
     * @param HaZoneList AZ list of direct connect gateway with cross-AZ placement groups
Note: this field may return `null`, indicating that no valid values can be found.
     */
    public void setHaZoneList(String [] HaZoneList) {
        this.HaZoneList = HaZoneList;
    }

    public DirectConnectGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectGateway(DirectConnectGateway source) {
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DirectConnectGatewayIp != null) {
            this.DirectConnectGatewayIp = new String(source.DirectConnectGatewayIp);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnRouteType != null) {
            this.CcnRouteType = new String(source.CcnRouteType);
        }
        if (source.EnableBGP != null) {
            this.EnableBGP = new Boolean(source.EnableBGP);
        }
        if (source.EnableBGPCommunity != null) {
            this.EnableBGPCommunity = new Boolean(source.EnableBGPCommunity);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.VXLANSupport != null) {
            this.VXLANSupport = new Boolean[source.VXLANSupport.length];
            for (int i = 0; i < source.VXLANSupport.length; i++) {
                this.VXLANSupport[i] = new Boolean(source.VXLANSupport[i]);
            }
        }
        if (source.ModeType != null) {
            this.ModeType = new String(source.ModeType);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.EnableFlowDetails != null) {
            this.EnableFlowDetails = new Long(source.EnableFlowDetails);
        }
        if (source.FlowDetailsUpdateTime != null) {
            this.FlowDetailsUpdateTime = new String(source.FlowDetailsUpdateTime);
        }
        if (source.NewAfc != null) {
            this.NewAfc = new Long(source.NewAfc);
        }
        if (source.AccessNetworkType != null) {
            this.AccessNetworkType = new String(source.AccessNetworkType);
        }
        if (source.HaZoneList != null) {
            this.HaZoneList = new String[source.HaZoneList.length];
            for (int i = 0; i < source.HaZoneList.length; i++) {
                this.HaZoneList[i] = new String(source.HaZoneList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DirectConnectGatewayIp", this.DirectConnectGatewayIp);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnRouteType", this.CcnRouteType);
        this.setParamSimple(map, prefix + "EnableBGP", this.EnableBGP);
        this.setParamSimple(map, prefix + "EnableBGPCommunity", this.EnableBGPCommunity);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArraySimple(map, prefix + "VXLANSupport.", this.VXLANSupport);
        this.setParamSimple(map, prefix + "ModeType", this.ModeType);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "EnableFlowDetails", this.EnableFlowDetails);
        this.setParamSimple(map, prefix + "FlowDetailsUpdateTime", this.FlowDetailsUpdateTime);
        this.setParamSimple(map, prefix + "NewAfc", this.NewAfc);
        this.setParamSimple(map, prefix + "AccessNetworkType", this.AccessNetworkType);
        this.setParamArraySimple(map, prefix + "HaZoneList.", this.HaZoneList);

    }
}


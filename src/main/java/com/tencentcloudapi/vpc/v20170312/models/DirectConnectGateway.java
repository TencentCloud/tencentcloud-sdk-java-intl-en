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

public class DirectConnectGateway extends AbstractModel{

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
    * 
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

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
     * Get  
     * @return EnableBGPCommunity 
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set 
     * @param EnableBGPCommunity 
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
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

    }
}


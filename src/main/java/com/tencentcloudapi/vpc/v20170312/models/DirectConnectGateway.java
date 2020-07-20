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
    * The direct connect gateway ID.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * The direct connect gateway name.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * The ID of the VPC instance associated with the direct connect gateway.
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
    * The ID of the associated network instance:
<li>When the `NetworkType` is `VPC`, this value is the VPC instance ID</li>
<li>When the `NetworkType` is `CCN`, this value is the CCN instance ID</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * The gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT type</li>
The NAT type supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The direct connect gateway IP.
    */
    @SerializedName("DirectConnectGatewayIp")
    @Expose
    private String DirectConnectGatewayIp;

    /**
    * The ID of the CCN instance associated with the direct connect gateway.
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
    * Whether the BGP is enabled.
    */
    @SerializedName("EnableBGP")
    @Expose
    private Boolean EnableBGP;

    /**
    * Whether the `community` attribute of the BGP is enabled.
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
     * Get The direct connect gateway ID. 
     * @return DirectConnectGatewayId The direct connect gateway ID.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The direct connect gateway ID.
     * @param DirectConnectGatewayId The direct connect gateway ID.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get The direct connect gateway name. 
     * @return DirectConnectGatewayName The direct connect gateway name.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set The direct connect gateway name.
     * @param DirectConnectGatewayName The direct connect gateway name.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get The ID of the VPC instance associated with the direct connect gateway. 
     * @return VpcId The ID of the VPC instance associated with the direct connect gateway.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of the VPC instance associated with the direct connect gateway.
     * @param VpcId The ID of the VPC instance associated with the direct connect gateway.
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
     * Get The ID of the associated network instance:
<li>When the `NetworkType` is `VPC`, this value is the VPC instance ID</li>
<li>When the `NetworkType` is `CCN`, this value is the CCN instance ID</li> 
     * @return NetworkInstanceId The ID of the associated network instance:
<li>When the `NetworkType` is `VPC`, this value is the VPC instance ID</li>
<li>When the `NetworkType` is `CCN`, this value is the CCN instance ID</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set The ID of the associated network instance:
<li>When the `NetworkType` is `VPC`, this value is the VPC instance ID</li>
<li>When the `NetworkType` is `CCN`, this value is the CCN instance ID</li>
     * @param NetworkInstanceId The ID of the associated network instance:
<li>When the `NetworkType` is `VPC`, this value is the VPC instance ID</li>
<li>When the `NetworkType` is `CCN`, this value is the CCN instance ID</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get The gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT type</li>
The NAT type supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway 
     * @return GatewayType The gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT type</li>
The NAT type supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set The gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT type</li>
The NAT type supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     * @param GatewayType The gateway type:
<li>NORMAL - Standard type. Note: CCN only supports the standard type</li>
<li>NAT type</li>
The NAT type supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The direct connect gateway IP. 
     * @return DirectConnectGatewayIp The direct connect gateway IP.
     */
    public String getDirectConnectGatewayIp() {
        return this.DirectConnectGatewayIp;
    }

    /**
     * Set The direct connect gateway IP.
     * @param DirectConnectGatewayIp The direct connect gateway IP.
     */
    public void setDirectConnectGatewayIp(String DirectConnectGatewayIp) {
        this.DirectConnectGatewayIp = DirectConnectGatewayIp;
    }

    /**
     * Get The ID of the CCN instance associated with the direct connect gateway. 
     * @return CcnId The ID of the CCN instance associated with the direct connect gateway.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The ID of the CCN instance associated with the direct connect gateway.
     * @param CcnId The ID of the CCN instance associated with the direct connect gateway.
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
     * Get Whether the BGP is enabled. 
     * @return EnableBGP Whether the BGP is enabled.
     */
    public Boolean getEnableBGP() {
        return this.EnableBGP;
    }

    /**
     * Set Whether the BGP is enabled.
     * @param EnableBGP Whether the BGP is enabled.
     */
    public void setEnableBGP(Boolean EnableBGP) {
        this.EnableBGP = EnableBGP;
    }

    /**
     * Get Whether the `community` attribute of the BGP is enabled. 
     * @return EnableBGPCommunity Whether the `community` attribute of the BGP is enabled.
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set Whether the `community` attribute of the BGP is enabled.
     * @param EnableBGPCommunity Whether the `community` attribute of the BGP is enabled.
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


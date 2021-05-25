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

public class CreateDirectConnectGatewayRequest extends AbstractModel{

    /**
    * The name of the direct connect gateway.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * The type of the associated network. Valid values:
<li>VPC</li>
<li>CCN</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <li>When the NetworkType is VPC, this value is the VPC instance ID</li>
<li>When the NetworkType is CCN, this value is the CCN instance ID</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * The type of the gateway. Valid values:
<li>NORMAL - (Default) Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>NAT gateway supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * CCN route publishing method. Valid values: `standard` and `exquisite`. This parameter is only valid for the CCN direct connect gateway.
    */
    @SerializedName("ModeType")
    @Expose
    private String ModeType;

    /**
    * Availability zone where the direct connect gateway resides.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get The name of the direct connect gateway. 
     * @return DirectConnectGatewayName The name of the direct connect gateway.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set The name of the direct connect gateway.
     * @param DirectConnectGatewayName The name of the direct connect gateway.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get The type of the associated network. Valid values:
<li>VPC</li>
<li>CCN</li> 
     * @return NetworkType The type of the associated network. Valid values:
<li>VPC</li>
<li>CCN</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The type of the associated network. Valid values:
<li>VPC</li>
<li>CCN</li>
     * @param NetworkType The type of the associated network. Valid values:
<li>VPC</li>
<li>CCN</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <li>When the NetworkType is VPC, this value is the VPC instance ID</li>
<li>When the NetworkType is CCN, this value is the CCN instance ID</li> 
     * @return NetworkInstanceId <li>When the NetworkType is VPC, this value is the VPC instance ID</li>
<li>When the NetworkType is CCN, this value is the CCN instance ID</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set <li>When the NetworkType is VPC, this value is the VPC instance ID</li>
<li>When the NetworkType is CCN, this value is the CCN instance ID</li>
     * @param NetworkInstanceId <li>When the NetworkType is VPC, this value is the VPC instance ID</li>
<li>When the NetworkType is CCN, this value is the CCN instance ID</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get The type of the gateway. Valid values:
<li>NORMAL - (Default) Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>NAT gateway supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway 
     * @return GatewayType The type of the gateway. Valid values:
<li>NORMAL - (Default) Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>NAT gateway supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set The type of the gateway. Valid values:
<li>NORMAL - (Default) Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>NAT gateway supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     * @param GatewayType The type of the gateway. Valid values:
<li>NORMAL - (Default) Standard type. Note: CCN only supports the standard type</li>
<li>NAT - NAT type</li>NAT gateway supports network address translation. The specified type cannot be modified. A VPC can create one NAT direct connect gateway and one non-NAT direct connect gateway
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get CCN route publishing method. Valid values: `standard` and `exquisite`. This parameter is only valid for the CCN direct connect gateway. 
     * @return ModeType CCN route publishing method. Valid values: `standard` and `exquisite`. This parameter is only valid for the CCN direct connect gateway.
     */
    public String getModeType() {
        return this.ModeType;
    }

    /**
     * Set CCN route publishing method. Valid values: `standard` and `exquisite`. This parameter is only valid for the CCN direct connect gateway.
     * @param ModeType CCN route publishing method. Valid values: `standard` and `exquisite`. This parameter is only valid for the CCN direct connect gateway.
     */
    public void setModeType(String ModeType) {
        this.ModeType = ModeType;
    }

    /**
     * Get Availability zone where the direct connect gateway resides. 
     * @return Zone Availability zone where the direct connect gateway resides.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone where the direct connect gateway resides.
     * @param Zone Availability zone where the direct connect gateway resides.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public CreateDirectConnectGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDirectConnectGatewayRequest(CreateDirectConnectGatewayRequest source) {
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
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
        if (source.ModeType != null) {
            this.ModeType = new String(source.ModeType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "ModeType", this.ModeType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}


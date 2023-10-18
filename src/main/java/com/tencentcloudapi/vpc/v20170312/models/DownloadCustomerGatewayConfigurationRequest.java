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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadCustomerGatewayConfigurationRequest extends AbstractModel {

    /**
    * The ID of the VPN gateway instance.
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * The ID of the VPN tunnel instance, such as `vpnx-f49l6u0z`.
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * Customer gateway vendor information object, which can be obtained through DescribeCustomerGatewayVendors.
    */
    @SerializedName("CustomerGatewayVendor")
    @Expose
    private CustomerGatewayVendor CustomerGatewayVendor;

    /**
    * Name of the physical API for tunnel access device.
    */
    @SerializedName("InterfaceName")
    @Expose
    private String InterfaceName;

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
     * Get Customer gateway vendor information object, which can be obtained through DescribeCustomerGatewayVendors. 
     * @return CustomerGatewayVendor Customer gateway vendor information object, which can be obtained through DescribeCustomerGatewayVendors.
     */
    public CustomerGatewayVendor getCustomerGatewayVendor() {
        return this.CustomerGatewayVendor;
    }

    /**
     * Set Customer gateway vendor information object, which can be obtained through DescribeCustomerGatewayVendors.
     * @param CustomerGatewayVendor Customer gateway vendor information object, which can be obtained through DescribeCustomerGatewayVendors.
     */
    public void setCustomerGatewayVendor(CustomerGatewayVendor CustomerGatewayVendor) {
        this.CustomerGatewayVendor = CustomerGatewayVendor;
    }

    /**
     * Get Name of the physical API for tunnel access device. 
     * @return InterfaceName Name of the physical API for tunnel access device.
     */
    public String getInterfaceName() {
        return this.InterfaceName;
    }

    /**
     * Set Name of the physical API for tunnel access device.
     * @param InterfaceName Name of the physical API for tunnel access device.
     */
    public void setInterfaceName(String InterfaceName) {
        this.InterfaceName = InterfaceName;
    }

    public DownloadCustomerGatewayConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadCustomerGatewayConfigurationRequest(DownloadCustomerGatewayConfigurationRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.CustomerGatewayVendor != null) {
            this.CustomerGatewayVendor = new CustomerGatewayVendor(source.CustomerGatewayVendor);
        }
        if (source.InterfaceName != null) {
            this.InterfaceName = new String(source.InterfaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamObj(map, prefix + "CustomerGatewayVendor.", this.CustomerGatewayVendor);
        this.setParamSimple(map, prefix + "InterfaceName", this.InterfaceName);

    }
}


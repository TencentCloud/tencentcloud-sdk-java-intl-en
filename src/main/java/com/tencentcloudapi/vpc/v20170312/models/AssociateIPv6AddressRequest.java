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

public class AssociateIPv6AddressRequest extends AbstractModel {

    /**
    * Unique ID of the EIPv6, such as eipv6-11112222.
    */
    @SerializedName("IPv6AddressId")
    @Expose
    private String IPv6AddressId;

    /**
    * ID of the ENI to be bound, such as eni-11112222. NetworkInterfaceId and InstanceId cannot be specified at the same time. The ENI ID can be queried by logging in to the console or obtained from the networkInterfaceId field in the returned value of the DescribeNetworkInterfaces API.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * Private IPv6 to be bound. If NetworkInterfaceId is specified, PrivateIPv6Address must also be specified, which indicates that the EIP will be bound to the specified private IPv6 of the specified ENI. At the same time, it shall be ensured that the specified PrivateIPv6Address is a private IPv6 on the specified NetworkInterfaceId. The specified ENI's private IPv6 can be queried by logging in to the console or obtained from the Ipv6AddressSet.Address field in the returned value of the DescribeNetworkInterfaces API.
    */
    @SerializedName("PrivateIPv6Address")
    @Expose
    private String PrivateIPv6Address;

    /**
     * Get Unique ID of the EIPv6, such as eipv6-11112222. 
     * @return IPv6AddressId Unique ID of the EIPv6, such as eipv6-11112222.
     */
    public String getIPv6AddressId() {
        return this.IPv6AddressId;
    }

    /**
     * Set Unique ID of the EIPv6, such as eipv6-11112222.
     * @param IPv6AddressId Unique ID of the EIPv6, such as eipv6-11112222.
     */
    public void setIPv6AddressId(String IPv6AddressId) {
        this.IPv6AddressId = IPv6AddressId;
    }

    /**
     * Get ID of the ENI to be bound, such as eni-11112222. NetworkInterfaceId and InstanceId cannot be specified at the same time. The ENI ID can be queried by logging in to the console or obtained from the networkInterfaceId field in the returned value of the DescribeNetworkInterfaces API. 
     * @return NetworkInterfaceId ID of the ENI to be bound, such as eni-11112222. NetworkInterfaceId and InstanceId cannot be specified at the same time. The ENI ID can be queried by logging in to the console or obtained from the networkInterfaceId field in the returned value of the DescribeNetworkInterfaces API.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ID of the ENI to be bound, such as eni-11112222. NetworkInterfaceId and InstanceId cannot be specified at the same time. The ENI ID can be queried by logging in to the console or obtained from the networkInterfaceId field in the returned value of the DescribeNetworkInterfaces API.
     * @param NetworkInterfaceId ID of the ENI to be bound, such as eni-11112222. NetworkInterfaceId and InstanceId cannot be specified at the same time. The ENI ID can be queried by logging in to the console or obtained from the networkInterfaceId field in the returned value of the DescribeNetworkInterfaces API.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get Private IPv6 to be bound. If NetworkInterfaceId is specified, PrivateIPv6Address must also be specified, which indicates that the EIP will be bound to the specified private IPv6 of the specified ENI. At the same time, it shall be ensured that the specified PrivateIPv6Address is a private IPv6 on the specified NetworkInterfaceId. The specified ENI's private IPv6 can be queried by logging in to the console or obtained from the Ipv6AddressSet.Address field in the returned value of the DescribeNetworkInterfaces API. 
     * @return PrivateIPv6Address Private IPv6 to be bound. If NetworkInterfaceId is specified, PrivateIPv6Address must also be specified, which indicates that the EIP will be bound to the specified private IPv6 of the specified ENI. At the same time, it shall be ensured that the specified PrivateIPv6Address is a private IPv6 on the specified NetworkInterfaceId. The specified ENI's private IPv6 can be queried by logging in to the console or obtained from the Ipv6AddressSet.Address field in the returned value of the DescribeNetworkInterfaces API.
     */
    public String getPrivateIPv6Address() {
        return this.PrivateIPv6Address;
    }

    /**
     * Set Private IPv6 to be bound. If NetworkInterfaceId is specified, PrivateIPv6Address must also be specified, which indicates that the EIP will be bound to the specified private IPv6 of the specified ENI. At the same time, it shall be ensured that the specified PrivateIPv6Address is a private IPv6 on the specified NetworkInterfaceId. The specified ENI's private IPv6 can be queried by logging in to the console or obtained from the Ipv6AddressSet.Address field in the returned value of the DescribeNetworkInterfaces API.
     * @param PrivateIPv6Address Private IPv6 to be bound. If NetworkInterfaceId is specified, PrivateIPv6Address must also be specified, which indicates that the EIP will be bound to the specified private IPv6 of the specified ENI. At the same time, it shall be ensured that the specified PrivateIPv6Address is a private IPv6 on the specified NetworkInterfaceId. The specified ENI's private IPv6 can be queried by logging in to the console or obtained from the Ipv6AddressSet.Address field in the returned value of the DescribeNetworkInterfaces API.
     */
    public void setPrivateIPv6Address(String PrivateIPv6Address) {
        this.PrivateIPv6Address = PrivateIPv6Address;
    }

    public AssociateIPv6AddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateIPv6AddressRequest(AssociateIPv6AddressRequest source) {
        if (source.IPv6AddressId != null) {
            this.IPv6AddressId = new String(source.IPv6AddressId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateIPv6Address != null) {
            this.PrivateIPv6Address = new String(source.PrivateIPv6Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPv6AddressId", this.IPv6AddressId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIPv6Address", this.PrivateIPv6Address);

    }
}


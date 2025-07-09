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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateAddressesRequest extends AbstractModel {

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Number of EIPs. Default value: 1.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * CMCC: China Mobile
CTCC: China Telecom
CUCC: China Unicom
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 1–5000 Mbps. Default value: 1 Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * List of tags to be bound.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * ID of the instance to be bound.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the ENI to be bound, such as `eni-11112222`. `NetworkInterfaceId` and `InstanceId` cannot be specified at the same time. The ENI ID can be obtained from the `networkInterfaceId` field in the returned value of the `DescribeNetworkInterfaces` API.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * Private IP to be bound. If you specify `NetworkInterfaceId`, you must also specify `PrivateIpAddress`, which means to bind the EIP to the specified private IP of the specified ENI. You must also make sure that the specified `PrivateIpAddress` is a private IP of the specified `NetworkInterfaceId`. The private IP of the specified ENI can be obtained from the `privateIpAddress` field in the returned value of the `DescribeNetworkInterfaces` API.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Number of EIPs. Default value: 1. 
     * @return AddressCount Number of EIPs. Default value: 1.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set Number of EIPs. Default value: 1.
     * @param AddressCount Number of EIPs. Default value: 1.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get CMCC: China Mobile
CTCC: China Telecom
CUCC: China Unicom 
     * @return InternetServiceProvider CMCC: China Mobile
CTCC: China Telecom
CUCC: China Unicom
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set CMCC: China Mobile
CTCC: China Telecom
CUCC: China Unicom
     * @param InternetServiceProvider CMCC: China Mobile
CTCC: China Telecom
CUCC: China Unicom
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 1–5000 Mbps. Default value: 1 Mbps. 
     * @return InternetMaxBandwidthOut 1–5000 Mbps. Default value: 1 Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 1–5000 Mbps. Default value: 1 Mbps.
     * @param InternetMaxBandwidthOut 1–5000 Mbps. Default value: 1 Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get List of tags to be bound. 
     * @return Tags List of tags to be bound.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound.
     * @param Tags List of tags to be bound.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the instance to be bound. 
     * @return InstanceId ID of the instance to be bound.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be bound.
     * @param InstanceId ID of the instance to be bound.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of the ENI to be bound, such as `eni-11112222`. `NetworkInterfaceId` and `InstanceId` cannot be specified at the same time. The ENI ID can be obtained from the `networkInterfaceId` field in the returned value of the `DescribeNetworkInterfaces` API. 
     * @return NetworkInterfaceId ID of the ENI to be bound, such as `eni-11112222`. `NetworkInterfaceId` and `InstanceId` cannot be specified at the same time. The ENI ID can be obtained from the `networkInterfaceId` field in the returned value of the `DescribeNetworkInterfaces` API.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ID of the ENI to be bound, such as `eni-11112222`. `NetworkInterfaceId` and `InstanceId` cannot be specified at the same time. The ENI ID can be obtained from the `networkInterfaceId` field in the returned value of the `DescribeNetworkInterfaces` API.
     * @param NetworkInterfaceId ID of the ENI to be bound, such as `eni-11112222`. `NetworkInterfaceId` and `InstanceId` cannot be specified at the same time. The ENI ID can be obtained from the `networkInterfaceId` field in the returned value of the `DescribeNetworkInterfaces` API.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get Private IP to be bound. If you specify `NetworkInterfaceId`, you must also specify `PrivateIpAddress`, which means to bind the EIP to the specified private IP of the specified ENI. You must also make sure that the specified `PrivateIpAddress` is a private IP of the specified `NetworkInterfaceId`. The private IP of the specified ENI can be obtained from the `privateIpAddress` field in the returned value of the `DescribeNetworkInterfaces` API. 
     * @return PrivateIpAddress Private IP to be bound. If you specify `NetworkInterfaceId`, you must also specify `PrivateIpAddress`, which means to bind the EIP to the specified private IP of the specified ENI. You must also make sure that the specified `PrivateIpAddress` is a private IP of the specified `NetworkInterfaceId`. The private IP of the specified ENI can be obtained from the `privateIpAddress` field in the returned value of the `DescribeNetworkInterfaces` API.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Private IP to be bound. If you specify `NetworkInterfaceId`, you must also specify `PrivateIpAddress`, which means to bind the EIP to the specified private IP of the specified ENI. You must also make sure that the specified `PrivateIpAddress` is a private IP of the specified `NetworkInterfaceId`. The private IP of the specified ENI can be obtained from the `privateIpAddress` field in the returned value of the `DescribeNetworkInterfaces` API.
     * @param PrivateIpAddress Private IP to be bound. If you specify `NetworkInterfaceId`, you must also specify `PrivateIpAddress`, which means to bind the EIP to the specified private IP of the specified ENI. You must also make sure that the specified `PrivateIpAddress` is a private IP of the specified `NetworkInterfaceId`. The private IP of the specified ENI can be obtained from the `privateIpAddress` field in the returned value of the `DescribeNetworkInterfaces` API.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    public AllocateAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateAddressesRequest(AllocateAddressesRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);

    }
}


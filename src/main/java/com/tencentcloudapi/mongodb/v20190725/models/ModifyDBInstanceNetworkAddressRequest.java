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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkAddressRequest extends AbstractModel {

    /**
    * Specifies the ID of the instance for modifying the network. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retention period of the original IP address.
 - Unit: minutes. 0 means that the IP address is immediately repossessed.
 - The original IP address will be released after a scheduled period. Both the original and new IP addresses are accessible before release.

    */
    @SerializedName("OldIpExpiredTime")
    @Expose
    private Long OldIpExpiredTime;

    /**
    * VPC ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the VPC ID.
    */
    @SerializedName("NewUniqVpcId")
    @Expose
    private String NewUniqVpcId;

    /**
    * VPC subnet ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the subnet ID of the VPC.
    */
    @SerializedName("NewUniqSubnetId")
    @Expose
    private String NewUniqSubnetId;

    /**
    * IP address information, including the new IP address and the original IP address.
    */
    @SerializedName("NetworkAddresses")
    @Expose
    private ModifyNetworkAddress [] NetworkAddresses;

    /**
     * Get Specifies the ID of the instance for modifying the network. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
 
     * @return InstanceId Specifies the ID of the instance for modifying the network. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the ID of the instance for modifying the network. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     * @param InstanceId Specifies the ID of the instance for modifying the network. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retention period of the original IP address.
 - Unit: minutes. 0 means that the IP address is immediately repossessed.
 - The original IP address will be released after a scheduled period. Both the original and new IP addresses are accessible before release.
 
     * @return OldIpExpiredTime Retention period of the original IP address.
 - Unit: minutes. 0 means that the IP address is immediately repossessed.
 - The original IP address will be released after a scheduled period. Both the original and new IP addresses are accessible before release.

     */
    public Long getOldIpExpiredTime() {
        return this.OldIpExpiredTime;
    }

    /**
     * Set Retention period of the original IP address.
 - Unit: minutes. 0 means that the IP address is immediately repossessed.
 - The original IP address will be released after a scheduled period. Both the original and new IP addresses are accessible before release.

     * @param OldIpExpiredTime Retention period of the original IP address.
 - Unit: minutes. 0 means that the IP address is immediately repossessed.
 - The original IP address will be released after a scheduled period. Both the original and new IP addresses are accessible before release.

     */
    public void setOldIpExpiredTime(Long OldIpExpiredTime) {
        this.OldIpExpiredTime = OldIpExpiredTime;
    }

    /**
     * Get VPC ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the VPC ID. 
     * @return NewUniqVpcId VPC ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the VPC ID.
     */
    public String getNewUniqVpcId() {
        return this.NewUniqVpcId;
    }

    /**
     * Set VPC ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the VPC ID.
     * @param NewUniqVpcId VPC ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the VPC ID.
     */
    public void setNewUniqVpcId(String NewUniqVpcId) {
        this.NewUniqVpcId = NewUniqVpcId;
    }

    /**
     * Get VPC subnet ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the subnet ID of the VPC. 
     * @return NewUniqSubnetId VPC subnet ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the subnet ID of the VPC.
     */
    public String getNewUniqSubnetId() {
        return this.NewUniqSubnetId;
    }

    /**
     * Set VPC subnet ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the subnet ID of the VPC.
     * @param NewUniqSubnetId VPC subnet ID after the switch. If the instance is using a basic network, this field is not required. The [DescribeDBInstances](https://www.tencentcloud.com/document/product/240/38568?from_cn_redirect=1) API can be called to obtain the subnet ID of the VPC.
     */
    public void setNewUniqSubnetId(String NewUniqSubnetId) {
        this.NewUniqSubnetId = NewUniqSubnetId;
    }

    /**
     * Get IP address information, including the new IP address and the original IP address. 
     * @return NetworkAddresses IP address information, including the new IP address and the original IP address.
     */
    public ModifyNetworkAddress [] getNetworkAddresses() {
        return this.NetworkAddresses;
    }

    /**
     * Set IP address information, including the new IP address and the original IP address.
     * @param NetworkAddresses IP address information, including the new IP address and the original IP address.
     */
    public void setNetworkAddresses(ModifyNetworkAddress [] NetworkAddresses) {
        this.NetworkAddresses = NetworkAddresses;
    }

    public ModifyDBInstanceNetworkAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkAddressRequest(ModifyDBInstanceNetworkAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldIpExpiredTime != null) {
            this.OldIpExpiredTime = new Long(source.OldIpExpiredTime);
        }
        if (source.NewUniqVpcId != null) {
            this.NewUniqVpcId = new String(source.NewUniqVpcId);
        }
        if (source.NewUniqSubnetId != null) {
            this.NewUniqSubnetId = new String(source.NewUniqSubnetId);
        }
        if (source.NetworkAddresses != null) {
            this.NetworkAddresses = new ModifyNetworkAddress[source.NetworkAddresses.length];
            for (int i = 0; i < source.NetworkAddresses.length; i++) {
                this.NetworkAddresses[i] = new ModifyNetworkAddress(source.NetworkAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldIpExpiredTime", this.OldIpExpiredTime);
        this.setParamSimple(map, prefix + "NewUniqVpcId", this.NewUniqVpcId);
        this.setParamSimple(map, prefix + "NewUniqSubnetId", this.NewUniqSubnetId);
        this.setParamArrayObj(map, prefix + "NetworkAddresses.", this.NetworkAddresses);

    }
}


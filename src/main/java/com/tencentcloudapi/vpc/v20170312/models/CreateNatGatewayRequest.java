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

public class CreateNatGatewayRequest extends AbstractModel {

    /**
    * NAT gateway name
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The maximum outbound bandwidth of the NAT gateway (unit: Mbps). Supported parameter values: `20, 50, 100, 200, 500, 1000, 2000, 5000`. Default: `100`.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * The concurrent connection cap of the NAT gateway. Values: `1000000, 3000000, 10000000`. The default value is `1000000`.
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
    * The number of EIPs that you want to apply for. Either `AddressCount` or `PublicIpAddresses` must be passed in.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * The EIP array bound to the NAT gateway. Either AddressCount or PublicIpAddresses must be passed in.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * The availability zone, such as `ap-guangzhou-1`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Subnet of the NAT gateway
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The bandwidth size (in Mbps) of the EIP bound to the NAT gateway, which defaults to the maximum value applicable for the current user type.
    */
    @SerializedName("StockPublicIpAddressesBandwidthOut")
    @Expose
    private Long StockPublicIpAddressesBandwidthOut;

    /**
    * The size of the public network IP bandwidth to be applied for (in Mbps), which defaults to the maximum value applicable for the current user type.
    */
    @SerializedName("PublicIpAddressesBandwidthOut")
    @Expose
    private Long PublicIpAddressesBandwidthOut;

    /**
    * Whether the public IP and the NAT gateway must be in the same availability zone. Valid values: `true` and `false`. This parameter is valid only when `Zone` is specified.
    */
    @SerializedName("PublicIpFromSameZone")
    @Expose
    private Boolean PublicIpFromSameZone;

    /**
     * Get NAT gateway name 
     * @return NatGatewayName NAT gateway name
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT gateway name
     * @param NatGatewayName NAT gateway name
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API. 
     * @return VpcId The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     * @param VpcId The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The maximum outbound bandwidth of the NAT gateway (unit: Mbps). Supported parameter values: `20, 50, 100, 200, 500, 1000, 2000, 5000`. Default: `100`. 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the NAT gateway (unit: Mbps). Supported parameter values: `20, 50, 100, 200, 500, 1000, 2000, 5000`. Default: `100`.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the NAT gateway (unit: Mbps). Supported parameter values: `20, 50, 100, 200, 500, 1000, 2000, 5000`. Default: `100`.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the NAT gateway (unit: Mbps). Supported parameter values: `20, 50, 100, 200, 500, 1000, 2000, 5000`. Default: `100`.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get The concurrent connection cap of the NAT gateway. Values: `1000000, 3000000, 10000000`. The default value is `1000000`. 
     * @return MaxConcurrentConnection The concurrent connection cap of the NAT gateway. Values: `1000000, 3000000, 10000000`. The default value is `1000000`.
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set The concurrent connection cap of the NAT gateway. Values: `1000000, 3000000, 10000000`. The default value is `1000000`.
     * @param MaxConcurrentConnection The concurrent connection cap of the NAT gateway. Values: `1000000, 3000000, 10000000`. The default value is `1000000`.
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Get The number of EIPs that you want to apply for. Either `AddressCount` or `PublicIpAddresses` must be passed in. 
     * @return AddressCount The number of EIPs that you want to apply for. Either `AddressCount` or `PublicIpAddresses` must be passed in.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set The number of EIPs that you want to apply for. Either `AddressCount` or `PublicIpAddresses` must be passed in.
     * @param AddressCount The number of EIPs that you want to apply for. Either `AddressCount` or `PublicIpAddresses` must be passed in.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get The EIP array bound to the NAT gateway. Either AddressCount or PublicIpAddresses must be passed in. 
     * @return PublicIpAddresses The EIP array bound to the NAT gateway. Either AddressCount or PublicIpAddresses must be passed in.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set The EIP array bound to the NAT gateway. Either AddressCount or PublicIpAddresses must be passed in.
     * @param PublicIpAddresses The EIP array bound to the NAT gateway. Either AddressCount or PublicIpAddresses must be passed in.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get The availability zone, such as `ap-guangzhou-1`. 
     * @return Zone The availability zone, such as `ap-guangzhou-1`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone, such as `ap-guangzhou-1`.
     * @param Zone The availability zone, such as `ap-guangzhou-1`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Bound tags, such as [{"Key": "city", "Value": "shanghai"}] 
     * @return Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     * @param Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Subnet of the NAT gateway 
     * @return SubnetId Subnet of the NAT gateway
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet of the NAT gateway
     * @param SubnetId Subnet of the NAT gateway
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The bandwidth size (in Mbps) of the EIP bound to the NAT gateway, which defaults to the maximum value applicable for the current user type. 
     * @return StockPublicIpAddressesBandwidthOut The bandwidth size (in Mbps) of the EIP bound to the NAT gateway, which defaults to the maximum value applicable for the current user type.
     */
    public Long getStockPublicIpAddressesBandwidthOut() {
        return this.StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Set The bandwidth size (in Mbps) of the EIP bound to the NAT gateway, which defaults to the maximum value applicable for the current user type.
     * @param StockPublicIpAddressesBandwidthOut The bandwidth size (in Mbps) of the EIP bound to the NAT gateway, which defaults to the maximum value applicable for the current user type.
     */
    public void setStockPublicIpAddressesBandwidthOut(Long StockPublicIpAddressesBandwidthOut) {
        this.StockPublicIpAddressesBandwidthOut = StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Get The size of the public network IP bandwidth to be applied for (in Mbps), which defaults to the maximum value applicable for the current user type. 
     * @return PublicIpAddressesBandwidthOut The size of the public network IP bandwidth to be applied for (in Mbps), which defaults to the maximum value applicable for the current user type.
     */
    public Long getPublicIpAddressesBandwidthOut() {
        return this.PublicIpAddressesBandwidthOut;
    }

    /**
     * Set The size of the public network IP bandwidth to be applied for (in Mbps), which defaults to the maximum value applicable for the current user type.
     * @param PublicIpAddressesBandwidthOut The size of the public network IP bandwidth to be applied for (in Mbps), which defaults to the maximum value applicable for the current user type.
     */
    public void setPublicIpAddressesBandwidthOut(Long PublicIpAddressesBandwidthOut) {
        this.PublicIpAddressesBandwidthOut = PublicIpAddressesBandwidthOut;
    }

    /**
     * Get Whether the public IP and the NAT gateway must be in the same availability zone. Valid values: `true` and `false`. This parameter is valid only when `Zone` is specified. 
     * @return PublicIpFromSameZone Whether the public IP and the NAT gateway must be in the same availability zone. Valid values: `true` and `false`. This parameter is valid only when `Zone` is specified.
     */
    public Boolean getPublicIpFromSameZone() {
        return this.PublicIpFromSameZone;
    }

    /**
     * Set Whether the public IP and the NAT gateway must be in the same availability zone. Valid values: `true` and `false`. This parameter is valid only when `Zone` is specified.
     * @param PublicIpFromSameZone Whether the public IP and the NAT gateway must be in the same availability zone. Valid values: `true` and `false`. This parameter is valid only when `Zone` is specified.
     */
    public void setPublicIpFromSameZone(Boolean PublicIpFromSameZone) {
        this.PublicIpFromSameZone = PublicIpFromSameZone;
    }

    public CreateNatGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatGatewayRequest(CreateNatGatewayRequest source) {
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.StockPublicIpAddressesBandwidthOut != null) {
            this.StockPublicIpAddressesBandwidthOut = new Long(source.StockPublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpAddressesBandwidthOut != null) {
            this.PublicIpAddressesBandwidthOut = new Long(source.PublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpFromSameZone != null) {
            this.PublicIpFromSameZone = new Boolean(source.PublicIpFromSameZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StockPublicIpAddressesBandwidthOut", this.StockPublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAddressesBandwidthOut", this.PublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpFromSameZone", this.PublicIpFromSameZone);

    }
}


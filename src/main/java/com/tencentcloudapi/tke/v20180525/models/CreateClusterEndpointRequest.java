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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterEndpointRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The ID of the subnet where the cluster's port is located (only needs to be entered when the non-public network access is enabled, and must be within the subnet of the cluster's VPC). 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Whether public network access is enabled or not (True = public network access, FALSE = private network access, with the default value as FALSE).
    */
    @SerializedName("IsExtranet")
    @Expose
    private Boolean IsExtranet;

    /**
    * The domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The security group in use, which must be passed in when public access is enabled.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * LB parameters in a JSON string. It is only required for public network access: {"InternetAccessible":{"InternetChargeType":"TRAFFIC_POSTPAID_BY_HOUR","InternetMaxBandwidthOut":200},"VipIsp":"","BandwidthPackageId":""}.
Description of parameters:
`InternetAccessible.InternetChargeType`: `TRAFFIC_POSTPAID_BY_HOUR` (Pay-as-you-go by traffic on an hourly basis); `BANDWIDTH_POSTPAID_BY_HOUR` (Pay-as-you-go by bandwidth on an hourly basis); `InternetAccessible.BANDWIDTH_PACKAGE` (Bill-by-bandwidth package).
`InternetMaxBandwidthOut`: Outbound bandwidth cap in Mbps. Value range: 0 - 2048. Default value: 10.
`VipIsp`: `CMCC` (China Mobile), `CTCC`·(China Telecom) and `CUCC` (China Unicom). If it is not specified, BGP line is used by default. To query ISPs available in a region, call `DescribeSingleIsp`. If this parameter is specified, the network billing mode must be `BANDWIDTH_PACKAGE`.
`BandwidthPackageId`: Bandwidth package ID. If this parameter is specified, only `BANDWIDTH_PACKAGE` is supported for `InternetAccessible.InternetChargeType`.
    */
    @SerializedName("ExtensiveParameters")
    @Expose
    private String ExtensiveParameters;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The ID of the subnet where the cluster's port is located (only needs to be entered when the non-public network access is enabled, and must be within the subnet of the cluster's VPC).  
     * @return SubnetId The ID of the subnet where the cluster's port is located (only needs to be entered when the non-public network access is enabled, and must be within the subnet of the cluster's VPC). 
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The ID of the subnet where the cluster's port is located (only needs to be entered when the non-public network access is enabled, and must be within the subnet of the cluster's VPC). 
     * @param SubnetId The ID of the subnet where the cluster's port is located (only needs to be entered when the non-public network access is enabled, and must be within the subnet of the cluster's VPC). 
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Whether public network access is enabled or not (True = public network access, FALSE = private network access, with the default value as FALSE). 
     * @return IsExtranet Whether public network access is enabled or not (True = public network access, FALSE = private network access, with the default value as FALSE).
     */
    public Boolean getIsExtranet() {
        return this.IsExtranet;
    }

    /**
     * Set Whether public network access is enabled or not (True = public network access, FALSE = private network access, with the default value as FALSE).
     * @param IsExtranet Whether public network access is enabled or not (True = public network access, FALSE = private network access, with the default value as FALSE).
     */
    public void setIsExtranet(Boolean IsExtranet) {
        this.IsExtranet = IsExtranet;
    }

    /**
     * Get The domain name 
     * @return Domain The domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name
     * @param Domain The domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The security group in use, which must be passed in when public access is enabled. 
     * @return SecurityGroup The security group in use, which must be passed in when public access is enabled.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set The security group in use, which must be passed in when public access is enabled.
     * @param SecurityGroup The security group in use, which must be passed in when public access is enabled.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get LB parameters in a JSON string. It is only required for public network access: {"InternetAccessible":{"InternetChargeType":"TRAFFIC_POSTPAID_BY_HOUR","InternetMaxBandwidthOut":200},"VipIsp":"","BandwidthPackageId":""}.
Description of parameters:
`InternetAccessible.InternetChargeType`: `TRAFFIC_POSTPAID_BY_HOUR` (Pay-as-you-go by traffic on an hourly basis); `BANDWIDTH_POSTPAID_BY_HOUR` (Pay-as-you-go by bandwidth on an hourly basis); `InternetAccessible.BANDWIDTH_PACKAGE` (Bill-by-bandwidth package).
`InternetMaxBandwidthOut`: Outbound bandwidth cap in Mbps. Value range: 0 - 2048. Default value: 10.
`VipIsp`: `CMCC` (China Mobile), `CTCC`·(China Telecom) and `CUCC` (China Unicom). If it is not specified, BGP line is used by default. To query ISPs available in a region, call `DescribeSingleIsp`. If this parameter is specified, the network billing mode must be `BANDWIDTH_PACKAGE`.
`BandwidthPackageId`: Bandwidth package ID. If this parameter is specified, only `BANDWIDTH_PACKAGE` is supported for `InternetAccessible.InternetChargeType`. 
     * @return ExtensiveParameters LB parameters in a JSON string. It is only required for public network access: {"InternetAccessible":{"InternetChargeType":"TRAFFIC_POSTPAID_BY_HOUR","InternetMaxBandwidthOut":200},"VipIsp":"","BandwidthPackageId":""}.
Description of parameters:
`InternetAccessible.InternetChargeType`: `TRAFFIC_POSTPAID_BY_HOUR` (Pay-as-you-go by traffic on an hourly basis); `BANDWIDTH_POSTPAID_BY_HOUR` (Pay-as-you-go by bandwidth on an hourly basis); `InternetAccessible.BANDWIDTH_PACKAGE` (Bill-by-bandwidth package).
`InternetMaxBandwidthOut`: Outbound bandwidth cap in Mbps. Value range: 0 - 2048. Default value: 10.
`VipIsp`: `CMCC` (China Mobile), `CTCC`·(China Telecom) and `CUCC` (China Unicom). If it is not specified, BGP line is used by default. To query ISPs available in a region, call `DescribeSingleIsp`. If this parameter is specified, the network billing mode must be `BANDWIDTH_PACKAGE`.
`BandwidthPackageId`: Bandwidth package ID. If this parameter is specified, only `BANDWIDTH_PACKAGE` is supported for `InternetAccessible.InternetChargeType`.
     */
    public String getExtensiveParameters() {
        return this.ExtensiveParameters;
    }

    /**
     * Set LB parameters in a JSON string. It is only required for public network access: {"InternetAccessible":{"InternetChargeType":"TRAFFIC_POSTPAID_BY_HOUR","InternetMaxBandwidthOut":200},"VipIsp":"","BandwidthPackageId":""}.
Description of parameters:
`InternetAccessible.InternetChargeType`: `TRAFFIC_POSTPAID_BY_HOUR` (Pay-as-you-go by traffic on an hourly basis); `BANDWIDTH_POSTPAID_BY_HOUR` (Pay-as-you-go by bandwidth on an hourly basis); `InternetAccessible.BANDWIDTH_PACKAGE` (Bill-by-bandwidth package).
`InternetMaxBandwidthOut`: Outbound bandwidth cap in Mbps. Value range: 0 - 2048. Default value: 10.
`VipIsp`: `CMCC` (China Mobile), `CTCC`·(China Telecom) and `CUCC` (China Unicom). If it is not specified, BGP line is used by default. To query ISPs available in a region, call `DescribeSingleIsp`. If this parameter is specified, the network billing mode must be `BANDWIDTH_PACKAGE`.
`BandwidthPackageId`: Bandwidth package ID. If this parameter is specified, only `BANDWIDTH_PACKAGE` is supported for `InternetAccessible.InternetChargeType`.
     * @param ExtensiveParameters LB parameters in a JSON string. It is only required for public network access: {"InternetAccessible":{"InternetChargeType":"TRAFFIC_POSTPAID_BY_HOUR","InternetMaxBandwidthOut":200},"VipIsp":"","BandwidthPackageId":""}.
Description of parameters:
`InternetAccessible.InternetChargeType`: `TRAFFIC_POSTPAID_BY_HOUR` (Pay-as-you-go by traffic on an hourly basis); `BANDWIDTH_POSTPAID_BY_HOUR` (Pay-as-you-go by bandwidth on an hourly basis); `InternetAccessible.BANDWIDTH_PACKAGE` (Bill-by-bandwidth package).
`InternetMaxBandwidthOut`: Outbound bandwidth cap in Mbps. Value range: 0 - 2048. Default value: 10.
`VipIsp`: `CMCC` (China Mobile), `CTCC`·(China Telecom) and `CUCC` (China Unicom). If it is not specified, BGP line is used by default. To query ISPs available in a region, call `DescribeSingleIsp`. If this parameter is specified, the network billing mode must be `BANDWIDTH_PACKAGE`.
`BandwidthPackageId`: Bandwidth package ID. If this parameter is specified, only `BANDWIDTH_PACKAGE` is supported for `InternetAccessible.InternetChargeType`.
     */
    public void setExtensiveParameters(String ExtensiveParameters) {
        this.ExtensiveParameters = ExtensiveParameters;
    }

    public CreateClusterEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterEndpointRequest(CreateClusterEndpointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IsExtranet != null) {
            this.IsExtranet = new Boolean(source.IsExtranet);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.ExtensiveParameters != null) {
            this.ExtensiveParameters = new String(source.ExtensiveParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IsExtranet", this.IsExtranet);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ExtensiveParameters", this.ExtensiveParameters);

    }
}


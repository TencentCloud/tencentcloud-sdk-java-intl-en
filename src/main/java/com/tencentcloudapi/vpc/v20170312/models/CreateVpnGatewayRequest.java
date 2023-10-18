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

public class CreateVpnGatewayRequest extends AbstractModel {

    /**
    * VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The VPN gateway name. The maximum length is 60 bytes.
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * The public network bandwidth configuration. Available bandwidth specifications: 5, 10, 20, 50, and 100. Unit: Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * The VPN gateway billing mode. PREPAID: prepaid means monthly subscription. POSTPAID_BY_HOUR: postpaid means pay-as-you-go. Default: POSTPAID_BY_HOUR. If prepaid mode is specified, the `InstanceChargePrepaid` parameter must be entered.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. This parameter is mandatory for prepaid instances.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * The availability zone, such as `ap-guangzhou-2`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPN gateway type. Values: `CCN` (CCN VPN gateway), `SSL` (SSL VPN gateway)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * CDC instance ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Maximum number of connected clients allowed for the SSL VPN gateway. Valid values: [5, 10, 20, 50, 100]. This parameter is only required for SSL VPN gateways.
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
     * Get VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API. 
     * @return VpcId VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
     * @param VpcId VPC instance ID, which can be obtained from the `VpcId` field in the response of the [`DescribeVpcs`](https://intl.cloud.tencent.com/document/product/215/15778?from_cn_redirect=1) API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The VPN gateway name. The maximum length is 60 bytes. 
     * @return VpnGatewayName The VPN gateway name. The maximum length is 60 bytes.
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set The VPN gateway name. The maximum length is 60 bytes.
     * @param VpnGatewayName The VPN gateway name. The maximum length is 60 bytes.
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get The public network bandwidth configuration. Available bandwidth specifications: 5, 10, 20, 50, and 100. Unit: Mbps 
     * @return InternetMaxBandwidthOut The public network bandwidth configuration. Available bandwidth specifications: 5, 10, 20, 50, and 100. Unit: Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The public network bandwidth configuration. Available bandwidth specifications: 5, 10, 20, 50, and 100. Unit: Mbps
     * @param InternetMaxBandwidthOut The public network bandwidth configuration. Available bandwidth specifications: 5, 10, 20, 50, and 100. Unit: Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get The VPN gateway billing mode. PREPAID: prepaid means monthly subscription. POSTPAID_BY_HOUR: postpaid means pay-as-you-go. Default: POSTPAID_BY_HOUR. If prepaid mode is specified, the `InstanceChargePrepaid` parameter must be entered. 
     * @return InstanceChargeType The VPN gateway billing mode. PREPAID: prepaid means monthly subscription. POSTPAID_BY_HOUR: postpaid means pay-as-you-go. Default: POSTPAID_BY_HOUR. If prepaid mode is specified, the `InstanceChargePrepaid` parameter must be entered.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The VPN gateway billing mode. PREPAID: prepaid means monthly subscription. POSTPAID_BY_HOUR: postpaid means pay-as-you-go. Default: POSTPAID_BY_HOUR. If prepaid mode is specified, the `InstanceChargePrepaid` parameter must be entered.
     * @param InstanceChargeType The VPN gateway billing mode. PREPAID: prepaid means monthly subscription. POSTPAID_BY_HOUR: postpaid means pay-as-you-go. Default: POSTPAID_BY_HOUR. If prepaid mode is specified, the `InstanceChargePrepaid` parameter must be entered.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. This parameter is mandatory for prepaid instances. 
     * @return InstanceChargePrepaid Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. This parameter is mandatory for prepaid instances.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. This parameter is mandatory for prepaid instances.
     * @param InstanceChargePrepaid Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. This parameter is mandatory for prepaid instances.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get The availability zone, such as `ap-guangzhou-2`. 
     * @return Zone The availability zone, such as `ap-guangzhou-2`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone, such as `ap-guangzhou-2`.
     * @param Zone The availability zone, such as `ap-guangzhou-2`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPN gateway type. Values: `CCN` (CCN VPN gateway), `SSL` (SSL VPN gateway) 
     * @return Type VPN gateway type. Values: `CCN` (CCN VPN gateway), `SSL` (SSL VPN gateway)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set VPN gateway type. Values: `CCN` (CCN VPN gateway), `SSL` (SSL VPN gateway)
     * @param Type VPN gateway type. Values: `CCN` (CCN VPN gateway), `SSL` (SSL VPN gateway)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Bound tags, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     * @param Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CDC instance ID 
     * @return CdcId CDC instance ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC instance ID
     * @param CdcId CDC instance ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Maximum number of connected clients allowed for the SSL VPN gateway. Valid values: [5, 10, 20, 50, 100]. This parameter is only required for SSL VPN gateways. 
     * @return MaxConnection Maximum number of connected clients allowed for the SSL VPN gateway. Valid values: [5, 10, 20, 50, 100]. This parameter is only required for SSL VPN gateways.
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set Maximum number of connected clients allowed for the SSL VPN gateway. Valid values: [5, 10, 20, 50, 100]. This parameter is only required for SSL VPN gateways.
     * @param MaxConnection Maximum number of connected clients allowed for the SSL VPN gateway. Valid values: [5, 10, 20, 50, 100]. This parameter is only required for SSL VPN gateways.
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    public CreateVpnGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnGatewayRequest(CreateVpnGatewayRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpnGatewayName != null) {
            this.VpnGatewayName = new String(source.VpnGatewayName);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);

    }
}


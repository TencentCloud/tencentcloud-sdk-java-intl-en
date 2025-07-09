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

public class InquiryPriceAllocateAddressesRequest extends AbstractModel {

    /**
    * EIP billing method.

<ul style="margin:0"><li>Users with standard account type. Valid values: <ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis.</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription.</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis.</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR.</li>
</ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For users with standard account type, the range of optional values depends on the EIP billing method:<ul>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li></ul>Default value: 1 Mbps.</li></ul>
<li>For users with traditional account type, the EIP outbound bandwidth cap is subject to the public network egress bandwidth limit of the bound instance. No need to pass this parameter.</li></ul>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH" this parameter is required. For other scenarios, it can be ignored.
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
    * EIP type. Default value: EIP.



<ul style="margin:0"><li>High quality EIP, valid values: <ul><li>HighQualityEIP: high quality EIP</li></ul>Note: High quality EIP is supported only in some regions.</li></ul><ul style="margin:0">
        <li>High-defense IP, valid values: <ul>
                <li>AntiDDoSEIP: high-defense IP</li>
            </ul>
        </li>
    </ul>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
     * Get EIP billing method.

<ul style="margin:0"><li>Users with standard account type. Valid values: <ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis.</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription.</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis.</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR.</li>
</ul> 
     * @return InternetChargeType EIP billing method.

<ul style="margin:0"><li>Users with standard account type. Valid values: <ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis.</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription.</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis.</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR.</li>
</ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set EIP billing method.

<ul style="margin:0"><li>Users with standard account type. Valid values: <ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis.</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription.</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis.</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR.</li>
</ul>
     * @param InternetChargeType EIP billing method.

<ul style="margin:0"><li>Users with standard account type. Valid values: <ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR: billed by hourly bandwidth on a pay-as-you-go basis.</li>
<li>BANDWIDTH_PREPAID_BY_MONTH: monthly bandwidth subscription.</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: billed by hourly traffic on a pay-as-you-go basis.</li></ul>Default value: TRAFFIC_POSTPAID_BY_HOUR.</li>
</ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For users with standard account type, the range of optional values depends on the EIP billing method:<ul>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li></ul>Default value: 1 Mbps.</li></ul>
<li>For users with traditional account type, the EIP outbound bandwidth cap is subject to the public network egress bandwidth limit of the bound instance. No need to pass this parameter.</li></ul> 
     * @return InternetMaxBandwidthOut The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For users with standard account type, the range of optional values depends on the EIP billing method:<ul>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li></ul>Default value: 1 Mbps.</li></ul>
<li>For users with traditional account type, the EIP outbound bandwidth cap is subject to the public network egress bandwidth limit of the bound instance. No need to pass this parameter.</li></ul>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For users with standard account type, the range of optional values depends on the EIP billing method:<ul>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li></ul>Default value: 1 Mbps.</li></ul>
<li>For users with traditional account type, the EIP outbound bandwidth cap is subject to the public network egress bandwidth limit of the bound instance. No need to pass this parameter.</li></ul>
     * @param InternetMaxBandwidthOut The EIP outbound bandwidth cap, in Mbps.
<ul style="margin:0"><li>For users with standard account type, the range of optional values depends on the EIP billing method:<ul>
<li>`BANDWIDTH_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li>
<li>`BANDWIDTH_PREPAID_BY_MONTH`: 1 Mbps to 200 Mbps</li>
<li>`TRAFFIC_POSTPAID_BY_HOUR`: 1 Mbps to 100 Mbps.</li></ul>Default value: 1 Mbps.</li></ul>
<li>For users with traditional account type, the EIP outbound bandwidth cap is subject to the public network egress bandwidth limit of the bound instance. No need to pass this parameter.</li></ul>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH" this parameter is required. For other scenarios, it can be ignored. 
     * @return AddressChargePrepaid A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH" this parameter is required. For other scenarios, it can be ignored.
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH" this parameter is required. For other scenarios, it can be ignored.
     * @param AddressChargePrepaid A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH" this parameter is required. For other scenarios, it can be ignored.
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    /**
     * Get EIP type. Default value: EIP.



<ul style="margin:0"><li>High quality EIP, valid values: <ul><li>HighQualityEIP: high quality EIP</li></ul>Note: High quality EIP is supported only in some regions.</li></ul><ul style="margin:0">
        <li>High-defense IP, valid values: <ul>
                <li>AntiDDoSEIP: high-defense IP</li>
            </ul>
        </li>
    </ul> 
     * @return AddressType EIP type. Default value: EIP.



<ul style="margin:0"><li>High quality EIP, valid values: <ul><li>HighQualityEIP: high quality EIP</li></ul>Note: High quality EIP is supported only in some regions.</li></ul><ul style="margin:0">
        <li>High-defense IP, valid values: <ul>
                <li>AntiDDoSEIP: high-defense IP</li>
            </ul>
        </li>
    </ul>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP type. Default value: EIP.



<ul style="margin:0"><li>High quality EIP, valid values: <ul><li>HighQualityEIP: high quality EIP</li></ul>Note: High quality EIP is supported only in some regions.</li></ul><ul style="margin:0">
        <li>High-defense IP, valid values: <ul>
                <li>AntiDDoSEIP: high-defense IP</li>
            </ul>
        </li>
    </ul>
     * @param AddressType EIP type. Default value: EIP.



<ul style="margin:0"><li>High quality EIP, valid values: <ul><li>HighQualityEIP: high quality EIP</li></ul>Note: High quality EIP is supported only in some regions.</li></ul><ul style="margin:0">
        <li>High-defense IP, valid values: <ul>
                <li>AntiDDoSEIP: high-defense IP</li>
            </ul>
        </li>
    </ul>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    public InquiryPriceAllocateAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceAllocateAddressesRequest(InquiryPriceAllocateAddressesRequest source) {
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);

    }
}


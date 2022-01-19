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

public class DescribeAddressesRequest extends AbstractModel{

    /**
    * The list of unique IDs of EIPs in the format of `eip-11112222`. `AddressIds` and `Filters.address-id` cannot be specified at the same time.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> address-id - String - Optional - Filter by unique EIP ID, such as `eip-11112222`.</li>
<li> address-name - String - Optional - Filter by EIP name. Fuzzy filtering is not supported.</li>
<li> address-ip - String - Optional - Filter by EIP address.</li>
<li> address-status - String - Optional - Filter by EIP status. Valid values: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`.</li>
<li> instance-id - String - Optional - Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.</li>
<li> private-ip-address - String - Optional - Filter by the private IP address bound to the EIP.</li>
<li> network-interface-id - String - Optional - Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.</li>
<li> is-arrears - String - Optional - Filter by the fact whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal).</li>
<li> address-type - String - Optional - Filter by IP type. Valid values: `WanIP`, `EIP`, `AnycastEIP`, and `HighQualityEIP`. Default value: `EIP`.</li>
<li> address-isp - String - Optional - Filter by ISP type. Valid values: `BGP`, `CMCC`, `CUCC`, and `CTCC`.</li>
<li> dedicated-cluster-id - String - Optional - Filter by unique CDC ID, such as `cluster-11112222`.</li>
<li> tag-key - String - Optional - Filter by tag key.</li>
<li> tag-value - String - Optional - Filter by tag value.</li>
<li> tag:tag-key - String - Optional - Filter by tag key-value pair. Use a specific tag key to replace `tag-key`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The list of unique IDs of EIPs in the format of `eip-11112222`. `AddressIds` and `Filters.address-id` cannot be specified at the same time. 
     * @return AddressIds The list of unique IDs of EIPs in the format of `eip-11112222`. `AddressIds` and `Filters.address-id` cannot be specified at the same time.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set The list of unique IDs of EIPs in the format of `eip-11112222`. `AddressIds` and `Filters.address-id` cannot be specified at the same time.
     * @param AddressIds The list of unique IDs of EIPs in the format of `eip-11112222`. `AddressIds` and `Filters.address-id` cannot be specified at the same time.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> address-id - String - Optional - Filter by unique EIP ID, such as `eip-11112222`.</li>
<li> address-name - String - Optional - Filter by EIP name. Fuzzy filtering is not supported.</li>
<li> address-ip - String - Optional - Filter by EIP address.</li>
<li> address-status - String - Optional - Filter by EIP status. Valid values: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`.</li>
<li> instance-id - String - Optional - Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.</li>
<li> private-ip-address - String - Optional - Filter by the private IP address bound to the EIP.</li>
<li> network-interface-id - String - Optional - Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.</li>
<li> is-arrears - String - Optional - Filter by the fact whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal).</li>
<li> address-type - String - Optional - Filter by IP type. Valid values: `WanIP`, `EIP`, `AnycastEIP`, and `HighQualityEIP`. Default value: `EIP`.</li>
<li> address-isp - String - Optional - Filter by ISP type. Valid values: `BGP`, `CMCC`, `CUCC`, and `CTCC`.</li>
<li> dedicated-cluster-id - String - Optional - Filter by unique CDC ID, such as `cluster-11112222`.</li>
<li> tag-key - String - Optional - Filter by tag key.</li>
<li> tag-value - String - Optional - Filter by tag value.</li>
<li> tag:tag-key - String - Optional - Filter by tag key-value pair. Use a specific tag key to replace `tag-key`.</li> 
     * @return Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> address-id - String - Optional - Filter by unique EIP ID, such as `eip-11112222`.</li>
<li> address-name - String - Optional - Filter by EIP name. Fuzzy filtering is not supported.</li>
<li> address-ip - String - Optional - Filter by EIP address.</li>
<li> address-status - String - Optional - Filter by EIP status. Valid values: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`.</li>
<li> instance-id - String - Optional - Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.</li>
<li> private-ip-address - String - Optional - Filter by the private IP address bound to the EIP.</li>
<li> network-interface-id - String - Optional - Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.</li>
<li> is-arrears - String - Optional - Filter by the fact whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal).</li>
<li> address-type - String - Optional - Filter by IP type. Valid values: `WanIP`, `EIP`, `AnycastEIP`, and `HighQualityEIP`. Default value: `EIP`.</li>
<li> address-isp - String - Optional - Filter by ISP type. Valid values: `BGP`, `CMCC`, `CUCC`, and `CTCC`.</li>
<li> dedicated-cluster-id - String - Optional - Filter by unique CDC ID, such as `cluster-11112222`.</li>
<li> tag-key - String - Optional - Filter by tag key.</li>
<li> tag-value - String - Optional - Filter by tag value.</li>
<li> tag:tag-key - String - Optional - Filter by tag key-value pair. Use a specific tag key to replace `tag-key`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> address-id - String - Optional - Filter by unique EIP ID, such as `eip-11112222`.</li>
<li> address-name - String - Optional - Filter by EIP name. Fuzzy filtering is not supported.</li>
<li> address-ip - String - Optional - Filter by EIP address.</li>
<li> address-status - String - Optional - Filter by EIP status. Valid values: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`.</li>
<li> instance-id - String - Optional - Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.</li>
<li> private-ip-address - String - Optional - Filter by the private IP address bound to the EIP.</li>
<li> network-interface-id - String - Optional - Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.</li>
<li> is-arrears - String - Optional - Filter by the fact whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal).</li>
<li> address-type - String - Optional - Filter by IP type. Valid values: `WanIP`, `EIP`, `AnycastEIP`, and `HighQualityEIP`. Default value: `EIP`.</li>
<li> address-isp - String - Optional - Filter by ISP type. Valid values: `BGP`, `CMCC`, `CUCC`, and `CTCC`.</li>
<li> dedicated-cluster-id - String - Optional - Filter by unique CDC ID, such as `cluster-11112222`.</li>
<li> tag-key - String - Optional - Filter by tag key.</li>
<li> tag-value - String - Optional - Filter by tag value.</li>
<li> tag:tag-key - String - Optional - Filter by tag key-value pair. Use a specific tag key to replace `tag-key`.</li>
     * @param Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. Detailed filter conditions:
<li> address-id - String - Optional - Filter by unique EIP ID, such as `eip-11112222`.</li>
<li> address-name - String - Optional - Filter by EIP name. Fuzzy filtering is not supported.</li>
<li> address-ip - String - Optional - Filter by EIP address.</li>
<li> address-status - String - Optional - Filter by EIP status. Valid values: `CREATING`, `BINDING`, `BIND`, `UNBINDING`, `UNBIND`, `OFFLINING`, and `BIND_ENI`.</li>
<li> instance-id - String - Optional - Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.</li>
<li> private-ip-address - String - Optional - Filter by the private IP address bound to the EIP.</li>
<li> network-interface-id - String - Optional - Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.</li>
<li> is-arrears - String - Optional - Filter by the fact whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal).</li>
<li> address-type - String - Optional - Filter by IP type. Valid values: `WanIP`, `EIP`, `AnycastEIP`, and `HighQualityEIP`. Default value: `EIP`.</li>
<li> address-isp - String - Optional - Filter by ISP type. Valid values: `BGP`, `CMCC`, `CUCC`, and `CTCC`.</li>
<li> dedicated-cluster-id - String - Optional - Filter by unique CDC ID, such as `cluster-11112222`.</li>
<li> tag-key - String - Optional - Filter by tag key.</li>
<li> tag-value - String - Optional - Filter by tag value.</li>
<li> tag:tag-key - String - Optional - Filter by tag key-value pair. Use a specific tag key to replace `tag-key`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646). 
     * @return Offset The Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     * @param Offset The Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646). 
     * @return Limit Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     * @param Limit Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/11646).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressesRequest(DescribeAddressesRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


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

public class DescribeIPv6AddressesRequest extends AbstractModel {

    /**
    * Unique ID column identifying IPv6.

- Unique ID of the traditional EIPv6, such as `eip-11112222`
- Unique ID of the EIPv6, such as `eipv6-11112222`

Note: `IPv6AddressIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("IPv6AddressIds")
    @Expose
    private String [] IPv6AddressIds;

    /**
    * Each request can have up to 10 `Filters` and 100 `Filter.Values`. `IPv6AddressIds` and `Filters` cannot be specified at the same time. The detailed filter conditions are as follows:

- address-id - String - Required: No - (Filter condition) Filter by the unique ID of the EIPv6.
- public-ipv6-address - String - Required: No - (Filter condition) Filter by the public IPv6 address.
- network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of the ENI.
- instance-id - String - Required: No - (Filter condition) Filter by the unique ID of the bound instance.
- charge-type - String - Required: No - (Filter condition) Filter by the billing type.
- private-ipv6-address - String - Required: No - (Filter condition) Filter by the bound private IPv6 address.
- egress - String - Required: No - (Filter condition) Filter by the egress.
- address-type - String - Required: No - (Filter condition) Filter by the IPv6 type. Valid values: 'EIP6', 'EIPv6', 'WanIPv6', and 'HighQualityEIPv6'. Default: 'EIPv6'.
- address-isp - String - Required: No - (Filter condition) Filter by the ISP type. Valid values: 'BGP', 'CMCC', 'CUCC', and 'CTCC'.
- address-status - String - Required: No - (Filter condition) Filter by the EIP status. Valid values: 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', 'BIND_ENI', and 'PRIVATE'.
- address-name - String - Required: No - (Filter condition) Filter by the EIP name. Fuzzy filtering is not supported.
- tag-key - String - Required: No - (Filter condition) Filter by the tag key.
- tag-value - String - Required: No - (Filter condition) Filter by the tag value.
- tag:tag-key - String - Required: No - (Filter condition) Filter by the tag-key - value pair. Replace tag-key with a specific tag key.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Indicates whether to query the traditional IPv6 address information.
    */
    @SerializedName("Traditional")
    @Expose
    private Boolean Traditional;

    /**
    * Offset. Default: 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default: 20. Maximum: 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Unique ID column identifying IPv6.

- Unique ID of the traditional EIPv6, such as `eip-11112222`
- Unique ID of the EIPv6, such as `eipv6-11112222`

Note: `IPv6AddressIds` and `Filters` cannot be specified at the same time. 
     * @return IPv6AddressIds Unique ID column identifying IPv6.

- Unique ID of the traditional EIPv6, such as `eip-11112222`
- Unique ID of the EIPv6, such as `eipv6-11112222`

Note: `IPv6AddressIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getIPv6AddressIds() {
        return this.IPv6AddressIds;
    }

    /**
     * Set Unique ID column identifying IPv6.

- Unique ID of the traditional EIPv6, such as `eip-11112222`
- Unique ID of the EIPv6, such as `eipv6-11112222`

Note: `IPv6AddressIds` and `Filters` cannot be specified at the same time.
     * @param IPv6AddressIds Unique ID column identifying IPv6.

- Unique ID of the traditional EIPv6, such as `eip-11112222`
- Unique ID of the EIPv6, such as `eipv6-11112222`

Note: `IPv6AddressIds` and `Filters` cannot be specified at the same time.
     */
    public void setIPv6AddressIds(String [] IPv6AddressIds) {
        this.IPv6AddressIds = IPv6AddressIds;
    }

    /**
     * Get Each request can have up to 10 `Filters` and 100 `Filter.Values`. `IPv6AddressIds` and `Filters` cannot be specified at the same time. The detailed filter conditions are as follows:

- address-id - String - Required: No - (Filter condition) Filter by the unique ID of the EIPv6.
- public-ipv6-address - String - Required: No - (Filter condition) Filter by the public IPv6 address.
- network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of the ENI.
- instance-id - String - Required: No - (Filter condition) Filter by the unique ID of the bound instance.
- charge-type - String - Required: No - (Filter condition) Filter by the billing type.
- private-ipv6-address - String - Required: No - (Filter condition) Filter by the bound private IPv6 address.
- egress - String - Required: No - (Filter condition) Filter by the egress.
- address-type - String - Required: No - (Filter condition) Filter by the IPv6 type. Valid values: 'EIP6', 'EIPv6', 'WanIPv6', and 'HighQualityEIPv6'. Default: 'EIPv6'.
- address-isp - String - Required: No - (Filter condition) Filter by the ISP type. Valid values: 'BGP', 'CMCC', 'CUCC', and 'CTCC'.
- address-status - String - Required: No - (Filter condition) Filter by the EIP status. Valid values: 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', 'BIND_ENI', and 'PRIVATE'.
- address-name - String - Required: No - (Filter condition) Filter by the EIP name. Fuzzy filtering is not supported.
- tag-key - String - Required: No - (Filter condition) Filter by the tag key.
- tag-value - String - Required: No - (Filter condition) Filter by the tag value.
- tag:tag-key - String - Required: No - (Filter condition) Filter by the tag-key - value pair. Replace tag-key with a specific tag key. 
     * @return Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. `IPv6AddressIds` and `Filters` cannot be specified at the same time. The detailed filter conditions are as follows:

- address-id - String - Required: No - (Filter condition) Filter by the unique ID of the EIPv6.
- public-ipv6-address - String - Required: No - (Filter condition) Filter by the public IPv6 address.
- network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of the ENI.
- instance-id - String - Required: No - (Filter condition) Filter by the unique ID of the bound instance.
- charge-type - String - Required: No - (Filter condition) Filter by the billing type.
- private-ipv6-address - String - Required: No - (Filter condition) Filter by the bound private IPv6 address.
- egress - String - Required: No - (Filter condition) Filter by the egress.
- address-type - String - Required: No - (Filter condition) Filter by the IPv6 type. Valid values: 'EIP6', 'EIPv6', 'WanIPv6', and 'HighQualityEIPv6'. Default: 'EIPv6'.
- address-isp - String - Required: No - (Filter condition) Filter by the ISP type. Valid values: 'BGP', 'CMCC', 'CUCC', and 'CTCC'.
- address-status - String - Required: No - (Filter condition) Filter by the EIP status. Valid values: 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', 'BIND_ENI', and 'PRIVATE'.
- address-name - String - Required: No - (Filter condition) Filter by the EIP name. Fuzzy filtering is not supported.
- tag-key - String - Required: No - (Filter condition) Filter by the tag key.
- tag-value - String - Required: No - (Filter condition) Filter by the tag value.
- tag:tag-key - String - Required: No - (Filter condition) Filter by the tag-key - value pair. Replace tag-key with a specific tag key.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters` and 100 `Filter.Values`. `IPv6AddressIds` and `Filters` cannot be specified at the same time. The detailed filter conditions are as follows:

- address-id - String - Required: No - (Filter condition) Filter by the unique ID of the EIPv6.
- public-ipv6-address - String - Required: No - (Filter condition) Filter by the public IPv6 address.
- network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of the ENI.
- instance-id - String - Required: No - (Filter condition) Filter by the unique ID of the bound instance.
- charge-type - String - Required: No - (Filter condition) Filter by the billing type.
- private-ipv6-address - String - Required: No - (Filter condition) Filter by the bound private IPv6 address.
- egress - String - Required: No - (Filter condition) Filter by the egress.
- address-type - String - Required: No - (Filter condition) Filter by the IPv6 type. Valid values: 'EIP6', 'EIPv6', 'WanIPv6', and 'HighQualityEIPv6'. Default: 'EIPv6'.
- address-isp - String - Required: No - (Filter condition) Filter by the ISP type. Valid values: 'BGP', 'CMCC', 'CUCC', and 'CTCC'.
- address-status - String - Required: No - (Filter condition) Filter by the EIP status. Valid values: 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', 'BIND_ENI', and 'PRIVATE'.
- address-name - String - Required: No - (Filter condition) Filter by the EIP name. Fuzzy filtering is not supported.
- tag-key - String - Required: No - (Filter condition) Filter by the tag key.
- tag-value - String - Required: No - (Filter condition) Filter by the tag value.
- tag:tag-key - String - Required: No - (Filter condition) Filter by the tag-key - value pair. Replace tag-key with a specific tag key.
     * @param Filters Each request can have up to 10 `Filters` and 100 `Filter.Values`. `IPv6AddressIds` and `Filters` cannot be specified at the same time. The detailed filter conditions are as follows:

- address-id - String - Required: No - (Filter condition) Filter by the unique ID of the EIPv6.
- public-ipv6-address - String - Required: No - (Filter condition) Filter by the public IPv6 address.
- network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of the ENI.
- instance-id - String - Required: No - (Filter condition) Filter by the unique ID of the bound instance.
- charge-type - String - Required: No - (Filter condition) Filter by the billing type.
- private-ipv6-address - String - Required: No - (Filter condition) Filter by the bound private IPv6 address.
- egress - String - Required: No - (Filter condition) Filter by the egress.
- address-type - String - Required: No - (Filter condition) Filter by the IPv6 type. Valid values: 'EIP6', 'EIPv6', 'WanIPv6', and 'HighQualityEIPv6'. Default: 'EIPv6'.
- address-isp - String - Required: No - (Filter condition) Filter by the ISP type. Valid values: 'BGP', 'CMCC', 'CUCC', and 'CTCC'.
- address-status - String - Required: No - (Filter condition) Filter by the EIP status. Valid values: 'CREATING', 'BINDING', 'BIND', 'UNBINDING', 'UNBIND', 'OFFLINING', 'BIND_ENI', and 'PRIVATE'.
- address-name - String - Required: No - (Filter condition) Filter by the EIP name. Fuzzy filtering is not supported.
- tag-key - String - Required: No - (Filter condition) Filter by the tag key.
- tag-value - String - Required: No - (Filter condition) Filter by the tag value.
- tag:tag-key - String - Required: No - (Filter condition) Filter by the tag-key - value pair. Replace tag-key with a specific tag key.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Indicates whether to query the traditional IPv6 address information. 
     * @return Traditional Indicates whether to query the traditional IPv6 address information.
     */
    public Boolean getTraditional() {
        return this.Traditional;
    }

    /**
     * Set Indicates whether to query the traditional IPv6 address information.
     * @param Traditional Indicates whether to query the traditional IPv6 address information.
     */
    public void setTraditional(Boolean Traditional) {
        this.Traditional = Traditional;
    }

    /**
     * Get Offset. Default: 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688). 
     * @return Offset Offset. Default: 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default: 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     * @param Offset Offset. Default: 0. For more information on Offset, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default: 20. Maximum: 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688). 
     * @return Limit Number of returned results. Default: 20. Maximum: 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default: 20. Maximum: 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     * @param Limit Number of returned results. Default: 20. Maximum: 100. For more information on Limit, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIPv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPv6AddressesRequest(DescribeIPv6AddressesRequest source) {
        if (source.IPv6AddressIds != null) {
            this.IPv6AddressIds = new String[source.IPv6AddressIds.length];
            for (int i = 0; i < source.IPv6AddressIds.length; i++) {
                this.IPv6AddressIds[i] = new String(source.IPv6AddressIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Traditional != null) {
            this.Traditional = new Boolean(source.Traditional);
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
        this.setParamArraySimple(map, prefix + "IPv6AddressIds.", this.IPv6AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Traditional", this.Traditional);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


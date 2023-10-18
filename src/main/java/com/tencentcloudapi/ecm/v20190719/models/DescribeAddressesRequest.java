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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressesRequest extends AbstractModel {

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * List of unique IDs of EIPs, such as `eip-11112222`. `AddressIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `AddressIds` and `Filters` cannot be specified at the same time. The detailed filters are as follows:
address-id - String - Required: no - (Filter) Filter by unique EIP ID, such as `eip-11112222`.
address-name - String - Required: no - (Filter) Filter by EIP name. Fuzzy filtering is not supported.
address-ip - String - Required: no - (Filter) Filter by EIP IP address.
address-status - String - Required: no - (Filter) Filter by EIP status. Value range: see the list of EIP status.
instance-id - String - Required: no - (Filter) Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.
private-ip-address - String - Required: no - (Filter) Filter by the private IP bound to the EIP.
network-interface-id - String - Required: no - (Filter) Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.
is-arrears - String - Required: no - (Filter) Filter by whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get List of unique IDs of EIPs, such as `eip-11112222`. `AddressIds` and `Filters` cannot be specified at the same time. 
     * @return AddressIds List of unique IDs of EIPs, such as `eip-11112222`. `AddressIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set List of unique IDs of EIPs, such as `eip-11112222`. `AddressIds` and `Filters` cannot be specified at the same time.
     * @param AddressIds List of unique IDs of EIPs, such as `eip-11112222`. `AddressIds` and `Filters` cannot be specified at the same time.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `AddressIds` and `Filters` cannot be specified at the same time. The detailed filters are as follows:
address-id - String - Required: no - (Filter) Filter by unique EIP ID, such as `eip-11112222`.
address-name - String - Required: no - (Filter) Filter by EIP name. Fuzzy filtering is not supported.
address-ip - String - Required: no - (Filter) Filter by EIP IP address.
address-status - String - Required: no - (Filter) Filter by EIP status. Value range: see the list of EIP status.
instance-id - String - Required: no - (Filter) Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.
private-ip-address - String - Required: no - (Filter) Filter by the private IP bound to the EIP.
network-interface-id - String - Required: no - (Filter) Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.
is-arrears - String - Required: no - (Filter) Filter by whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal) 
     * @return Filters Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `AddressIds` and `Filters` cannot be specified at the same time. The detailed filters are as follows:
address-id - String - Required: no - (Filter) Filter by unique EIP ID, such as `eip-11112222`.
address-name - String - Required: no - (Filter) Filter by EIP name. Fuzzy filtering is not supported.
address-ip - String - Required: no - (Filter) Filter by EIP IP address.
address-status - String - Required: no - (Filter) Filter by EIP status. Value range: see the list of EIP status.
instance-id - String - Required: no - (Filter) Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.
private-ip-address - String - Required: no - (Filter) Filter by the private IP bound to the EIP.
network-interface-id - String - Required: no - (Filter) Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.
is-arrears - String - Required: no - (Filter) Filter by whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `AddressIds` and `Filters` cannot be specified at the same time. The detailed filters are as follows:
address-id - String - Required: no - (Filter) Filter by unique EIP ID, such as `eip-11112222`.
address-name - String - Required: no - (Filter) Filter by EIP name. Fuzzy filtering is not supported.
address-ip - String - Required: no - (Filter) Filter by EIP IP address.
address-status - String - Required: no - (Filter) Filter by EIP status. Value range: see the list of EIP status.
instance-id - String - Required: no - (Filter) Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.
private-ip-address - String - Required: no - (Filter) Filter by the private IP bound to the EIP.
network-interface-id - String - Required: no - (Filter) Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.
is-arrears - String - Required: no - (Filter) Filter by whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal)
     * @param Filters Each request can contain up to 10 `Filters` and 5 `Filter.Values`. `AddressIds` and `Filters` cannot be specified at the same time. The detailed filters are as follows:
address-id - String - Required: no - (Filter) Filter by unique EIP ID, such as `eip-11112222`.
address-name - String - Required: no - (Filter) Filter by EIP name. Fuzzy filtering is not supported.
address-ip - String - Required: no - (Filter) Filter by EIP IP address.
address-status - String - Required: no - (Filter) Filter by EIP status. Value range: see the list of EIP status.
instance-id - String - Required: no - (Filter) Filter by the ID of the instance bound to the EIP, such as `ins-11112222`.
private-ip-address - String - Required: no - (Filter) Filter by the private IP bound to the EIP.
network-interface-id - String - Required: no - (Filter) Filter by ID of the ENI bound to the EIP, such as `eni-11112222`.
is-arrears - String - Required: no - (Filter) Filter by whether the EIP is overdue (TRUE: the EIP is overdue | FALSE: the billing status of the EIP is normal)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Default value: 20. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 20. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 20. Maximum value: 100.
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
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
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
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


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

public class DescribeReserveIpAddressesRequest extends AbstractModel {

    /**
    * List of unique IDs of reserved private IP addresses.
    */
    @SerializedName("ReserveIpIds")
    @Expose
    private String [] ReserveIpIds;

    /**
    * Filter criteria. ReserveIpIds and Filters cannot be specified at the same time.

reserve-ip-id - String - (Filter criteria) Unique ID of a reserved private IP address, for example, rsvip-pvqgv9vi.
vpc-id - String - (Filter criteria) VPC instance ID, for example, vpc-f49l6u0z.
subnet-id - String - (Filter criteria) Subnet instance ID, for example, subnet-f49l6u0z.
address-ip - String - (Filter criteria) Reserved private IP address, for example, 192.168.0.10.
ip-type - String - (Filter criteria) Business type (IpType), for example, 0.
name - String - (Filter criteria) Name.
state - String - (Filter criteria) Status. Valid values: Bind and UnBind.
resource-id - String - (Filter criteria) Bound instance resource, for example, eni-059qmnif.
tag-key - String - (Filter criteria) Tag key.
tag:tag-key - String - (Filter criteria) Tag key-value pair. Replace tag-key with the specific tag key.

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of request objects.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get List of unique IDs of reserved private IP addresses. 
     * @return ReserveIpIds List of unique IDs of reserved private IP addresses.
     */
    public String [] getReserveIpIds() {
        return this.ReserveIpIds;
    }

    /**
     * Set List of unique IDs of reserved private IP addresses.
     * @param ReserveIpIds List of unique IDs of reserved private IP addresses.
     */
    public void setReserveIpIds(String [] ReserveIpIds) {
        this.ReserveIpIds = ReserveIpIds;
    }

    /**
     * Get Filter criteria. ReserveIpIds and Filters cannot be specified at the same time.

reserve-ip-id - String - (Filter criteria) Unique ID of a reserved private IP address, for example, rsvip-pvqgv9vi.
vpc-id - String - (Filter criteria) VPC instance ID, for example, vpc-f49l6u0z.
subnet-id - String - (Filter criteria) Subnet instance ID, for example, subnet-f49l6u0z.
address-ip - String - (Filter criteria) Reserved private IP address, for example, 192.168.0.10.
ip-type - String - (Filter criteria) Business type (IpType), for example, 0.
name - String - (Filter criteria) Name.
state - String - (Filter criteria) Status. Valid values: Bind and UnBind.
resource-id - String - (Filter criteria) Bound instance resource, for example, eni-059qmnif.
tag-key - String - (Filter criteria) Tag key.
tag:tag-key - String - (Filter criteria) Tag key-value pair. Replace tag-key with the specific tag key.
 
     * @return Filters Filter criteria. ReserveIpIds and Filters cannot be specified at the same time.

reserve-ip-id - String - (Filter criteria) Unique ID of a reserved private IP address, for example, rsvip-pvqgv9vi.
vpc-id - String - (Filter criteria) VPC instance ID, for example, vpc-f49l6u0z.
subnet-id - String - (Filter criteria) Subnet instance ID, for example, subnet-f49l6u0z.
address-ip - String - (Filter criteria) Reserved private IP address, for example, 192.168.0.10.
ip-type - String - (Filter criteria) Business type (IpType), for example, 0.
name - String - (Filter criteria) Name.
state - String - (Filter criteria) Status. Valid values: Bind and UnBind.
resource-id - String - (Filter criteria) Bound instance resource, for example, eni-059qmnif.
tag-key - String - (Filter criteria) Tag key.
tag:tag-key - String - (Filter criteria) Tag key-value pair. Replace tag-key with the specific tag key.

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. ReserveIpIds and Filters cannot be specified at the same time.

reserve-ip-id - String - (Filter criteria) Unique ID of a reserved private IP address, for example, rsvip-pvqgv9vi.
vpc-id - String - (Filter criteria) VPC instance ID, for example, vpc-f49l6u0z.
subnet-id - String - (Filter criteria) Subnet instance ID, for example, subnet-f49l6u0z.
address-ip - String - (Filter criteria) Reserved private IP address, for example, 192.168.0.10.
ip-type - String - (Filter criteria) Business type (IpType), for example, 0.
name - String - (Filter criteria) Name.
state - String - (Filter criteria) Status. Valid values: Bind and UnBind.
resource-id - String - (Filter criteria) Bound instance resource, for example, eni-059qmnif.
tag-key - String - (Filter criteria) Tag key.
tag:tag-key - String - (Filter criteria) Tag key-value pair. Replace tag-key with the specific tag key.

     * @param Filters Filter criteria. ReserveIpIds and Filters cannot be specified at the same time.

reserve-ip-id - String - (Filter criteria) Unique ID of a reserved private IP address, for example, rsvip-pvqgv9vi.
vpc-id - String - (Filter criteria) VPC instance ID, for example, vpc-f49l6u0z.
subnet-id - String - (Filter criteria) Subnet instance ID, for example, subnet-f49l6u0z.
address-ip - String - (Filter criteria) Reserved private IP address, for example, 192.168.0.10.
ip-type - String - (Filter criteria) Business type (IpType), for example, 0.
name - String - (Filter criteria) Name.
state - String - (Filter criteria) Status. Valid values: Bind and UnBind.
resource-id - String - (Filter criteria) Bound instance resource, for example, eni-059qmnif.
tag-key - String - (Filter criteria) Tag key.
tag:tag-key - String - (Filter criteria) Tag key-value pair. Replace tag-key with the specific tag key.

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of request objects. 
     * @return Limit Number of request objects.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of request objects.
     * @param Limit Number of request objects.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeReserveIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReserveIpAddressesRequest(DescribeReserveIpAddressesRequest source) {
        if (source.ReserveIpIds != null) {
            this.ReserveIpIds = new String[source.ReserveIpIds.length];
            for (int i = 0; i < source.ReserveIpIds.length; i++) {
                this.ReserveIpIds[i] = new String(source.ReserveIpIds[i]);
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
        this.setParamArraySimple(map, prefix + "ReserveIpIds.", this.ReserveIpIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


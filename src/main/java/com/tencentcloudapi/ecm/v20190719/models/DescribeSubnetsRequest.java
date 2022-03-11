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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetsRequest extends AbstractModel{

    /**
    * Subnet instance ID, such as `subnet-pxir56ns`. Each request supports a maximum of 100 instances. `SubnetIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Filter. `SubnetIds` and `Filters` cannot be specified at the same time.
subnet-id - String - Subnet instance name.
subnet-name - String - Subnet name. Only fuzzy query by a single value is supported.
cidr-block - String - Subnet IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
vpc-id - String - VPC instance ID, such as `vpc-f49l6u0z`.
vpc-cidr-block  - String - VPC IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
region - String - ECM region.
zone - String - AZ.
tag-key - String - Required: no - Filter by tag key.
tag:tag-key - String - Required: no - Filter by tag key-value pair.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Number of returned results.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Sorting method. time: sort in reverse chronological order; default: sort by network planning.
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get Subnet instance ID, such as `subnet-pxir56ns`. Each request supports a maximum of 100 instances. `SubnetIds` and `Filters` cannot be specified at the same time. 
     * @return SubnetIds Subnet instance ID, such as `subnet-pxir56ns`. Each request supports a maximum of 100 instances. `SubnetIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Subnet instance ID, such as `subnet-pxir56ns`. Each request supports a maximum of 100 instances. `SubnetIds` and `Filters` cannot be specified at the same time.
     * @param SubnetIds Subnet instance ID, such as `subnet-pxir56ns`. Each request supports a maximum of 100 instances. `SubnetIds` and `Filters` cannot be specified at the same time.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Filter. `SubnetIds` and `Filters` cannot be specified at the same time.
subnet-id - String - Subnet instance name.
subnet-name - String - Subnet name. Only fuzzy query by a single value is supported.
cidr-block - String - Subnet IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
vpc-id - String - VPC instance ID, such as `vpc-f49l6u0z`.
vpc-cidr-block  - String - VPC IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
region - String - ECM region.
zone - String - AZ.
tag-key - String - Required: no - Filter by tag key.
tag:tag-key - String - Required: no - Filter by tag key-value pair. 
     * @return Filters Filter. `SubnetIds` and `Filters` cannot be specified at the same time.
subnet-id - String - Subnet instance name.
subnet-name - String - Subnet name. Only fuzzy query by a single value is supported.
cidr-block - String - Subnet IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
vpc-id - String - VPC instance ID, such as `vpc-f49l6u0z`.
vpc-cidr-block  - String - VPC IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
region - String - ECM region.
zone - String - AZ.
tag-key - String - Required: no - Filter by tag key.
tag:tag-key - String - Required: no - Filter by tag key-value pair.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. `SubnetIds` and `Filters` cannot be specified at the same time.
subnet-id - String - Subnet instance name.
subnet-name - String - Subnet name. Only fuzzy query by a single value is supported.
cidr-block - String - Subnet IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
vpc-id - String - VPC instance ID, such as `vpc-f49l6u0z`.
vpc-cidr-block  - String - VPC IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
region - String - ECM region.
zone - String - AZ.
tag-key - String - Required: no - Filter by tag key.
tag:tag-key - String - Required: no - Filter by tag key-value pair.
     * @param Filters Filter. `SubnetIds` and `Filters` cannot be specified at the same time.
subnet-id - String - Subnet instance name.
subnet-name - String - Subnet name. Only fuzzy query by a single value is supported.
cidr-block - String - Subnet IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
vpc-id - String - VPC instance ID, such as `vpc-f49l6u0z`.
vpc-cidr-block  - String - VPC IP address range, such as `192.168.1.0`. Only fuzzy query by a single value is supported.
region - String - ECM region.
zone - String - AZ.
tag-key - String - Required: no - Filter by tag key.
tag:tag-key - String - Required: no - Filter by tag key-value pair.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. 
     * @return Limit Number of returned results.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results.
     * @param Limit Number of returned results.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

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
     * Get Sorting method. time: sort in reverse chronological order; default: sort by network planning. 
     * @return Sort Sorting method. time: sort in reverse chronological order; default: sort by network planning.
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting method. time: sort in reverse chronological order; default: sort by network planning.
     * @param Sort Sorting method. time: sort in reverse chronological order; default: sort by network planning.
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public DescribeSubnetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubnetsRequest(DescribeSubnetsRequest source) {
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}


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

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * Filter.
zone      String      Required: no     (Filter) Filter by AZ abbreviation.
zone-name      String      Required: no     (Filter) Filter by AZ name. Fuzzy match is supported.
module-id      String      Required: no     (Filter) Filter by module ID.
instance-id      String      Required: no      (Filter) Filter by instance ID.
instance-name      String      Required: no      (Filter) Filter by instance name. Fuzzy match is supported.
ip-address      String      Required: no      (Filter) Filter by the instance's private/public IP.
instance-uuid   string Required: no (Filter) Filter instances by `uuid`.
instance-state  string  Required: no (Filter) Update instances by instance status.
internet-service-provider      String      Required: no      (Filter) Filter by the ISP of the instance's public IP.
tag-key      String      Required: no      (Filter) Filter by tag key.
tag:tag-key      String      Required: no      (Filter) Filter by tag key-value pair. Replace `tag-key` with the specific tag key.
instance-family      String      Required: no      (Filter) Filter by model family.
module-name      String      Required: no      (Filter) Filter by module name. Fuzzy match is supported.
image-id      String      Required: no      (Filter) Filter by instance image ID.
vpc-id String      Required: no      (Filter) Filter by instance VPC ID.
subnet-id String      Required: no      (Filter) Filter by instance subnet ID.

If the `Filters` parameter is not specified, the information of all relevant instances will be queried.
Each request can contain up to 5 `Filter.Values`.
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
    * Number of returned results. Default value: 20 (if the number of query results is greater than or equal to 20). Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specified sort by field. Currently, valid values are as follows:
timestamp: sort by instance creation time.
Note: you can sort only by creation time currently. More sort criteria may be supported in the future.
If this parameter is not specified, instances will be sorted by creation time by default.
    */
    @SerializedName("OrderByField")
    @Expose
    private String OrderByField;

    /**
    * Sorting order. 0: descending; 1: ascending. If this parameter is not specified, it will be descending by default.
    */
    @SerializedName("OrderDirection")
    @Expose
    private Long OrderDirection;

    /**
     * Get Filter.
zone      String      Required: no     (Filter) Filter by AZ abbreviation.
zone-name      String      Required: no     (Filter) Filter by AZ name. Fuzzy match is supported.
module-id      String      Required: no     (Filter) Filter by module ID.
instance-id      String      Required: no      (Filter) Filter by instance ID.
instance-name      String      Required: no      (Filter) Filter by instance name. Fuzzy match is supported.
ip-address      String      Required: no      (Filter) Filter by the instance's private/public IP.
instance-uuid   string Required: no (Filter) Filter instances by `uuid`.
instance-state  string  Required: no (Filter) Update instances by instance status.
internet-service-provider      String      Required: no      (Filter) Filter by the ISP of the instance's public IP.
tag-key      String      Required: no      (Filter) Filter by tag key.
tag:tag-key      String      Required: no      (Filter) Filter by tag key-value pair. Replace `tag-key` with the specific tag key.
instance-family      String      Required: no      (Filter) Filter by model family.
module-name      String      Required: no      (Filter) Filter by module name. Fuzzy match is supported.
image-id      String      Required: no      (Filter) Filter by instance image ID.
vpc-id String      Required: no      (Filter) Filter by instance VPC ID.
subnet-id String      Required: no      (Filter) Filter by instance subnet ID.

If the `Filters` parameter is not specified, the information of all relevant instances will be queried.
Each request can contain up to 5 `Filter.Values`. 
     * @return Filters Filter.
zone      String      Required: no     (Filter) Filter by AZ abbreviation.
zone-name      String      Required: no     (Filter) Filter by AZ name. Fuzzy match is supported.
module-id      String      Required: no     (Filter) Filter by module ID.
instance-id      String      Required: no      (Filter) Filter by instance ID.
instance-name      String      Required: no      (Filter) Filter by instance name. Fuzzy match is supported.
ip-address      String      Required: no      (Filter) Filter by the instance's private/public IP.
instance-uuid   string Required: no (Filter) Filter instances by `uuid`.
instance-state  string  Required: no (Filter) Update instances by instance status.
internet-service-provider      String      Required: no      (Filter) Filter by the ISP of the instance's public IP.
tag-key      String      Required: no      (Filter) Filter by tag key.
tag:tag-key      String      Required: no      (Filter) Filter by tag key-value pair. Replace `tag-key` with the specific tag key.
instance-family      String      Required: no      (Filter) Filter by model family.
module-name      String      Required: no      (Filter) Filter by module name. Fuzzy match is supported.
image-id      String      Required: no      (Filter) Filter by instance image ID.
vpc-id String      Required: no      (Filter) Filter by instance VPC ID.
subnet-id String      Required: no      (Filter) Filter by instance subnet ID.

If the `Filters` parameter is not specified, the information of all relevant instances will be queried.
Each request can contain up to 5 `Filter.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
zone      String      Required: no     (Filter) Filter by AZ abbreviation.
zone-name      String      Required: no     (Filter) Filter by AZ name. Fuzzy match is supported.
module-id      String      Required: no     (Filter) Filter by module ID.
instance-id      String      Required: no      (Filter) Filter by instance ID.
instance-name      String      Required: no      (Filter) Filter by instance name. Fuzzy match is supported.
ip-address      String      Required: no      (Filter) Filter by the instance's private/public IP.
instance-uuid   string Required: no (Filter) Filter instances by `uuid`.
instance-state  string  Required: no (Filter) Update instances by instance status.
internet-service-provider      String      Required: no      (Filter) Filter by the ISP of the instance's public IP.
tag-key      String      Required: no      (Filter) Filter by tag key.
tag:tag-key      String      Required: no      (Filter) Filter by tag key-value pair. Replace `tag-key` with the specific tag key.
instance-family      String      Required: no      (Filter) Filter by model family.
module-name      String      Required: no      (Filter) Filter by module name. Fuzzy match is supported.
image-id      String      Required: no      (Filter) Filter by instance image ID.
vpc-id String      Required: no      (Filter) Filter by instance VPC ID.
subnet-id String      Required: no      (Filter) Filter by instance subnet ID.

If the `Filters` parameter is not specified, the information of all relevant instances will be queried.
Each request can contain up to 5 `Filter.Values`.
     * @param Filters Filter.
zone      String      Required: no     (Filter) Filter by AZ abbreviation.
zone-name      String      Required: no     (Filter) Filter by AZ name. Fuzzy match is supported.
module-id      String      Required: no     (Filter) Filter by module ID.
instance-id      String      Required: no      (Filter) Filter by instance ID.
instance-name      String      Required: no      (Filter) Filter by instance name. Fuzzy match is supported.
ip-address      String      Required: no      (Filter) Filter by the instance's private/public IP.
instance-uuid   string Required: no (Filter) Filter instances by `uuid`.
instance-state  string  Required: no (Filter) Update instances by instance status.
internet-service-provider      String      Required: no      (Filter) Filter by the ISP of the instance's public IP.
tag-key      String      Required: no      (Filter) Filter by tag key.
tag:tag-key      String      Required: no      (Filter) Filter by tag key-value pair. Replace `tag-key` with the specific tag key.
instance-family      String      Required: no      (Filter) Filter by model family.
module-name      String      Required: no      (Filter) Filter by module name. Fuzzy match is supported.
image-id      String      Required: no      (Filter) Filter by instance image ID.
vpc-id String      Required: no      (Filter) Filter by instance VPC ID.
subnet-id String      Required: no      (Filter) Filter by instance subnet ID.

If the `Filters` parameter is not specified, the information of all relevant instances will be queried.
Each request can contain up to 5 `Filter.Values`.
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
     * Get Number of returned results. Default value: 20 (if the number of query results is greater than or equal to 20). Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20 (if the number of query results is greater than or equal to 20). Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20 (if the number of query results is greater than or equal to 20). Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20 (if the number of query results is greater than or equal to 20). Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specified sort by field. Currently, valid values are as follows:
timestamp: sort by instance creation time.
Note: you can sort only by creation time currently. More sort criteria may be supported in the future.
If this parameter is not specified, instances will be sorted by creation time by default. 
     * @return OrderByField Specified sort by field. Currently, valid values are as follows:
timestamp: sort by instance creation time.
Note: you can sort only by creation time currently. More sort criteria may be supported in the future.
If this parameter is not specified, instances will be sorted by creation time by default.
     */
    public String getOrderByField() {
        return this.OrderByField;
    }

    /**
     * Set Specified sort by field. Currently, valid values are as follows:
timestamp: sort by instance creation time.
Note: you can sort only by creation time currently. More sort criteria may be supported in the future.
If this parameter is not specified, instances will be sorted by creation time by default.
     * @param OrderByField Specified sort by field. Currently, valid values are as follows:
timestamp: sort by instance creation time.
Note: you can sort only by creation time currently. More sort criteria may be supported in the future.
If this parameter is not specified, instances will be sorted by creation time by default.
     */
    public void setOrderByField(String OrderByField) {
        this.OrderByField = OrderByField;
    }

    /**
     * Get Sorting order. 0: descending; 1: ascending. If this parameter is not specified, it will be descending by default. 
     * @return OrderDirection Sorting order. 0: descending; 1: ascending. If this parameter is not specified, it will be descending by default.
     */
    public Long getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. 0: descending; 1: ascending. If this parameter is not specified, it will be descending by default.
     * @param OrderDirection Sorting order. 0: descending; 1: ascending. If this parameter is not specified, it will be descending by default.
     */
    public void setOrderDirection(Long OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
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
        if (source.OrderByField != null) {
            this.OrderByField = new String(source.OrderByField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new Long(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByField", this.OrderByField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}


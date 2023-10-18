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

public class DescribeRouteTablesRequest extends AbstractModel {

    /**
    * Route table instance ID, such as `rtb-azd4dt1c`.
    */
    @SerializedName("RouteTableIds")
    @Expose
    private String [] RouteTableIds;

    /**
    * Filter. `RouteTableIds` and `Filters` cannot be specified at the same time.
route-table-id - String - (Filter) Route table instance ID.
route-table-name - String - (Filter) Route table name.
vpc-id - String - (Filter) VPC instance ID, such as `vpc-f49l6u0z`.
association.main - String - (Filter) Whether it is the main route table.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * ECM region. If this parameter is left empty or not specified, it will indicate all regions.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get Route table instance ID, such as `rtb-azd4dt1c`. 
     * @return RouteTableIds Route table instance ID, such as `rtb-azd4dt1c`.
     */
    public String [] getRouteTableIds() {
        return this.RouteTableIds;
    }

    /**
     * Set Route table instance ID, such as `rtb-azd4dt1c`.
     * @param RouteTableIds Route table instance ID, such as `rtb-azd4dt1c`.
     */
    public void setRouteTableIds(String [] RouteTableIds) {
        this.RouteTableIds = RouteTableIds;
    }

    /**
     * Get Filter. `RouteTableIds` and `Filters` cannot be specified at the same time.
route-table-id - String - (Filter) Route table instance ID.
route-table-name - String - (Filter) Route table name.
vpc-id - String - (Filter) VPC instance ID, such as `vpc-f49l6u0z`.
association.main - String - (Filter) Whether it is the main route table. 
     * @return Filters Filter. `RouteTableIds` and `Filters` cannot be specified at the same time.
route-table-id - String - (Filter) Route table instance ID.
route-table-name - String - (Filter) Route table name.
vpc-id - String - (Filter) VPC instance ID, such as `vpc-f49l6u0z`.
association.main - String - (Filter) Whether it is the main route table.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. `RouteTableIds` and `Filters` cannot be specified at the same time.
route-table-id - String - (Filter) Route table instance ID.
route-table-name - String - (Filter) Route table name.
vpc-id - String - (Filter) VPC instance ID, such as `vpc-f49l6u0z`.
association.main - String - (Filter) Whether it is the main route table.
     * @param Filters Filter. `RouteTableIds` and `Filters` cannot be specified at the same time.
route-table-id - String - (Filter) Route table instance ID.
route-table-name - String - (Filter) Route table name.
vpc-id - String - (Filter) VPC instance ID, such as `vpc-f49l6u0z`.
association.main - String - (Filter) Whether it is the main route table.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ECM region. If this parameter is left empty or not specified, it will indicate all regions. 
     * @return EcmRegion ECM region. If this parameter is left empty or not specified, it will indicate all regions.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region. If this parameter is left empty or not specified, it will indicate all regions.
     * @param EcmRegion ECM region. If this parameter is left empty or not specified, it will indicate all regions.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public DescribeRouteTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteTablesRequest(DescribeRouteTablesRequest source) {
        if (source.RouteTableIds != null) {
            this.RouteTableIds = new String[source.RouteTableIds.length];
            for (int i = 0; i < source.RouteTableIds.length; i++) {
                this.RouteTableIds[i] = new String(source.RouteTableIds[i]);
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
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RouteTableIds.", this.RouteTableIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}


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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayRoutesRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Pagination query limit count [0,1000], default value 0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page offset amount for pagination. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Service name, exact match
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Route name, exact match
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * Filter conditions. Multiple filter conditions have an AND relationship with each other, supporting name, path, host, method, service, and protocol.
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Pagination query limit count [0,1000], default value 0 
     * @return Limit Pagination query limit count [0,1000], default value 0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination query limit count [0,1000], default value 0
     * @param Limit Pagination query limit count [0,1000], default value 0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page offset amount for pagination. Default value: 0 
     * @return Offset Page offset amount for pagination. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset amount for pagination. Default value: 0
     * @param Offset Page offset amount for pagination. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Service name, exact match 
     * @return ServiceName Service name, exact match
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name, exact match
     * @param ServiceName Service name, exact match
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Route name, exact match 
     * @return RouteName Route name, exact match
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set Route name, exact match
     * @param RouteName Route name, exact match
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get Filter conditions. Multiple filter conditions have an AND relationship with each other, supporting name, path, host, method, service, and protocol. 
     * @return Filters Filter conditions. Multiple filter conditions have an AND relationship with each other, supporting name, path, host, method, service, and protocol.
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. Multiple filter conditions have an AND relationship with each other, supporting name, path, host, method, service, and protocol.
     * @param Filters Filter conditions. Multiple filter conditions have an AND relationship with each other, supporting name, path, host, method, service, and protocol.
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCloudNativeAPIGatewayRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayRoutesRequest(DescribeCloudNativeAPIGatewayRoutesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.Filters != null) {
            this.Filters = new ListFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ListFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


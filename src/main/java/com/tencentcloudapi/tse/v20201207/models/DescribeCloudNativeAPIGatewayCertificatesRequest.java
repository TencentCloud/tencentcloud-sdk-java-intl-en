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

public class DescribeCloudNativeAPIGatewayCertificatesRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Number of tables in the list
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * List offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria. Multiple filter conditions are in an AND relationship with each other. Support BindDomain and Name.
    */
    @SerializedName("Filters")
    @Expose
    private ListFilter [] Filters;

    /**
     * Get gateway ID 
     * @return GatewayId gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set gateway ID
     * @param GatewayId gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Number of tables in the list 
     * @return Limit Number of tables in the list
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of tables in the list
     * @param Limit Number of tables in the list
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get List offset 
     * @return Offset List offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set List offset
     * @param Offset List offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria. Multiple filter conditions are in an AND relationship with each other. Support BindDomain and Name. 
     * @return Filters Filter criteria. Multiple filter conditions are in an AND relationship with each other. Support BindDomain and Name.
     */
    public ListFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. Multiple filter conditions are in an AND relationship with each other. Support BindDomain and Name.
     * @param Filters Filter criteria. Multiple filter conditions are in an AND relationship with each other. Support BindDomain and Name.
     */
    public void setFilters(ListFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCloudNativeAPIGatewayCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayCertificatesRequest(DescribeCloudNativeAPIGatewayCertificatesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


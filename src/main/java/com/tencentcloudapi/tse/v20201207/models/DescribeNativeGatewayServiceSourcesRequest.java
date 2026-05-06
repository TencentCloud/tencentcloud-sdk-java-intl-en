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

public class DescribeNativeGatewayServiceSourcesRequest extends AbstractModel {

    /**
    * Gateway instance ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * Items per page. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Service Source ID
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * Service Source Instance Name, Fuzzy Search
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Microservice engine type: TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * Sorting field data type, currently only support SourceName
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sorting type, AES/DESC
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Gateway instance ID 
     * @return GatewayID Gateway instance ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayID Gateway instance ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get Items per page. Maximum value: 100. 
     * @return Limit Items per page. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Items per page. Maximum value: 100.
     * @param Limit Items per page. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Service Source ID 
     * @return SourceID Service Source ID
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set Service Source ID
     * @param SourceID Service Source ID
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get Service Source Instance Name, Fuzzy Search 
     * @return SourceName Service Source Instance Name, Fuzzy Search
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Service Source Instance Name, Fuzzy Search
     * @param SourceName Service Source Instance Name, Fuzzy Search
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Microservice engine type: TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh 
     * @return SourceTypes Microservice engine type: TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set Microservice engine type: TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     * @param SourceTypes Microservice engine type: TSE-Nacos｜TSE-Consul｜TSE-PolarisMesh｜Customer-Nacos｜Customer-Consul｜Customer-PolarisMesh
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get Sorting field data type, currently only support SourceName 
     * @return OrderField Sorting field data type, currently only support SourceName
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field data type, currently only support SourceName
     * @param OrderField Sorting field data type, currently only support SourceName
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sorting type, AES/DESC 
     * @return OrderType Sorting type, AES/DESC
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting type, AES/DESC
     * @param OrderType Sorting type, AES/DESC
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeNativeGatewayServiceSourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNativeGatewayServiceSourcesRequest(DescribeNativeGatewayServiceSourcesRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}


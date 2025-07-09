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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulRegistryImageListRequest extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * The number of results returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter condition
`OnlyAffectedNewestImage`: (bool) Whether the latest image is affected.
`ImageDigest`: Image digest. Fuzzy query is supported.
`ImageId`: Image ID.
`Namespace`: Namespace. Fuzzy query is supported.
`ImageTag`: Image tag. Fuzzy query is supported.
`InstanceName`: Instance name. Fuzzy query is supported.
`ImageName`: Image name. Fuzzy query is supported.
`ImageRepoAddress`: Image address. Fuzzy query is supported.
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Sorting order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Vulnerability ID 
     * @return PocID Vulnerability ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set Vulnerability ID
     * @param PocID Vulnerability ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get The number of results returned. Default value: 10. Maximum value: 100. 
     * @return Limit The number of results returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results returned. Default value: 10. Maximum value: 100.
     * @param Limit The number of results returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter condition
`OnlyAffectedNewestImage`: (bool) Whether the latest image is affected.
`ImageDigest`: Image digest. Fuzzy query is supported.
`ImageId`: Image ID.
`Namespace`: Namespace. Fuzzy query is supported.
`ImageTag`: Image tag. Fuzzy query is supported.
`InstanceName`: Instance name. Fuzzy query is supported.
`ImageName`: Image name. Fuzzy query is supported.
`ImageRepoAddress`: Image address. Fuzzy query is supported. 
     * @return Filters Filter condition
`OnlyAffectedNewestImage`: (bool) Whether the latest image is affected.
`ImageDigest`: Image digest. Fuzzy query is supported.
`ImageId`: Image ID.
`Namespace`: Namespace. Fuzzy query is supported.
`ImageTag`: Image tag. Fuzzy query is supported.
`InstanceName`: Instance name. Fuzzy query is supported.
`ImageName`: Image name. Fuzzy query is supported.
`ImageRepoAddress`: Image address. Fuzzy query is supported.
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition
`OnlyAffectedNewestImage`: (bool) Whether the latest image is affected.
`ImageDigest`: Image digest. Fuzzy query is supported.
`ImageId`: Image ID.
`Namespace`: Namespace. Fuzzy query is supported.
`ImageTag`: Image tag. Fuzzy query is supported.
`InstanceName`: Instance name. Fuzzy query is supported.
`ImageName`: Image name. Fuzzy query is supported.
`ImageRepoAddress`: Image address. Fuzzy query is supported.
     * @param Filters Filter condition
`OnlyAffectedNewestImage`: (bool) Whether the latest image is affected.
`ImageDigest`: Image digest. Fuzzy query is supported.
`ImageId`: Image ID.
`Namespace`: Namespace. Fuzzy query is supported.
`ImageTag`: Image tag. Fuzzy query is supported.
`InstanceName`: Instance name. Fuzzy query is supported.
`ImageName`: Image name. Fuzzy query is supported.
`ImageRepoAddress`: Image address. Fuzzy query is supported.
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting order 
     * @return Order Sorting order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order
     * @param Order Sorting order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulRegistryImageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulRegistryImageListRequest(DescribeVulRegistryImageListRequest source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}


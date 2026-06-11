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

public class DescribeAssetImageRegistryListRequest extends AbstractModel {

    /**
    * <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Filter field.<br>IsAuthorized can be set to all, 0 (unauthorized), and 1 (authorized).</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>Sorting field.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>Sorting method. Valid values: asc and desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Whether to display only the latest image of each repository. Default value: false.</p>
    */
    @SerializedName("OnlyShowLatest")
    @Expose
    private Boolean OnlyShowLatest;

    /**
    * <p>Whether to display only running container images.</p>
    */
    @SerializedName("IsRunning")
    @Expose
    private Boolean IsRunning;

    /**
     * Get <p>Number of items to return. The default number is 10, and the maximum number is 100.</p> 
     * @return Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     * @param Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Filter field.<br>IsAuthorized can be set to all, 0 (unauthorized), and 1 (authorized).</p> 
     * @return Filters <p>Filter field.<br>IsAuthorized can be set to all, 0 (unauthorized), and 1 (authorized).</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter field.<br>IsAuthorized can be set to all, 0 (unauthorized), and 1 (authorized).</p>
     * @param Filters <p>Filter field.<br>IsAuthorized can be set to all, 0 (unauthorized), and 1 (authorized).</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting field.</p> 
     * @return By <p>Sorting field.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field.</p>
     * @param By <p>Sorting field.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>Sorting method. Valid values: asc and desc.</p> 
     * @return Order <p>Sorting method. Valid values: asc and desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method. Valid values: asc and desc.</p>
     * @param Order <p>Sorting method. Valid values: asc and desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Whether to display only the latest image of each repository. Default value: false.</p> 
     * @return OnlyShowLatest <p>Whether to display only the latest image of each repository. Default value: false.</p>
     */
    public Boolean getOnlyShowLatest() {
        return this.OnlyShowLatest;
    }

    /**
     * Set <p>Whether to display only the latest image of each repository. Default value: false.</p>
     * @param OnlyShowLatest <p>Whether to display only the latest image of each repository. Default value: false.</p>
     */
    public void setOnlyShowLatest(Boolean OnlyShowLatest) {
        this.OnlyShowLatest = OnlyShowLatest;
    }

    /**
     * Get <p>Whether to display only running container images.</p> 
     * @return IsRunning <p>Whether to display only running container images.</p>
     */
    public Boolean getIsRunning() {
        return this.IsRunning;
    }

    /**
     * Set <p>Whether to display only running container images.</p>
     * @param IsRunning <p>Whether to display only running container images.</p>
     */
    public void setIsRunning(Boolean IsRunning) {
        this.IsRunning = IsRunning;
    }

    public DescribeAssetImageRegistryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryListRequest(DescribeAssetImageRegistryListRequest source) {
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OnlyShowLatest != null) {
            this.OnlyShowLatest = new Boolean(source.OnlyShowLatest);
        }
        if (source.IsRunning != null) {
            this.IsRunning = new Boolean(source.IsRunning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OnlyShowLatest", this.OnlyShowLatest);
        this.setParamSimple(map, prefix + "IsRunning", this.IsRunning);

    }
}


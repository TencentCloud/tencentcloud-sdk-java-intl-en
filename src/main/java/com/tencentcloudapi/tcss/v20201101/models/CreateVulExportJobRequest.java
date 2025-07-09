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

public class CreateVulExportJobRequest extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
    * Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter
<li>ComponentName- String - Required: No - Image component name</li><li>ComponentVersion- String - Required: No - Image component version</li><li>ComponentType- String - Required: No - Image component type</li><li>VulLevel- String - Required: No - Vulnerability severity</li><li>HasVul- String - Required: No - Whether there is a vulnerability. Valid values: `true` (yes); `false` (no). If `ComponentName` is not passed in or is `ALL`, it indicates all.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order. Valid values: `desc`, `asc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Export field 
     * @return ExportField Export field
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Export field
     * @param ExportField Export field
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    /**
     * Get Number of results to be returned. Default value: `10000`. Maximum value: `10000`. 
     * @return Limit Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
     * @param Limit Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter
<li>ComponentName- String - Required: No - Image component name</li><li>ComponentVersion- String - Required: No - Image component version</li><li>ComponentType- String - Required: No - Image component type</li><li>VulLevel- String - Required: No - Vulnerability severity</li><li>HasVul- String - Required: No - Whether there is a vulnerability. Valid values: `true` (yes); `false` (no). If `ComponentName` is not passed in or is `ALL`, it indicates all.</li> 
     * @return Filters Filter
<li>ComponentName- String - Required: No - Image component name</li><li>ComponentVersion- String - Required: No - Image component version</li><li>ComponentType- String - Required: No - Image component type</li><li>VulLevel- String - Required: No - Vulnerability severity</li><li>HasVul- String - Required: No - Whether there is a vulnerability. Valid values: `true` (yes); `false` (no). If `ComponentName` is not passed in or is `ALL`, it indicates all.</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>ComponentName- String - Required: No - Image component name</li><li>ComponentVersion- String - Required: No - Image component version</li><li>ComponentType- String - Required: No - Image component type</li><li>VulLevel- String - Required: No - Vulnerability severity</li><li>HasVul- String - Required: No - Whether there is a vulnerability. Valid values: `true` (yes); `false` (no). If `ComponentName` is not passed in or is `ALL`, it indicates all.</li>
     * @param Filters Filter
<li>ComponentName- String - Required: No - Image component name</li><li>ComponentVersion- String - Required: No - Image component version</li><li>ComponentType- String - Required: No - Image component type</li><li>VulLevel- String - Required: No - Vulnerability severity</li><li>HasVul- String - Required: No - Whether there is a vulnerability. Valid values: `true` (yes); `false` (no). If `ComponentName` is not passed in or is `ALL`, it indicates all.</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
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

    /**
     * Get Sorting order. Valid values: `desc`, `asc`. 
     * @return Order Sorting order. Valid values: `desc`, `asc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: `desc`, `asc`.
     * @param Order Sorting order. Valid values: `desc`, `asc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public CreateVulExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulExportJobRequest(CreateVulExportJobRequest source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}


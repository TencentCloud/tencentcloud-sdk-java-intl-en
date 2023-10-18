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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetImageVirusExportJobRequest extends AbstractModel {

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `10000`.
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter parameter. "Filters":[{"Name":"Status","Values":["2"]}]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

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
     * Get Number of results to be returned. Default value: `10`. Maximum value: `10000`. 
     * @return Filters Number of results to be returned. Default value: `10`. Maximum value: `10000`.
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Number of results to be returned. Default value: `10`. Maximum value: `10000`.
     * @param Filters Number of results to be returned. Default value: `10`. Maximum value: `10000`.
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Limit Offset. Default value: `0`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Limit Offset. Default value: `0`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter parameter. "Filters":[{"Name":"Status","Values":["2"]}] 
     * @return Offset Filter parameter. "Filters":[{"Name":"Status","Values":["2"]}]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Filter parameter. "Filters":[{"Name":"Status","Values":["2"]}]
     * @param Offset Filter parameter. "Filters":[{"Name":"Status","Values":["2"]}]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get Valid values: `asc`, `desc`. 
     * @return Order Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Valid values: `asc`, `desc`.
     * @param Order Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public CreateAssetImageVirusExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageVirusExportJobRequest(CreateAssetImageVirusExportJobRequest source) {
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}


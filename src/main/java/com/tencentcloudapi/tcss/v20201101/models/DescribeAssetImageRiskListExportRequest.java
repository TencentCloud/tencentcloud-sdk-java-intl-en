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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRiskListExportRequest extends AbstractModel{

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
    * Filter
<li>Level- String - Required: No - Risk level. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Behavior - String - Required: No - Risky behavior. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Type - String - Required: No - Risk type. Valid values: `1`, `2`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

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
     * Get Filter
<li>Level- String - Required: No - Risk level. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Behavior - String - Required: No - Risky behavior. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Type - String - Required: No - Risk type. Valid values: `1`, `2`.</li> 
     * @return Filters Filter
<li>Level- String - Required: No - Risk level. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Behavior - String - Required: No - Risky behavior. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Type - String - Required: No - Risk type. Valid values: `1`, `2`.</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>Level- String - Required: No - Risk level. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Behavior - String - Required: No - Risky behavior. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Type - String - Required: No - Risk type. Valid values: `1`, `2`.</li>
     * @param Filters Filter
<li>Level- String - Required: No - Risk level. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Behavior - String - Required: No - Risky behavior. Valid values: `1`, `2`, `3`, `4`.</li>
<li>Type - String - Required: No - Risk type. Valid values: `1`, `2`.</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAssetImageRiskListExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRiskListExportRequest(DescribeAssetImageRiskListExportRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


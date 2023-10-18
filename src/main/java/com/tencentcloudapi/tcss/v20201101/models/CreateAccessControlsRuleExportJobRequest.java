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

public class CreateAccessControlsRuleExportJobRequest extends AbstractModel {

    /**
    * Filter conditions
<li>`RuleType` - String  - Optional - Rule type</li>
<li>`Status` - String - Optional - Status</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

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
    private String [] By;

    /**
    * Fields to export
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get Filter conditions
<li>`RuleType` - String  - Optional - Rule type</li>
<li>`Status` - String - Optional - Status</li> 
     * @return Filters Filter conditions
<li>`RuleType` - String  - Optional - Rule type</li>
<li>`Status` - String - Optional - Status</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions
<li>`RuleType` - String  - Optional - Rule type</li>
<li>`Status` - String - Optional - Status</li>
     * @param Filters Filter conditions
<li>`RuleType` - String  - Optional - Rule type</li>
<li>`Status` - String - Optional - Status</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
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
    public String [] getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String [] By) {
        this.By = By;
    }

    /**
     * Get Fields to export 
     * @return ExportField Fields to export
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Fields to export
     * @param ExportField Fields to export
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public CreateAccessControlsRuleExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessControlsRuleExportJobRequest(CreateAccessControlsRuleExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String[source.By.length];
            for (int i = 0; i < source.By.length; i++) {
                this.By[i] = new String(source.By[i]);
            }
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "By.", this.By);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}


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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselineRuleRequest extends AbstractModel {

    /**
    * None
    */
    @SerializedName("Data")
    @Expose
    private BaselineRule Data;

    /**
    * Whether to select all based on the filtering criteria
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
    * <li>ItemName - string - Required: No - Item name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 0: detection item, 1: detection item category.
    */
    @SerializedName("IdType")
    @Expose
    private Long IdType;

    /**
    * ID of the detection item to be excluded.
    */
    @SerializedName("ExcludeIds")
    @Expose
    private Long [] ExcludeIds;

    /**
    * Selected detection item category.
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
     * Get None 
     * @return Data None
     */
    public BaselineRule getData() {
        return this.Data;
    }

    /**
     * Set None
     * @param Data None
     */
    public void setData(BaselineRule Data) {
        this.Data = Data;
    }

    /**
     * Get Whether to select all based on the filtering criteria 
     * @return SelectAll Whether to select all based on the filtering criteria
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set Whether to select all based on the filtering criteria
     * @param SelectAll Whether to select all based on the filtering criteria
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <li>ItemName - string - Required: No - Item name</li> 
     * @return Filters <li>ItemName - string - Required: No - Item name</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>ItemName - string - Required: No - Item name</li>
     * @param Filters <li>ItemName - string - Required: No - Item name</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 0: detection item, 1: detection item category. 
     * @return IdType 0: detection item, 1: detection item category.
     */
    public Long getIdType() {
        return this.IdType;
    }

    /**
     * Set 0: detection item, 1: detection item category.
     * @param IdType 0: detection item, 1: detection item category.
     */
    public void setIdType(Long IdType) {
        this.IdType = IdType;
    }

    /**
     * Get ID of the detection item to be excluded. 
     * @return ExcludeIds ID of the detection item to be excluded.
     */
    public Long [] getExcludeIds() {
        return this.ExcludeIds;
    }

    /**
     * Set ID of the detection item to be excluded.
     * @param ExcludeIds ID of the detection item to be excluded.
     */
    public void setExcludeIds(Long [] ExcludeIds) {
        this.ExcludeIds = ExcludeIds;
    }

    /**
     * Get Selected detection item category. 
     * @return CategoryIds Selected detection item category.
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set Selected detection item category.
     * @param CategoryIds Selected detection item category.
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    public ModifyBaselineRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineRuleRequest(ModifyBaselineRuleRequest source) {
        if (source.Data != null) {
            this.Data = new BaselineRule(source.Data);
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IdType != null) {
            this.IdType = new Long(source.IdType);
        }
        if (source.ExcludeIds != null) {
            this.ExcludeIds = new Long[source.ExcludeIds.length];
            for (int i = 0; i < source.ExcludeIds.length; i++) {
                this.ExcludeIds[i] = new Long(source.ExcludeIds[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamArraySimple(map, prefix + "ExcludeIds.", this.ExcludeIds);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);

    }
}


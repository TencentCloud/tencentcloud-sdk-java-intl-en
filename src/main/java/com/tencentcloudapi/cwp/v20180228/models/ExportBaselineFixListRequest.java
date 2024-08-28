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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportBaselineFixListRequest extends AbstractModel {

    /**
    * <li>ItemName - String - required: no - item name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 0: Filtered Result Export; 1: Export All
    */
    @SerializedName("ExportAll")
    @Expose
    private Long ExportAll;

    /**
     * Get <li>ItemName - String - required: no - item name</li> 
     * @return Filters <li>ItemName - String - required: no - item name</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>ItemName - String - required: no - item name</li>
     * @param Filters <li>ItemName - String - required: no - item name</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 0: Filtered Result Export; 1: Export All 
     * @return ExportAll 0: Filtered Result Export; 1: Export All
     */
    public Long getExportAll() {
        return this.ExportAll;
    }

    /**
     * Set 0: Filtered Result Export; 1: Export All
     * @param ExportAll 0: Filtered Result Export; 1: Export All
     */
    public void setExportAll(Long ExportAll) {
        this.ExportAll = ExportAll;
    }

    public ExportBaselineFixListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineFixListRequest(ExportBaselineFixListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ExportAll != null) {
            this.ExportAll = new Long(source.ExportAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ExportAll", this.ExportAll);

    }
}


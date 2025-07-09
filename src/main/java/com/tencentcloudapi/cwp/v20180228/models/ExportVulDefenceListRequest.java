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

public class ExportVulDefenceListRequest extends AbstractModel {

    /**
    * Filtering criteria: Keywords: vulnerability name or CVE ID for fuzzy matching, and level for precise matching
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Fields to be exported. All fields are to be exported by default.
    */
    @SerializedName("Where")
    @Expose
    private String [] Where;

    /**
     * Get Filtering criteria: Keywords: vulnerability name or CVE ID for fuzzy matching, and level for precise matching 
     * @return Filters Filtering criteria: Keywords: vulnerability name or CVE ID for fuzzy matching, and level for precise matching
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria: Keywords: vulnerability name or CVE ID for fuzzy matching, and level for precise matching
     * @param Filters Filtering criteria: Keywords: vulnerability name or CVE ID for fuzzy matching, and level for precise matching
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Fields to be exported. All fields are to be exported by default. 
     * @return Where Fields to be exported. All fields are to be exported by default.
     */
    public String [] getWhere() {
        return this.Where;
    }

    /**
     * Set Fields to be exported. All fields are to be exported by default.
     * @param Where Fields to be exported. All fields are to be exported by default.
     */
    public void setWhere(String [] Where) {
        this.Where = Where;
    }

    public ExportVulDefenceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVulDefenceListRequest(ExportVulDefenceListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Where != null) {
            this.Where = new String[source.Where.length];
            for (int i = 0; i < source.Where.length; i++) {
                this.Where[i] = new String(source.Where[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Where.", this.Where);

    }
}


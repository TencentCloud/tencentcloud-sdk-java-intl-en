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

public class ExportJavaMemShellPluginsRequest extends AbstractModel {

    /**
    * Filtering criteria: Keywords: IP or host name for fuzzy query; Pid for precise match; MainClass for fuzzy match
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Export fields
    */
    @SerializedName("Where")
    @Expose
    private String [] Where;

    /**
     * Get Filtering criteria: Keywords: IP or host name for fuzzy query; Pid for precise match; MainClass for fuzzy match 
     * @return Filters Filtering criteria: Keywords: IP or host name for fuzzy query; Pid for precise match; MainClass for fuzzy match
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria: Keywords: IP or host name for fuzzy query; Pid for precise match; MainClass for fuzzy match
     * @param Filters Filtering criteria: Keywords: IP or host name for fuzzy query; Pid for precise match; MainClass for fuzzy match
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Export fields 
     * @return Where Export fields
     */
    public String [] getWhere() {
        return this.Where;
    }

    /**
     * Set Export fields
     * @param Where Export fields
     */
    public void setWhere(String [] Where) {
        this.Where = Where;
    }

    public ExportJavaMemShellPluginsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportJavaMemShellPluginsRequest(ExportJavaMemShellPluginsRequest source) {
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


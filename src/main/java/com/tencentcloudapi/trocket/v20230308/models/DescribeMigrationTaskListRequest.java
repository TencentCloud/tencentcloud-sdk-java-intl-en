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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationTaskListRequest extends AbstractModel {

    /**
    * Query criteria list
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Query start position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Query result limit count
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query criteria list 
     * @return Filters Query criteria list
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query criteria list
     * @param Filters Query criteria list
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query start position 
     * @return Offset Query start position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query start position
     * @param Offset Query start position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Query result limit count 
     * @return Limit Query result limit count
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Query result limit count
     * @param Limit Query result limit count
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMigrationTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationTaskListRequest(DescribeMigrationTaskListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


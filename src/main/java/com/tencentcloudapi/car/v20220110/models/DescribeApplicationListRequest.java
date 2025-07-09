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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationListRequest extends AbstractModel {

    /**
    * Application list offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Application quantity limit.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Application category (DESKTOP: desktop; MOBILE: mobile).
    */
    @SerializedName("ApplicationCategory")
    @Expose
    private String ApplicationCategory;

    /**
     * Get Application list offset. 
     * @return Offset Application list offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Application list offset.
     * @param Offset Application list offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Application quantity limit. 
     * @return Limit Application quantity limit.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Application quantity limit.
     * @param Limit Application quantity limit.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. 
     * @return Filters Filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
     * @param Filters Filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Application category (DESKTOP: desktop; MOBILE: mobile). 
     * @return ApplicationCategory Application category (DESKTOP: desktop; MOBILE: mobile).
     */
    public String getApplicationCategory() {
        return this.ApplicationCategory;
    }

    /**
     * Set Application category (DESKTOP: desktop; MOBILE: mobile).
     * @param ApplicationCategory Application category (DESKTOP: desktop; MOBILE: mobile).
     */
    public void setApplicationCategory(String ApplicationCategory) {
        this.ApplicationCategory = ApplicationCategory;
    }

    public DescribeApplicationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationListRequest(DescribeApplicationListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ApplicationCategory != null) {
            this.ApplicationCategory = new String(source.ApplicationCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ApplicationCategory", this.ApplicationCategory);

    }
}


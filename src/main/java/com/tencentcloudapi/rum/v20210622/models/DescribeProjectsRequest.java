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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel {

    /**
    * Number of items per page (integer)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number (integer)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter parameter. Pass in {"Name": "IsDemo", "Values":["1"]} for the demo mode.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * This parameter has been disused. You need to indicate whether the demo mode is used in `Filters`.
    */
    @SerializedName("IsDemo")
    @Expose
    private Long IsDemo;

    /**
     * Get Number of items per page (integer) 
     * @return Limit Number of items per page (integer)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page (integer)
     * @param Limit Number of items per page (integer)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number (integer) 
     * @return Offset Page number (integer)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number (integer)
     * @param Offset Page number (integer)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter parameter. Pass in {"Name": "IsDemo", "Values":["1"]} for the demo mode. 
     * @return Filters Filter parameter. Pass in {"Name": "IsDemo", "Values":["1"]} for the demo mode.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter. Pass in {"Name": "IsDemo", "Values":["1"]} for the demo mode.
     * @param Filters Filter parameter. Pass in {"Name": "IsDemo", "Values":["1"]} for the demo mode.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get This parameter has been disused. You need to indicate whether the demo mode is used in `Filters`. 
     * @return IsDemo This parameter has been disused. You need to indicate whether the demo mode is used in `Filters`.
     */
    public Long getIsDemo() {
        return this.IsDemo;
    }

    /**
     * Set This parameter has been disused. You need to indicate whether the demo mode is used in `Filters`.
     * @param IsDemo This parameter has been disused. You need to indicate whether the demo mode is used in `Filters`.
     */
    public void setIsDemo(Long IsDemo) {
        this.IsDemo = IsDemo;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IsDemo != null) {
            this.IsDemo = new Long(source.IsDemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsDemo", this.IsDemo);

    }
}


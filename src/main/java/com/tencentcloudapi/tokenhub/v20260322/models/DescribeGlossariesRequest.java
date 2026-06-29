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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlossariesRequest extends AbstractModel {

    /**
    * Number of returned results. Defaults to 20, maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter condition list. Supported filter fields: GlossaryId (Termbase ID), Name, Source (source language code), Target (target language code).
    */
    @SerializedName("Filters")
    @Expose
    private RequestFilter [] Filters;

    /**
    * Sorting condition list. Supported sorting fields: CreatedTime (creation time), UpdatedTime (last update time).
    */
    @SerializedName("Sorts")
    @Expose
    private RequestSort [] Sorts;

    /**
     * Get Number of returned results. Defaults to 20, maximum value is 100. 
     * @return Limit Number of returned results. Defaults to 20, maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Defaults to 20, maximum value is 100.
     * @param Limit Number of returned results. Defaults to 20, maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter condition list. Supported filter fields: GlossaryId (Termbase ID), Name, Source (source language code), Target (target language code). 
     * @return Filters Filter condition list. Supported filter fields: GlossaryId (Termbase ID), Name, Source (source language code), Target (target language code).
     */
    public RequestFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition list. Supported filter fields: GlossaryId (Termbase ID), Name, Source (source language code), Target (target language code).
     * @param Filters Filter condition list. Supported filter fields: GlossaryId (Termbase ID), Name, Source (source language code), Target (target language code).
     */
    public void setFilters(RequestFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting condition list. Supported sorting fields: CreatedTime (creation time), UpdatedTime (last update time). 
     * @return Sorts Sorting condition list. Supported sorting fields: CreatedTime (creation time), UpdatedTime (last update time).
     */
    public RequestSort [] getSorts() {
        return this.Sorts;
    }

    /**
     * Set Sorting condition list. Supported sorting fields: CreatedTime (creation time), UpdatedTime (last update time).
     * @param Sorts Sorting condition list. Supported sorting fields: CreatedTime (creation time), UpdatedTime (last update time).
     */
    public void setSorts(RequestSort [] Sorts) {
        this.Sorts = Sorts;
    }

    public DescribeGlossariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlossariesRequest(DescribeGlossariesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new RequestFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RequestFilter(source.Filters[i]);
            }
        }
        if (source.Sorts != null) {
            this.Sorts = new RequestSort[source.Sorts.length];
            for (int i = 0; i < source.Sorts.length; i++) {
                this.Sorts[i] = new RequestSort(source.Sorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Sorts.", this.Sorts);

    }
}


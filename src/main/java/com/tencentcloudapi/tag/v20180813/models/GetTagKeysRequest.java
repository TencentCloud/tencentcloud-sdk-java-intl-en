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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTagKeysRequest extends AbstractModel {

    /**
    * The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * Number of data entries to return per page (up to 1,000).
Default value: 50.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request. 
     * @return PaginationToken The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     * @param PaginationToken The token value of the next page obtained from the response of the previous page.
Leave it empty for the first request.
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get Number of data entries to return per page (up to 1,000).
Default value: 50. 
     * @return MaxResults Number of data entries to return per page (up to 1,000).
Default value: 50.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Number of data entries to return per page (up to 1,000).
Default value: 50.
     * @param MaxResults Number of data entries to return per page (up to 1,000).
Default value: 50.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All. 
     * @return Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     * @param Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public GetTagKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTagKeysRequest(GetTagKeysRequest source) {
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}


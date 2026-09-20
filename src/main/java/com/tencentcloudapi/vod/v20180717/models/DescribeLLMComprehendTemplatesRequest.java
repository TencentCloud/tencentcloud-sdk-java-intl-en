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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMComprehendTemplatesRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Filter condition for the unique identifier of the large model parsing template. The array can contain up to 100 unique identifiers.</p>
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * <p>Sorting method.<br>Sort.Field Option: Definition, CreateTime, UpdateTime.</p>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Filter condition for the unique identifier of the large model parsing template. The array can contain up to 100 unique identifiers.</p> 
     * @return Definitions <p>Filter condition for the unique identifier of the large model parsing template. The array can contain up to 100 unique identifiers.</p>
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set <p>Filter condition for the unique identifier of the large model parsing template. The array can contain up to 100 unique identifiers.</p>
     * @param Definitions <p>Filter condition for the unique identifier of the large model parsing template. The array can contain up to 100 unique identifiers.</p>
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get <p>Sorting method.<br>Sort.Field Option: Definition, CreateTime, UpdateTime.</p> 
     * @return Sort <p>Sorting method.<br>Sort.Field Option: Definition, CreateTime, UpdateTime.</p>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sorting method.<br>Sort.Field Option: Definition, CreateTime, UpdateTime.</p>
     * @param Sort <p>Sorting method.<br>Sort.Field Option: Definition, CreateTime, UpdateTime.</p>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Paging offset. Default value: 0.</p> 
     * @return Offset <p>Paging offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0.</p>
     * @param Offset <p>Paging offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLLMComprehendTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMComprehendTemplatesRequest(DescribeLLMComprehendTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}


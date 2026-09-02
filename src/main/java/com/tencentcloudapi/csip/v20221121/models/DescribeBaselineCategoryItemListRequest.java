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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineCategoryItemListRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>ID of the parent category in the baseline, for filtering detection items under the specified parent category.</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>Number of entries returned per page for paging query. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paginated query offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>List of Universal Filter Criteria. Supported filter fields:</p><ul><li>CategoryID: subcategory ID, exact match</li><li>Name: detection item name, fuzzy matching</li><li>RiskLevel: risk level, exact match. Values: LOW, MEDIUM, HIGH, CRITICAL</li><li>SupportCustomValue: whether editing is supported, exact match. Values: true, false</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>ID of the parent category in the baseline, for filtering detection items under the specified parent category.</p> 
     * @return ParentCategoryID <p>ID of the parent category in the baseline, for filtering detection items under the specified parent category.</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>ID of the parent category in the baseline, for filtering detection items under the specified parent category.</p>
     * @param ParentCategoryID <p>ID of the parent category in the baseline, for filtering detection items under the specified parent category.</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>Number of entries returned per page for paging query. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of entries returned per page for paging query. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of entries returned per page for paging query. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of entries returned per page for paging query. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paginated query offset. Default value: 0.</p> 
     * @return Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset. Default value: 0.</p>
     * @param Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>List of Universal Filter Criteria. Supported filter fields:</p><ul><li>CategoryID: subcategory ID, exact match</li><li>Name: detection item name, fuzzy matching</li><li>RiskLevel: risk level, exact match. Values: LOW, MEDIUM, HIGH, CRITICAL</li><li>SupportCustomValue: whether editing is supported, exact match. Values: true, false</li></ul> 
     * @return Filters <p>List of Universal Filter Criteria. Supported filter fields:</p><ul><li>CategoryID: subcategory ID, exact match</li><li>Name: detection item name, fuzzy matching</li><li>RiskLevel: risk level, exact match. Values: LOW, MEDIUM, HIGH, CRITICAL</li><li>SupportCustomValue: whether editing is supported, exact match. Values: true, false</li></ul>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>List of Universal Filter Criteria. Supported filter fields:</p><ul><li>CategoryID: subcategory ID, exact match</li><li>Name: detection item name, fuzzy matching</li><li>RiskLevel: risk level, exact match. Values: LOW, MEDIUM, HIGH, CRITICAL</li><li>SupportCustomValue: whether editing is supported, exact match. Values: true, false</li></ul>
     * @param Filters <p>List of Universal Filter Criteria. Supported filter fields:</p><ul><li>CategoryID: subcategory ID, exact match</li><li>Name: detection item name, fuzzy matching</li><li>RiskLevel: risk level, exact match. Values: LOW, MEDIUM, HIGH, CRITICAL</li><li>SupportCustomValue: whether editing is supported, exact match. Values: true, false</li></ul>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBaselineCategoryItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineCategoryItemListRequest(DescribeBaselineCategoryItemListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


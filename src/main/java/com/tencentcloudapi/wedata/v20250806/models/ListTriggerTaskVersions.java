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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTriggerTaskVersions extends AbstractModel {

    /**
    * Record list	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private TriggerTaskVersion [] Items;

    /**
    * Total number of records that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total number of pages that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Number of records on current page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Number of entries in the current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number of the current request.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Record list	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Items Record list	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerTaskVersion [] getItems() {
        return this.Items;
    }

    /**
     * Set Record list	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Items Record list	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItems(TriggerTaskVersion [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total number of records that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of records that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of records that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total number of pages that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPageNumber Total number of pages that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total number of pages that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPageNumber Total number of pages that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Number of records on current page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageCount Number of records on current page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Number of records on current page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageCount Number of records on current page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Number of entries in the current request data page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Number of entries in the current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries in the current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Number of entries in the current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number of the current request.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNumber Page number of the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number of the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNumber Page number of the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListTriggerTaskVersions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggerTaskVersions(ListTriggerTaskVersions source) {
        if (source.Items != null) {
            this.Items = new TriggerTaskVersion[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TriggerTaskVersion(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}


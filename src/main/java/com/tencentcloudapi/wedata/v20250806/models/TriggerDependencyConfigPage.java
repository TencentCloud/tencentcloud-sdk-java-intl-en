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

public class TriggerDependencyConfigPage extends AbstractModel {

    /**
    * Total number of data entries that meet the query condition.
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
    * Current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of entries in the current request.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Paging data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private TriggerTaskDependDto [] Items;

    /**
     * Get Total number of data entries that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of data entries that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of data entries that meet the query condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of data entries that meet the query condition.
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
     * Get Current request data page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNumber Current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNumber Current request data page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries in the current request.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Number of entries in the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries in the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Number of entries in the current request.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Paging data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Items Paging data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerTaskDependDto [] getItems() {
        return this.Items;
    }

    /**
     * Set Paging data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Items Paging data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItems(TriggerTaskDependDto [] Items) {
        this.Items = Items;
    }

    public TriggerDependencyConfigPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerDependencyConfigPage(TriggerDependencyConfigPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new TriggerTaskDependDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TriggerTaskDependDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}


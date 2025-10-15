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

public class ListTaskVersions extends AbstractModel {

    /**
    * Record list	
	

    */
    @SerializedName("Items")
    @Expose
    private TaskVersion [] Items;

    /**
    * Total number of records that meet the query condition.

    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total number of pages that meet the query condition.

    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Number of records on current page.

    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Specifies the number of entries in the current request data page.

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Specifies the data page number of the current request.

    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Record list	
	
 
     * @return Items Record list	
	

     */
    public TaskVersion [] getItems() {
        return this.Items;
    }

    /**
     * Set Record list	
	

     * @param Items Record list	
	

     */
    public void setItems(TaskVersion [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total number of records that meet the query condition.
 
     * @return TotalCount Total number of records that meet the query condition.

     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records that meet the query condition.

     * @param TotalCount Total number of records that meet the query condition.

     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total number of pages that meet the query condition.
 
     * @return TotalPageNumber Total number of pages that meet the query condition.

     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total number of pages that meet the query condition.

     * @param TotalPageNumber Total number of pages that meet the query condition.

     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Number of records on current page.
 
     * @return PageCount Number of records on current page.

     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Number of records on current page.

     * @param PageCount Number of records on current page.

     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Specifies the number of entries in the current request data page.
 
     * @return PageSize Specifies the number of entries in the current request data page.

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of entries in the current request data page.

     * @param PageSize Specifies the number of entries in the current request data page.

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Specifies the data page number of the current request.
 
     * @return PageNumber Specifies the data page number of the current request.

     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Specifies the data page number of the current request.

     * @param PageNumber Specifies the data page number of the current request.

     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListTaskVersions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskVersions(ListTaskVersions source) {
        if (source.Items != null) {
            this.Items = new TaskVersion[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskVersion(source.Items[i]);
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


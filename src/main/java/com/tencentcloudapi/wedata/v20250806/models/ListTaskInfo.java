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

public class ListTaskInfo extends AbstractModel {

    /**
    * Task Array

    */
    @SerializedName("Items")
    @Expose
    private TaskBaseAttribute [] Items;

    /**
    * Current request data page number.

    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of entries in the current request.

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of data entries that meet the query condition.
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
     * Get Task Array
 
     * @return Items Task Array

     */
    public TaskBaseAttribute [] getItems() {
        return this.Items;
    }

    /**
     * Set Task Array

     * @param Items Task Array

     */
    public void setItems(TaskBaseAttribute [] Items) {
        this.Items = Items;
    }

    /**
     * Get Current request data page number.
 
     * @return PageNumber Current request data page number.

     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current request data page number.

     * @param PageNumber Current request data page number.

     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries in the current request.
 
     * @return PageSize Number of entries in the current request.

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries in the current request.

     * @param PageSize Number of entries in the current request.

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of data entries that meet the query condition. 
     * @return TotalCount Total number of data entries that meet the query condition.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of data entries that meet the query condition.
     * @param TotalCount Total number of data entries that meet the query condition.
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

    public ListTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskInfo(ListTaskInfo source) {
        if (source.Items != null) {
            this.Items = new TaskBaseAttribute[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskBaseAttribute(source.Items[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);

    }
}


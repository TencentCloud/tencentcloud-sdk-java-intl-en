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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFolderWorkflowListData extends AbstractModel {

    /**
    * Workflow Information List
    */
    @SerializedName("Items")
    @Expose
    private Workflow [] Items;

    /**
    * Total number of items
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page Size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Workflow Information List 
     * @return Items Workflow Information List
     */
    public Workflow [] getItems() {
        return this.Items;
    }

    /**
     * Set Workflow Information List
     * @param Items Workflow Information List
     */
    public void setItems(Workflow [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total number of items 
     * @return TotalCount Total number of items
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of items
     * @param TotalCount Total number of items
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page Size 
     * @return PageSize Page Size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page Size
     * @param PageSize Page Size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeFolderWorkflowListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFolderWorkflowListData(DescribeFolderWorkflowListData source) {
        if (source.Items != null) {
            this.Items = new Workflow[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Workflow(source.Items[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}


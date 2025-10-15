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

public class WorkflowFolderPage extends AbstractModel {

    /**
    * Data page number, equal to or greater than 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of data records displayed per page. value range: 10 to 200.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of folders.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total pages
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Folder list.
    */
    @SerializedName("Items")
    @Expose
    private WorkflowFolder [] Items;

    /**
     * Get Data page number, equal to or greater than 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNumber Data page number, equal to or greater than 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Data page number, equal to or greater than 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNumber Data page number, equal to or greater than 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of data records displayed per page. value range: 10 to 200.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Specifies the number of data records displayed per page. value range: 10 to 200.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of data records displayed per page. value range: 10 to 200.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Specifies the number of data records displayed per page. value range: 10 to 200.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of folders. 
     * @return TotalCount Total number of folders.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of folders.
     * @param TotalCount Total number of folders.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total pages 
     * @return TotalPageNumber Total pages
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total pages
     * @param TotalPageNumber Total pages
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Folder list. 
     * @return Items Folder list.
     */
    public WorkflowFolder [] getItems() {
        return this.Items;
    }

    /**
     * Set Folder list.
     * @param Items Folder list.
     */
    public void setItems(WorkflowFolder [] Items) {
        this.Items = Items;
    }

    public WorkflowFolderPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowFolderPage(WorkflowFolderPage source) {
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
        if (source.Items != null) {
            this.Items = new WorkflowFolder[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowFolder(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}


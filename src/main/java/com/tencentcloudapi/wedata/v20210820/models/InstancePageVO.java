/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class InstancePageVO extends AbstractModel {

    /**
    * Total number of entries.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Page number

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Entries per page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Data List

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private InstanceVO [] Items;

    /**
     * Get Total number of entries.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of entries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of entries.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of entries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPage Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPage Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Page number

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNumber Page number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNumber Page number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Entries per page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Entries per page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Entries per page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Entries per page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageCount Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageCount Total number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Data List

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Items Data List

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceVO [] getItems() {
        return this.Items;
    }

    /**
     * Set Data List

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Items Data List

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItems(InstanceVO [] Items) {
        this.Items = Items;
    }

    public InstancePageVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePageVO(InstancePageVO source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.Items != null) {
            this.Items = new InstanceVO[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceVO(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}


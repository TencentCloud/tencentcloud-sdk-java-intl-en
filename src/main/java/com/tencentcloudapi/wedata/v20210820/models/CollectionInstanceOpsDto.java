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

public class CollectionInstanceOpsDto extends AbstractModel {

    /**
    * Total numberNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Current Page Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Page Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Quantity per page
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Instance InformationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private InstanceOpsDto [] Items;

    /**
     * Get Total numberNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total numberNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalPage Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalPage Total Number of Pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Current Page Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageCount Current Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Current Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageCount Current Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Page Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageNumber Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageNumber Page Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Quantity per page
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageSize Quantity per page
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Quantity per page
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageSize Quantity per page
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Instance InformationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Items Instance InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceOpsDto [] getItems() {
        return this.Items;
    }

    /**
     * Set Instance InformationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Items Instance InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(InstanceOpsDto [] Items) {
        this.Items = Items;
    }

    public CollectionInstanceOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectionInstanceOpsDto(CollectionInstanceOpsDto source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new InstanceOpsDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceOpsDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}


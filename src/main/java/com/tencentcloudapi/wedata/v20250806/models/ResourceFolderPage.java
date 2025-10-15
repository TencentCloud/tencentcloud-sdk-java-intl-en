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

public class ResourceFolderPage extends AbstractModel {

    /**
    * Resource folder collection information.
    */
    @SerializedName("Items")
    @Expose
    private ResourceFolder [] Items;

    /**
    * Total page number.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Total resource folder count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Current Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Items per Page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Resource folder collection information. 
     * @return Items Resource folder collection information.
     */
    public ResourceFolder [] getItems() {
        return this.Items;
    }

    /**
     * Set Resource folder collection information.
     * @param Items Resource folder collection information.
     */
    public void setItems(ResourceFolder [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total page number. 
     * @return TotalPageNumber Total page number.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total page number.
     * @param TotalPageNumber Total page number.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Total resource folder count 
     * @return TotalCount Total resource folder count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total resource folder count
     * @param TotalCount Total resource folder count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Current Page number 
     * @return PageNumber Current Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current Page number
     * @param PageNumber Current Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Items per Page 
     * @return PageSize Items per Page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Items per Page
     * @param PageSize Items per Page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ResourceFolderPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFolderPage(ResourceFolderPage source) {
        if (source.Items != null) {
            this.Items = new ResourceFolder[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ResourceFolder(source.Items[i]);
            }
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
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
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}


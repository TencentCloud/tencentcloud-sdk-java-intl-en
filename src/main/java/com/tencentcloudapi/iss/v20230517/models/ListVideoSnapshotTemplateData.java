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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVideoSnapshotTemplateData extends AbstractModel {

    /**
    * <p>Total.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Sorting parameter</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Sort order</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Screenshot template list</p>
    */
    @SerializedName("List")
    @Expose
    private VideoSnapshotTemplateInfo [] List;

    /**
     * Get <p>Total.</p> 
     * @return TotalCount <p>Total.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total.</p>
     * @param TotalCount <p>Total.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Sorting parameter</p> 
     * @return Sort <p>Sorting parameter</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sorting parameter</p>
     * @param Sort <p>Sorting parameter</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Sort order</p> 
     * @return Order <p>Sort order</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort order</p>
     * @param Order <p>Sort order</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageNumber <p>Page number.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageNumber <p>Page number.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page.</p> 
     * @return PageSize <p>Number of items per page.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page.</p>
     * @param PageSize <p>Number of items per page.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Screenshot template list</p> 
     * @return List <p>Screenshot template list</p>
     */
    public VideoSnapshotTemplateInfo [] getList() {
        return this.List;
    }

    /**
     * Set <p>Screenshot template list</p>
     * @param List <p>Screenshot template list</p>
     */
    public void setList(VideoSnapshotTemplateInfo [] List) {
        this.List = List;
    }

    public ListVideoSnapshotTemplateData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoSnapshotTemplateData(ListVideoSnapshotTemplateData source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.List != null) {
            this.List = new VideoSnapshotTemplateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new VideoSnapshotTemplateInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}


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

public class ListVideoSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>Template name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Sorting parameter</p><p>Default value: update_time</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Sort order</p><p>Enumeration values:</p><ul><li>desc: in descending order</li><li>asc: in ascending order</li></ul><p>Default value: desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Page number</p><p>Default value: 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page</p><p>Default value: 20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>Template name</p> 
     * @return Name <p>Template name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name</p>
     * @param Name <p>Template name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul> 
     * @return Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     * @param Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Sorting parameter</p><p>Default value: update_time</p> 
     * @return Sort <p>Sorting parameter</p><p>Default value: update_time</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sorting parameter</p><p>Default value: update_time</p>
     * @param Sort <p>Sorting parameter</p><p>Default value: update_time</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Sort order</p><p>Enumeration values:</p><ul><li>desc: in descending order</li><li>asc: in ascending order</li></ul><p>Default value: desc</p> 
     * @return Order <p>Sort order</p><p>Enumeration values:</p><ul><li>desc: in descending order</li><li>asc: in ascending order</li></ul><p>Default value: desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort order</p><p>Enumeration values:</p><ul><li>desc: in descending order</li><li>asc: in ascending order</li></ul><p>Default value: desc</p>
     * @param Order <p>Sort order</p><p>Enumeration values:</p><ul><li>desc: in descending order</li><li>asc: in ascending order</li></ul><p>Default value: desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Page number</p><p>Default value: 1</p> 
     * @return PageNumber <p>Page number</p><p>Default value: 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number</p><p>Default value: 1</p>
     * @param PageNumber <p>Page number</p><p>Default value: 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page</p><p>Default value: 20</p> 
     * @return PageSize <p>Number of items per page</p><p>Default value: 20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page</p><p>Default value: 20</p>
     * @param PageSize <p>Number of items per page</p><p>Default value: 20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListVideoSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoSnapshotTemplateRequest(ListVideoSnapshotTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}


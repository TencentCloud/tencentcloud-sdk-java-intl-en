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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListConsoleGroupUsersRsp extends AbstractModel {

    /**
    * User group member list
    */
    @SerializedName("Items")
    @Expose
    private ConsoleGroupUserInfo [] Items;

    /**
    * Current page
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
    * Total number of records
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
     * Get User group member list 
     * @return Items User group member list
     */
    public ConsoleGroupUserInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set User group member list
     * @param Items User group member list
     */
    public void setItems(ConsoleGroupUserInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get Current page 
     * @return PageNumber Current page
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current page
     * @param PageNumber Current page
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

    /**
     * Get Total number of records 
     * @return TotalCount Total number of records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records
     * @param TotalCount Total number of records
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

    public ListConsoleGroupUsersRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConsoleGroupUsersRsp(ListConsoleGroupUsersRsp source) {
        if (source.Items != null) {
            this.Items = new ConsoleGroupUserInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ConsoleGroupUserInfo(source.Items[i]);
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


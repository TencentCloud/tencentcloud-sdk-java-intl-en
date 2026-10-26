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

public class ListOrganizationChannelsData extends AbstractModel {

    /**
    * Which page.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of devices on the current page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of device channels in this query
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of device channel information
    */
    @SerializedName("List")
    @Expose
    private OrganizationChannelInfo [] List;

    /**
     * Get Which page. 
     * @return PageNumber Which page.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Which page.
     * @param PageNumber Which page.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of devices on the current page 
     * @return PageSize Number of devices on the current page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of devices on the current page
     * @param PageSize Number of devices on the current page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of device channels in this query 
     * @return TotalCount Total number of device channels in this query
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of device channels in this query
     * @param TotalCount Total number of device channels in this query
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of device channel information 
     * @return List List of device channel information
     */
    public OrganizationChannelInfo [] getList() {
        return this.List;
    }

    /**
     * Set List of device channel information
     * @param List List of device channel information
     */
    public void setList(OrganizationChannelInfo [] List) {
        this.List = List;
    }

    public ListOrganizationChannelsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationChannelsData(ListOrganizationChannelsData source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new OrganizationChannelInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new OrganizationChannelInfo(source.List[i]);
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
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}


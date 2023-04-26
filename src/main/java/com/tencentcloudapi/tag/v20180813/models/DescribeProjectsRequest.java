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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel{

    /**
    * If this parameter is 1, all projects (including hidden ones) will be queried. If it is 0, only non-hidden projects will be queried.
    */
    @SerializedName("AllList")
    @Expose
    private Long AllList;

    /**
    * Number of entries per page. Fixed value: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get If this parameter is 1, all projects (including hidden ones) will be queried. If it is 0, only non-hidden projects will be queried. 
     * @return AllList If this parameter is 1, all projects (including hidden ones) will be queried. If it is 0, only non-hidden projects will be queried.
     */
    public Long getAllList() {
        return this.AllList;
    }

    /**
     * Set If this parameter is 1, all projects (including hidden ones) will be queried. If it is 0, only non-hidden projects will be queried.
     * @param AllList If this parameter is 1, all projects (including hidden ones) will be queried. If it is 0, only non-hidden projects will be queried.
     */
    public void setAllList(Long AllList) {
        this.AllList = AllList;
    }

    /**
     * Get Number of entries per page. Fixed value: 1,000. 
     * @return Limit Number of entries per page. Fixed value: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Fixed value: 1,000.
     * @param Limit Number of entries per page. Fixed value: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.AllList != null) {
            this.AllList = new Long(source.AllList);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllList", this.AllList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}


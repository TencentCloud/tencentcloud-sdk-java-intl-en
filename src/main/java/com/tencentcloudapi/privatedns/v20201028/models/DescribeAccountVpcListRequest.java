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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountVpcListRequest extends AbstractModel {

    /**
    * UIN of account
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * Pagination offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Maximum value: `100`. Default value: `20`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter parameters
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get UIN of account 
     * @return AccountUin UIN of account
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set UIN of account
     * @param AccountUin UIN of account
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get Pagination offset, starting from 0 
     * @return Offset Pagination offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0
     * @param Offset Pagination offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Maximum value: `100`. Default value: `20` 
     * @return Limit Number of entries per page. Maximum value: `100`. Default value: `20`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Maximum value: `100`. Default value: `20`
     * @param Limit Number of entries per page. Maximum value: `100`. Default value: `20`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter parameters 
     * @return Filters Filter parameters
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
     * @param Filters Filter parameters
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAccountVpcListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountVpcListRequest(DescribeAccountVpcListRequest source) {
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}


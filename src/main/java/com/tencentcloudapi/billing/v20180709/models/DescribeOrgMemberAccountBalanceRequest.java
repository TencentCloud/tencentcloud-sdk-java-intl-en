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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrgMemberAccountBalanceRequest extends AbstractModel {

    /**
    * <p>Page number</p><p>Default value: 1</p><p>Value ranges from 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Page size</p><p>Value ranges from 1 to 10</p><p>Default value: 10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Member uin list</p><p>Input parameter limit: Elements must be pure digits and the number of elements cannot be greater than 10</p><p>Return the account balance information of all members within the organization when empty, and return the account balance information of specified members when not empty</p>
    */
    @SerializedName("MemberUins")
    @Expose
    private String [] MemberUins;

    /**
     * Get <p>Page number</p><p>Default value: 1</p><p>Value ranges from 1</p> 
     * @return PageNumber <p>Page number</p><p>Default value: 1</p><p>Value ranges from 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number</p><p>Default value: 1</p><p>Value ranges from 1</p>
     * @param PageNumber <p>Page number</p><p>Default value: 1</p><p>Value ranges from 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Page size</p><p>Value ranges from 1 to 10</p><p>Default value: 10</p> 
     * @return PageSize <p>Page size</p><p>Value ranges from 1 to 10</p><p>Default value: 10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Page size</p><p>Value ranges from 1 to 10</p><p>Default value: 10</p>
     * @param PageSize <p>Page size</p><p>Value ranges from 1 to 10</p><p>Default value: 10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Member uin list</p><p>Input parameter limit: Elements must be pure digits and the number of elements cannot be greater than 10</p><p>Return the account balance information of all members within the organization when empty, and return the account balance information of specified members when not empty</p> 
     * @return MemberUins <p>Member uin list</p><p>Input parameter limit: Elements must be pure digits and the number of elements cannot be greater than 10</p><p>Return the account balance information of all members within the organization when empty, and return the account balance information of specified members when not empty</p>
     */
    public String [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set <p>Member uin list</p><p>Input parameter limit: Elements must be pure digits and the number of elements cannot be greater than 10</p><p>Return the account balance information of all members within the organization when empty, and return the account balance information of specified members when not empty</p>
     * @param MemberUins <p>Member uin list</p><p>Input parameter limit: Elements must be pure digits and the number of elements cannot be greater than 10</p><p>Return the account balance information of all members within the organization when empty, and return the account balance information of specified members when not empty</p>
     */
    public void setMemberUins(String [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    public DescribeOrgMemberAccountBalanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgMemberAccountBalanceRequest(DescribeOrgMemberAccountBalanceRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MemberUins != null) {
            this.MemberUins = new String[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new String(source.MemberUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);

    }
}


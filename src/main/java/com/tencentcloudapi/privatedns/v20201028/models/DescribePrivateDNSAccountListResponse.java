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

public class DescribePrivateDNSAccountListResponse extends AbstractModel {

    /**
    * Number of Private DNS accounts
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of Private DNS accounts
    */
    @SerializedName("AccountSet")
    @Expose
    private PrivateDNSAccount [] AccountSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of Private DNS accounts 
     * @return TotalCount Number of Private DNS accounts
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of Private DNS accounts
     * @param TotalCount Number of Private DNS accounts
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of Private DNS accounts 
     * @return AccountSet List of Private DNS accounts
     */
    public PrivateDNSAccount [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set List of Private DNS accounts
     * @param AccountSet List of Private DNS accounts
     */
    public void setAccountSet(PrivateDNSAccount [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrivateDNSAccountListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateDNSAccountListResponse(DescribePrivateDNSAccountListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccountSet != null) {
            this.AccountSet = new PrivateDNSAccount[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new PrivateDNSAccount(source.AccountSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


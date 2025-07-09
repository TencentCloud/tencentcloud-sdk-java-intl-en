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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAccountResponse extends AbstractModel {

    /**
    * Namespace usage information
    */
    @SerializedName("AccountUsage")
    @Expose
    private UsageInfo AccountUsage;

    /**
    * Namespace limit information
    */
    @SerializedName("AccountLimit")
    @Expose
    private LimitsInfo AccountLimit;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Namespace usage information 
     * @return AccountUsage Namespace usage information
     */
    public UsageInfo getAccountUsage() {
        return this.AccountUsage;
    }

    /**
     * Set Namespace usage information
     * @param AccountUsage Namespace usage information
     */
    public void setAccountUsage(UsageInfo AccountUsage) {
        this.AccountUsage = AccountUsage;
    }

    /**
     * Get Namespace limit information 
     * @return AccountLimit Namespace limit information
     */
    public LimitsInfo getAccountLimit() {
        return this.AccountLimit;
    }

    /**
     * Set Namespace limit information
     * @param AccountLimit Namespace limit information
     */
    public void setAccountLimit(LimitsInfo AccountLimit) {
        this.AccountLimit = AccountLimit;
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

    public GetAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAccountResponse(GetAccountResponse source) {
        if (source.AccountUsage != null) {
            this.AccountUsage = new UsageInfo(source.AccountUsage);
        }
        if (source.AccountLimit != null) {
            this.AccountLimit = new LimitsInfo(source.AccountLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountUsage.", this.AccountUsage);
        this.setParamObj(map, prefix + "AccountLimit.", this.AccountLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


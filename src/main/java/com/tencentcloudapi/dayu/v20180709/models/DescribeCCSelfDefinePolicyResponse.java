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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCSelfDefinePolicyResponse extends AbstractModel {

    /**
    * Total number of custom rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Policy list
    */
    @SerializedName("Policys")
    @Expose
    private CCPolicy [] Policys;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of custom rules 
     * @return Total Total number of custom rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of custom rules
     * @param Total Total number of custom rules
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Policy list 
     * @return Policys Policy list
     */
    public CCPolicy [] getPolicys() {
        return this.Policys;
    }

    /**
     * Set Policy list
     * @param Policys Policy list
     */
    public void setPolicys(CCPolicy [] Policys) {
        this.Policys = Policys;
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

    public DescribeCCSelfDefinePolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCSelfDefinePolicyResponse(DescribeCCSelfDefinePolicyResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Policys != null) {
            this.Policys = new CCPolicy[source.Policys.length];
            for (int i = 0; i < source.Policys.length; i++) {
                this.Policys[i] = new CCPolicy(source.Policys[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Policys.", this.Policys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


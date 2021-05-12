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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSPolicyResponse extends AbstractModel{

    /**
    * Advanced DDoS policy list
    */
    @SerializedName("DDosPolicyList")
    @Expose
    private DDosPolicy [] DDosPolicyList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Advanced DDoS policy list 
     * @return DDosPolicyList Advanced DDoS policy list
     */
    public DDosPolicy [] getDDosPolicyList() {
        return this.DDosPolicyList;
    }

    /**
     * Set Advanced DDoS policy list
     * @param DDosPolicyList Advanced DDoS policy list
     */
    public void setDDosPolicyList(DDosPolicy [] DDosPolicyList) {
        this.DDosPolicyList = DDosPolicyList;
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

    public DescribeDDoSPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSPolicyResponse(DescribeDDoSPolicyResponse source) {
        if (source.DDosPolicyList != null) {
            this.DDosPolicyList = new DDosPolicy[source.DDosPolicyList.length];
            for (int i = 0; i < source.DDosPolicyList.length; i++) {
                this.DDosPolicyList[i] = new DDosPolicy(source.DDosPolicyList[i]);
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
        this.setParamArrayObj(map, prefix + "DDosPolicyList.", this.DDosPolicyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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

public class DescribeInsurePacksResponse extends AbstractModel{

    /**
    * Guarantee package list
    */
    @SerializedName("InsurePacks")
    @Expose
    private KeyValueRecord [] InsurePacks;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Guarantee package list 
     * @return InsurePacks Guarantee package list
     */
    public KeyValueRecord [] getInsurePacks() {
        return this.InsurePacks;
    }

    /**
     * Set Guarantee package list
     * @param InsurePacks Guarantee package list
     */
    public void setInsurePacks(KeyValueRecord [] InsurePacks) {
        this.InsurePacks = InsurePacks;
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

    public DescribeInsurePacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInsurePacksResponse(DescribeInsurePacksResponse source) {
        if (source.InsurePacks != null) {
            this.InsurePacks = new KeyValueRecord[source.InsurePacks.length];
            for (int i = 0; i < source.InsurePacks.length; i++) {
                this.InsurePacks[i] = new KeyValueRecord(source.InsurePacks[i]);
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
        this.setParamArrayObj(map, prefix + "InsurePacks.", this.InsurePacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


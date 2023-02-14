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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeployListResponse extends AbstractModel{

    /**
    * The total number of contracts.
    */
    @SerializedName("AllCount")
    @Expose
    private Long AllCount;

    /**
    * A list of deployed contracts.
    */
    @SerializedName("Result")
    @Expose
    private Contract [] Result;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of contracts. 
     * @return AllCount The total number of contracts.
     */
    public Long getAllCount() {
        return this.AllCount;
    }

    /**
     * Set The total number of contracts.
     * @param AllCount The total number of contracts.
     */
    public void setAllCount(Long AllCount) {
        this.AllCount = AllCount;
    }

    /**
     * Get A list of deployed contracts. 
     * @return Result A list of deployed contracts.
     */
    public Contract [] getResult() {
        return this.Result;
    }

    /**
     * Set A list of deployed contracts.
     * @param Result A list of deployed contracts.
     */
    public void setResult(Contract [] Result) {
        this.Result = Result;
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

    public GetDeployListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeployListResponse(GetDeployListResponse source) {
        if (source.AllCount != null) {
            this.AllCount = new Long(source.AllCount);
        }
        if (source.Result != null) {
            this.Result = new Contract[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new Contract(source.Result[i]);
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
        this.setParamSimple(map, prefix + "AllCount", this.AllCount);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


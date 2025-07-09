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

public class GetProvisionedConcurrencyConfigResponse extends AbstractModel {

    /**
    * Unallocated provisioned concurrency amount of function.
    */
    @SerializedName("UnallocatedConcurrencyNum")
    @Expose
    private Long UnallocatedConcurrencyNum;

    /**
    * Allocated provisioned concurrency amount of function.
    */
    @SerializedName("Allocated")
    @Expose
    private VersionProvisionedConcurrencyInfo [] Allocated;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unallocated provisioned concurrency amount of function. 
     * @return UnallocatedConcurrencyNum Unallocated provisioned concurrency amount of function.
     */
    public Long getUnallocatedConcurrencyNum() {
        return this.UnallocatedConcurrencyNum;
    }

    /**
     * Set Unallocated provisioned concurrency amount of function.
     * @param UnallocatedConcurrencyNum Unallocated provisioned concurrency amount of function.
     */
    public void setUnallocatedConcurrencyNum(Long UnallocatedConcurrencyNum) {
        this.UnallocatedConcurrencyNum = UnallocatedConcurrencyNum;
    }

    /**
     * Get Allocated provisioned concurrency amount of function. 
     * @return Allocated Allocated provisioned concurrency amount of function.
     */
    public VersionProvisionedConcurrencyInfo [] getAllocated() {
        return this.Allocated;
    }

    /**
     * Set Allocated provisioned concurrency amount of function.
     * @param Allocated Allocated provisioned concurrency amount of function.
     */
    public void setAllocated(VersionProvisionedConcurrencyInfo [] Allocated) {
        this.Allocated = Allocated;
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

    public GetProvisionedConcurrencyConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProvisionedConcurrencyConfigResponse(GetProvisionedConcurrencyConfigResponse source) {
        if (source.UnallocatedConcurrencyNum != null) {
            this.UnallocatedConcurrencyNum = new Long(source.UnallocatedConcurrencyNum);
        }
        if (source.Allocated != null) {
            this.Allocated = new VersionProvisionedConcurrencyInfo[source.Allocated.length];
            for (int i = 0; i < source.Allocated.length; i++) {
                this.Allocated[i] = new VersionProvisionedConcurrencyInfo(source.Allocated[i]);
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
        this.setParamSimple(map, prefix + "UnallocatedConcurrencyNum", this.UnallocatedConcurrencyNum);
        this.setParamArrayObj(map, prefix + "Allocated.", this.Allocated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


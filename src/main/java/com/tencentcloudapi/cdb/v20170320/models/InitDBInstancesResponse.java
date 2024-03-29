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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDBInstancesResponse extends AbstractModel {

    /**
    * Array of async task request IDs, which can be used to query the execution results of async tasks.
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private String [] AsyncRequestIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of async task request IDs, which can be used to query the execution results of async tasks. 
     * @return AsyncRequestIds Array of async task request IDs, which can be used to query the execution results of async tasks.
     */
    public String [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * Set Array of async task request IDs, which can be used to query the execution results of async tasks.
     * @param AsyncRequestIds Array of async task request IDs, which can be used to query the execution results of async tasks.
     */
    public void setAsyncRequestIds(String [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
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

    public InitDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitDBInstancesResponse(InitDBInstancesResponse source) {
        if (source.AsyncRequestIds != null) {
            this.AsyncRequestIds = new String[source.AsyncRequestIds.length];
            for (int i = 0; i < source.AsyncRequestIds.length; i++) {
                this.AsyncRequestIds[i] = new String(source.AsyncRequestIds[i]);
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
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


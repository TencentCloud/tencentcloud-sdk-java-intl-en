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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRequestTargetNodeTypesResponse extends AbstractModel {

    /**
    * A list of node types used to receive requests.
    */
    @SerializedName("TargetNodeTypes")
    @Expose
    private String [] TargetNodeTypes;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get A list of node types used to receive requests. 
     * @return TargetNodeTypes A list of node types used to receive requests.
     */
    public String [] getTargetNodeTypes() {
        return this.TargetNodeTypes;
    }

    /**
     * Set A list of node types used to receive requests.
     * @param TargetNodeTypes A list of node types used to receive requests.
     */
    public void setTargetNodeTypes(String [] TargetNodeTypes) {
        this.TargetNodeTypes = TargetNodeTypes;
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

    public GetRequestTargetNodeTypesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRequestTargetNodeTypesResponse(GetRequestTargetNodeTypesResponse source) {
        if (source.TargetNodeTypes != null) {
            this.TargetNodeTypes = new String[source.TargetNodeTypes.length];
            for (int i = 0; i < source.TargetNodeTypes.length; i++) {
                this.TargetNodeTypes[i] = new String(source.TargetNodeTypes[i]);
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
        this.setParamArraySimple(map, prefix + "TargetNodeTypes.", this.TargetNodeTypes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


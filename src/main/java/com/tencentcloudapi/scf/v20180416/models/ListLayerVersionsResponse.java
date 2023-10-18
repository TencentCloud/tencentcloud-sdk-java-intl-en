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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLayerVersionsResponse extends AbstractModel {

    /**
    * Layer version list
    */
    @SerializedName("LayerVersions")
    @Expose
    private LayerVersionInfo [] LayerVersions;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Layer version list 
     * @return LayerVersions Layer version list
     */
    public LayerVersionInfo [] getLayerVersions() {
        return this.LayerVersions;
    }

    /**
     * Set Layer version list
     * @param LayerVersions Layer version list
     */
    public void setLayerVersions(LayerVersionInfo [] LayerVersions) {
        this.LayerVersions = LayerVersions;
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

    public ListLayerVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLayerVersionsResponse(ListLayerVersionsResponse source) {
        if (source.LayerVersions != null) {
            this.LayerVersions = new LayerVersionInfo[source.LayerVersions.length];
            for (int i = 0; i < source.LayerVersions.length; i++) {
                this.LayerVersions[i] = new LayerVersionInfo(source.LayerVersions[i]);
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
        this.setParamArrayObj(map, prefix + "LayerVersions.", this.LayerVersions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


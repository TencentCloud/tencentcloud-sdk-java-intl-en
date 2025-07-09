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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnAttachedInstancesResponse extends AbstractModel {

    /**
    * List of instances associated with the CCN instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CcnAttachedInstanceSet")
    @Expose
    private CcnAttachedInstance [] CcnAttachedInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of instances associated with the CCN instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CcnAttachedInstanceSet List of instances associated with the CCN instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CcnAttachedInstance [] getCcnAttachedInstanceSet() {
        return this.CcnAttachedInstanceSet;
    }

    /**
     * Set List of instances associated with the CCN instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CcnAttachedInstanceSet List of instances associated with the CCN instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCcnAttachedInstanceSet(CcnAttachedInstance [] CcnAttachedInstanceSet) {
        this.CcnAttachedInstanceSet = CcnAttachedInstanceSet;
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

    public DescribeCcnAttachedInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnAttachedInstancesResponse(DescribeCcnAttachedInstancesResponse source) {
        if (source.CcnAttachedInstanceSet != null) {
            this.CcnAttachedInstanceSet = new CcnAttachedInstance[source.CcnAttachedInstanceSet.length];
            for (int i = 0; i < source.CcnAttachedInstanceSet.length; i++) {
                this.CcnAttachedInstanceSet[i] = new CcnAttachedInstance(source.CcnAttachedInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "CcnAttachedInstanceSet.", this.CcnAttachedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceTypeConfigResponse extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Model configuration information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTypeConfigSet")
    @Expose
    private InstanceTypeConfig [] InstanceTypeConfigSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Model configuration information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTypeConfigSet Model configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InstanceTypeConfig [] getInstanceTypeConfigSet() {
        return this.InstanceTypeConfigSet;
    }

    /**
     * Set Model configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceTypeConfigSet Model configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTypeConfigSet(InstanceTypeConfig [] InstanceTypeConfigSet) {
        this.InstanceTypeConfigSet = InstanceTypeConfigSet;
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

    public DescribeInstanceTypeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceTypeConfigResponse(DescribeInstanceTypeConfigResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceTypeConfigSet != null) {
            this.InstanceTypeConfigSet = new InstanceTypeConfig[source.InstanceTypeConfigSet.length];
            for (int i = 0; i < source.InstanceTypeConfigSet.length; i++) {
                this.InstanceTypeConfigSet[i] = new InstanceTypeConfig(source.InstanceTypeConfigSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceTypeConfigSet.", this.InstanceTypeConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


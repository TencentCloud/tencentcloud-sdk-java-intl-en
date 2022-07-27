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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeClusterExtraArgsResponse extends AbstractModel{

    /**
    * Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterExtraArgs")
    @Expose
    private EdgeClusterExtraArgs ClusterExtraArgs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterExtraArgs Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EdgeClusterExtraArgs getClusterExtraArgs() {
        return this.ClusterExtraArgs;
    }

    /**
     * Set Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterExtraArgs Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterExtraArgs(EdgeClusterExtraArgs ClusterExtraArgs) {
        this.ClusterExtraArgs = ClusterExtraArgs;
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

    public DescribeEdgeClusterExtraArgsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeClusterExtraArgsResponse(DescribeEdgeClusterExtraArgsResponse source) {
        if (source.ClusterExtraArgs != null) {
            this.ClusterExtraArgs = new EdgeClusterExtraArgs(source.ClusterExtraArgs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterExtraArgs.", this.ClusterExtraArgs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


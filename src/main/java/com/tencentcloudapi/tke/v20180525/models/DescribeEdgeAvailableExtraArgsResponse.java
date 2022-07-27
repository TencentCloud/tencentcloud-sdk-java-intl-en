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

public class DescribeEdgeAvailableExtraArgsResponse extends AbstractModel{

    /**
    * Cluster version
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Available custom parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableExtraArgs")
    @Expose
    private EdgeAvailableExtraArgs AvailableExtraArgs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster version
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterVersion Cluster version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterVersion Cluster version
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Available custom parameters
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AvailableExtraArgs Available custom parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EdgeAvailableExtraArgs getAvailableExtraArgs() {
        return this.AvailableExtraArgs;
    }

    /**
     * Set Available custom parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AvailableExtraArgs Available custom parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAvailableExtraArgs(EdgeAvailableExtraArgs AvailableExtraArgs) {
        this.AvailableExtraArgs = AvailableExtraArgs;
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

    public DescribeEdgeAvailableExtraArgsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeAvailableExtraArgsResponse(DescribeEdgeAvailableExtraArgsResponse source) {
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.AvailableExtraArgs != null) {
            this.AvailableExtraArgs = new EdgeAvailableExtraArgs(source.AvailableExtraArgs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamObj(map, prefix + "AvailableExtraArgs.", this.AvailableExtraArgs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


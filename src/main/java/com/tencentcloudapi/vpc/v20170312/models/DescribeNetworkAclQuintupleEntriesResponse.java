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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkAclQuintupleEntriesResponse extends AbstractModel {

    /**
    * The list of the network ACL quintuple entries
    */
    @SerializedName("NetworkAclQuintupleSet")
    @Expose
    private NetworkAclQuintupleEntry [] NetworkAclQuintupleSet;

    /**
    * Number of eligible instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The list of the network ACL quintuple entries 
     * @return NetworkAclQuintupleSet The list of the network ACL quintuple entries
     */
    public NetworkAclQuintupleEntry [] getNetworkAclQuintupleSet() {
        return this.NetworkAclQuintupleSet;
    }

    /**
     * Set The list of the network ACL quintuple entries
     * @param NetworkAclQuintupleSet The list of the network ACL quintuple entries
     */
    public void setNetworkAclQuintupleSet(NetworkAclQuintupleEntry [] NetworkAclQuintupleSet) {
        this.NetworkAclQuintupleSet = NetworkAclQuintupleSet;
    }

    /**
     * Get Number of eligible instances. 
     * @return TotalCount Number of eligible instances.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible instances.
     * @param TotalCount Number of eligible instances.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeNetworkAclQuintupleEntriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkAclQuintupleEntriesResponse(DescribeNetworkAclQuintupleEntriesResponse source) {
        if (source.NetworkAclQuintupleSet != null) {
            this.NetworkAclQuintupleSet = new NetworkAclQuintupleEntry[source.NetworkAclQuintupleSet.length];
            for (int i = 0; i < source.NetworkAclQuintupleSet.length; i++) {
                this.NetworkAclQuintupleSet[i] = new NetworkAclQuintupleEntry(source.NetworkAclQuintupleSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NetworkAclQuintupleSet.", this.NetworkAclQuintupleSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


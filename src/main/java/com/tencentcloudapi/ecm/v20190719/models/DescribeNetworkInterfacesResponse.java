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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkInterfacesResponse extends AbstractModel{

    /**
    * Number of eligible instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of instance details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkInterfaceSet")
    @Expose
    private NetworkInterface [] NetworkInterfaceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get List of instance details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkInterfaceSet List of instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public NetworkInterface [] getNetworkInterfaceSet() {
        return this.NetworkInterfaceSet;
    }

    /**
     * Set List of instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkInterfaceSet List of instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkInterfaceSet(NetworkInterface [] NetworkInterfaceSet) {
        this.NetworkInterfaceSet = NetworkInterfaceSet;
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

    public DescribeNetworkInterfacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkInterfacesResponse(DescribeNetworkInterfacesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NetworkInterfaceSet != null) {
            this.NetworkInterfaceSet = new NetworkInterface[source.NetworkInterfaceSet.length];
            for (int i = 0; i < source.NetworkInterfaceSet.length; i++) {
                this.NetworkInterfaceSet[i] = new NetworkInterface(source.NetworkInterfaceSet[i]);
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
        this.setParamArrayObj(map, prefix + "NetworkInterfaceSet.", this.NetworkInterfaceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


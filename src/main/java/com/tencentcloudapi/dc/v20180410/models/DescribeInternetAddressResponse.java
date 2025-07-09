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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInternetAddressResponse extends AbstractModel {

    /**
    * Number of public IP addresses for internet tunnels
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of the public IP addresses for internet tunnels
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Subnets")
    @Expose
    private InternetAddressDetail [] Subnets;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of public IP addresses for internet tunnels 
     * @return TotalCount Number of public IP addresses for internet tunnels
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of public IP addresses for internet tunnels
     * @param TotalCount Number of public IP addresses for internet tunnels
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of the public IP addresses for internet tunnels
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Subnets List of the public IP addresses for internet tunnels
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public InternetAddressDetail [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set List of the public IP addresses for internet tunnels
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Subnets List of the public IP addresses for internet tunnels
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnets(InternetAddressDetail [] Subnets) {
        this.Subnets = Subnets;
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

    public DescribeInternetAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternetAddressResponse(DescribeInternetAddressResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Subnets != null) {
            this.Subnets = new InternetAddressDetail[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new InternetAddressDetail(source.Subnets[i]);
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
        this.setParamArrayObj(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


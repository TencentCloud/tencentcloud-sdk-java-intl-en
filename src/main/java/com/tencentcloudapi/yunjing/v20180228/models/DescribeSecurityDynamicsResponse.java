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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityDynamicsResponse extends AbstractModel {

    /**
    * Security event message array.
    */
    @SerializedName("SecurityDynamics")
    @Expose
    private SecurityDynamic [] SecurityDynamics;

    /**
    * Total number of records.
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
     * Get Security event message array. 
     * @return SecurityDynamics Security event message array.
     */
    public SecurityDynamic [] getSecurityDynamics() {
        return this.SecurityDynamics;
    }

    /**
     * Set Security event message array.
     * @param SecurityDynamics Security event message array.
     */
    public void setSecurityDynamics(SecurityDynamic [] SecurityDynamics) {
        this.SecurityDynamics = SecurityDynamics;
    }

    /**
     * Get Total number of records. 
     * @return TotalCount Total number of records.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records.
     * @param TotalCount Total number of records.
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

    public DescribeSecurityDynamicsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityDynamicsResponse(DescribeSecurityDynamicsResponse source) {
        if (source.SecurityDynamics != null) {
            this.SecurityDynamics = new SecurityDynamic[source.SecurityDynamics.length];
            for (int i = 0; i < source.SecurityDynamics.length; i++) {
                this.SecurityDynamics[i] = new SecurityDynamic(source.SecurityDynamics[i]);
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
        this.setParamArrayObj(map, prefix + "SecurityDynamics.", this.SecurityDynamics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


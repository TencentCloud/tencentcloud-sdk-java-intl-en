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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckEdgeClusterCIDRResponse extends AbstractModel {

    /**
    * Return code. Valid values:
-1: Internal error
0: No conflict
1: Conflict between VPC and serviceCIDR
2: Conflict between VPC and podCIDR
3: Conflict between serviceCIDR and podCIDR
    */
    @SerializedName("ConflictCode")
    @Expose
    private Long ConflictCode;

    /**
    * CIDR block conflict description
    */
    @SerializedName("ConflictMsg")
    @Expose
    private String ConflictMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Return code. Valid values:
-1: Internal error
0: No conflict
1: Conflict between VPC and serviceCIDR
2: Conflict between VPC and podCIDR
3: Conflict between serviceCIDR and podCIDR 
     * @return ConflictCode Return code. Valid values:
-1: Internal error
0: No conflict
1: Conflict between VPC and serviceCIDR
2: Conflict between VPC and podCIDR
3: Conflict between serviceCIDR and podCIDR
     */
    public Long getConflictCode() {
        return this.ConflictCode;
    }

    /**
     * Set Return code. Valid values:
-1: Internal error
0: No conflict
1: Conflict between VPC and serviceCIDR
2: Conflict between VPC and podCIDR
3: Conflict between serviceCIDR and podCIDR
     * @param ConflictCode Return code. Valid values:
-1: Internal error
0: No conflict
1: Conflict between VPC and serviceCIDR
2: Conflict between VPC and podCIDR
3: Conflict between serviceCIDR and podCIDR
     */
    public void setConflictCode(Long ConflictCode) {
        this.ConflictCode = ConflictCode;
    }

    /**
     * Get CIDR block conflict description 
     * @return ConflictMsg CIDR block conflict description
     */
    public String getConflictMsg() {
        return this.ConflictMsg;
    }

    /**
     * Set CIDR block conflict description
     * @param ConflictMsg CIDR block conflict description
     */
    public void setConflictMsg(String ConflictMsg) {
        this.ConflictMsg = ConflictMsg;
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

    public CheckEdgeClusterCIDRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckEdgeClusterCIDRResponse(CheckEdgeClusterCIDRResponse source) {
        if (source.ConflictCode != null) {
            this.ConflictCode = new Long(source.ConflictCode);
        }
        if (source.ConflictMsg != null) {
            this.ConflictMsg = new String(source.ConflictMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictCode", this.ConflictCode);
        this.setParamSimple(map, prefix + "ConflictMsg", this.ConflictMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


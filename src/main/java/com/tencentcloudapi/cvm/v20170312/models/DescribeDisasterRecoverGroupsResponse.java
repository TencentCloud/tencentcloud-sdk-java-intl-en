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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisasterRecoverGroupsResponse extends AbstractModel{

    /**
    * Information on spread placement groups.
    */
    @SerializedName("DisasterRecoverGroupSet")
    @Expose
    private DisasterRecoverGroup [] DisasterRecoverGroupSet;

    /**
    * Total number of placement groups of the user.
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
     * Get Information on spread placement groups. 
     * @return DisasterRecoverGroupSet Information on spread placement groups.
     */
    public DisasterRecoverGroup [] getDisasterRecoverGroupSet() {
        return this.DisasterRecoverGroupSet;
    }

    /**
     * Set Information on spread placement groups.
     * @param DisasterRecoverGroupSet Information on spread placement groups.
     */
    public void setDisasterRecoverGroupSet(DisasterRecoverGroup [] DisasterRecoverGroupSet) {
        this.DisasterRecoverGroupSet = DisasterRecoverGroupSet;
    }

    /**
     * Get Total number of placement groups of the user. 
     * @return TotalCount Total number of placement groups of the user.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of placement groups of the user.
     * @param TotalCount Total number of placement groups of the user.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DisasterRecoverGroupSet.", this.DisasterRecoverGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


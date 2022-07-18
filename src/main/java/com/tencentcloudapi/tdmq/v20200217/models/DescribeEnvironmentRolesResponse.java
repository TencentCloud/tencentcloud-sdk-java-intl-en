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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvironmentRolesResponse extends AbstractModel{

    /**
    * The number of records.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Namespace role set.
    */
    @SerializedName("EnvironmentRoleSets")
    @Expose
    private EnvironmentRole [] EnvironmentRoleSets;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of records. 
     * @return TotalCount The number of records.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of records.
     * @param TotalCount The number of records.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Namespace role set. 
     * @return EnvironmentRoleSets Namespace role set.
     */
    public EnvironmentRole [] getEnvironmentRoleSets() {
        return this.EnvironmentRoleSets;
    }

    /**
     * Set Namespace role set.
     * @param EnvironmentRoleSets Namespace role set.
     */
    public void setEnvironmentRoleSets(EnvironmentRole [] EnvironmentRoleSets) {
        this.EnvironmentRoleSets = EnvironmentRoleSets;
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

    public DescribeEnvironmentRolesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentRolesResponse(DescribeEnvironmentRolesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EnvironmentRoleSets != null) {
            this.EnvironmentRoleSets = new EnvironmentRole[source.EnvironmentRoleSets.length];
            for (int i = 0; i < source.EnvironmentRoleSets.length; i++) {
                this.EnvironmentRoleSets[i] = new EnvironmentRole(source.EnvironmentRoleSets[i]);
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
        this.setParamArrayObj(map, prefix + "EnvironmentRoleSets.", this.EnvironmentRoleSets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterBaselineRiskPolicyListRequest extends AbstractModel {

    /**
    * <p>Appid of the cluster's account, used to specify the account for querying baseline risk policies.</p>
    */
    @SerializedName("ClusterAppid")
    @Expose
    private Long ClusterAppid;

    /**
    * <p>Cluster CaMD5</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * List of member IDs of the group account.
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Appid of the cluster's account, used to specify the account for querying baseline risk policies.</p> 
     * @return ClusterAppid <p>Appid of the cluster's account, used to specify the account for querying baseline risk policies.</p>
     */
    public Long getClusterAppid() {
        return this.ClusterAppid;
    }

    /**
     * Set <p>Appid of the cluster's account, used to specify the account for querying baseline risk policies.</p>
     * @param ClusterAppid <p>Appid of the cluster's account, used to specify the account for querying baseline risk policies.</p>
     */
    public void setClusterAppid(Long ClusterAppid) {
        this.ClusterAppid = ClusterAppid;
    }

    /**
     * Get <p>Cluster CaMD5</p> 
     * @return ClusterCaMD5 <p>Cluster CaMD5</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster CaMD5</p>
     * @param ClusterCaMD5 <p>Cluster CaMD5</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get List of member IDs of the group account. 
     * @return MemberId List of member IDs of the group account.
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set List of member IDs of the group account.
     * @param MemberId List of member IDs of the group account.
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeClusterBaselineRiskPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterBaselineRiskPolicyListRequest(DescribeClusterBaselineRiskPolicyListRequest source) {
        if (source.ClusterAppid != null) {
            this.ClusterAppid = new Long(source.ClusterAppid);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterAppid", this.ClusterAppid);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}


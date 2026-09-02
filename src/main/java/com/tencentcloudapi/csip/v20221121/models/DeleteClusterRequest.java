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

public class DeleteClusterRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Member ID of the Called Group Account
    */
    @SerializedName("OperatedMemberId")
    @Expose
    private String [] OperatedMemberId;

    /**
    * <p>Cluster asset id</p>
    */
    @SerializedName("ClusterAssetIds")
    @Expose
    private String [] ClusterAssetIds;

    /**
    * <p>Cluster ca certificate md5 value, the unique identifier of the cluster</p>
    */
    @SerializedName("ClusterCaMD5List")
    @Expose
    private String [] ClusterCaMD5List;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Member ID of the Called Group Account 
     * @return OperatedMemberId Member ID of the Called Group Account
     */
    public String [] getOperatedMemberId() {
        return this.OperatedMemberId;
    }

    /**
     * Set Member ID of the Called Group Account
     * @param OperatedMemberId Member ID of the Called Group Account
     */
    public void setOperatedMemberId(String [] OperatedMemberId) {
        this.OperatedMemberId = OperatedMemberId;
    }

    /**
     * Get <p>Cluster asset id</p> 
     * @return ClusterAssetIds <p>Cluster asset id</p>
     * @deprecated
     */
    @Deprecated
    public String [] getClusterAssetIds() {
        return this.ClusterAssetIds;
    }

    /**
     * Set <p>Cluster asset id</p>
     * @param ClusterAssetIds <p>Cluster asset id</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterAssetIds(String [] ClusterAssetIds) {
        this.ClusterAssetIds = ClusterAssetIds;
    }

    /**
     * Get <p>Cluster ca certificate md5 value, the unique identifier of the cluster</p> 
     * @return ClusterCaMD5List <p>Cluster ca certificate md5 value, the unique identifier of the cluster</p>
     */
    public String [] getClusterCaMD5List() {
        return this.ClusterCaMD5List;
    }

    /**
     * Set <p>Cluster ca certificate md5 value, the unique identifier of the cluster</p>
     * @param ClusterCaMD5List <p>Cluster ca certificate md5 value, the unique identifier of the cluster</p>
     */
    public void setClusterCaMD5List(String [] ClusterCaMD5List) {
        this.ClusterCaMD5List = ClusterCaMD5List;
    }

    public DeleteClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterRequest(DeleteClusterRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OperatedMemberId != null) {
            this.OperatedMemberId = new String[source.OperatedMemberId.length];
            for (int i = 0; i < source.OperatedMemberId.length; i++) {
                this.OperatedMemberId[i] = new String(source.OperatedMemberId[i]);
            }
        }
        if (source.ClusterAssetIds != null) {
            this.ClusterAssetIds = new String[source.ClusterAssetIds.length];
            for (int i = 0; i < source.ClusterAssetIds.length; i++) {
                this.ClusterAssetIds[i] = new String(source.ClusterAssetIds[i]);
            }
        }
        if (source.ClusterCaMD5List != null) {
            this.ClusterCaMD5List = new String[source.ClusterCaMD5List.length];
            for (int i = 0; i < source.ClusterCaMD5List.length; i++) {
                this.ClusterCaMD5List[i] = new String(source.ClusterCaMD5List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "OperatedMemberId.", this.OperatedMemberId);
        this.setParamArraySimple(map, prefix + "ClusterAssetIds.", this.ClusterAssetIds);
        this.setParamArraySimple(map, prefix + "ClusterCaMD5List.", this.ClusterCaMD5List);

    }
}


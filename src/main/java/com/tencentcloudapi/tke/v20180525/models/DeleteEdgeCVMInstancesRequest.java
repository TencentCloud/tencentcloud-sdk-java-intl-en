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

public class DeleteEdgeCVMInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * IDs of CVMs to be deleted
    */
    @SerializedName("CvmIdSet")
    @Expose
    private String [] CvmIdSet;

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get IDs of CVMs to be deleted 
     * @return CvmIdSet IDs of CVMs to be deleted
     */
    public String [] getCvmIdSet() {
        return this.CvmIdSet;
    }

    /**
     * Set IDs of CVMs to be deleted
     * @param CvmIdSet IDs of CVMs to be deleted
     */
    public void setCvmIdSet(String [] CvmIdSet) {
        this.CvmIdSet = CvmIdSet;
    }

    public DeleteEdgeCVMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeCVMInstancesRequest(DeleteEdgeCVMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.CvmIdSet != null) {
            this.CvmIdSet = new String[source.CvmIdSet.length];
            for (int i = 0; i < source.CvmIdSet.length; i++) {
                this.CvmIdSet[i] = new String(source.CvmIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArraySimple(map, prefix + "CvmIdSet.", this.CvmIdSet);

    }
}


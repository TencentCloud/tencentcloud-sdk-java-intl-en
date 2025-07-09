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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteECMInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * IDs of ECMs to be deleted
    */
    @SerializedName("EcmIdSet")
    @Expose
    private String [] EcmIdSet;

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
     * Get IDs of ECMs to be deleted 
     * @return EcmIdSet IDs of ECMs to be deleted
     */
    public String [] getEcmIdSet() {
        return this.EcmIdSet;
    }

    /**
     * Set IDs of ECMs to be deleted
     * @param EcmIdSet IDs of ECMs to be deleted
     */
    public void setEcmIdSet(String [] EcmIdSet) {
        this.EcmIdSet = EcmIdSet;
    }

    public DeleteECMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteECMInstancesRequest(DeleteECMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.EcmIdSet != null) {
            this.EcmIdSet = new String[source.EcmIdSet.length];
            for (int i = 0; i < source.EcmIdSet.length; i++) {
                this.EcmIdSet[i] = new String(source.EcmIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArraySimple(map, prefix + "EcmIdSet.", this.EcmIdSet);

    }
}


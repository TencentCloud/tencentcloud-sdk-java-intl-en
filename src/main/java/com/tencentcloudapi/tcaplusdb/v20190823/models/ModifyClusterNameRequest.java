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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterNameRequest extends AbstractModel {

    /**
    * ID of the cluster to be renamed
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name to be changed to, which can contain up to 32 letters and digits
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get ID of the cluster to be renamed 
     * @return ClusterId ID of the cluster to be renamed
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster to be renamed
     * @param ClusterId ID of the cluster to be renamed
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name to be changed to, which can contain up to 32 letters and digits 
     * @return ClusterName Cluster name to be changed to, which can contain up to 32 letters and digits
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name to be changed to, which can contain up to 32 letters and digits
     * @param ClusterName Cluster name to be changed to, which can contain up to 32 letters and digits
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public ModifyClusterNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterNameRequest(ModifyClusterNameRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}


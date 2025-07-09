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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExclusiveCluster extends AbstractModel {

    /**
    * Layer-4 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("L4Clusters")
    @Expose
    private ClusterItem [] L4Clusters;

    /**
    * Layer-7 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("L7Clusters")
    @Expose
    private ClusterItem [] L7Clusters;

    /**
    * vpcgw cluster
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassicalCluster")
    @Expose
    private ClusterItem ClassicalCluster;

    /**
     * Get Layer-4 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return L4Clusters Layer-4 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClusterItem [] getL4Clusters() {
        return this.L4Clusters;
    }

    /**
     * Set Layer-4 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param L4Clusters Layer-4 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setL4Clusters(ClusterItem [] L4Clusters) {
        this.L4Clusters = L4Clusters;
    }

    /**
     * Get Layer-7 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return L7Clusters Layer-7 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClusterItem [] getL7Clusters() {
        return this.L7Clusters;
    }

    /**
     * Set Layer-7 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param L7Clusters Layer-7 dedicated cluster list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setL7Clusters(ClusterItem [] L7Clusters) {
        this.L7Clusters = L7Clusters;
    }

    /**
     * Get vpcgw cluster
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassicalCluster vpcgw cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClusterItem getClassicalCluster() {
        return this.ClassicalCluster;
    }

    /**
     * Set vpcgw cluster
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassicalCluster vpcgw cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassicalCluster(ClusterItem ClassicalCluster) {
        this.ClassicalCluster = ClassicalCluster;
    }

    public ExclusiveCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExclusiveCluster(ExclusiveCluster source) {
        if (source.L4Clusters != null) {
            this.L4Clusters = new ClusterItem[source.L4Clusters.length];
            for (int i = 0; i < source.L4Clusters.length; i++) {
                this.L4Clusters[i] = new ClusterItem(source.L4Clusters[i]);
            }
        }
        if (source.L7Clusters != null) {
            this.L7Clusters = new ClusterItem[source.L7Clusters.length];
            for (int i = 0; i < source.L7Clusters.length; i++) {
                this.L7Clusters[i] = new ClusterItem(source.L7Clusters[i]);
            }
        }
        if (source.ClassicalCluster != null) {
            this.ClassicalCluster = new ClusterItem(source.ClassicalCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "L4Clusters.", this.L4Clusters);
        this.setParamArrayObj(map, prefix + "L7Clusters.", this.L7Clusters);
        this.setParamObj(map, prefix + "ClassicalCluster.", this.ClassicalCluster);

    }
}


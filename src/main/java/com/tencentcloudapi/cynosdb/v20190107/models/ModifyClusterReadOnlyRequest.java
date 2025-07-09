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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterReadOnlyRequest extends AbstractModel {

    /**
    * List of cluster IDs
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Cluster read-only switch, valid values: ON, OFF.
    */
    @SerializedName("ReadOnlyOperation")
    @Expose
    private String ReadOnlyOperation;

    /**
    * Valid values: `yes` (modify in maintenance window), `no` (execute now by default).
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get List of cluster IDs 
     * @return ClusterIds List of cluster IDs
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set List of cluster IDs
     * @param ClusterIds List of cluster IDs
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Cluster read-only switch, valid values: ON, OFF. 
     * @return ReadOnlyOperation Cluster read-only switch, valid values: ON, OFF.
     */
    public String getReadOnlyOperation() {
        return this.ReadOnlyOperation;
    }

    /**
     * Set Cluster read-only switch, valid values: ON, OFF.
     * @param ReadOnlyOperation Cluster read-only switch, valid values: ON, OFF.
     */
    public void setReadOnlyOperation(String ReadOnlyOperation) {
        this.ReadOnlyOperation = ReadOnlyOperation;
    }

    /**
     * Get Valid values: `yes` (modify in maintenance window), `no` (execute now by default). 
     * @return IsInMaintainPeriod Valid values: `yes` (modify in maintenance window), `no` (execute now by default).
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Valid values: `yes` (modify in maintenance window), `no` (execute now by default).
     * @param IsInMaintainPeriod Valid values: `yes` (modify in maintenance window), `no` (execute now by default).
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public ModifyClusterReadOnlyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterReadOnlyRequest(ModifyClusterReadOnlyRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.ReadOnlyOperation != null) {
            this.ReadOnlyOperation = new String(source.ReadOnlyOperation);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "ReadOnlyOperation", this.ReadOnlyOperation);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}


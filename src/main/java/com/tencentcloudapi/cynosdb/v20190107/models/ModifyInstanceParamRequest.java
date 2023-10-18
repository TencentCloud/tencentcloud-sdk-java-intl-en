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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of cluster parameters
    */
    @SerializedName("ClusterParamList")
    @Expose
    private ModifyParamItem [] ClusterParamList;

    /**
    * List of the instance parameters
    */
    @SerializedName("InstanceParamList")
    @Expose
    private ModifyParamItem [] InstanceParamList;

    /**
    * Valid values: `yes` (modify in maintenance window),  `no`  (execute now by default).
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance ID 
     * @return InstanceIds Instance ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID
     * @param InstanceIds Instance ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of cluster parameters 
     * @return ClusterParamList List of cluster parameters
     */
    public ModifyParamItem [] getClusterParamList() {
        return this.ClusterParamList;
    }

    /**
     * Set List of cluster parameters
     * @param ClusterParamList List of cluster parameters
     */
    public void setClusterParamList(ModifyParamItem [] ClusterParamList) {
        this.ClusterParamList = ClusterParamList;
    }

    /**
     * Get List of the instance parameters 
     * @return InstanceParamList List of the instance parameters
     */
    public ModifyParamItem [] getInstanceParamList() {
        return this.InstanceParamList;
    }

    /**
     * Set List of the instance parameters
     * @param InstanceParamList List of the instance parameters
     */
    public void setInstanceParamList(ModifyParamItem [] InstanceParamList) {
        this.InstanceParamList = InstanceParamList;
    }

    /**
     * Get Valid values: `yes` (modify in maintenance window),  `no`  (execute now by default). 
     * @return IsInMaintainPeriod Valid values: `yes` (modify in maintenance window),  `no`  (execute now by default).
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Valid values: `yes` (modify in maintenance window),  `no`  (execute now by default).
     * @param IsInMaintainPeriod Valid values: `yes` (modify in maintenance window),  `no`  (execute now by default).
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public ModifyInstanceParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamRequest(ModifyInstanceParamRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ClusterParamList != null) {
            this.ClusterParamList = new ModifyParamItem[source.ClusterParamList.length];
            for (int i = 0; i < source.ClusterParamList.length; i++) {
                this.ClusterParamList[i] = new ModifyParamItem(source.ClusterParamList[i]);
            }
        }
        if (source.InstanceParamList != null) {
            this.InstanceParamList = new ModifyParamItem[source.InstanceParamList.length];
            for (int i = 0; i < source.InstanceParamList.length; i++) {
                this.InstanceParamList[i] = new ModifyParamItem(source.InstanceParamList[i]);
            }
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ClusterParamList.", this.ClusterParamList);
        this.setParamArrayObj(map, prefix + "InstanceParamList.", this.InstanceParamList);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}


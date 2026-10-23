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

public class ModifyInstanceParamRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Cluster parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"auto_increment_increment"}]
    */
    @SerializedName("ClusterParamList")
    @Expose
    private ModifyParamItem [] ClusterParamList;

    /**
    * Instance parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"innodb_stats_transient_sample_pages"}]
    */
    @SerializedName("InstanceParamList")
    @Expose
    private ModifyParamItem [] InstanceParamList;

    /**
    * yes: modify within the Ops time window. no: immediately execute (default value).
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
     * Get Instance ID. 
     * @return InstanceIds Instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID.
     * @param InstanceIds Instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Cluster parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"auto_increment_increment"}] 
     * @return ClusterParamList Cluster parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"auto_increment_increment"}]
     */
    public ModifyParamItem [] getClusterParamList() {
        return this.ClusterParamList;
    }

    /**
     * Set Cluster parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"auto_increment_increment"}]
     * @param ClusterParamList Cluster parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"auto_increment_increment"}]
     */
    public void setClusterParamList(ModifyParamItem [] ClusterParamList) {
        this.ClusterParamList = ClusterParamList;
    }

    /**
     * Get Instance parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"innodb_stats_transient_sample_pages"}] 
     * @return InstanceParamList Instance parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"innodb_stats_transient_sample_pages"}]
     */
    public ModifyParamItem [] getInstanceParamList() {
        return this.InstanceParamList;
    }

    /**
     * Set Instance parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"innodb_stats_transient_sample_pages"}]
     * @param InstanceParamList Instance parameter list, for example, [{           "CurrentValue":"2",        "ParamName":"innodb_stats_transient_sample_pages"}]
     */
    public void setInstanceParamList(ModifyParamItem [] InstanceParamList) {
        this.InstanceParamList = InstanceParamList;
    }

    /**
     * Get yes: modify within the Ops time window. no: immediately execute (default value). 
     * @return IsInMaintainPeriod yes: modify within the Ops time window. no: immediately execute (default value).
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set yes: modify within the Ops time window. no: immediately execute (default value).
     * @param IsInMaintainPeriod yes: modify within the Ops time window. no: immediately execute (default value).
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


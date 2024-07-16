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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartClusterForNodeRequest extends AbstractModel {

    /**
    * Cluster ID, such as cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configuration file's name
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Each batch of restarts
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * Restart node
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * False means non-rolling restart, and true means rolling restart.
    */
    @SerializedName("RollingRestart")
    @Expose
    private Boolean RollingRestart;

    /**
     * Get Cluster ID, such as cdwch-xxxx 
     * @return InstanceId Cluster ID, such as cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID, such as cdwch-xxxx
     * @param InstanceId Cluster ID, such as cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Configuration file's name 
     * @return ConfigName Configuration file's name
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration file's name
     * @param ConfigName Configuration file's name
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Each batch of restarts 
     * @return BatchSize Each batch of restarts
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set Each batch of restarts
     * @param BatchSize Each batch of restarts
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get Restart node 
     * @return NodeList Restart node
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set Restart node
     * @param NodeList Restart node
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get False means non-rolling restart, and true means rolling restart. 
     * @return RollingRestart False means non-rolling restart, and true means rolling restart.
     */
    public Boolean getRollingRestart() {
        return this.RollingRestart;
    }

    /**
     * Set False means non-rolling restart, and true means rolling restart.
     * @param RollingRestart False means non-rolling restart, and true means rolling restart.
     */
    public void setRollingRestart(Boolean RollingRestart) {
        this.RollingRestart = RollingRestart;
    }

    public RestartClusterForNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartClusterForNodeRequest(RestartClusterForNodeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.RollingRestart != null) {
            this.RollingRestart = new Boolean(source.RollingRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "RollingRestart", this.RollingRestart);

    }
}


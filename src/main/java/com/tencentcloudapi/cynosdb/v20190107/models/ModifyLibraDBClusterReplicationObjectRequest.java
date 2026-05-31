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

public class ModifyLibraDBClusterReplicationObjectRequest extends AbstractModel {

    /**
    * Analysis Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Read-only analysis engine instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Map mode
    */
    @SerializedName("ForceDefaultMapRule")
    @Expose
    private String ForceDefaultMapRule;

    /**
    * sync object
    */
    @SerializedName("Objects")
    @Expose
    private ReplicationObject [] Objects;

    /**
    * Automated mapping rule
    */
    @SerializedName("AutoMapRules")
    @Expose
    private AutoMapRule [] AutoMapRules;

    /**
    * Whether to refresh existing mapping relationships according to the latest mapping rule
    */
    @SerializedName("RefreshMapping")
    @Expose
    private Boolean RefreshMapping;

    /**
     * Get Analysis Cluster ID 
     * @return ClusterId Analysis Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Analysis Cluster ID
     * @param ClusterId Analysis Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Read-only analysis engine instance ID 
     * @return InstanceId Read-only analysis engine instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Read-only analysis engine instance ID
     * @param InstanceId Read-only analysis engine instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Map mode 
     * @return ForceDefaultMapRule Map mode
     */
    public String getForceDefaultMapRule() {
        return this.ForceDefaultMapRule;
    }

    /**
     * Set Map mode
     * @param ForceDefaultMapRule Map mode
     */
    public void setForceDefaultMapRule(String ForceDefaultMapRule) {
        this.ForceDefaultMapRule = ForceDefaultMapRule;
    }

    /**
     * Get sync object 
     * @return Objects sync object
     */
    public ReplicationObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set sync object
     * @param Objects sync object
     */
    public void setObjects(ReplicationObject [] Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Automated mapping rule 
     * @return AutoMapRules Automated mapping rule
     */
    public AutoMapRule [] getAutoMapRules() {
        return this.AutoMapRules;
    }

    /**
     * Set Automated mapping rule
     * @param AutoMapRules Automated mapping rule
     */
    public void setAutoMapRules(AutoMapRule [] AutoMapRules) {
        this.AutoMapRules = AutoMapRules;
    }

    /**
     * Get Whether to refresh existing mapping relationships according to the latest mapping rule 
     * @return RefreshMapping Whether to refresh existing mapping relationships according to the latest mapping rule
     */
    public Boolean getRefreshMapping() {
        return this.RefreshMapping;
    }

    /**
     * Set Whether to refresh existing mapping relationships according to the latest mapping rule
     * @param RefreshMapping Whether to refresh existing mapping relationships according to the latest mapping rule
     */
    public void setRefreshMapping(Boolean RefreshMapping) {
        this.RefreshMapping = RefreshMapping;
    }

    public ModifyLibraDBClusterReplicationObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterReplicationObjectRequest(ModifyLibraDBClusterReplicationObjectRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForceDefaultMapRule != null) {
            this.ForceDefaultMapRule = new String(source.ForceDefaultMapRule);
        }
        if (source.Objects != null) {
            this.Objects = new ReplicationObject[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new ReplicationObject(source.Objects[i]);
            }
        }
        if (source.AutoMapRules != null) {
            this.AutoMapRules = new AutoMapRule[source.AutoMapRules.length];
            for (int i = 0; i < source.AutoMapRules.length; i++) {
                this.AutoMapRules[i] = new AutoMapRule(source.AutoMapRules[i]);
            }
        }
        if (source.RefreshMapping != null) {
            this.RefreshMapping = new Boolean(source.RefreshMapping);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceDefaultMapRule", this.ForceDefaultMapRule);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);
        this.setParamArrayObj(map, prefix + "AutoMapRules.", this.AutoMapRules);
        this.setParamSimple(map, prefix + "RefreshMapping", this.RefreshMapping);

    }
}


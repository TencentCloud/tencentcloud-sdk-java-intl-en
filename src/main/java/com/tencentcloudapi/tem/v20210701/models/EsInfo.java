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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsInfo extends AbstractModel{

    /**
    * Minimum number of instances
    */
    @SerializedName("MinAliveInstances")
    @Expose
    private Long MinAliveInstances;

    /**
    * Maximum number of instances
    */
    @SerializedName("MaxAliveInstances")
    @Expose
    private Long MaxAliveInstances;

    /**
    * Auto scaling policy. 1: CPU; 2: memory
    */
    @SerializedName("EsStrategy")
    @Expose
    private Long EsStrategy;

    /**
    * Auto scaling condition value
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Version ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get Minimum number of instances 
     * @return MinAliveInstances Minimum number of instances
     */
    public Long getMinAliveInstances() {
        return this.MinAliveInstances;
    }

    /**
     * Set Minimum number of instances
     * @param MinAliveInstances Minimum number of instances
     */
    public void setMinAliveInstances(Long MinAliveInstances) {
        this.MinAliveInstances = MinAliveInstances;
    }

    /**
     * Get Maximum number of instances 
     * @return MaxAliveInstances Maximum number of instances
     */
    public Long getMaxAliveInstances() {
        return this.MaxAliveInstances;
    }

    /**
     * Set Maximum number of instances
     * @param MaxAliveInstances Maximum number of instances
     */
    public void setMaxAliveInstances(Long MaxAliveInstances) {
        this.MaxAliveInstances = MaxAliveInstances;
    }

    /**
     * Get Auto scaling policy. 1: CPU; 2: memory 
     * @return EsStrategy Auto scaling policy. 1: CPU; 2: memory
     */
    public Long getEsStrategy() {
        return this.EsStrategy;
    }

    /**
     * Set Auto scaling policy. 1: CPU; 2: memory
     * @param EsStrategy Auto scaling policy. 1: CPU; 2: memory
     */
    public void setEsStrategy(Long EsStrategy) {
        this.EsStrategy = EsStrategy;
    }

    /**
     * Get Auto scaling condition value 
     * @return Threshold Auto scaling condition value
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Auto scaling condition value
     * @param Threshold Auto scaling condition value
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Version ID 
     * @return VersionId Version ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Version ID
     * @param VersionId Version ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public EsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsInfo(EsInfo source) {
        if (source.MinAliveInstances != null) {
            this.MinAliveInstances = new Long(source.MinAliveInstances);
        }
        if (source.MaxAliveInstances != null) {
            this.MaxAliveInstances = new Long(source.MaxAliveInstances);
        }
        if (source.EsStrategy != null) {
            this.EsStrategy = new Long(source.EsStrategy);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinAliveInstances", this.MinAliveInstances);
        this.setParamSimple(map, prefix + "MaxAliveInstances", this.MaxAliveInstances);
        this.setParamSimple(map, prefix + "EsStrategy", this.EsStrategy);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}


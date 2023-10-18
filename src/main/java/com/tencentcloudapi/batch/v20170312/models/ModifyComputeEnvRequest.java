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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyComputeEnvRequest extends AbstractModel {

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Number of desired compute nodes
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * Compute environment name
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * Compute environment description
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * Compute environment attributes
    */
    @SerializedName("EnvData")
    @Expose
    private ComputeEnvData EnvData;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Number of desired compute nodes 
     * @return DesiredComputeNodeCount Number of desired compute nodes
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set Number of desired compute nodes
     * @param DesiredComputeNodeCount Number of desired compute nodes
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get Compute environment name 
     * @return EnvName Compute environment name
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set Compute environment name
     * @param EnvName Compute environment name
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get Compute environment description 
     * @return EnvDescription Compute environment description
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * Set Compute environment description
     * @param EnvDescription Compute environment description
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * Get Compute environment attributes 
     * @return EnvData Compute environment attributes
     */
    public ComputeEnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set Compute environment attributes
     * @param EnvData Compute environment attributes
     */
    public void setEnvData(ComputeEnvData EnvData) {
        this.EnvData = EnvData;
    }

    public ModifyComputeEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyComputeEnvRequest(ModifyComputeEnvRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DesiredComputeNodeCount != null) {
            this.DesiredComputeNodeCount = new Long(source.DesiredComputeNodeCount);
        }
        if (source.EnvName != null) {
            this.EnvName = new String(source.EnvName);
        }
        if (source.EnvDescription != null) {
            this.EnvDescription = new String(source.EnvDescription);
        }
        if (source.EnvData != null) {
            this.EnvData = new ComputeEnvData(source.EnvData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);

    }
}


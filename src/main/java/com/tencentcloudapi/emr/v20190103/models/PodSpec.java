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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSpec extends AbstractModel{

    /**
    * 
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * 
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * 
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 
    */
    @SerializedName("DataVolumes")
    @Expose
    private String [] DataVolumes;

    /**
     * Get  
     * @return ResourceProviderIdentifier 
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set 
     * @param ResourceProviderIdentifier 
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get  
     * @return ResourceProviderType 
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set 
     * @param ResourceProviderType 
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get  
     * @return NodeType 
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 
     * @param NodeType 
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get  
     * @return Cpu 
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 
     * @param Cpu 
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get  
     * @return Memory 
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 
     * @param Memory 
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  
     * @return DataVolumes 
     */
    public String [] getDataVolumes() {
        return this.DataVolumes;
    }

    /**
     * Set 
     * @param DataVolumes 
     */
    public void setDataVolumes(String [] DataVolumes) {
        this.DataVolumes = DataVolumes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceProviderIdentifier", this.ResourceProviderIdentifier);
        this.setParamSimple(map, prefix + "ResourceProviderType", this.ResourceProviderType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "DataVolumes.", this.DataVolumes);

    }
}


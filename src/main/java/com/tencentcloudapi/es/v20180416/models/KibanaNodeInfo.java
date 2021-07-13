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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KibanaNodeInfo extends AbstractModel{

    /**
    * Kibana node specification
    */
    @SerializedName("KibanaNodeType")
    @Expose
    private String KibanaNodeType;

    /**
    * Number of Kibana nodes
    */
    @SerializedName("KibanaNodeNum")
    @Expose
    private Long KibanaNodeNum;

    /**
    * Number of Kibana node's CPUs
    */
    @SerializedName("KibanaNodeCpuNum")
    @Expose
    private Long KibanaNodeCpuNum;

    /**
    * Kibana node's memory in GB
    */
    @SerializedName("KibanaNodeMemSize")
    @Expose
    private Long KibanaNodeMemSize;

    /**
    * Kibana node's disk type
    */
    @SerializedName("KibanaNodeDiskType")
    @Expose
    private String KibanaNodeDiskType;

    /**
    * Kibana node's disk size
    */
    @SerializedName("KibanaNodeDiskSize")
    @Expose
    private Long KibanaNodeDiskSize;

    /**
     * Get Kibana node specification 
     * @return KibanaNodeType Kibana node specification
     */
    public String getKibanaNodeType() {
        return this.KibanaNodeType;
    }

    /**
     * Set Kibana node specification
     * @param KibanaNodeType Kibana node specification
     */
    public void setKibanaNodeType(String KibanaNodeType) {
        this.KibanaNodeType = KibanaNodeType;
    }

    /**
     * Get Number of Kibana nodes 
     * @return KibanaNodeNum Number of Kibana nodes
     */
    public Long getKibanaNodeNum() {
        return this.KibanaNodeNum;
    }

    /**
     * Set Number of Kibana nodes
     * @param KibanaNodeNum Number of Kibana nodes
     */
    public void setKibanaNodeNum(Long KibanaNodeNum) {
        this.KibanaNodeNum = KibanaNodeNum;
    }

    /**
     * Get Number of Kibana node's CPUs 
     * @return KibanaNodeCpuNum Number of Kibana node's CPUs
     */
    public Long getKibanaNodeCpuNum() {
        return this.KibanaNodeCpuNum;
    }

    /**
     * Set Number of Kibana node's CPUs
     * @param KibanaNodeCpuNum Number of Kibana node's CPUs
     */
    public void setKibanaNodeCpuNum(Long KibanaNodeCpuNum) {
        this.KibanaNodeCpuNum = KibanaNodeCpuNum;
    }

    /**
     * Get Kibana node's memory in GB 
     * @return KibanaNodeMemSize Kibana node's memory in GB
     */
    public Long getKibanaNodeMemSize() {
        return this.KibanaNodeMemSize;
    }

    /**
     * Set Kibana node's memory in GB
     * @param KibanaNodeMemSize Kibana node's memory in GB
     */
    public void setKibanaNodeMemSize(Long KibanaNodeMemSize) {
        this.KibanaNodeMemSize = KibanaNodeMemSize;
    }

    /**
     * Get Kibana node's disk type 
     * @return KibanaNodeDiskType Kibana node's disk type
     */
    public String getKibanaNodeDiskType() {
        return this.KibanaNodeDiskType;
    }

    /**
     * Set Kibana node's disk type
     * @param KibanaNodeDiskType Kibana node's disk type
     */
    public void setKibanaNodeDiskType(String KibanaNodeDiskType) {
        this.KibanaNodeDiskType = KibanaNodeDiskType;
    }

    /**
     * Get Kibana node's disk size 
     * @return KibanaNodeDiskSize Kibana node's disk size
     */
    public Long getKibanaNodeDiskSize() {
        return this.KibanaNodeDiskSize;
    }

    /**
     * Set Kibana node's disk size
     * @param KibanaNodeDiskSize Kibana node's disk size
     */
    public void setKibanaNodeDiskSize(Long KibanaNodeDiskSize) {
        this.KibanaNodeDiskSize = KibanaNodeDiskSize;
    }

    public KibanaNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KibanaNodeInfo(KibanaNodeInfo source) {
        if (source.KibanaNodeType != null) {
            this.KibanaNodeType = new String(source.KibanaNodeType);
        }
        if (source.KibanaNodeNum != null) {
            this.KibanaNodeNum = new Long(source.KibanaNodeNum);
        }
        if (source.KibanaNodeCpuNum != null) {
            this.KibanaNodeCpuNum = new Long(source.KibanaNodeCpuNum);
        }
        if (source.KibanaNodeMemSize != null) {
            this.KibanaNodeMemSize = new Long(source.KibanaNodeMemSize);
        }
        if (source.KibanaNodeDiskType != null) {
            this.KibanaNodeDiskType = new String(source.KibanaNodeDiskType);
        }
        if (source.KibanaNodeDiskSize != null) {
            this.KibanaNodeDiskSize = new Long(source.KibanaNodeDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KibanaNodeType", this.KibanaNodeType);
        this.setParamSimple(map, prefix + "KibanaNodeNum", this.KibanaNodeNum);
        this.setParamSimple(map, prefix + "KibanaNodeCpuNum", this.KibanaNodeCpuNum);
        this.setParamSimple(map, prefix + "KibanaNodeMemSize", this.KibanaNodeMemSize);
        this.setParamSimple(map, prefix + "KibanaNodeDiskType", this.KibanaNodeDiskType);
        this.setParamSimple(map, prefix + "KibanaNodeDiskSize", this.KibanaNodeDiskSize);

    }
}


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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllNodeResourceSpec extends AbstractModel {

    /**
    * Description of Master node resources.
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private NodeResourceSpec MasterResourceSpec;

    /**
    * Description of Core node resources.
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private NodeResourceSpec CoreResourceSpec;

    /**
    * Description of Task node resources.
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private NodeResourceSpec TaskResourceSpec;

    /**
    * Description of Common node resources.
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private NodeResourceSpec CommonResourceSpec;

    /**
    * Number of Master nodes.
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * Number of Core nodes.
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Number of Task nodes.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Number of Common nodes.
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
     * Get Description of Master node resources. 
     * @return MasterResourceSpec Description of Master node resources.
     */
    public NodeResourceSpec getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set Description of Master node resources.
     * @param MasterResourceSpec Description of Master node resources.
     */
    public void setMasterResourceSpec(NodeResourceSpec MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get Description of Core node resources. 
     * @return CoreResourceSpec Description of Core node resources.
     */
    public NodeResourceSpec getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set Description of Core node resources.
     * @param CoreResourceSpec Description of Core node resources.
     */
    public void setCoreResourceSpec(NodeResourceSpec CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get Description of Task node resources. 
     * @return TaskResourceSpec Description of Task node resources.
     */
    public NodeResourceSpec getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set Description of Task node resources.
     * @param TaskResourceSpec Description of Task node resources.
     */
    public void setTaskResourceSpec(NodeResourceSpec TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get Description of Common node resources. 
     * @return CommonResourceSpec Description of Common node resources.
     */
    public NodeResourceSpec getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set Description of Common node resources.
     * @param CommonResourceSpec Description of Common node resources.
     */
    public void setCommonResourceSpec(NodeResourceSpec CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * Get Number of Master nodes. 
     * @return MasterCount Number of Master nodes.
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Number of Master nodes.
     * @param MasterCount Number of Master nodes.
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get Number of Core nodes. 
     * @return CoreCount Number of Core nodes.
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Number of Core nodes.
     * @param CoreCount Number of Core nodes.
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Number of Task nodes. 
     * @return TaskCount Number of Task nodes.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of Task nodes.
     * @param TaskCount Number of Task nodes.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Number of Common nodes. 
     * @return CommonCount Number of Common nodes.
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set Number of Common nodes.
     * @param CommonCount Number of Common nodes.
     */
    public void setCommonCount(Long CommonCount) {
        this.CommonCount = CommonCount;
    }

    public AllNodeResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllNodeResourceSpec(AllNodeResourceSpec source) {
        if (source.MasterResourceSpec != null) {
            this.MasterResourceSpec = new NodeResourceSpec(source.MasterResourceSpec);
        }
        if (source.CoreResourceSpec != null) {
            this.CoreResourceSpec = new NodeResourceSpec(source.CoreResourceSpec);
        }
        if (source.TaskResourceSpec != null) {
            this.TaskResourceSpec = new NodeResourceSpec(source.TaskResourceSpec);
        }
        if (source.CommonResourceSpec != null) {
            this.CommonResourceSpec = new NodeResourceSpec(source.CommonResourceSpec);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CommonCount != null) {
            this.CommonCount = new Long(source.CommonCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MasterResourceSpec.", this.MasterResourceSpec);
        this.setParamObj(map, prefix + "CoreResourceSpec.", this.CoreResourceSpec);
        this.setParamObj(map, prefix + "TaskResourceSpec.", this.TaskResourceSpec);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CommonCount", this.CommonCount);

    }
}


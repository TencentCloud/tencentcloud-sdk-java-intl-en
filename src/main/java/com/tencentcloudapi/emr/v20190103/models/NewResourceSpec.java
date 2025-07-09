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

public class NewResourceSpec extends AbstractModel {

    /**
    * Describes master node resource
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private Resource MasterResourceSpec;

    /**
    * Describes core node resource
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private Resource CoreResourceSpec;

    /**
    * Describes task node resource
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private Resource TaskResourceSpec;

    /**
    * Number of master nodes
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * Number of core nodes
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Number of task nodes
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Describes common node resource
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private Resource CommonResourceSpec;

    /**
    * Number of common nodes
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
     * Get Describes master node resource 
     * @return MasterResourceSpec Describes master node resource
     */
    public Resource getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set Describes master node resource
     * @param MasterResourceSpec Describes master node resource
     */
    public void setMasterResourceSpec(Resource MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get Describes core node resource 
     * @return CoreResourceSpec Describes core node resource
     */
    public Resource getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set Describes core node resource
     * @param CoreResourceSpec Describes core node resource
     */
    public void setCoreResourceSpec(Resource CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get Describes task node resource 
     * @return TaskResourceSpec Describes task node resource
     */
    public Resource getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set Describes task node resource
     * @param TaskResourceSpec Describes task node resource
     */
    public void setTaskResourceSpec(Resource TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get Number of master nodes 
     * @return MasterCount Number of master nodes
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Number of master nodes
     * @param MasterCount Number of master nodes
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get Number of core nodes 
     * @return CoreCount Number of core nodes
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Number of core nodes
     * @param CoreCount Number of core nodes
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Number of task nodes 
     * @return TaskCount Number of task nodes
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of task nodes
     * @param TaskCount Number of task nodes
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Describes common node resource 
     * @return CommonResourceSpec Describes common node resource
     */
    public Resource getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set Describes common node resource
     * @param CommonResourceSpec Describes common node resource
     */
    public void setCommonResourceSpec(Resource CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * Get Number of common nodes 
     * @return CommonCount Number of common nodes
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set Number of common nodes
     * @param CommonCount Number of common nodes
     */
    public void setCommonCount(Long CommonCount) {
        this.CommonCount = CommonCount;
    }

    public NewResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewResourceSpec(NewResourceSpec source) {
        if (source.MasterResourceSpec != null) {
            this.MasterResourceSpec = new Resource(source.MasterResourceSpec);
        }
        if (source.CoreResourceSpec != null) {
            this.CoreResourceSpec = new Resource(source.CoreResourceSpec);
        }
        if (source.TaskResourceSpec != null) {
            this.TaskResourceSpec = new Resource(source.TaskResourceSpec);
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
        if (source.CommonResourceSpec != null) {
            this.CommonResourceSpec = new Resource(source.CommonResourceSpec);
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
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);
        this.setParamSimple(map, prefix + "CommonCount", this.CommonCount);

    }
}


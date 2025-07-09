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
    * The description of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private NodeResourceSpec MasterResourceSpec;

    /**
    * The description of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private NodeResourceSpec CoreResourceSpec;

    /**
    * The description of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private NodeResourceSpec TaskResourceSpec;

    /**
    * The description of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private NodeResourceSpec CommonResourceSpec;

    /**
    * The number of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * The number of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * The number of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * The number of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
     * Get The description of master nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterResourceSpec The description of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeResourceSpec getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set The description of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterResourceSpec The description of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterResourceSpec(NodeResourceSpec MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get The description of core nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoreResourceSpec The description of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeResourceSpec getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set The description of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoreResourceSpec The description of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreResourceSpec(NodeResourceSpec CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get The description of task nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskResourceSpec The description of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeResourceSpec getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set The description of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskResourceSpec The description of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskResourceSpec(NodeResourceSpec TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get The description of common nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommonResourceSpec The description of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeResourceSpec getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set The description of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommonResourceSpec The description of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommonResourceSpec(NodeResourceSpec CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * Get The number of master nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterCount The number of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set The number of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterCount The number of master nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get The number of core nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoreCount The number of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set The number of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoreCount The number of core nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get The number of task nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskCount The number of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set The number of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskCount The number of task nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get The number of common nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommonCount The number of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set The number of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommonCount The number of common nodes.
Note: This field may return null, indicating that no valid values can be obtained.
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


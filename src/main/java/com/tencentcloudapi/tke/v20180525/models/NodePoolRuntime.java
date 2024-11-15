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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePoolRuntime extends AbstractModel {

    /**
    * Node pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeType")
    @Expose
    private String RuntimeType;

    /**
    * Runtime version

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * Node pool name

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodePoolName")
    @Expose
    private String NodePoolName;

    /**
     * Get Node pool ID

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodePoolId Node pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Node pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodePoolId Node pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Runtime type
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeType Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeType Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeType(String RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get Runtime version

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeVersion Runtime version

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set Runtime version

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeVersion Runtime version

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get Node pool name

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodePoolName Node pool name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodePoolName() {
        return this.NodePoolName;
    }

    /**
     * Set Node pool name

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodePoolName Node pool name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodePoolName(String NodePoolName) {
        this.NodePoolName = NodePoolName;
    }

    public NodePoolRuntime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePoolRuntime(NodePoolRuntime source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.RuntimeType != null) {
            this.RuntimeType = new String(source.RuntimeType);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.NodePoolName != null) {
            this.NodePoolName = new String(source.NodePoolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "NodePoolName", this.NodePoolName);

    }
}


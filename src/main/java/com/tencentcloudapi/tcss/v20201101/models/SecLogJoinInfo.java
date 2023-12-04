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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogJoinInfo extends AbstractModel {

    /**
    * Number of connected general nodes
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Number of connected super nodes
    */
    @SerializedName("SuperNodeCount")
    @Expose
    private Long SuperNodeCount;

    /**
    * Whether it is accessed. Valid values: `true` (accessed); `false` (not accessed).
    */
    @SerializedName("IsJoined")
    @Expose
    private Boolean IsJoined;

    /**
    * Log type (
Container bash: "container_bash"
Container startup: "container_launch"
K8s API: "k8s_api"
)
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get Number of connected general nodes 
     * @return Count Number of connected general nodes
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of connected general nodes
     * @param Count Number of connected general nodes
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Number of connected super nodes 
     * @return SuperNodeCount Number of connected super nodes
     */
    public Long getSuperNodeCount() {
        return this.SuperNodeCount;
    }

    /**
     * Set Number of connected super nodes
     * @param SuperNodeCount Number of connected super nodes
     */
    public void setSuperNodeCount(Long SuperNodeCount) {
        this.SuperNodeCount = SuperNodeCount;
    }

    /**
     * Get Whether it is accessed. Valid values: `true` (accessed); `false` (not accessed). 
     * @return IsJoined Whether it is accessed. Valid values: `true` (accessed); `false` (not accessed).
     */
    public Boolean getIsJoined() {
        return this.IsJoined;
    }

    /**
     * Set Whether it is accessed. Valid values: `true` (accessed); `false` (not accessed).
     * @param IsJoined Whether it is accessed. Valid values: `true` (accessed); `false` (not accessed).
     */
    public void setIsJoined(Boolean IsJoined) {
        this.IsJoined = IsJoined;
    }

    /**
     * Get Log type (
Container bash: "container_bash"
Container startup: "container_launch"
K8s API: "k8s_api"
) 
     * @return LogType Log type (
Container bash: "container_bash"
Container startup: "container_launch"
K8s API: "k8s_api"
)
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type (
Container bash: "container_bash"
Container startup: "container_launch"
K8s API: "k8s_api"
)
     * @param LogType Log type (
Container bash: "container_bash"
Container startup: "container_launch"
K8s API: "k8s_api"
)
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public SecLogJoinInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogJoinInfo(SecLogJoinInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SuperNodeCount != null) {
            this.SuperNodeCount = new Long(source.SuperNodeCount);
        }
        if (source.IsJoined != null) {
            this.IsJoined = new Boolean(source.IsJoined);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "SuperNodeCount", this.SuperNodeCount);
        this.setParamSimple(map, prefix + "IsJoined", this.IsJoined);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}


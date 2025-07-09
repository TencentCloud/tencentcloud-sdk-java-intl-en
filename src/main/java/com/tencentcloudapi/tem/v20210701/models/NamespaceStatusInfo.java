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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceStatusInfo extends AbstractModel {

    /**
    * ID of the environment
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment name
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * TCB envId | EKS clusterId
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Environment status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Whether the environment is being started. `null` is returned if it’s not being started.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentStartingStatus")
    @Expose
    private TemEnvironmentStartingStatus EnvironmentStartingStatus;

    /**
    * Whether the environment is being stopped. `null` is returned if it’s not being stopped.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentStoppingStatus")
    @Expose
    private TemEnvironmentStoppingStatus EnvironmentStoppingStatus;

    /**
     * Get ID of the environment 
     * @return EnvironmentId ID of the environment
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set ID of the environment
     * @param EnvironmentId ID of the environment
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Environment name 
     * @return EnvironmentName Environment name
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
     * @param EnvironmentName Environment name
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get TCB envId | EKS clusterId 
     * @return ClusterId TCB envId | EKS clusterId
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TCB envId | EKS clusterId
     * @param ClusterId TCB envId | EKS clusterId
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Environment status 
     * @return ClusterStatus Environment status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Environment status
     * @param ClusterStatus Environment status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Whether the environment is being started. `null` is returned if it’s not being started.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentStartingStatus Whether the environment is being started. `null` is returned if it’s not being started.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TemEnvironmentStartingStatus getEnvironmentStartingStatus() {
        return this.EnvironmentStartingStatus;
    }

    /**
     * Set Whether the environment is being started. `null` is returned if it’s not being started.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentStartingStatus Whether the environment is being started. `null` is returned if it’s not being started.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentStartingStatus(TemEnvironmentStartingStatus EnvironmentStartingStatus) {
        this.EnvironmentStartingStatus = EnvironmentStartingStatus;
    }

    /**
     * Get Whether the environment is being stopped. `null` is returned if it’s not being stopped.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentStoppingStatus Whether the environment is being stopped. `null` is returned if it’s not being stopped.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TemEnvironmentStoppingStatus getEnvironmentStoppingStatus() {
        return this.EnvironmentStoppingStatus;
    }

    /**
     * Set Whether the environment is being stopped. `null` is returned if it’s not being stopped.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentStoppingStatus Whether the environment is being stopped. `null` is returned if it’s not being stopped.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentStoppingStatus(TemEnvironmentStoppingStatus EnvironmentStoppingStatus) {
        this.EnvironmentStoppingStatus = EnvironmentStoppingStatus;
    }

    public NamespaceStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceStatusInfo(NamespaceStatusInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.EnvironmentStartingStatus != null) {
            this.EnvironmentStartingStatus = new TemEnvironmentStartingStatus(source.EnvironmentStartingStatus);
        }
        if (source.EnvironmentStoppingStatus != null) {
            this.EnvironmentStoppingStatus = new TemEnvironmentStoppingStatus(source.EnvironmentStoppingStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamObj(map, prefix + "EnvironmentStartingStatus.", this.EnvironmentStartingStatus);
        this.setParamObj(map, prefix + "EnvironmentStoppingStatus.", this.EnvironmentStoppingStatus);

    }
}


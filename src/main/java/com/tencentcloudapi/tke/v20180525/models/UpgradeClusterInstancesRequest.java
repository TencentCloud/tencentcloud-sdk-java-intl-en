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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeClusterInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * create: starting an upgrade task
pause: pausing the task
resume: continuing the task
abort: stopping the task
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Upgrade type. It’s only required when `Operation` is set as `create`.
reset: the reinstallation and upgrade of major version
hot: the hot upgrade of minor version
major: in-place upgrade of major version
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * List of nodes that need to upgrade
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * This parameter is used when the node joins the cluster again. Refer to the API of creating one or more cluster nodes.
    */
    @SerializedName("ResetParam")
    @Expose
    private UpgradeNodeResetParam ResetParam;

    /**
    * Whether to skip the pre-upgrade check of the node
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
    * The maximum tolerable proportion of unavailable pods
    */
    @SerializedName("MaxNotReadyPercent")
    @Expose
    private Float MaxNotReadyPercent;

    /**
    * Whether to upgrade node runtime. Values: `true`, `false` (default).
    */
    @SerializedName("UpgradeRunTime")
    @Expose
    private Boolean UpgradeRunTime;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get create: starting an upgrade task
pause: pausing the task
resume: continuing the task
abort: stopping the task 
     * @return Operation create: starting an upgrade task
pause: pausing the task
resume: continuing the task
abort: stopping the task
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set create: starting an upgrade task
pause: pausing the task
resume: continuing the task
abort: stopping the task
     * @param Operation create: starting an upgrade task
pause: pausing the task
resume: continuing the task
abort: stopping the task
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Upgrade type. It’s only required when `Operation` is set as `create`.
reset: the reinstallation and upgrade of major version
hot: the hot upgrade of minor version
major: in-place upgrade of major version 
     * @return UpgradeType Upgrade type. It’s only required when `Operation` is set as `create`.
reset: the reinstallation and upgrade of major version
hot: the hot upgrade of minor version
major: in-place upgrade of major version
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade type. It’s only required when `Operation` is set as `create`.
reset: the reinstallation and upgrade of major version
hot: the hot upgrade of minor version
major: in-place upgrade of major version
     * @param UpgradeType Upgrade type. It’s only required when `Operation` is set as `create`.
reset: the reinstallation and upgrade of major version
hot: the hot upgrade of minor version
major: in-place upgrade of major version
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get List of nodes that need to upgrade 
     * @return InstanceIds List of nodes that need to upgrade
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of nodes that need to upgrade
     * @param InstanceIds List of nodes that need to upgrade
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get This parameter is used when the node joins the cluster again. Refer to the API of creating one or more cluster nodes. 
     * @return ResetParam This parameter is used when the node joins the cluster again. Refer to the API of creating one or more cluster nodes.
     */
    public UpgradeNodeResetParam getResetParam() {
        return this.ResetParam;
    }

    /**
     * Set This parameter is used when the node joins the cluster again. Refer to the API of creating one or more cluster nodes.
     * @param ResetParam This parameter is used when the node joins the cluster again. Refer to the API of creating one or more cluster nodes.
     */
    public void setResetParam(UpgradeNodeResetParam ResetParam) {
        this.ResetParam = ResetParam;
    }

    /**
     * Get Whether to skip the pre-upgrade check of the node 
     * @return SkipPreCheck Whether to skip the pre-upgrade check of the node
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set Whether to skip the pre-upgrade check of the node
     * @param SkipPreCheck Whether to skip the pre-upgrade check of the node
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    /**
     * Get The maximum tolerable proportion of unavailable pods 
     * @return MaxNotReadyPercent The maximum tolerable proportion of unavailable pods
     */
    public Float getMaxNotReadyPercent() {
        return this.MaxNotReadyPercent;
    }

    /**
     * Set The maximum tolerable proportion of unavailable pods
     * @param MaxNotReadyPercent The maximum tolerable proportion of unavailable pods
     */
    public void setMaxNotReadyPercent(Float MaxNotReadyPercent) {
        this.MaxNotReadyPercent = MaxNotReadyPercent;
    }

    /**
     * Get Whether to upgrade node runtime. Values: `true`, `false` (default). 
     * @return UpgradeRunTime Whether to upgrade node runtime. Values: `true`, `false` (default).
     */
    public Boolean getUpgradeRunTime() {
        return this.UpgradeRunTime;
    }

    /**
     * Set Whether to upgrade node runtime. Values: `true`, `false` (default).
     * @param UpgradeRunTime Whether to upgrade node runtime. Values: `true`, `false` (default).
     */
    public void setUpgradeRunTime(Boolean UpgradeRunTime) {
        this.UpgradeRunTime = UpgradeRunTime;
    }

    public UpgradeClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeClusterInstancesRequest(UpgradeClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ResetParam != null) {
            this.ResetParam = new UpgradeNodeResetParam(source.ResetParam);
        }
        if (source.SkipPreCheck != null) {
            this.SkipPreCheck = new Boolean(source.SkipPreCheck);
        }
        if (source.MaxNotReadyPercent != null) {
            this.MaxNotReadyPercent = new Float(source.MaxNotReadyPercent);
        }
        if (source.UpgradeRunTime != null) {
            this.UpgradeRunTime = new Boolean(source.UpgradeRunTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "ResetParam.", this.ResetParam);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);
        this.setParamSimple(map, prefix + "MaxNotReadyPercent", this.MaxNotReadyPercent);
        this.setParamSimple(map, prefix + "UpgradeRunTime", this.UpgradeRunTime);

    }
}


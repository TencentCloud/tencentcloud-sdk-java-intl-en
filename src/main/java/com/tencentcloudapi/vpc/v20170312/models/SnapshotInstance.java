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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInstance extends AbstractModel {

    /**
    * ID of the instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Type of associated resource. Values: `securitygroup`
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance region
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * Snapshot policy IDs
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * The instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get ID of the instance. 
     * @return InstanceId ID of the instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance.
     * @param InstanceId ID of the instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Type of associated resource. Values: `securitygroup` 
     * @return InstanceType Type of associated resource. Values: `securitygroup`
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Type of associated resource. Values: `securitygroup`
     * @param InstanceType Type of associated resource. Values: `securitygroup`
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance region 
     * @return InstanceRegion Instance region
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set Instance region
     * @param InstanceRegion Instance region
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get Snapshot policy IDs 
     * @return SnapshotPolicyId Snapshot policy IDs
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set Snapshot policy IDs
     * @param SnapshotPolicyId Snapshot policy IDs
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get The instance name. 
     * @return InstanceName The instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set The instance name.
     * @param InstanceName The instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public SnapshotInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInstance(SnapshotInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}


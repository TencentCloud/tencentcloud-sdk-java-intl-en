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

public class ModifyAutoRenewFlagRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance ID.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * NOTIFY_AND_MANUAL_RENEW: Notification of impending expiration, without auto-renewal. NOTIFY_AND_AUTO_RENEW: Notification of impending expiration, with auto-renewal. DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification of impending expiration, without auto-renewal.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Computing resource ID.
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance ID. 
     * @return ResourceIds Instance ID.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Instance ID.
     * @param ResourceIds Instance ID.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get NOTIFY_AND_MANUAL_RENEW: Notification of impending expiration, without auto-renewal. NOTIFY_AND_AUTO_RENEW: Notification of impending expiration, with auto-renewal. DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification of impending expiration, without auto-renewal. 
     * @return RenewFlag NOTIFY_AND_MANUAL_RENEW: Notification of impending expiration, without auto-renewal. NOTIFY_AND_AUTO_RENEW: Notification of impending expiration, with auto-renewal. DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification of impending expiration, without auto-renewal.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set NOTIFY_AND_MANUAL_RENEW: Notification of impending expiration, without auto-renewal. NOTIFY_AND_AUTO_RENEW: Notification of impending expiration, with auto-renewal. DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification of impending expiration, without auto-renewal.
     * @param RenewFlag NOTIFY_AND_MANUAL_RENEW: Notification of impending expiration, without auto-renewal. NOTIFY_AND_AUTO_RENEW: Notification of impending expiration, with auto-renewal. DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification of impending expiration, without auto-renewal.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Computing resource ID. 
     * @return ComputeResourceId Computing resource ID.
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set Computing resource ID.
     * @param ComputeResourceId Computing resource ID.
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    public ModifyAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoRenewFlagRequest(ModifyAutoRenewFlagRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);

    }
}


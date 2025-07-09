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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAccessKeyRequest extends AbstractModel {

    /**
    * ID of the specified access key that needs to be updated
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Key status. Valid values: `Active` (activated), `Inactive` (not activated).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * UIN of the specified user. If this parameter is left empty, the access key will be updated for the current user by default.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
     * Get ID of the specified access key that needs to be updated 
     * @return AccessKeyId ID of the specified access key that needs to be updated
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set ID of the specified access key that needs to be updated
     * @param AccessKeyId ID of the specified access key that needs to be updated
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Key status. Valid values: `Active` (activated), `Inactive` (not activated). 
     * @return Status Key status. Valid values: `Active` (activated), `Inactive` (not activated).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Key status. Valid values: `Active` (activated), `Inactive` (not activated).
     * @param Status Key status. Valid values: `Active` (activated), `Inactive` (not activated).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get UIN of the specified user. If this parameter is left empty, the access key will be updated for the current user by default. 
     * @return TargetUin UIN of the specified user. If this parameter is left empty, the access key will be updated for the current user by default.
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set UIN of the specified user. If this parameter is left empty, the access key will be updated for the current user by default.
     * @param TargetUin UIN of the specified user. If this parameter is left empty, the access key will be updated for the current user by default.
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    public UpdateAccessKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccessKeyRequest(UpdateAccessKeyRequest source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);

    }
}


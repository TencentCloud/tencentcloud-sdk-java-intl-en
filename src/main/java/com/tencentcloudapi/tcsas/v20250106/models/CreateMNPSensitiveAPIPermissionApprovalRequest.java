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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMNPSensitiveAPIPermissionApprovalRequest extends AbstractModel {

    /**
    * API Id
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * Reason for application
    */
    @SerializedName("ApplyReason")
    @Expose
    private String ApplyReason;

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get API Id 
     * @return APIId API Id
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API Id
     * @param APIId API Id
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get Reason for application 
     * @return ApplyReason Reason for application
     */
    public String getApplyReason() {
        return this.ApplyReason;
    }

    /**
     * Set Reason for application
     * @param ApplyReason Reason for application
     */
    public void setApplyReason(String ApplyReason) {
        this.ApplyReason = ApplyReason;
    }

    /**
     * Get Mini program ID 
     * @return MNPId Mini program ID
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
     * @param MNPId Mini program ID
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public CreateMNPSensitiveAPIPermissionApprovalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNPSensitiveAPIPermissionApprovalRequest(CreateMNPSensitiveAPIPermissionApprovalRequest source) {
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.ApplyReason != null) {
            this.ApplyReason = new String(source.ApplyReason);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "ApplyReason", this.ApplyReason);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}


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

public class CreateMNGApprovalRequest extends AbstractModel {

    /**
    * <p>Mini game version ID</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>submit: Submit for approval; cancel: Cancel approval</p>
    */
    @SerializedName("ApplyAction")
    @Expose
    private String ApplyAction;

    /**
    * <p>Platform ID</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get <p>Mini game version ID</p> 
     * @return MNPVersionId <p>Mini game version ID</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini game version ID</p>
     * @param MNPVersionId <p>Mini game version ID</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get <p>submit: Submit for approval; cancel: Cancel approval</p> 
     * @return ApplyAction <p>submit: Submit for approval; cancel: Cancel approval</p>
     */
    public String getApplyAction() {
        return this.ApplyAction;
    }

    /**
     * Set <p>submit: Submit for approval; cancel: Cancel approval</p>
     * @param ApplyAction <p>submit: Submit for approval; cancel: Cancel approval</p>
     */
    public void setApplyAction(String ApplyAction) {
        this.ApplyAction = ApplyAction;
    }

    /**
     * Get <p>Platform ID</p> 
     * @return PlatformId <p>Platform ID</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID</p>
     * @param PlatformId <p>Platform ID</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public CreateMNGApprovalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNGApprovalRequest(CreateMNGApprovalRequest source) {
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.ApplyAction != null) {
            this.ApplyAction = new String(source.ApplyAction);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "ApplyAction", this.ApplyAction);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}


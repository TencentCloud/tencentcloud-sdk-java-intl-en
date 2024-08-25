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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureMNPPreviewRequest extends AbstractModel {

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * 1: Set; 2: Cancel
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Mini program version ID
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Path to the preview page
    */
    @SerializedName("PreivewEntrancePath")
    @Expose
    private String PreivewEntrancePath;

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
     * Get 1: Set; 2: Cancel 
     * @return ActionType 1: Set; 2: Cancel
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 1: Set; 2: Cancel
     * @param ActionType 1: Set; 2: Cancel
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Mini program version ID 
     * @return MNPVersionId Mini program version ID
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Mini program version ID
     * @param MNPVersionId Mini program version ID
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
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

    /**
     * Get Path to the preview page 
     * @return PreivewEntrancePath Path to the preview page
     */
    public String getPreivewEntrancePath() {
        return this.PreivewEntrancePath;
    }

    /**
     * Set Path to the preview page
     * @param PreivewEntrancePath Path to the preview page
     */
    public void setPreivewEntrancePath(String PreivewEntrancePath) {
        this.PreivewEntrancePath = PreivewEntrancePath;
    }

    public ConfigureMNPPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureMNPPreviewRequest(ConfigureMNPPreviewRequest source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.PreivewEntrancePath != null) {
            this.PreivewEntrancePath = new String(source.PreivewEntrancePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "PreivewEntrancePath", this.PreivewEntrancePath);

    }
}


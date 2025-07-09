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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExtensionRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Extension.
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * Extension name.
    */
    @SerializedName("ExtensionName")
    @Expose
    private String ExtensionName;

    /**
    * Affiliated skill group list.
    */
    @SerializedName("SkillGroupIds")
    @Expose
    private Long [] SkillGroupIds;

    /**
    * Bind agent email account.
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Extension. 
     * @return ExtensionId Extension.
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set Extension.
     * @param ExtensionId Extension.
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get Extension name. 
     * @return ExtensionName Extension name.
     */
    public String getExtensionName() {
        return this.ExtensionName;
    }

    /**
     * Set Extension name.
     * @param ExtensionName Extension name.
     */
    public void setExtensionName(String ExtensionName) {
        this.ExtensionName = ExtensionName;
    }

    /**
     * Get Affiliated skill group list. 
     * @return SkillGroupIds Affiliated skill group list.
     */
    public Long [] getSkillGroupIds() {
        return this.SkillGroupIds;
    }

    /**
     * Set Affiliated skill group list.
     * @param SkillGroupIds Affiliated skill group list.
     */
    public void setSkillGroupIds(Long [] SkillGroupIds) {
        this.SkillGroupIds = SkillGroupIds;
    }

    /**
     * Get Bind agent email account. 
     * @return Relation Bind agent email account.
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set Bind agent email account.
     * @param Relation Bind agent email account.
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public ModifyExtensionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExtensionRequest(ModifyExtensionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.ExtensionName != null) {
            this.ExtensionName = new String(source.ExtensionName);
        }
        if (source.SkillGroupIds != null) {
            this.SkillGroupIds = new Long[source.SkillGroupIds.length];
            for (int i = 0; i < source.SkillGroupIds.length; i++) {
                this.SkillGroupIds[i] = new Long(source.SkillGroupIds[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "ExtensionName", this.ExtensionName);
        this.setParamArraySimple(map, prefix + "SkillGroupIds.", this.SkillGroupIds);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}


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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLaunchTemplateDefaultVersionRequest extends AbstractModel {

    /**
    * The launch template ID
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * The number of the version that you want to set as the default version
    */
    @SerializedName("DefaultVersion")
    @Expose
    private Long DefaultVersion;

    /**
     * Get The launch template ID 
     * @return LaunchTemplateId The launch template ID
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set The launch template ID
     * @param LaunchTemplateId The launch template ID
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get The number of the version that you want to set as the default version 
     * @return DefaultVersion The number of the version that you want to set as the default version
     */
    public Long getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set The number of the version that you want to set as the default version
     * @param DefaultVersion The number of the version that you want to set as the default version
     */
    public void setDefaultVersion(Long DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    public ModifyLaunchTemplateDefaultVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLaunchTemplateDefaultVersionRequest(ModifyLaunchTemplateDefaultVersionRequest source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new Long(source.DefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);

    }
}


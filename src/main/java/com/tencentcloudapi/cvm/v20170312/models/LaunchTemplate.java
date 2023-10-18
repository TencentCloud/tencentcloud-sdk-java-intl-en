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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchTemplate extends AbstractModel {

    /**
    * Instance launch template ID. This parameter enables you to create an instance using the preset parameters in the template.
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * Instance launch template version number. If specified, this parameter will be used to create a new instance launch template.
    */
    @SerializedName("LaunchTemplateVersion")
    @Expose
    private Long LaunchTemplateVersion;

    /**
     * Get Instance launch template ID. This parameter enables you to create an instance using the preset parameters in the template. 
     * @return LaunchTemplateId Instance launch template ID. This parameter enables you to create an instance using the preset parameters in the template.
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set Instance launch template ID. This parameter enables you to create an instance using the preset parameters in the template.
     * @param LaunchTemplateId Instance launch template ID. This parameter enables you to create an instance using the preset parameters in the template.
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get Instance launch template version number. If specified, this parameter will be used to create a new instance launch template. 
     * @return LaunchTemplateVersion Instance launch template version number. If specified, this parameter will be used to create a new instance launch template.
     */
    public Long getLaunchTemplateVersion() {
        return this.LaunchTemplateVersion;
    }

    /**
     * Set Instance launch template version number. If specified, this parameter will be used to create a new instance launch template.
     * @param LaunchTemplateVersion Instance launch template version number. If specified, this parameter will be used to create a new instance launch template.
     */
    public void setLaunchTemplateVersion(Long LaunchTemplateVersion) {
        this.LaunchTemplateVersion = LaunchTemplateVersion;
    }

    public LaunchTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplate(LaunchTemplate source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersion != null) {
            this.LaunchTemplateVersion = new Long(source.LaunchTemplateVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "LaunchTemplateVersion", this.LaunchTemplateVersion);

    }
}


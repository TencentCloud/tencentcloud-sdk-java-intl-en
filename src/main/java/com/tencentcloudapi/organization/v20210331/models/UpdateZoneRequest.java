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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateZoneRequest extends AbstractModel {

    /**
    * Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Space name, which must be globally unique and contain 2-64 characters including lowercase letters, digits, and hyphens (-). It can neither start or end with a hyphen (-) nor contain two consecutive hyphens (-).
    */
    @SerializedName("NewZoneName")
    @Expose
    private String NewZoneName;

    /**
     * Get Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters. 
     * @return ZoneId Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     * @param ZoneId Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Space name, which must be globally unique and contain 2-64 characters including lowercase letters, digits, and hyphens (-). It can neither start or end with a hyphen (-) nor contain two consecutive hyphens (-). 
     * @return NewZoneName Space name, which must be globally unique and contain 2-64 characters including lowercase letters, digits, and hyphens (-). It can neither start or end with a hyphen (-) nor contain two consecutive hyphens (-).
     */
    public String getNewZoneName() {
        return this.NewZoneName;
    }

    /**
     * Set Space name, which must be globally unique and contain 2-64 characters including lowercase letters, digits, and hyphens (-). It can neither start or end with a hyphen (-) nor contain two consecutive hyphens (-).
     * @param NewZoneName Space name, which must be globally unique and contain 2-64 characters including lowercase letters, digits, and hyphens (-). It can neither start or end with a hyphen (-) nor contain two consecutive hyphens (-).
     */
    public void setNewZoneName(String NewZoneName) {
        this.NewZoneName = NewZoneName;
    }

    public UpdateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateZoneRequest(UpdateZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NewZoneName != null) {
            this.NewZoneName = new String(source.NewZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NewZoneName", this.NewZoneName);

    }
}


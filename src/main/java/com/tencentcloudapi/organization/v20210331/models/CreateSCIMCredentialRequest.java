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

public class CreateSCIMCredentialRequest extends AbstractModel {

    /**
    * Space ID, which starts with the z- prefix, followed by 12 random digits/lowercase letters.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Expiration time (in seconds), with a minimum value of 1 hour and a maximum value of 99 years. if not provided, it expires in 1 year by default.
    */
    @SerializedName("ExpireDuration")
    @Expose
    private Long ExpireDuration;

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
     * Get Expiration time (in seconds), with a minimum value of 1 hour and a maximum value of 99 years. if not provided, it expires in 1 year by default. 
     * @return ExpireDuration Expiration time (in seconds), with a minimum value of 1 hour and a maximum value of 99 years. if not provided, it expires in 1 year by default.
     */
    public Long getExpireDuration() {
        return this.ExpireDuration;
    }

    /**
     * Set Expiration time (in seconds), with a minimum value of 1 hour and a maximum value of 99 years. if not provided, it expires in 1 year by default.
     * @param ExpireDuration Expiration time (in seconds), with a minimum value of 1 hour and a maximum value of 99 years. if not provided, it expires in 1 year by default.
     */
    public void setExpireDuration(Long ExpireDuration) {
        this.ExpireDuration = ExpireDuration;
    }

    public CreateSCIMCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSCIMCredentialRequest(CreateSCIMCredentialRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ExpireDuration != null) {
            this.ExpireDuration = new Long(source.ExpireDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ExpireDuration", this.ExpireDuration);

    }
}


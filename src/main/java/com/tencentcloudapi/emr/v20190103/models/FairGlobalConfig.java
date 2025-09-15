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

public class FairGlobalConfig extends AbstractModel {

    /**
    * Corresponds to <p>Program Upper Limit</p> of the page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserMaxAppsDefault")
    @Expose
    private Long UserMaxAppsDefault;

    /**
     * Get Corresponds to <p>Program Upper Limit</p> of the page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserMaxAppsDefault Corresponds to <p>Program Upper Limit</p> of the page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUserMaxAppsDefault() {
        return this.UserMaxAppsDefault;
    }

    /**
     * Set Corresponds to <p>Program Upper Limit</p> of the page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserMaxAppsDefault Corresponds to <p>Program Upper Limit</p> of the page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserMaxAppsDefault(Long UserMaxAppsDefault) {
        this.UserMaxAppsDefault = UserMaxAppsDefault;
    }

    public FairGlobalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FairGlobalConfig(FairGlobalConfig source) {
        if (source.UserMaxAppsDefault != null) {
            this.UserMaxAppsDefault = new Long(source.UserMaxAppsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserMaxAppsDefault", this.UserMaxAppsDefault);

    }
}


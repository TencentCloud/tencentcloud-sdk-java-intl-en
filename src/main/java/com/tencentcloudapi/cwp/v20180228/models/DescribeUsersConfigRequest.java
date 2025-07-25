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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsersConfigRequest extends AbstractModel {

    /**
    * Configuration name
<li>license_monitor authorization monitoring configuration. 0: off; 1: on</li>
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
     * Get Configuration name
<li>license_monitor authorization monitoring configuration. 0: off; 1: on</li> 
     * @return ConfigName Configuration name
<li>license_monitor authorization monitoring configuration. 0: off; 1: on</li>
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration name
<li>license_monitor authorization monitoring configuration. 0: off; 1: on</li>
     * @param ConfigName Configuration name
<li>license_monitor authorization monitoring configuration. 0: off; 1: on</li>
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    public DescribeUsersConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersConfigRequest(DescribeUsersConfigRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);

    }
}


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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanBindEnvironment extends AbstractModel {

    /**
    * Environment name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get Environment name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentName Environment name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentName Environment name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Unique service ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public UsagePlanBindEnvironment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanBindEnvironment(UsagePlanBindEnvironment source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}


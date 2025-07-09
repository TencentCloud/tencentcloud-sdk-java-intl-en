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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshSettings extends AbstractModel {

    /**
    * Rolling update settings parameters. RefreshMode is the rolling update. This parameter must be filled in.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RollingUpdateSettings")
    @Expose
    private RollingUpdateSettings RollingUpdateSettings;

    /**
    * Whether to enable the backend service health check for the instance. Default value: FALSE. This parameter is valid only for the scaling group bound to an application-based CLB. After this feature is enabled, if the instance fails the check after refresh, the port weight of the CLB will be always 0, and it will be marked as a refresh failure. Valid values: <li>TRUE: enable;</li> <li>FALSE: disable.</li>
    */
    @SerializedName("CheckInstanceTargetHealth")
    @Expose
    private Boolean CheckInstanceTargetHealth;

    /**
     * Get Rolling update settings parameters. RefreshMode is the rolling update. This parameter must be filled in.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RollingUpdateSettings Rolling update settings parameters. RefreshMode is the rolling update. This parameter must be filled in.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RollingUpdateSettings getRollingUpdateSettings() {
        return this.RollingUpdateSettings;
    }

    /**
     * Set Rolling update settings parameters. RefreshMode is the rolling update. This parameter must be filled in.Note: This field may return null, indicating that no valid value can be obtained.
     * @param RollingUpdateSettings Rolling update settings parameters. RefreshMode is the rolling update. This parameter must be filled in.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRollingUpdateSettings(RollingUpdateSettings RollingUpdateSettings) {
        this.RollingUpdateSettings = RollingUpdateSettings;
    }

    /**
     * Get Whether to enable the backend service health check for the instance. Default value: FALSE. This parameter is valid only for the scaling group bound to an application-based CLB. After this feature is enabled, if the instance fails the check after refresh, the port weight of the CLB will be always 0, and it will be marked as a refresh failure. Valid values: <li>TRUE: enable;</li> <li>FALSE: disable.</li> 
     * @return CheckInstanceTargetHealth Whether to enable the backend service health check for the instance. Default value: FALSE. This parameter is valid only for the scaling group bound to an application-based CLB. After this feature is enabled, if the instance fails the check after refresh, the port weight of the CLB will be always 0, and it will be marked as a refresh failure. Valid values: <li>TRUE: enable;</li> <li>FALSE: disable.</li>
     */
    public Boolean getCheckInstanceTargetHealth() {
        return this.CheckInstanceTargetHealth;
    }

    /**
     * Set Whether to enable the backend service health check for the instance. Default value: FALSE. This parameter is valid only for the scaling group bound to an application-based CLB. After this feature is enabled, if the instance fails the check after refresh, the port weight of the CLB will be always 0, and it will be marked as a refresh failure. Valid values: <li>TRUE: enable;</li> <li>FALSE: disable.</li>
     * @param CheckInstanceTargetHealth Whether to enable the backend service health check for the instance. Default value: FALSE. This parameter is valid only for the scaling group bound to an application-based CLB. After this feature is enabled, if the instance fails the check after refresh, the port weight of the CLB will be always 0, and it will be marked as a refresh failure. Valid values: <li>TRUE: enable;</li> <li>FALSE: disable.</li>
     */
    public void setCheckInstanceTargetHealth(Boolean CheckInstanceTargetHealth) {
        this.CheckInstanceTargetHealth = CheckInstanceTargetHealth;
    }

    public RefreshSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshSettings(RefreshSettings source) {
        if (source.RollingUpdateSettings != null) {
            this.RollingUpdateSettings = new RollingUpdateSettings(source.RollingUpdateSettings);
        }
        if (source.CheckInstanceTargetHealth != null) {
            this.CheckInstanceTargetHealth = new Boolean(source.CheckInstanceTargetHealth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RollingUpdateSettings.", this.RollingUpdateSettings);
        this.setParamSimple(map, prefix + "CheckInstanceTargetHealth", this.CheckInstanceTargetHealth);

    }
}


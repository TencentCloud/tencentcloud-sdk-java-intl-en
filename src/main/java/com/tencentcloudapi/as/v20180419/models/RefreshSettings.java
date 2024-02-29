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
    * Backend service health check status for instances, defaults to FALSE. This setting takes effect only for scaling groups bound with application load balancers. When enabled, if an instance fails the check after being refreshed, its load balancer port weight remains 0 and is marked as a refresh failure. Valid values: <br><li>TRUE: Enable the check.</li> <li>FALSE: Do not enable the check.
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
     * Get Backend service health check status for instances, defaults to FALSE. This setting takes effect only for scaling groups bound with application load balancers. When enabled, if an instance fails the check after being refreshed, its load balancer port weight remains 0 and is marked as a refresh failure. Valid values: <br><li>TRUE: Enable the check.</li> <li>FALSE: Do not enable the check. 
     * @return CheckInstanceTargetHealth Backend service health check status for instances, defaults to FALSE. This setting takes effect only for scaling groups bound with application load balancers. When enabled, if an instance fails the check after being refreshed, its load balancer port weight remains 0 and is marked as a refresh failure. Valid values: <br><li>TRUE: Enable the check.</li> <li>FALSE: Do not enable the check.
     */
    public Boolean getCheckInstanceTargetHealth() {
        return this.CheckInstanceTargetHealth;
    }

    /**
     * Set Backend service health check status for instances, defaults to FALSE. This setting takes effect only for scaling groups bound with application load balancers. When enabled, if an instance fails the check after being refreshed, its load balancer port weight remains 0 and is marked as a refresh failure. Valid values: <br><li>TRUE: Enable the check.</li> <li>FALSE: Do not enable the check.
     * @param CheckInstanceTargetHealth Backend service health check status for instances, defaults to FALSE. This setting takes effect only for scaling groups bound with application load balancers. When enabled, if an instance fails the check after being refreshed, its load balancer port weight remains 0 and is marked as a refresh failure. Valid values: <br><li>TRUE: Enable the check.</li> <li>FALSE: Do not enable the check.
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


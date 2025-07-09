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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Addon extends AbstractModel {

    /**
    * Add-on name
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * Add-on version
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * Add-on parameters, which are base64-encoded strings in JSON/
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
    * Add-on status
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * Reason for add-on failure
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Add-on name 
     * @return AddonName Add-on name
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set Add-on name
     * @param AddonName Add-on name
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get Add-on version 
     * @return AddonVersion Add-on version
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set Add-on version
     * @param AddonVersion Add-on version
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get Add-on parameters, which are base64-encoded strings in JSON/
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RawValues Add-on parameters, which are base64-encoded strings in JSON/
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set Add-on parameters, which are base64-encoded strings in JSON/
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RawValues Add-on parameters, which are base64-encoded strings in JSON/
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    /**
     * Get Add-on status
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Phase Add-on status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Add-on status
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Phase Add-on status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get Reason for add-on failure
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Reason Reason for add-on failure
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for add-on failure
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Reason Reason for add-on failure
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public Addon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Addon(Addon source) {
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonVersion != null) {
            this.AddonVersion = new String(source.AddonVersion);
        }
        if (source.RawValues != null) {
            this.RawValues = new String(source.RawValues);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonVersion", this.AddonVersion);
        this.setParamSimple(map, prefix + "RawValues", this.RawValues);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}


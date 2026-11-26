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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CurrentOriginACL extends AbstractModel {

    /**
    * Origin-pull IP range details.
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * Version.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version effective time, which adopts Beijing time (UTC+8) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * This parameter is used to record whether "I have updated to the latest origin-pull IP range" is confirmed before the current version takes effect. Valid values:
<li>true: When the version takes effect, the confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: When the version takes effect, the confirmation of updating to the latest origin-pull IP is not completed, and the origin-pull IP range is forcibly updated to the latest version by the backend.</li>Note: When this parameter returns false, confirm in time whether your origin server firewall configuration has been updated to the latest origin-pull IP range to avoid origin-pull failure.
    */
    @SerializedName("IsPlaned")
    @Expose
    private String IsPlaned;

    /**
     * Get Origin-pull IP range details. 
     * @return EntireAddresses Origin-pull IP range details.
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set Origin-pull IP range details.
     * @param EntireAddresses Origin-pull IP range details.
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get Version. 
     * @return Version Version.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version.
     * @param Version Version.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version effective time, which adopts Beijing time (UTC+8) and follows the date and time format of the ISO 8601 standard. 
     * @return ActiveTime Version effective time, which adopts Beijing time (UTC+8) and follows the date and time format of the ISO 8601 standard.
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set Version effective time, which adopts Beijing time (UTC+8) and follows the date and time format of the ISO 8601 standard.
     * @param ActiveTime Version effective time, which adopts Beijing time (UTC+8) and follows the date and time format of the ISO 8601 standard.
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get This parameter is used to record whether "I have updated to the latest origin-pull IP range" is confirmed before the current version takes effect. Valid values:
<li>true: When the version takes effect, the confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: When the version takes effect, the confirmation of updating to the latest origin-pull IP is not completed, and the origin-pull IP range is forcibly updated to the latest version by the backend.</li>Note: When this parameter returns false, confirm in time whether your origin server firewall configuration has been updated to the latest origin-pull IP range to avoid origin-pull failure. 
     * @return IsPlaned This parameter is used to record whether "I have updated to the latest origin-pull IP range" is confirmed before the current version takes effect. Valid values:
<li>true: When the version takes effect, the confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: When the version takes effect, the confirmation of updating to the latest origin-pull IP is not completed, and the origin-pull IP range is forcibly updated to the latest version by the backend.</li>Note: When this parameter returns false, confirm in time whether your origin server firewall configuration has been updated to the latest origin-pull IP range to avoid origin-pull failure.
     */
    public String getIsPlaned() {
        return this.IsPlaned;
    }

    /**
     * Set This parameter is used to record whether "I have updated to the latest origin-pull IP range" is confirmed before the current version takes effect. Valid values:
<li>true: When the version takes effect, the confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: When the version takes effect, the confirmation of updating to the latest origin-pull IP is not completed, and the origin-pull IP range is forcibly updated to the latest version by the backend.</li>Note: When this parameter returns false, confirm in time whether your origin server firewall configuration has been updated to the latest origin-pull IP range to avoid origin-pull failure.
     * @param IsPlaned This parameter is used to record whether "I have updated to the latest origin-pull IP range" is confirmed before the current version takes effect. Valid values:
<li>true: When the version takes effect, the confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: When the version takes effect, the confirmation of updating to the latest origin-pull IP is not completed, and the origin-pull IP range is forcibly updated to the latest version by the backend.</li>Note: When this parameter returns false, confirm in time whether your origin server firewall configuration has been updated to the latest origin-pull IP range to avoid origin-pull failure.
     */
    public void setIsPlaned(String IsPlaned) {
        this.IsPlaned = IsPlaned;
    }

    public CurrentOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CurrentOriginACL(CurrentOriginACL source) {
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.IsPlaned != null) {
            this.IsPlaned = new String(source.IsPlaned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "IsPlaned", this.IsPlaned);

    }
}


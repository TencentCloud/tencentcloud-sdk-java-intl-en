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
    * IP range details.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * Version number.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version effective time in UTC+8, following the date and time format of the ISO 8601 standard.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * This parameter is used to record whether "I've upgraded to the lastest version" is completed before the origin ACLs version is effective. valid values:.
- true: specifies that the version is effective and the update to the latest version is confirmed.
- false: when the version takes effect, the confirmation of updating to the latest origin ACLs are not completed. The IP range is forcibly updated to the latest version in the backend. When this parameter returns false, please confirm in time whether your origin server firewall configuration has been updated to the latest version to avoid origin-pull failure.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("IsPlaned")
    @Expose
    private String IsPlaned;

    /**
     * Get IP range details.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return EntireAddresses IP range details.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set IP range details.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param EntireAddresses IP range details.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get Version number.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Version Version number.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version number.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Version Version number.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version effective time in UTC+8, following the date and time format of the ISO 8601 standard.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return ActiveTime Version effective time in UTC+8, following the date and time format of the ISO 8601 standard.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set Version effective time in UTC+8, following the date and time format of the ISO 8601 standard.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param ActiveTime Version effective time in UTC+8, following the date and time format of the ISO 8601 standard.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get This parameter is used to record whether "I've upgraded to the lastest version" is completed before the origin ACLs version is effective. valid values:.
- true: specifies that the version is effective and the update to the latest version is confirmed.
- false: when the version takes effect, the confirmation of updating to the latest origin ACLs are not completed. The IP range is forcibly updated to the latest version in the backend. When this parameter returns false, please confirm in time whether your origin server firewall configuration has been updated to the latest version to avoid origin-pull failure.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return IsPlaned This parameter is used to record whether "I've upgraded to the lastest version" is completed before the origin ACLs version is effective. valid values:.
- true: specifies that the version is effective and the update to the latest version is confirmed.
- false: when the version takes effect, the confirmation of updating to the latest origin ACLs are not completed. The IP range is forcibly updated to the latest version in the backend. When this parameter returns false, please confirm in time whether your origin server firewall configuration has been updated to the latest version to avoid origin-pull failure.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getIsPlaned() {
        return this.IsPlaned;
    }

    /**
     * Set This parameter is used to record whether "I've upgraded to the lastest version" is completed before the origin ACLs version is effective. valid values:.
- true: specifies that the version is effective and the update to the latest version is confirmed.
- false: when the version takes effect, the confirmation of updating to the latest origin ACLs are not completed. The IP range is forcibly updated to the latest version in the backend. When this parameter returns false, please confirm in time whether your origin server firewall configuration has been updated to the latest version to avoid origin-pull failure.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param IsPlaned This parameter is used to record whether "I've upgraded to the lastest version" is completed before the origin ACLs version is effective. valid values:.
- true: specifies that the version is effective and the update to the latest version is confirmed.
- false: when the version takes effect, the confirmation of updating to the latest origin ACLs are not completed. The IP range is forcibly updated to the latest version in the backend. When this parameter returns false, please confirm in time whether your origin server firewall configuration has been updated to the latest version to avoid origin-pull failure.
Note: This field may return null, which indicates a failure to obtain a valid value.
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


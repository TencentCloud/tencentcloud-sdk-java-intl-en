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

public class MultiPathGatewayCurrentOriginACL extends AbstractModel {

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
    private Long Version;

    /**
    * This parameter is used to record whether the confirmation of "I have updated to the latest origin-pull IP range" is completed before the current version takes effect. Valid values:
<li>true: The confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: The confirmation of updating to the latest origin-pull IP is not completed;</li>
Note: When this parameter returns false, confirm in time whether your origin server firewall settings are updated to the latest origin-pull IP range to avoid origin-pull failure.
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
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Version.
     * @param Version Version.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get This parameter is used to record whether the confirmation of "I have updated to the latest origin-pull IP range" is completed before the current version takes effect. Valid values:
<li>true: The confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: The confirmation of updating to the latest origin-pull IP is not completed;</li>
Note: When this parameter returns false, confirm in time whether your origin server firewall settings are updated to the latest origin-pull IP range to avoid origin-pull failure. 
     * @return IsPlaned This parameter is used to record whether the confirmation of "I have updated to the latest origin-pull IP range" is completed before the current version takes effect. Valid values:
<li>true: The confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: The confirmation of updating to the latest origin-pull IP is not completed;</li>
Note: When this parameter returns false, confirm in time whether your origin server firewall settings are updated to the latest origin-pull IP range to avoid origin-pull failure.
     */
    public String getIsPlaned() {
        return this.IsPlaned;
    }

    /**
     * Set This parameter is used to record whether the confirmation of "I have updated to the latest origin-pull IP range" is completed before the current version takes effect. Valid values:
<li>true: The confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: The confirmation of updating to the latest origin-pull IP is not completed;</li>
Note: When this parameter returns false, confirm in time whether your origin server firewall settings are updated to the latest origin-pull IP range to avoid origin-pull failure.
     * @param IsPlaned This parameter is used to record whether the confirmation of "I have updated to the latest origin-pull IP range" is completed before the current version takes effect. Valid values:
<li>true: The confirmation of updating to the latest origin-pull IP is completed;</li>
<li>false: The confirmation of updating to the latest origin-pull IP is not completed;</li>
Note: When this parameter returns false, confirm in time whether your origin server firewall settings are updated to the latest origin-pull IP range to avoid origin-pull failure.
     */
    public void setIsPlaned(String IsPlaned) {
        this.IsPlaned = IsPlaned;
    }

    public MultiPathGatewayCurrentOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayCurrentOriginACL(MultiPathGatewayCurrentOriginACL source) {
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
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
        this.setParamSimple(map, prefix + "IsPlaned", this.IsPlaned);

    }
}


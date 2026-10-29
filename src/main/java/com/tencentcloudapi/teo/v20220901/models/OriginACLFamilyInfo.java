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

public class OriginACLFamilyInfo extends AbstractModel {

    /**
    * Origin protection version number.
Format description:
Standard version.
<li>gaz-xxxxx: global;</li>
<li>mlc-xxxxx: China;</li>
<li>emc-xxxxx: overseas (worldwide excluding China);</li>
Simplified edition (platform-level version)
<li>plat-gaz-xxxxxx: Simplified global edition;</li>
<li>plat-mlc-xxxxxx: Simplified China version;</li>
<li>plat-emc-xxxxxx: Simplified overseas (global excluding China) edition;</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li>
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
    * Origin-pull IP range details.	
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * Origin protection origin-pull ACL control domain. Parameter values are as follows:
<li>gaz: standard global availability zone control domain;</li>
<li>mlc: standard Chinese mainland availability zone control domain;</li>
<li>emc: standard worldwide (excluding Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: simplified global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplified global (excluding Chinese mainland) availability zone control domain;</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get Origin protection version number.
Format description:
Standard version.
<li>gaz-xxxxx: global;</li>
<li>mlc-xxxxx: China;</li>
<li>emc-xxxxx: overseas (worldwide excluding China);</li>
Simplified edition (platform-level version)
<li>plat-gaz-xxxxxx: Simplified global edition;</li>
<li>plat-mlc-xxxxxx: Simplified China version;</li>
<li>plat-emc-xxxxxx: Simplified overseas (global excluding China) edition;</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li> 
     * @return Version Origin protection version number.
Format description:
Standard version.
<li>gaz-xxxxx: global;</li>
<li>mlc-xxxxx: China;</li>
<li>emc-xxxxx: overseas (worldwide excluding China);</li>
Simplified edition (platform-level version)
<li>plat-gaz-xxxxxx: Simplified global edition;</li>
<li>plat-mlc-xxxxxx: Simplified China version;</li>
<li>plat-emc-xxxxxx: Simplified overseas (global excluding China) edition;</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Origin protection version number.
Format description:
Standard version.
<li>gaz-xxxxx: global;</li>
<li>mlc-xxxxx: China;</li>
<li>emc-xxxxx: overseas (worldwide excluding China);</li>
Simplified edition (platform-level version)
<li>plat-gaz-xxxxxx: Simplified global edition;</li>
<li>plat-mlc-xxxxxx: Simplified China version;</li>
<li>plat-emc-xxxxxx: Simplified overseas (global excluding China) edition;</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li>
     * @param Version Origin protection version number.
Format description:
Standard version.
<li>gaz-xxxxx: global;</li>
<li>mlc-xxxxx: China;</li>
<li>emc-xxxxx: overseas (worldwide excluding China);</li>
Simplified edition (platform-level version)
<li>plat-gaz-xxxxxx: Simplified global edition;</li>
<li>plat-mlc-xxxxxx: Simplified China version;</li>
<li>plat-emc-xxxxxx: Simplified overseas (global excluding China) edition;</li>
Abbreviation description:
<li>gaz:Global AZ Availability Zone;</li>
<li>mlc:mainlandChina;</li>
<li>emc:Exclude mainlandChina.</li>
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
     * Get Origin protection origin-pull ACL control domain. Parameter values are as follows:
<li>gaz: standard global availability zone control domain;</li>
<li>mlc: standard Chinese mainland availability zone control domain;</li>
<li>emc: standard worldwide (excluding Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: simplified global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplified global (excluding Chinese mainland) availability zone control domain;</li> 
     * @return OriginACLFamily Origin protection origin-pull ACL control domain. Parameter values are as follows:
<li>gaz: standard global availability zone control domain;</li>
<li>mlc: standard Chinese mainland availability zone control domain;</li>
<li>emc: standard worldwide (excluding Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: simplified global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplified global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set Origin protection origin-pull ACL control domain. Parameter values are as follows:
<li>gaz: standard global availability zone control domain;</li>
<li>mlc: standard Chinese mainland availability zone control domain;</li>
<li>emc: standard worldwide (excluding Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: simplified global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplified global (excluding Chinese mainland) availability zone control domain;</li>
     * @param OriginACLFamily Origin protection origin-pull ACL control domain. Parameter values are as follows:
<li>gaz: standard global availability zone control domain;</li>
<li>mlc: standard Chinese mainland availability zone control domain;</li>
<li>emc: standard worldwide (excluding Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: simplified global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplified global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public OriginACLFamilyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLFamilyInfo(OriginACLFamilyInfo source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}


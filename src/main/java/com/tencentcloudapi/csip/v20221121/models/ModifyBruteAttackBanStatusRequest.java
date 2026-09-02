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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBruteAttackBanStatusRequest extends AbstractModel {

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Whether to enable the intelligent over-whitening mode</p>
    */
    @SerializedName("OpenSmartMode")
    @Expose
    private Boolean OpenSmartMode;

    /**
    * <p>Whether to block intelligence blacklisted IPs</p>
    */
    @SerializedName("BanBlackIp")
    @Expose
    private Boolean BanBlackIp;

    /**
    * <p>Whether to block the black IP exploiting the vulnerability</p>
    */
    @SerializedName("BanVulIp")
    @Expose
    private Boolean BanVulIp;

    /**
    * <p>Whether to enable rule blocking</p>
    */
    @SerializedName("BanByRule")
    @Expose
    private Boolean BanByRule;

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Whether to enable the intelligent over-whitening mode</p> 
     * @return OpenSmartMode <p>Whether to enable the intelligent over-whitening mode</p>
     */
    public Boolean getOpenSmartMode() {
        return this.OpenSmartMode;
    }

    /**
     * Set <p>Whether to enable the intelligent over-whitening mode</p>
     * @param OpenSmartMode <p>Whether to enable the intelligent over-whitening mode</p>
     */
    public void setOpenSmartMode(Boolean OpenSmartMode) {
        this.OpenSmartMode = OpenSmartMode;
    }

    /**
     * Get <p>Whether to block intelligence blacklisted IPs</p> 
     * @return BanBlackIp <p>Whether to block intelligence blacklisted IPs</p>
     */
    public Boolean getBanBlackIp() {
        return this.BanBlackIp;
    }

    /**
     * Set <p>Whether to block intelligence blacklisted IPs</p>
     * @param BanBlackIp <p>Whether to block intelligence blacklisted IPs</p>
     */
    public void setBanBlackIp(Boolean BanBlackIp) {
        this.BanBlackIp = BanBlackIp;
    }

    /**
     * Get <p>Whether to block the black IP exploiting the vulnerability</p> 
     * @return BanVulIp <p>Whether to block the black IP exploiting the vulnerability</p>
     */
    public Boolean getBanVulIp() {
        return this.BanVulIp;
    }

    /**
     * Set <p>Whether to block the black IP exploiting the vulnerability</p>
     * @param BanVulIp <p>Whether to block the black IP exploiting the vulnerability</p>
     */
    public void setBanVulIp(Boolean BanVulIp) {
        this.BanVulIp = BanVulIp;
    }

    /**
     * Get <p>Whether to enable rule blocking</p> 
     * @return BanByRule <p>Whether to enable rule blocking</p>
     */
    public Boolean getBanByRule() {
        return this.BanByRule;
    }

    /**
     * Set <p>Whether to enable rule blocking</p>
     * @param BanByRule <p>Whether to enable rule blocking</p>
     */
    public void setBanByRule(Boolean BanByRule) {
        this.BanByRule = BanByRule;
    }

    public ModifyBruteAttackBanStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBruteAttackBanStatusRequest(ModifyBruteAttackBanStatusRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OpenSmartMode != null) {
            this.OpenSmartMode = new Boolean(source.OpenSmartMode);
        }
        if (source.BanBlackIp != null) {
            this.BanBlackIp = new Boolean(source.BanBlackIp);
        }
        if (source.BanVulIp != null) {
            this.BanVulIp = new Boolean(source.BanVulIp);
        }
        if (source.BanByRule != null) {
            this.BanByRule = new Boolean(source.BanByRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "OpenSmartMode", this.OpenSmartMode);
        this.setParamSimple(map, prefix + "BanBlackIp", this.BanBlackIp);
        this.setParamSimple(map, prefix + "BanVulIp", this.BanVulIp);
        this.setParamSimple(map, prefix + "BanByRule", this.BanByRule);

    }
}


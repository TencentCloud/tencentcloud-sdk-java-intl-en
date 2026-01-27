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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmailIdentity extends AbstractModel {

    /**
    * Sender domain.
    */
    @SerializedName("IdentityName")
    @Expose
    private String IdentityName;

    /**
    * Verification type. The value is fixed to `DOMAIN`.
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * Verification passed or not.
    */
    @SerializedName("SendingEnabled")
    @Expose
    private Boolean SendingEnabled;

    /**
    * Current reputation level
    */
    @SerializedName("CurrentReputationLevel")
    @Expose
    private Long CurrentReputationLevel;

    /**
    * Maximum number of messages sent per day
    */
    @SerializedName("DailyQuota")
    @Expose
    private Long DailyQuota;

    /**
    * Independent ip for domain configuration.
    */
    @SerializedName("SendIp")
    @Expose
    private String [] SendIp;

    /**
    * tag.
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
     * Get Sender domain. 
     * @return IdentityName Sender domain.
     */
    public String getIdentityName() {
        return this.IdentityName;
    }

    /**
     * Set Sender domain.
     * @param IdentityName Sender domain.
     */
    public void setIdentityName(String IdentityName) {
        this.IdentityName = IdentityName;
    }

    /**
     * Get Verification type. The value is fixed to `DOMAIN`. 
     * @return IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Verification type. The value is fixed to `DOMAIN`.
     * @param IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get Verification passed or not. 
     * @return SendingEnabled Verification passed or not.
     */
    public Boolean getSendingEnabled() {
        return this.SendingEnabled;
    }

    /**
     * Set Verification passed or not.
     * @param SendingEnabled Verification passed or not.
     */
    public void setSendingEnabled(Boolean SendingEnabled) {
        this.SendingEnabled = SendingEnabled;
    }

    /**
     * Get Current reputation level 
     * @return CurrentReputationLevel Current reputation level
     */
    public Long getCurrentReputationLevel() {
        return this.CurrentReputationLevel;
    }

    /**
     * Set Current reputation level
     * @param CurrentReputationLevel Current reputation level
     */
    public void setCurrentReputationLevel(Long CurrentReputationLevel) {
        this.CurrentReputationLevel = CurrentReputationLevel;
    }

    /**
     * Get Maximum number of messages sent per day 
     * @return DailyQuota Maximum number of messages sent per day
     */
    public Long getDailyQuota() {
        return this.DailyQuota;
    }

    /**
     * Set Maximum number of messages sent per day
     * @param DailyQuota Maximum number of messages sent per day
     */
    public void setDailyQuota(Long DailyQuota) {
        this.DailyQuota = DailyQuota;
    }

    /**
     * Get Independent ip for domain configuration. 
     * @return SendIp Independent ip for domain configuration.
     */
    public String [] getSendIp() {
        return this.SendIp;
    }

    /**
     * Set Independent ip for domain configuration.
     * @param SendIp Independent ip for domain configuration.
     */
    public void setSendIp(String [] SendIp) {
        this.SendIp = SendIp;
    }

    /**
     * Get tag. 
     * @return TagList tag.
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set tag.
     * @param TagList tag.
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    public EmailIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailIdentity(EmailIdentity source) {
        if (source.IdentityName != null) {
            this.IdentityName = new String(source.IdentityName);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
        if (source.SendingEnabled != null) {
            this.SendingEnabled = new Boolean(source.SendingEnabled);
        }
        if (source.CurrentReputationLevel != null) {
            this.CurrentReputationLevel = new Long(source.CurrentReputationLevel);
        }
        if (source.DailyQuota != null) {
            this.DailyQuota = new Long(source.DailyQuota);
        }
        if (source.SendIp != null) {
            this.SendIp = new String[source.SendIp.length];
            for (int i = 0; i < source.SendIp.length; i++) {
                this.SendIp[i] = new String(source.SendIp[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityName", this.IdentityName);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "SendingEnabled", this.SendingEnabled);
        this.setParamSimple(map, prefix + "CurrentReputationLevel", this.CurrentReputationLevel);
        this.setParamSimple(map, prefix + "DailyQuota", this.DailyQuota);
        this.setParamArraySimple(map, prefix + "SendIp.", this.SendIp);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}


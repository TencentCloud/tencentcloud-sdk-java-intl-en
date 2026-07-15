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
    * <p>Sender domain name</p>
    */
    @SerializedName("IdentityName")
    @Expose
    private String IdentityName;

    /**
    * <p>Validation type, fixed as DOMAIN</p>
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * <p>Whether verified</p>
    */
    @SerializedName("SendingEnabled")
    @Expose
    private Boolean SendingEnabled;

    /**
    * <p>Current reputation level</p>
    */
    @SerializedName("CurrentReputationLevel")
    @Expose
    private Long CurrentReputationLevel;

    /**
    * <p>Maximum message sending capacity of the current day</p>
    */
    @SerializedName("DailyQuota")
    @Expose
    private Long DailyQuota;

    /**
    * <p>Independent ip for domain configuration</p>
    */
    @SerializedName("SendIp")
    @Expose
    private String [] SendIp;

    /**
    * <p>tag</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * <p>dkim bit number</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul><p>Default value: 0</p>
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
     * Get <p>Sender domain name</p> 
     * @return IdentityName <p>Sender domain name</p>
     */
    public String getIdentityName() {
        return this.IdentityName;
    }

    /**
     * Set <p>Sender domain name</p>
     * @param IdentityName <p>Sender domain name</p>
     */
    public void setIdentityName(String IdentityName) {
        this.IdentityName = IdentityName;
    }

    /**
     * Get <p>Validation type, fixed as DOMAIN</p> 
     * @return IdentityType <p>Validation type, fixed as DOMAIN</p>
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set <p>Validation type, fixed as DOMAIN</p>
     * @param IdentityType <p>Validation type, fixed as DOMAIN</p>
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get <p>Whether verified</p> 
     * @return SendingEnabled <p>Whether verified</p>
     */
    public Boolean getSendingEnabled() {
        return this.SendingEnabled;
    }

    /**
     * Set <p>Whether verified</p>
     * @param SendingEnabled <p>Whether verified</p>
     */
    public void setSendingEnabled(Boolean SendingEnabled) {
        this.SendingEnabled = SendingEnabled;
    }

    /**
     * Get <p>Current reputation level</p> 
     * @return CurrentReputationLevel <p>Current reputation level</p>
     */
    public Long getCurrentReputationLevel() {
        return this.CurrentReputationLevel;
    }

    /**
     * Set <p>Current reputation level</p>
     * @param CurrentReputationLevel <p>Current reputation level</p>
     */
    public void setCurrentReputationLevel(Long CurrentReputationLevel) {
        this.CurrentReputationLevel = CurrentReputationLevel;
    }

    /**
     * Get <p>Maximum message sending capacity of the current day</p> 
     * @return DailyQuota <p>Maximum message sending capacity of the current day</p>
     */
    public Long getDailyQuota() {
        return this.DailyQuota;
    }

    /**
     * Set <p>Maximum message sending capacity of the current day</p>
     * @param DailyQuota <p>Maximum message sending capacity of the current day</p>
     */
    public void setDailyQuota(Long DailyQuota) {
        this.DailyQuota = DailyQuota;
    }

    /**
     * Get <p>Independent ip for domain configuration</p> 
     * @return SendIp <p>Independent ip for domain configuration</p>
     */
    public String [] getSendIp() {
        return this.SendIp;
    }

    /**
     * Set <p>Independent ip for domain configuration</p>
     * @param SendIp <p>Independent ip for domain configuration</p>
     */
    public void setSendIp(String [] SendIp) {
        this.SendIp = SendIp;
    }

    /**
     * Get <p>tag</p> 
     * @return TagList <p>tag</p>
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>tag</p>
     * @param TagList <p>tag</p>
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>dkim bit number</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul><p>Default value: 0</p> 
     * @return DKIMOption <p>dkim bit number</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul><p>Default value: 0</p>
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set <p>dkim bit number</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul><p>Default value: 0</p>
     * @param DKIMOption <p>dkim bit number</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul><p>Default value: 0</p>
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
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
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
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
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);

    }
}


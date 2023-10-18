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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagedRule extends AbstractModel {

    /**
    * ID of the rule to be enabled
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ManagedIds")
    @Expose
    private Long [] ManagedIds;

    /**
    * ID of the rule being applied
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Action of the rule. Values: `drop`; `trans`; `monitor`; `alg`.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The amount of time the IP is blocked
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * Unit of IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * Redirection URL, which must be a subdomain name of your site encoded by URLEncode
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * Response code returned after redirection
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
    * ID of the rule that is set to allow requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TransManagedIds")
    @Expose
    private Long [] TransManagedIds;

    /**
    * ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AlgManagedIds")
    @Expose
    private Long [] AlgManagedIds;

    /**
    * ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CapManagedIds")
    @Expose
    private Long [] CapManagedIds;

    /**
    * ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
     * Get ID of the rule to be enabled
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ManagedIds ID of the rule to be enabled
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getManagedIds() {
        return this.ManagedIds;
    }

    /**
     * Set ID of the rule to be enabled
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ManagedIds ID of the rule to be enabled
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setManagedIds(Long [] ManagedIds) {
        this.ManagedIds = ManagedIds;
    }

    /**
     * Get ID of the rule being applied 
     * @return RuleID ID of the rule being applied
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set ID of the rule being applied
     * @param RuleID ID of the rule being applied
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Action of the rule. Values: `drop`; `trans`; `monitor`; `alg`. 
     * @return Action Action of the rule. Values: `drop`; `trans`; `monitor`; `alg`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action of the rule. Values: `drop`; `trans`; `monitor`; `alg`.
     * @param Action Action of the rule. Values: `drop`; `trans`; `monitor`; `alg`.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The amount of time the IP is blocked
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PunishTime The amount of time the IP is blocked
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set The amount of time the IP is blocked
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PunishTime The amount of time the IP is blocked
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get Unit of IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PunishTimeUnit Unit of IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set Unit of IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PunishTimeUnit Unit of IP blocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Name Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Name Name of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PageId ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PageId ID of the custom block page
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Redirection URL, which must be a subdomain name of your site encoded by URLEncode
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RedirectUrl Redirection URL, which must be a subdomain name of your site encoded by URLEncode
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Redirection URL, which must be a subdomain name of your site encoded by URLEncode
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RedirectUrl Redirection URL, which must be a subdomain name of your site encoded by URLEncode
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get Response code returned after redirection
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ResponseCode Response code returned after redirection
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set Response code returned after redirection
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ResponseCode Response code returned after redirection
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    /**
     * Get ID of the rule that is set to allow requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TransManagedIds ID of the rule that is set to allow requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getTransManagedIds() {
        return this.TransManagedIds;
    }

    /**
     * Set ID of the rule that is set to allow requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TransManagedIds ID of the rule that is set to allow requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTransManagedIds(Long [] TransManagedIds) {
        this.TransManagedIds = TransManagedIds;
    }

    /**
     * Get ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AlgManagedIds ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AlgManagedIds ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAlgManagedIds(Long [] AlgManagedIds) {
        this.AlgManagedIds = AlgManagedIds;
    }

    /**
     * Get ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CapManagedIds ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getCapManagedIds() {
        return this.CapManagedIds;
    }

    /**
     * Set ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CapManagedIds ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCapManagedIds(Long [] CapManagedIds) {
        this.CapManagedIds = CapManagedIds;
    }

    /**
     * Get ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MonManagedIds ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MonManagedIds ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DropManagedIds ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DropManagedIds ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    public BotManagedRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagedRule(BotManagedRule source) {
        if (source.ManagedIds != null) {
            this.ManagedIds = new Long[source.ManagedIds.length];
            for (int i = 0; i < source.ManagedIds.length; i++) {
                this.ManagedIds[i] = new Long(source.ManagedIds[i]);
            }
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
        if (source.TransManagedIds != null) {
            this.TransManagedIds = new Long[source.TransManagedIds.length];
            for (int i = 0; i < source.TransManagedIds.length; i++) {
                this.TransManagedIds[i] = new Long(source.TransManagedIds[i]);
            }
        }
        if (source.AlgManagedIds != null) {
            this.AlgManagedIds = new Long[source.AlgManagedIds.length];
            for (int i = 0; i < source.AlgManagedIds.length; i++) {
                this.AlgManagedIds[i] = new Long(source.AlgManagedIds[i]);
            }
        }
        if (source.CapManagedIds != null) {
            this.CapManagedIds = new Long[source.CapManagedIds.length];
            for (int i = 0; i < source.CapManagedIds.length; i++) {
                this.CapManagedIds[i] = new Long(source.CapManagedIds[i]);
            }
        }
        if (source.MonManagedIds != null) {
            this.MonManagedIds = new Long[source.MonManagedIds.length];
            for (int i = 0; i < source.MonManagedIds.length; i++) {
                this.MonManagedIds[i] = new Long(source.MonManagedIds[i]);
            }
        }
        if (source.DropManagedIds != null) {
            this.DropManagedIds = new Long[source.DropManagedIds.length];
            for (int i = 0; i < source.DropManagedIds.length; i++) {
                this.DropManagedIds[i] = new Long(source.DropManagedIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ManagedIds.", this.ManagedIds);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);
        this.setParamArraySimple(map, prefix + "TransManagedIds.", this.TransManagedIds);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);

    }
}


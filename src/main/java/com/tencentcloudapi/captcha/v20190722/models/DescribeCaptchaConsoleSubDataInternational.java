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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaConsoleSubDataInternational extends AbstractModel {

    /**
    * <p>Verification code id</p>
    */
    @SerializedName("CaptchaAppId")
    @Expose
    private Long CaptchaAppId;

    /**
    * <p>Verification name</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Separate domain names with commas</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Random key</p>
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * <p>Verification scenario</p><p>Enumeration values:</p><ul><li>1: Account</li><li>2: SMS</li><li>3: Promotion</li><li>4: Comment</li><li>5: Data protection</li><li>6: Other</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Sliding puzzle</li><li>8: Graphical point selection</li><li>9: Voice verification</li></ul>
    */
    @SerializedName("UserSetCapType")
    @Expose
    private Long UserSetCapType;

    /**
    * <p>Intelligent verification-free</p><p>Enumeration values:</p><ul><li>0: disable</li><li>1: enable</li></ul>
    */
    @SerializedName("NoVerifyRule")
    @Expose
    private Long NoVerifyRule;

    /**
    * <p>Language</p><p>Enumeration values:</p><ul><li>1: Self adaptive</li><li>2052: Simplified</li><li>1028: Traditional</li><li>1033: English</li></ul>
    */
    @SerializedName("CaptchaLanguage")
    @Expose
    private String CaptchaLanguage;

    /**
    * <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
    */
    @SerializedName("VerifyRank")
    @Expose
    private Long VerifyRank;

    /**
    * <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario usage</li><li>android: For Android client usage</li><li>ios: For iOS client usage</li></ul>
    */
    @SerializedName("ChannelInfo")
    @Expose
    private String ChannelInfo;

    /**
    * <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p>
    */
    @SerializedName("DefendMode")
    @Expose
    private String DefendMode;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Whether to enable captchaAppid encryption</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul>
    */
    @SerializedName("CheckAppidSwitch")
    @Expose
    private Long CheckAppidSwitch;

    /**
    * <p>Resource tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("CheckIvSwitch")
    @Expose
    private Long CheckIvSwitch;

    /**
    * <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul>
    */
    @SerializedName("DisableInvisibleSwitch")
    @Expose
    private String DisableInvisibleSwitch;

    /**
    * <p>Web domain name</p><p>Valid only when ChannelInfo is web</p>
    */
    @SerializedName("VerifyDomain")
    @Expose
    private String VerifyDomain;

    /**
    * <p>app BundleId</p><p>Valid only when ChannelInfo is ios</p>
    */
    @SerializedName("VerifyBundleId")
    @Expose
    private String VerifyBundleId;

    /**
    * <p>app package</p><p>Only valid when ChannelInfo is android</p>
    */
    @SerializedName("VerifyPackage")
    @Expose
    private String VerifyPackage;

    /**
    * <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul>
    */
    @SerializedName("CheckBoxStyle")
    @Expose
    private String CheckBoxStyle;

    /**
    * <p>Customer type</p><p>Enumeration values:</p><ul><li>0: General user</li><li>1: waf</li><li>2: EO</li></ul>
    */
    @SerializedName("CustomerType")
    @Expose
    private String CustomerType;

    /**
     * Get <p>Verification code id</p> 
     * @return CaptchaAppId <p>Verification code id</p>
     */
    public Long getCaptchaAppId() {
        return this.CaptchaAppId;
    }

    /**
     * Set <p>Verification code id</p>
     * @param CaptchaAppId <p>Verification code id</p>
     */
    public void setCaptchaAppId(Long CaptchaAppId) {
        this.CaptchaAppId = CaptchaAppId;
    }

    /**
     * Get <p>Verification name</p> 
     * @return AppName <p>Verification name</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Verification name</p>
     * @param AppName <p>Verification name</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Separate domain names with commas</p> 
     * @return Domain <p>Separate domain names with commas</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Separate domain names with commas</p>
     * @param Domain <p>Separate domain names with commas</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Random key</p> 
     * @return EncryptKey <p>Random key</p>
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set <p>Random key</p>
     * @param EncryptKey <p>Random key</p>
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get <p>Verification scenario</p><p>Enumeration values:</p><ul><li>1: Account</li><li>2: SMS</li><li>3: Promotion</li><li>4: Comment</li><li>5: Data protection</li><li>6: Other</li></ul> 
     * @return SceneType <p>Verification scenario</p><p>Enumeration values:</p><ul><li>1: Account</li><li>2: SMS</li><li>3: Promotion</li><li>4: Comment</li><li>5: Data protection</li><li>6: Other</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>Verification scenario</p><p>Enumeration values:</p><ul><li>1: Account</li><li>2: SMS</li><li>3: Promotion</li><li>4: Comment</li><li>5: Data protection</li><li>6: Other</li></ul>
     * @param SceneType <p>Verification scenario</p><p>Enumeration values:</p><ul><li>1: Account</li><li>2: SMS</li><li>3: Promotion</li><li>4: Comment</li><li>5: Data protection</li><li>6: Other</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Sliding puzzle</li><li>8: Graphical point selection</li><li>9: Voice verification</li></ul> 
     * @return UserSetCapType <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Sliding puzzle</li><li>8: Graphical point selection</li><li>9: Voice verification</li></ul>
     */
    public Long getUserSetCapType() {
        return this.UserSetCapType;
    }

    /**
     * Set <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Sliding puzzle</li><li>8: Graphical point selection</li><li>9: Voice verification</li></ul>
     * @param UserSetCapType <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Sliding puzzle</li><li>8: Graphical point selection</li><li>9: Voice verification</li></ul>
     */
    public void setUserSetCapType(Long UserSetCapType) {
        this.UserSetCapType = UserSetCapType;
    }

    /**
     * Get <p>Intelligent verification-free</p><p>Enumeration values:</p><ul><li>0: disable</li><li>1: enable</li></ul> 
     * @return NoVerifyRule <p>Intelligent verification-free</p><p>Enumeration values:</p><ul><li>0: disable</li><li>1: enable</li></ul>
     */
    public Long getNoVerifyRule() {
        return this.NoVerifyRule;
    }

    /**
     * Set <p>Intelligent verification-free</p><p>Enumeration values:</p><ul><li>0: disable</li><li>1: enable</li></ul>
     * @param NoVerifyRule <p>Intelligent verification-free</p><p>Enumeration values:</p><ul><li>0: disable</li><li>1: enable</li></ul>
     */
    public void setNoVerifyRule(Long NoVerifyRule) {
        this.NoVerifyRule = NoVerifyRule;
    }

    /**
     * Get <p>Language</p><p>Enumeration values:</p><ul><li>1: Self adaptive</li><li>2052: Simplified</li><li>1028: Traditional</li><li>1033: English</li></ul> 
     * @return CaptchaLanguage <p>Language</p><p>Enumeration values:</p><ul><li>1: Self adaptive</li><li>2052: Simplified</li><li>1028: Traditional</li><li>1033: English</li></ul>
     */
    public String getCaptchaLanguage() {
        return this.CaptchaLanguage;
    }

    /**
     * Set <p>Language</p><p>Enumeration values:</p><ul><li>1: Self adaptive</li><li>2052: Simplified</li><li>1028: Traditional</li><li>1033: English</li></ul>
     * @param CaptchaLanguage <p>Language</p><p>Enumeration values:</p><ul><li>1: Self adaptive</li><li>2052: Simplified</li><li>1028: Traditional</li><li>1033: English</li></ul>
     */
    public void setCaptchaLanguage(String CaptchaLanguage) {
        this.CaptchaLanguage = CaptchaLanguage;
    }

    /**
     * Get <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p> 
     * @return VerifyRank <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     */
    public Long getVerifyRank() {
        return this.VerifyRank;
    }

    /**
     * Set <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     * @param VerifyRank <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     */
    public void setVerifyRank(Long VerifyRank) {
        this.VerifyRank = VerifyRank;
    }

    /**
     * Get <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario usage</li><li>android: For Android client usage</li><li>ios: For iOS client usage</li></ul> 
     * @return ChannelInfo <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario usage</li><li>android: For Android client usage</li><li>ios: For iOS client usage</li></ul>
     */
    public String getChannelInfo() {
        return this.ChannelInfo;
    }

    /**
     * Set <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario usage</li><li>android: For Android client usage</li><li>ios: For iOS client usage</li></ul>
     * @param ChannelInfo <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario usage</li><li>android: For Android client usage</li><li>ios: For iOS client usage</li></ul>
     */
    public void setChannelInfo(String ChannelInfo) {
        this.ChannelInfo = ChannelInfo;
    }

    /**
     * Get <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p> 
     * @return DefendMode <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p>
     */
    public String getDefendMode() {
        return this.DefendMode;
    }

    /**
     * Set <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p>
     * @param DefendMode <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p>
     */
    public void setDefendMode(String DefendMode) {
        this.DefendMode = DefendMode;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Whether to enable captchaAppid encryption</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul> 
     * @return CheckAppidSwitch <p>Whether to enable captchaAppid encryption</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul>
     */
    public Long getCheckAppidSwitch() {
        return this.CheckAppidSwitch;
    }

    /**
     * Set <p>Whether to enable captchaAppid encryption</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul>
     * @param CheckAppidSwitch <p>Whether to enable captchaAppid encryption</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul>
     */
    public void setCheckAppidSwitch(Long CheckAppidSwitch) {
        this.CheckAppidSwitch = CheckAppidSwitch;
    }

    /**
     * Get <p>Resource tag.</p> 
     * @return Tags <p>Resource tag.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Resource tag.</p>
     * @param Tags <p>Resource tag.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul> 
     * @return CheckIvSwitch <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public Long getCheckIvSwitch() {
        return this.CheckIvSwitch;
    }

    /**
     * Set <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     * @param CheckIvSwitch <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public void setCheckIvSwitch(Long CheckIvSwitch) {
        this.CheckIvSwitch = CheckIvSwitch;
    }

    /**
     * Get <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul> 
     * @return DisableInvisibleSwitch <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul>
     */
    public String getDisableInvisibleSwitch() {
        return this.DisableInvisibleSwitch;
    }

    /**
     * Set <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul>
     * @param DisableInvisibleSwitch <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul>
     */
    public void setDisableInvisibleSwitch(String DisableInvisibleSwitch) {
        this.DisableInvisibleSwitch = DisableInvisibleSwitch;
    }

    /**
     * Get <p>Web domain name</p><p>Valid only when ChannelInfo is web</p> 
     * @return VerifyDomain <p>Web domain name</p><p>Valid only when ChannelInfo is web</p>
     */
    public String getVerifyDomain() {
        return this.VerifyDomain;
    }

    /**
     * Set <p>Web domain name</p><p>Valid only when ChannelInfo is web</p>
     * @param VerifyDomain <p>Web domain name</p><p>Valid only when ChannelInfo is web</p>
     */
    public void setVerifyDomain(String VerifyDomain) {
        this.VerifyDomain = VerifyDomain;
    }

    /**
     * Get <p>app BundleId</p><p>Valid only when ChannelInfo is ios</p> 
     * @return VerifyBundleId <p>app BundleId</p><p>Valid only when ChannelInfo is ios</p>
     */
    public String getVerifyBundleId() {
        return this.VerifyBundleId;
    }

    /**
     * Set <p>app BundleId</p><p>Valid only when ChannelInfo is ios</p>
     * @param VerifyBundleId <p>app BundleId</p><p>Valid only when ChannelInfo is ios</p>
     */
    public void setVerifyBundleId(String VerifyBundleId) {
        this.VerifyBundleId = VerifyBundleId;
    }

    /**
     * Get <p>app package</p><p>Only valid when ChannelInfo is android</p> 
     * @return VerifyPackage <p>app package</p><p>Only valid when ChannelInfo is android</p>
     */
    public String getVerifyPackage() {
        return this.VerifyPackage;
    }

    /**
     * Set <p>app package</p><p>Only valid when ChannelInfo is android</p>
     * @param VerifyPackage <p>app package</p><p>Only valid when ChannelInfo is android</p>
     */
    public void setVerifyPackage(String VerifyPackage) {
        this.VerifyPackage = VerifyPackage;
    }

    /**
     * Get <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul> 
     * @return CheckBoxStyle <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul>
     */
    public String getCheckBoxStyle() {
        return this.CheckBoxStyle;
    }

    /**
     * Set <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul>
     * @param CheckBoxStyle <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul>
     */
    public void setCheckBoxStyle(String CheckBoxStyle) {
        this.CheckBoxStyle = CheckBoxStyle;
    }

    /**
     * Get <p>Customer type</p><p>Enumeration values:</p><ul><li>0: General user</li><li>1: waf</li><li>2: EO</li></ul> 
     * @return CustomerType <p>Customer type</p><p>Enumeration values:</p><ul><li>0: General user</li><li>1: waf</li><li>2: EO</li></ul>
     */
    public String getCustomerType() {
        return this.CustomerType;
    }

    /**
     * Set <p>Customer type</p><p>Enumeration values:</p><ul><li>0: General user</li><li>1: waf</li><li>2: EO</li></ul>
     * @param CustomerType <p>Customer type</p><p>Enumeration values:</p><ul><li>0: General user</li><li>1: waf</li><li>2: EO</li></ul>
     */
    public void setCustomerType(String CustomerType) {
        this.CustomerType = CustomerType;
    }

    public DescribeCaptchaConsoleSubDataInternational() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaConsoleSubDataInternational(DescribeCaptchaConsoleSubDataInternational source) {
        if (source.CaptchaAppId != null) {
            this.CaptchaAppId = new Long(source.CaptchaAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.EncryptKey != null) {
            this.EncryptKey = new String(source.EncryptKey);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.UserSetCapType != null) {
            this.UserSetCapType = new Long(source.UserSetCapType);
        }
        if (source.NoVerifyRule != null) {
            this.NoVerifyRule = new Long(source.NoVerifyRule);
        }
        if (source.CaptchaLanguage != null) {
            this.CaptchaLanguage = new String(source.CaptchaLanguage);
        }
        if (source.VerifyRank != null) {
            this.VerifyRank = new Long(source.VerifyRank);
        }
        if (source.ChannelInfo != null) {
            this.ChannelInfo = new String(source.ChannelInfo);
        }
        if (source.DefendMode != null) {
            this.DefendMode = new String(source.DefendMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CheckAppidSwitch != null) {
            this.CheckAppidSwitch = new Long(source.CheckAppidSwitch);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CheckIvSwitch != null) {
            this.CheckIvSwitch = new Long(source.CheckIvSwitch);
        }
        if (source.DisableInvisibleSwitch != null) {
            this.DisableInvisibleSwitch = new String(source.DisableInvisibleSwitch);
        }
        if (source.VerifyDomain != null) {
            this.VerifyDomain = new String(source.VerifyDomain);
        }
        if (source.VerifyBundleId != null) {
            this.VerifyBundleId = new String(source.VerifyBundleId);
        }
        if (source.VerifyPackage != null) {
            this.VerifyPackage = new String(source.VerifyPackage);
        }
        if (source.CheckBoxStyle != null) {
            this.CheckBoxStyle = new String(source.CheckBoxStyle);
        }
        if (source.CustomerType != null) {
            this.CustomerType = new String(source.CustomerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaAppId", this.CaptchaAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "UserSetCapType", this.UserSetCapType);
        this.setParamSimple(map, prefix + "NoVerifyRule", this.NoVerifyRule);
        this.setParamSimple(map, prefix + "CaptchaLanguage", this.CaptchaLanguage);
        this.setParamSimple(map, prefix + "VerifyRank", this.VerifyRank);
        this.setParamSimple(map, prefix + "ChannelInfo", this.ChannelInfo);
        this.setParamSimple(map, prefix + "DefendMode", this.DefendMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CheckAppidSwitch", this.CheckAppidSwitch);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CheckIvSwitch", this.CheckIvSwitch);
        this.setParamSimple(map, prefix + "DisableInvisibleSwitch", this.DisableInvisibleSwitch);
        this.setParamSimple(map, prefix + "VerifyDomain", this.VerifyDomain);
        this.setParamSimple(map, prefix + "VerifyBundleId", this.VerifyBundleId);
        this.setParamSimple(map, prefix + "VerifyPackage", this.VerifyPackage);
        this.setParamSimple(map, prefix + "CheckBoxStyle", this.CheckBoxStyle);
        this.setParamSimple(map, prefix + "CustomerType", this.CustomerType);

    }
}


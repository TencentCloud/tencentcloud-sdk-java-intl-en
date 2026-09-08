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

public class CreateCaptchaInfoInternationalRequest extends AbstractModel {

    /**
    * <p>Captcha name</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario</li><li>android: For Android client</li><li>ios: For iOS client</li></ul><p>Default value: web</p>
    */
    @SerializedName("ChannelInfo")
    @Expose
    private String ChannelInfo;

    /**
    * <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
    */
    @SerializedName("VerifyRank")
    @Expose
    private String VerifyRank;

    /**
    * <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Slide</li><li>8: Graphical</li><li>9: Voice</li></ul>
    */
    @SerializedName("UserSetCapType")
    @Expose
    private String UserSetCapType;

    /**
    * <p>Interception mode</p><p>Enumeration values:</p><ul><li>block: interception mode</li><li>notify: perception mode</li></ul><p>Default value: notify</p>
    */
    @SerializedName("DefendMode")
    @Expose
    private String DefendMode;

    /**
    * <p>Resource tag, key&amp;value format</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Verification mechanism</p><p>Enumeration values:</p><ul><li>0: One-Click Verification</li><li>1: Always verify</li><li>2: Invisible verification. DisableInvisibleSwitch input 2, UserSetCapType must be 1</li></ul>
    */
    @SerializedName("DisableInvisibleSwitch")
    @Expose
    private String DisableInvisibleSwitch;

    /**
    * <p>web domain name</p><p>Only valid when ChannelInfo is web</p>
    */
    @SerializedName("VerifyDomain")
    @Expose
    private String VerifyDomain;

    /**
    * <p>app BundleId</p><p>Only valid when ChannelInfo is ios</p>
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
    * <p>Whether to enable captcha encryption. 0: Off. 1: On</p>
    */
    @SerializedName("CheckAppidSwitch")
    @Expose
    private Long CheckAppidSwitch;

    /**
    * <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Input 1 is allowed only when CheckAppidSwitch is 1</p>
    */
    @SerializedName("CheckIvSwitch")
    @Expose
    private Long CheckIvSwitch;

    /**
    * <p>Checkbox display method</p><p>Enumeration values:</p><ul><li>0: simplified version</li><li>1: basic version</li><li>2: invisible version</li></ul>
    */
    @SerializedName("CheckBoxStyle")
    @Expose
    private String CheckBoxStyle;

    /**
     * Get <p>Captcha name</p> 
     * @return AppName <p>Captcha name</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Captcha name</p>
     * @param AppName <p>Captcha name</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario</li><li>android: For Android client</li><li>ios: For iOS client</li></ul><p>Default value: web</p> 
     * @return ChannelInfo <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario</li><li>android: For Android client</li><li>ios: For iOS client</li></ul><p>Default value: web</p>
     */
    public String getChannelInfo() {
        return this.ChannelInfo;
    }

    /**
     * Set <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario</li><li>android: For Android client</li><li>ios: For iOS client</li></ul><p>Default value: web</p>
     * @param ChannelInfo <p>Client type</p><p>Enumeration values:</p><ul><li>web: For web scenario</li><li>android: For Android client</li><li>ios: For iOS client</li></ul><p>Default value: web</p>
     */
    public void setChannelInfo(String ChannelInfo) {
        this.ChannelInfo = ChannelInfo;
    }

    /**
     * Get <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p> 
     * @return VerifyRank <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     */
    public String getVerifyRank() {
        return this.VerifyRank;
    }

    /**
     * Set <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     * @param VerifyRank <p>Verification level</p><p>Enumeration values:</p><ul><li>1: Experience-oriented</li><li>2: Balanced</li><li>3: Security-focused</li></ul><p>Default value: 1</p>
     */
    public void setVerifyRank(String VerifyRank) {
        this.VerifyRank = VerifyRank;
    }

    /**
     * Get <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Slide</li><li>8: Graphical</li><li>9: Voice</li></ul> 
     * @return UserSetCapType <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Slide</li><li>8: Graphical</li><li>9: Voice</li></ul>
     */
    public String getUserSetCapType() {
        return this.UserSetCapType;
    }

    /**
     * Set <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Slide</li><li>8: Graphical</li><li>9: Voice</li></ul>
     * @param UserSetCapType <p>Validation type</p><p>Enumeration values:</p><ul><li>1: Invisible verification. UserSetCapType input 1, DisableInvisibleSwitch must be 2</li><li>2: Slide</li><li>8: Graphical</li><li>9: Voice</li></ul>
     */
    public void setUserSetCapType(String UserSetCapType) {
        this.UserSetCapType = UserSetCapType;
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
     * Get <p>Resource tag, key&amp;value format</p> 
     * @return Tags <p>Resource tag, key&amp;value format</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Resource tag, key&amp;value format</p>
     * @param Tags <p>Resource tag, key&amp;value format</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
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
     * Get <p>web domain name</p><p>Only valid when ChannelInfo is web</p> 
     * @return VerifyDomain <p>web domain name</p><p>Only valid when ChannelInfo is web</p>
     */
    public String getVerifyDomain() {
        return this.VerifyDomain;
    }

    /**
     * Set <p>web domain name</p><p>Only valid when ChannelInfo is web</p>
     * @param VerifyDomain <p>web domain name</p><p>Only valid when ChannelInfo is web</p>
     */
    public void setVerifyDomain(String VerifyDomain) {
        this.VerifyDomain = VerifyDomain;
    }

    /**
     * Get <p>app BundleId</p><p>Only valid when ChannelInfo is ios</p> 
     * @return VerifyBundleId <p>app BundleId</p><p>Only valid when ChannelInfo is ios</p>
     */
    public String getVerifyBundleId() {
        return this.VerifyBundleId;
    }

    /**
     * Set <p>app BundleId</p><p>Only valid when ChannelInfo is ios</p>
     * @param VerifyBundleId <p>app BundleId</p><p>Only valid when ChannelInfo is ios</p>
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
     * Get <p>Whether to enable captcha encryption. 0: Off. 1: On</p> 
     * @return CheckAppidSwitch <p>Whether to enable captcha encryption. 0: Off. 1: On</p>
     */
    public Long getCheckAppidSwitch() {
        return this.CheckAppidSwitch;
    }

    /**
     * Set <p>Whether to enable captcha encryption. 0: Off. 1: On</p>
     * @param CheckAppidSwitch <p>Whether to enable captcha encryption. 0: Off. 1: On</p>
     */
    public void setCheckAppidSwitch(Long CheckAppidSwitch) {
        this.CheckAppidSwitch = CheckAppidSwitch;
    }

    /**
     * Get <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Input 1 is allowed only when CheckAppidSwitch is 1</p> 
     * @return CheckIvSwitch <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Input 1 is allowed only when CheckAppidSwitch is 1</p>
     */
    public Long getCheckIvSwitch() {
        return this.CheckIvSwitch;
    }

    /**
     * Set <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Input 1 is allowed only when CheckAppidSwitch is 1</p>
     * @param CheckIvSwitch <p>Whether to enable non-repeating IV</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Input 1 is allowed only when CheckAppidSwitch is 1</p>
     */
    public void setCheckIvSwitch(Long CheckIvSwitch) {
        this.CheckIvSwitch = CheckIvSwitch;
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

    public CreateCaptchaInfoInternationalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCaptchaInfoInternationalRequest(CreateCaptchaInfoInternationalRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ChannelInfo != null) {
            this.ChannelInfo = new String(source.ChannelInfo);
        }
        if (source.VerifyRank != null) {
            this.VerifyRank = new String(source.VerifyRank);
        }
        if (source.UserSetCapType != null) {
            this.UserSetCapType = new String(source.UserSetCapType);
        }
        if (source.DefendMode != null) {
            this.DefendMode = new String(source.DefendMode);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
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
        if (source.CheckAppidSwitch != null) {
            this.CheckAppidSwitch = new Long(source.CheckAppidSwitch);
        }
        if (source.CheckIvSwitch != null) {
            this.CheckIvSwitch = new Long(source.CheckIvSwitch);
        }
        if (source.CheckBoxStyle != null) {
            this.CheckBoxStyle = new String(source.CheckBoxStyle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ChannelInfo", this.ChannelInfo);
        this.setParamSimple(map, prefix + "VerifyRank", this.VerifyRank);
        this.setParamSimple(map, prefix + "UserSetCapType", this.UserSetCapType);
        this.setParamSimple(map, prefix + "DefendMode", this.DefendMode);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DisableInvisibleSwitch", this.DisableInvisibleSwitch);
        this.setParamSimple(map, prefix + "VerifyDomain", this.VerifyDomain);
        this.setParamSimple(map, prefix + "VerifyBundleId", this.VerifyBundleId);
        this.setParamSimple(map, prefix + "VerifyPackage", this.VerifyPackage);
        this.setParamSimple(map, prefix + "CheckAppidSwitch", this.CheckAppidSwitch);
        this.setParamSimple(map, prefix + "CheckIvSwitch", this.CheckIvSwitch);
        this.setParamSimple(map, prefix + "CheckBoxStyle", this.CheckBoxStyle);

    }
}


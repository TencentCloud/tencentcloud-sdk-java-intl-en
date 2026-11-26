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

public class ClientAttester extends AbstractModel {

    /**
    * <p>Authentication option ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Authentication option name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Authentication rule type. Returned only as an output parameter. Valid values:</p><li>PRESET: system preset rule. Only AttesterDuration can be modified;</li><li>CUSTOM: user-defined rule.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Authentication method. Valid values:</p><li>TC-RCE: Use risk identification RCE for authentication;</li><li>TC-CAPTCHA: Use Tencent Cloud CAPTCHA for authentication;</li><li>TC-EO-CAPTCHA: Use EdgeOne human-machine verification for authentication.</li>
    */
    @SerializedName("AttesterSource")
    @Expose
    private String AttesterSource;

    /**
    * <p>Authentication validity time. Default is 60s. Supported units:</p><li>s: second, value ranges from 60 to 43200;</li><li>m: minute, value ranges from 1 to 720;</li><li>h: hour, value ranges from 1 to 12.</li>
    */
    @SerializedName("AttesterDuration")
    @Expose
    private String AttesterDuration;

    /**
    * <p>Whether to enable usage limits on authentication results. </p><p>Enumeration values:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
    */
    @SerializedName("UsageLimit")
    @Expose
    private String UsageLimit;

    /**
    * <p>Maximum number of uses for the authentication result. This field is required when UsageLimit is on.</p><p>Value range: [1, 100000]</p>
    */
    @SerializedName("MaxUsageCount")
    @Expose
    private Long MaxUsageCount;

    /**
    * <p>Configuration message for TC-RCE certification.</p><li>This field is required when the AttesterSource parameter value is TC-RCE.</li>
    */
    @SerializedName("TCRCEOption")
    @Expose
    private TCRCEOption TCRCEOption;

    /**
    * <p>Configuration message for TC-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-CAPTCHA.</li>
    */
    @SerializedName("TCCaptchaOption")
    @Expose
    private TCCaptchaOption TCCaptchaOption;

    /**
    * <p>Configuration message for TC-EO-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-EO-CAPTCHA.</li>
    */
    @SerializedName("TCEOCaptchaOption")
    @Expose
    private TCEOCaptchaOption TCEOCaptchaOption;

    /**
     * Get <p>Authentication option ID.</p> 
     * @return Id <p>Authentication option ID.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Authentication option ID.</p>
     * @param Id <p>Authentication option ID.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Authentication option name.</p> 
     * @return Name <p>Authentication option name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Authentication option name.</p>
     * @param Name <p>Authentication option name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Authentication rule type. Returned only as an output parameter. Valid values:</p><li>PRESET: system preset rule. Only AttesterDuration can be modified;</li><li>CUSTOM: user-defined rule.</li> 
     * @return Type <p>Authentication rule type. Returned only as an output parameter. Valid values:</p><li>PRESET: system preset rule. Only AttesterDuration can be modified;</li><li>CUSTOM: user-defined rule.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Authentication rule type. Returned only as an output parameter. Valid values:</p><li>PRESET: system preset rule. Only AttesterDuration can be modified;</li><li>CUSTOM: user-defined rule.</li>
     * @param Type <p>Authentication rule type. Returned only as an output parameter. Valid values:</p><li>PRESET: system preset rule. Only AttesterDuration can be modified;</li><li>CUSTOM: user-defined rule.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Authentication method. Valid values:</p><li>TC-RCE: Use risk identification RCE for authentication;</li><li>TC-CAPTCHA: Use Tencent Cloud CAPTCHA for authentication;</li><li>TC-EO-CAPTCHA: Use EdgeOne human-machine verification for authentication.</li> 
     * @return AttesterSource <p>Authentication method. Valid values:</p><li>TC-RCE: Use risk identification RCE for authentication;</li><li>TC-CAPTCHA: Use Tencent Cloud CAPTCHA for authentication;</li><li>TC-EO-CAPTCHA: Use EdgeOne human-machine verification for authentication.</li>
     */
    public String getAttesterSource() {
        return this.AttesterSource;
    }

    /**
     * Set <p>Authentication method. Valid values:</p><li>TC-RCE: Use risk identification RCE for authentication;</li><li>TC-CAPTCHA: Use Tencent Cloud CAPTCHA for authentication;</li><li>TC-EO-CAPTCHA: Use EdgeOne human-machine verification for authentication.</li>
     * @param AttesterSource <p>Authentication method. Valid values:</p><li>TC-RCE: Use risk identification RCE for authentication;</li><li>TC-CAPTCHA: Use Tencent Cloud CAPTCHA for authentication;</li><li>TC-EO-CAPTCHA: Use EdgeOne human-machine verification for authentication.</li>
     */
    public void setAttesterSource(String AttesterSource) {
        this.AttesterSource = AttesterSource;
    }

    /**
     * Get <p>Authentication validity time. Default is 60s. Supported units:</p><li>s: second, value ranges from 60 to 43200;</li><li>m: minute, value ranges from 1 to 720;</li><li>h: hour, value ranges from 1 to 12.</li> 
     * @return AttesterDuration <p>Authentication validity time. Default is 60s. Supported units:</p><li>s: second, value ranges from 60 to 43200;</li><li>m: minute, value ranges from 1 to 720;</li><li>h: hour, value ranges from 1 to 12.</li>
     */
    public String getAttesterDuration() {
        return this.AttesterDuration;
    }

    /**
     * Set <p>Authentication validity time. Default is 60s. Supported units:</p><li>s: second, value ranges from 60 to 43200;</li><li>m: minute, value ranges from 1 to 720;</li><li>h: hour, value ranges from 1 to 12.</li>
     * @param AttesterDuration <p>Authentication validity time. Default is 60s. Supported units:</p><li>s: second, value ranges from 60 to 43200;</li><li>m: minute, value ranges from 1 to 720;</li><li>h: hour, value ranges from 1 to 12.</li>
     */
    public void setAttesterDuration(String AttesterDuration) {
        this.AttesterDuration = AttesterDuration;
    }

    /**
     * Get <p>Whether to enable usage limits on authentication results. </p><p>Enumeration values:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p> 
     * @return UsageLimit <p>Whether to enable usage limits on authentication results. </p><p>Enumeration values:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     */
    public String getUsageLimit() {
        return this.UsageLimit;
    }

    /**
     * Set <p>Whether to enable usage limits on authentication results. </p><p>Enumeration values:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     * @param UsageLimit <p>Whether to enable usage limits on authentication results. </p><p>Enumeration values:</p><ul><li>on: Enable</li><li>off: Disable</li></ul><p>Default value: off</p>
     */
    public void setUsageLimit(String UsageLimit) {
        this.UsageLimit = UsageLimit;
    }

    /**
     * Get <p>Maximum number of uses for the authentication result. This field is required when UsageLimit is on.</p><p>Value range: [1, 100000]</p> 
     * @return MaxUsageCount <p>Maximum number of uses for the authentication result. This field is required when UsageLimit is on.</p><p>Value range: [1, 100000]</p>
     */
    public Long getMaxUsageCount() {
        return this.MaxUsageCount;
    }

    /**
     * Set <p>Maximum number of uses for the authentication result. This field is required when UsageLimit is on.</p><p>Value range: [1, 100000]</p>
     * @param MaxUsageCount <p>Maximum number of uses for the authentication result. This field is required when UsageLimit is on.</p><p>Value range: [1, 100000]</p>
     */
    public void setMaxUsageCount(Long MaxUsageCount) {
        this.MaxUsageCount = MaxUsageCount;
    }

    /**
     * Get <p>Configuration message for TC-RCE certification.</p><li>This field is required when the AttesterSource parameter value is TC-RCE.</li> 
     * @return TCRCEOption <p>Configuration message for TC-RCE certification.</p><li>This field is required when the AttesterSource parameter value is TC-RCE.</li>
     */
    public TCRCEOption getTCRCEOption() {
        return this.TCRCEOption;
    }

    /**
     * Set <p>Configuration message for TC-RCE certification.</p><li>This field is required when the AttesterSource parameter value is TC-RCE.</li>
     * @param TCRCEOption <p>Configuration message for TC-RCE certification.</p><li>This field is required when the AttesterSource parameter value is TC-RCE.</li>
     */
    public void setTCRCEOption(TCRCEOption TCRCEOption) {
        this.TCRCEOption = TCRCEOption;
    }

    /**
     * Get <p>Configuration message for TC-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-CAPTCHA.</li> 
     * @return TCCaptchaOption <p>Configuration message for TC-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-CAPTCHA.</li>
     */
    public TCCaptchaOption getTCCaptchaOption() {
        return this.TCCaptchaOption;
    }

    /**
     * Set <p>Configuration message for TC-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-CAPTCHA.</li>
     * @param TCCaptchaOption <p>Configuration message for TC-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-CAPTCHA.</li>
     */
    public void setTCCaptchaOption(TCCaptchaOption TCCaptchaOption) {
        this.TCCaptchaOption = TCCaptchaOption;
    }

    /**
     * Get <p>Configuration message for TC-EO-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-EO-CAPTCHA.</li> 
     * @return TCEOCaptchaOption <p>Configuration message for TC-EO-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-EO-CAPTCHA.</li>
     */
    public TCEOCaptchaOption getTCEOCaptchaOption() {
        return this.TCEOCaptchaOption;
    }

    /**
     * Set <p>Configuration message for TC-EO-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-EO-CAPTCHA.</li>
     * @param TCEOCaptchaOption <p>Configuration message for TC-EO-CAPTCHA authentication.</p><li>Required when the AttesterSource parameter value is TC-EO-CAPTCHA.</li>
     */
    public void setTCEOCaptchaOption(TCEOCaptchaOption TCEOCaptchaOption) {
        this.TCEOCaptchaOption = TCEOCaptchaOption;
    }

    public ClientAttester() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttester(ClientAttester source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AttesterSource != null) {
            this.AttesterSource = new String(source.AttesterSource);
        }
        if (source.AttesterDuration != null) {
            this.AttesterDuration = new String(source.AttesterDuration);
        }
        if (source.UsageLimit != null) {
            this.UsageLimit = new String(source.UsageLimit);
        }
        if (source.MaxUsageCount != null) {
            this.MaxUsageCount = new Long(source.MaxUsageCount);
        }
        if (source.TCRCEOption != null) {
            this.TCRCEOption = new TCRCEOption(source.TCRCEOption);
        }
        if (source.TCCaptchaOption != null) {
            this.TCCaptchaOption = new TCCaptchaOption(source.TCCaptchaOption);
        }
        if (source.TCEOCaptchaOption != null) {
            this.TCEOCaptchaOption = new TCEOCaptchaOption(source.TCEOCaptchaOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AttesterSource", this.AttesterSource);
        this.setParamSimple(map, prefix + "AttesterDuration", this.AttesterDuration);
        this.setParamSimple(map, prefix + "UsageLimit", this.UsageLimit);
        this.setParamSimple(map, prefix + "MaxUsageCount", this.MaxUsageCount);
        this.setParamObj(map, prefix + "TCRCEOption.", this.TCRCEOption);
        this.setParamObj(map, prefix + "TCCaptchaOption.", this.TCCaptchaOption);
        this.setParamObj(map, prefix + "TCEOCaptchaOption.", this.TCEOCaptchaOption);

    }
}


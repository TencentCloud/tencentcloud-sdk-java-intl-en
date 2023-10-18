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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeB extends AbstractModel {

    /**
    * Alpha key name
    */
    @SerializedName("KeyAlpha")
    @Expose
    private String KeyAlpha;

    /**
    * Beta key name
    */
    @SerializedName("KeyBeta")
    @Expose
    private String KeyBeta;

    /**
    * Gamma key name
    */
    @SerializedName("KeyGamma")
    @Expose
    private String KeyGamma;

    /**
    * Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * Expiration time in seconds
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Time format. Valid values: dec (decimal), hex (hexadecimal).
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Status code returned when the authentication failed
    */
    @SerializedName("FailCode")
    @Expose
    private Long FailCode;

    /**
    * Status code returned when the URL expired
    */
    @SerializedName("ExpireCode")
    @Expose
    private Long ExpireCode;

    /**
    * List of URLs to be authenticated
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get Alpha key name 
     * @return KeyAlpha Alpha key name
     */
    public String getKeyAlpha() {
        return this.KeyAlpha;
    }

    /**
     * Set Alpha key name
     * @param KeyAlpha Alpha key name
     */
    public void setKeyAlpha(String KeyAlpha) {
        this.KeyAlpha = KeyAlpha;
    }

    /**
     * Get Beta key name 
     * @return KeyBeta Beta key name
     */
    public String getKeyBeta() {
        return this.KeyBeta;
    }

    /**
     * Set Beta key name
     * @param KeyBeta Beta key name
     */
    public void setKeyBeta(String KeyBeta) {
        this.KeyBeta = KeyBeta;
    }

    /**
     * Get Gamma key name 
     * @return KeyGamma Gamma key name
     */
    public String getKeyGamma() {
        return this.KeyGamma;
    }

    /**
     * Set Gamma key name
     * @param KeyGamma Gamma key name
     */
    public void setKeyGamma(String KeyGamma) {
        this.KeyGamma = KeyGamma;
    }

    /**
     * Get Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores. 
     * @return SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     * @param SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores. 
     * @return TimeParam Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     * @param TimeParam Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get Expiration time in seconds 
     * @return ExpireTime Expiration time in seconds
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time in seconds
     * @param ExpireTime Expiration time in seconds
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Time format. Valid values: dec (decimal), hex (hexadecimal). 
     * @return TimeFormat Time format. Valid values: dec (decimal), hex (hexadecimal).
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time format. Valid values: dec (decimal), hex (hexadecimal).
     * @param TimeFormat Time format. Valid values: dec (decimal), hex (hexadecimal).
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Status code returned when the authentication failed 
     * @return FailCode Status code returned when the authentication failed
     */
    public Long getFailCode() {
        return this.FailCode;
    }

    /**
     * Set Status code returned when the authentication failed
     * @param FailCode Status code returned when the authentication failed
     */
    public void setFailCode(Long FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get Status code returned when the URL expired 
     * @return ExpireCode Status code returned when the URL expired
     */
    public Long getExpireCode() {
        return this.ExpireCode;
    }

    /**
     * Set Status code returned when the URL expired
     * @param ExpireCode Status code returned when the URL expired
     */
    public void setExpireCode(Long ExpireCode) {
        this.ExpireCode = ExpireCode;
    }

    /**
     * Get List of URLs to be authenticated 
     * @return RulePaths List of URLs to be authenticated
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set List of URLs to be authenticated
     * @param RulePaths List of URLs to be authenticated
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    public AdvancedAuthenticationTypeB() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeB(AdvancedAuthenticationTypeB source) {
        if (source.KeyAlpha != null) {
            this.KeyAlpha = new String(source.KeyAlpha);
        }
        if (source.KeyBeta != null) {
            this.KeyBeta = new String(source.KeyBeta);
        }
        if (source.KeyGamma != null) {
            this.KeyGamma = new String(source.KeyGamma);
        }
        if (source.SignParam != null) {
            this.SignParam = new String(source.SignParam);
        }
        if (source.TimeParam != null) {
            this.TimeParam = new String(source.TimeParam);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.FailCode != null) {
            this.FailCode = new Long(source.FailCode);
        }
        if (source.ExpireCode != null) {
            this.ExpireCode = new Long(source.ExpireCode);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyAlpha", this.KeyAlpha);
        this.setParamSimple(map, prefix + "KeyBeta", this.KeyBeta);
        this.setParamSimple(map, prefix + "KeyGamma", this.KeyGamma);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "ExpireCode", this.ExpireCode);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}


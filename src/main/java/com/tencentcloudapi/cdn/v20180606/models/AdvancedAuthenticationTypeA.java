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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeA extends AbstractModel{

    /**
    * Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

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
    * Whether the expiration time parameter is required
    */
    @SerializedName("ExpireTimeRequired")
    @Expose
    private Boolean ExpireTimeRequired;

    /**
    * URL composition, e.g., `${private_key}${schema}${host}${full_uri}`.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

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
    * Reserved field
    */
    @SerializedName("Transformation")
    @Expose
    private Long Transformation;

    /**
     * Get Key used for signature calculation, allowing 6 to 32 bytes of letters and digits. 
     * @return SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     * @param SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
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
     * Get Whether the expiration time parameter is required 
     * @return ExpireTimeRequired Whether the expiration time parameter is required
     */
    public Boolean getExpireTimeRequired() {
        return this.ExpireTimeRequired;
    }

    /**
     * Set Whether the expiration time parameter is required
     * @param ExpireTimeRequired Whether the expiration time parameter is required
     */
    public void setExpireTimeRequired(Boolean ExpireTimeRequired) {
        this.ExpireTimeRequired = ExpireTimeRequired;
    }

    /**
     * Get URL composition, e.g., `${private_key}${schema}${host}${full_uri}`. 
     * @return Format URL composition, e.g., `${private_key}${schema}${host}${full_uri}`.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set URL composition, e.g., `${private_key}${schema}${host}${full_uri}`.
     * @param Format URL composition, e.g., `${private_key}${schema}${host}${full_uri}`.
     */
    public void setFormat(String Format) {
        this.Format = Format;
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

    /**
     * Get Reserved field 
     * @return Transformation Reserved field
     */
    public Long getTransformation() {
        return this.Transformation;
    }

    /**
     * Set Reserved field
     * @param Transformation Reserved field
     */
    public void setTransformation(Long Transformation) {
        this.Transformation = Transformation;
    }

    public AdvancedAuthenticationTypeA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeA(AdvancedAuthenticationTypeA source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
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
        if (source.ExpireTimeRequired != null) {
            this.ExpireTimeRequired = new Boolean(source.ExpireTimeRequired);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
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
        if (source.Transformation != null) {
            this.Transformation = new Long(source.Transformation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExpireTimeRequired", this.ExpireTimeRequired);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "ExpireCode", this.ExpireCode);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "Transformation", this.Transformation);

    }
}


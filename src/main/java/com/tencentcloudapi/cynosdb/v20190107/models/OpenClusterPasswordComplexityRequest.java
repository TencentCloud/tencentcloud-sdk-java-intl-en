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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenClusterPasswordComplexityRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Password length
    */
    @SerializedName("ValidatePasswordLength")
    @Expose
    private Long ValidatePasswordLength;

    /**
    * Number of letters
    */
    @SerializedName("ValidatePasswordMixedCaseCount")
    @Expose
    private Long ValidatePasswordMixedCaseCount;

    /**
    * Number of symbols
    */
    @SerializedName("ValidatePasswordSpecialCharCount")
    @Expose
    private Long ValidatePasswordSpecialCharCount;

    /**
    * Number of digits
    */
    @SerializedName("ValidatePasswordNumberCount")
    @Expose
    private Long ValidatePasswordNumberCount;

    /**
    * Password strength. Valid values: `MEDIUM`, `STRONG`.
    */
    @SerializedName("ValidatePasswordPolicy")
    @Expose
    private String ValidatePasswordPolicy;

    /**
    * Data dictionary
    */
    @SerializedName("ValidatePasswordDictionary")
    @Expose
    private String [] ValidatePasswordDictionary;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Password length 
     * @return ValidatePasswordLength Password length
     */
    public Long getValidatePasswordLength() {
        return this.ValidatePasswordLength;
    }

    /**
     * Set Password length
     * @param ValidatePasswordLength Password length
     */
    public void setValidatePasswordLength(Long ValidatePasswordLength) {
        this.ValidatePasswordLength = ValidatePasswordLength;
    }

    /**
     * Get Number of letters 
     * @return ValidatePasswordMixedCaseCount Number of letters
     */
    public Long getValidatePasswordMixedCaseCount() {
        return this.ValidatePasswordMixedCaseCount;
    }

    /**
     * Set Number of letters
     * @param ValidatePasswordMixedCaseCount Number of letters
     */
    public void setValidatePasswordMixedCaseCount(Long ValidatePasswordMixedCaseCount) {
        this.ValidatePasswordMixedCaseCount = ValidatePasswordMixedCaseCount;
    }

    /**
     * Get Number of symbols 
     * @return ValidatePasswordSpecialCharCount Number of symbols
     */
    public Long getValidatePasswordSpecialCharCount() {
        return this.ValidatePasswordSpecialCharCount;
    }

    /**
     * Set Number of symbols
     * @param ValidatePasswordSpecialCharCount Number of symbols
     */
    public void setValidatePasswordSpecialCharCount(Long ValidatePasswordSpecialCharCount) {
        this.ValidatePasswordSpecialCharCount = ValidatePasswordSpecialCharCount;
    }

    /**
     * Get Number of digits 
     * @return ValidatePasswordNumberCount Number of digits
     */
    public Long getValidatePasswordNumberCount() {
        return this.ValidatePasswordNumberCount;
    }

    /**
     * Set Number of digits
     * @param ValidatePasswordNumberCount Number of digits
     */
    public void setValidatePasswordNumberCount(Long ValidatePasswordNumberCount) {
        this.ValidatePasswordNumberCount = ValidatePasswordNumberCount;
    }

    /**
     * Get Password strength. Valid values: `MEDIUM`, `STRONG`. 
     * @return ValidatePasswordPolicy Password strength. Valid values: `MEDIUM`, `STRONG`.
     */
    public String getValidatePasswordPolicy() {
        return this.ValidatePasswordPolicy;
    }

    /**
     * Set Password strength. Valid values: `MEDIUM`, `STRONG`.
     * @param ValidatePasswordPolicy Password strength. Valid values: `MEDIUM`, `STRONG`.
     */
    public void setValidatePasswordPolicy(String ValidatePasswordPolicy) {
        this.ValidatePasswordPolicy = ValidatePasswordPolicy;
    }

    /**
     * Get Data dictionary 
     * @return ValidatePasswordDictionary Data dictionary
     */
    public String [] getValidatePasswordDictionary() {
        return this.ValidatePasswordDictionary;
    }

    /**
     * Set Data dictionary
     * @param ValidatePasswordDictionary Data dictionary
     */
    public void setValidatePasswordDictionary(String [] ValidatePasswordDictionary) {
        this.ValidatePasswordDictionary = ValidatePasswordDictionary;
    }

    public OpenClusterPasswordComplexityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClusterPasswordComplexityRequest(OpenClusterPasswordComplexityRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ValidatePasswordLength != null) {
            this.ValidatePasswordLength = new Long(source.ValidatePasswordLength);
        }
        if (source.ValidatePasswordMixedCaseCount != null) {
            this.ValidatePasswordMixedCaseCount = new Long(source.ValidatePasswordMixedCaseCount);
        }
        if (source.ValidatePasswordSpecialCharCount != null) {
            this.ValidatePasswordSpecialCharCount = new Long(source.ValidatePasswordSpecialCharCount);
        }
        if (source.ValidatePasswordNumberCount != null) {
            this.ValidatePasswordNumberCount = new Long(source.ValidatePasswordNumberCount);
        }
        if (source.ValidatePasswordPolicy != null) {
            this.ValidatePasswordPolicy = new String(source.ValidatePasswordPolicy);
        }
        if (source.ValidatePasswordDictionary != null) {
            this.ValidatePasswordDictionary = new String[source.ValidatePasswordDictionary.length];
            for (int i = 0; i < source.ValidatePasswordDictionary.length; i++) {
                this.ValidatePasswordDictionary[i] = new String(source.ValidatePasswordDictionary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ValidatePasswordLength", this.ValidatePasswordLength);
        this.setParamSimple(map, prefix + "ValidatePasswordMixedCaseCount", this.ValidatePasswordMixedCaseCount);
        this.setParamSimple(map, prefix + "ValidatePasswordSpecialCharCount", this.ValidatePasswordSpecialCharCount);
        this.setParamSimple(map, prefix + "ValidatePasswordNumberCount", this.ValidatePasswordNumberCount);
        this.setParamSimple(map, prefix + "ValidatePasswordPolicy", this.ValidatePasswordPolicy);
        this.setParamArraySimple(map, prefix + "ValidatePasswordDictionary.", this.ValidatePasswordDictionary);

    }
}


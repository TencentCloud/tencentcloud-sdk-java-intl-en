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

public class DescribeClusterPasswordComplexityResponse extends AbstractModel{

    /**
    * Data dictionary parameter Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordDictionary")
    @Expose
    private ParamInfo ValidatePasswordDictionary;

    /**
    * The length of the password Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordLength")
    @Expose
    private ParamInfo ValidatePasswordLength;

    /**
    * Number of case-sensitive characters Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordMixedCaseCount")
    @Expose
    private ParamInfo ValidatePasswordMixedCaseCount;

    /**
    * Number of digits Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordNumberCount")
    @Expose
    private ParamInfo ValidatePasswordNumberCount;

    /**
    * Password level Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordPolicy")
    @Expose
    private ParamInfo ValidatePasswordPolicy;

    /**
    * Number of symbols Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidatePasswordSpecialCharCount")
    @Expose
    private ParamInfo ValidatePasswordSpecialCharCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data dictionary parameter Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordDictionary Data dictionary parameter Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordDictionary() {
        return this.ValidatePasswordDictionary;
    }

    /**
     * Set Data dictionary parameter Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordDictionary Data dictionary parameter Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordDictionary(ParamInfo ValidatePasswordDictionary) {
        this.ValidatePasswordDictionary = ValidatePasswordDictionary;
    }

    /**
     * Get The length of the password Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordLength The length of the password Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordLength() {
        return this.ValidatePasswordLength;
    }

    /**
     * Set The length of the password Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordLength The length of the password Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordLength(ParamInfo ValidatePasswordLength) {
        this.ValidatePasswordLength = ValidatePasswordLength;
    }

    /**
     * Get Number of case-sensitive characters Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordMixedCaseCount Number of case-sensitive characters Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordMixedCaseCount() {
        return this.ValidatePasswordMixedCaseCount;
    }

    /**
     * Set Number of case-sensitive characters Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordMixedCaseCount Number of case-sensitive characters Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordMixedCaseCount(ParamInfo ValidatePasswordMixedCaseCount) {
        this.ValidatePasswordMixedCaseCount = ValidatePasswordMixedCaseCount;
    }

    /**
     * Get Number of digits Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordNumberCount Number of digits Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordNumberCount() {
        return this.ValidatePasswordNumberCount;
    }

    /**
     * Set Number of digits Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordNumberCount Number of digits Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordNumberCount(ParamInfo ValidatePasswordNumberCount) {
        this.ValidatePasswordNumberCount = ValidatePasswordNumberCount;
    }

    /**
     * Get Password level Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordPolicy Password level Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordPolicy() {
        return this.ValidatePasswordPolicy;
    }

    /**
     * Set Password level Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordPolicy Password level Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordPolicy(ParamInfo ValidatePasswordPolicy) {
        this.ValidatePasswordPolicy = ValidatePasswordPolicy;
    }

    /**
     * Get Number of symbols Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidatePasswordSpecialCharCount Number of symbols Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo getValidatePasswordSpecialCharCount() {
        return this.ValidatePasswordSpecialCharCount;
    }

    /**
     * Set Number of symbols Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidatePasswordSpecialCharCount Number of symbols Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidatePasswordSpecialCharCount(ParamInfo ValidatePasswordSpecialCharCount) {
        this.ValidatePasswordSpecialCharCount = ValidatePasswordSpecialCharCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterPasswordComplexityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPasswordComplexityResponse(DescribeClusterPasswordComplexityResponse source) {
        if (source.ValidatePasswordDictionary != null) {
            this.ValidatePasswordDictionary = new ParamInfo(source.ValidatePasswordDictionary);
        }
        if (source.ValidatePasswordLength != null) {
            this.ValidatePasswordLength = new ParamInfo(source.ValidatePasswordLength);
        }
        if (source.ValidatePasswordMixedCaseCount != null) {
            this.ValidatePasswordMixedCaseCount = new ParamInfo(source.ValidatePasswordMixedCaseCount);
        }
        if (source.ValidatePasswordNumberCount != null) {
            this.ValidatePasswordNumberCount = new ParamInfo(source.ValidatePasswordNumberCount);
        }
        if (source.ValidatePasswordPolicy != null) {
            this.ValidatePasswordPolicy = new ParamInfo(source.ValidatePasswordPolicy);
        }
        if (source.ValidatePasswordSpecialCharCount != null) {
            this.ValidatePasswordSpecialCharCount = new ParamInfo(source.ValidatePasswordSpecialCharCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ValidatePasswordDictionary.", this.ValidatePasswordDictionary);
        this.setParamObj(map, prefix + "ValidatePasswordLength.", this.ValidatePasswordLength);
        this.setParamObj(map, prefix + "ValidatePasswordMixedCaseCount.", this.ValidatePasswordMixedCaseCount);
        this.setParamObj(map, prefix + "ValidatePasswordNumberCount.", this.ValidatePasswordNumberCount);
        this.setParamObj(map, prefix + "ValidatePasswordPolicy.", this.ValidatePasswordPolicy);
        this.setParamObj(map, prefix + "ValidatePasswordSpecialCharCount.", this.ValidatePasswordSpecialCharCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorInfo extends AbstractModel {

    /**
    * Error description field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorTip")
    @Expose
    private String ErrorTip;

    /**
    * Original exception message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Error level field.
ERROR
WARN
INFO
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorLevel")
    @Expose
    private String ErrorLevel;

    /**
    * Documentation link.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocLink")
    @Expose
    private String DocLink;

    /**
    * Quick start guide.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FAQ")
    @Expose
    private String FAQ;

    /**
    * Reserved field 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReservedField")
    @Expose
    private String ReservedField;

    /**
     * Get Error description field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorTip Error description field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorTip() {
        return this.ErrorTip;
    }

    /**
     * Set Error description field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorTip Error description field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorTip(String ErrorTip) {
        this.ErrorTip = ErrorTip;
    }

    /**
     * Get Original exception message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Original exception message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Original exception message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Original exception message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Error level field.
ERROR
WARN
INFO
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorLevel Error level field.
ERROR
WARN
INFO
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorLevel() {
        return this.ErrorLevel;
    }

    /**
     * Set Error level field.
ERROR
WARN
INFO
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorLevel Error level field.
ERROR
WARN
INFO
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorLevel(String ErrorLevel) {
        this.ErrorLevel = ErrorLevel;
    }

    /**
     * Get Documentation link.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocLink Documentation link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocLink() {
        return this.DocLink;
    }

    /**
     * Set Documentation link.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocLink Documentation link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocLink(String DocLink) {
        this.DocLink = DocLink;
    }

    /**
     * Get Quick start guide.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FAQ Quick start guide.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFAQ() {
        return this.FAQ;
    }

    /**
     * Set Quick start guide.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FAQ Quick start guide.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFAQ(String FAQ) {
        this.FAQ = FAQ;
    }

    /**
     * Get Reserved field 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReservedField Reserved field 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReservedField() {
        return this.ReservedField;
    }

    /**
     * Set Reserved field 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReservedField Reserved field 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReservedField(String ReservedField) {
        this.ReservedField = ReservedField;
    }

    public ErrorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorInfo(ErrorInfo source) {
        if (source.ErrorTip != null) {
            this.ErrorTip = new String(source.ErrorTip);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ErrorLevel != null) {
            this.ErrorLevel = new String(source.ErrorLevel);
        }
        if (source.DocLink != null) {
            this.DocLink = new String(source.DocLink);
        }
        if (source.FAQ != null) {
            this.FAQ = new String(source.FAQ);
        }
        if (source.ReservedField != null) {
            this.ReservedField = new String(source.ReservedField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorTip", this.ErrorTip);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ErrorLevel", this.ErrorLevel);
        this.setParamSimple(map, prefix + "DocLink", this.DocLink);
        this.setParamSimple(map, prefix + "FAQ", this.FAQ);
        this.setParamSimple(map, prefix + "ReservedField", this.ReservedField);

    }
}


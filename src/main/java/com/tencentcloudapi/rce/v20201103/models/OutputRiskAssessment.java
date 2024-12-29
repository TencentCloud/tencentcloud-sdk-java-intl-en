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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRiskAssessment extends AbstractModel {

    /**
    * Return code.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Returned information

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Business details.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Value")
    @Expose
    private OutputRiskAssessmentInfo Value;

    /**
    * Request ID.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UUid")
    @Expose
    private String UUid;

    /**
     * Get Return code.
Note: This field may return null, indicating that no valid value is found. 
     * @return Code Return code.
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Return code.
Note: This field may return null, indicating that no valid value is found.
     * @param Code Return code.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Returned information

Note: This field may return null, indicating that no valid value is found. 
     * @return Message Returned information

Note: This field may return null, indicating that no valid value is found.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Returned information

Note: This field may return null, indicating that no valid value is found.
     * @param Message Returned information

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Business details.
Note: This field may return null, indicating that no valid value is found. 
     * @return Value Business details.
Note: This field may return null, indicating that no valid value is found.
     */
    public OutputRiskAssessmentInfo getValue() {
        return this.Value;
    }

    /**
     * Set Business details.
Note: This field may return null, indicating that no valid value is found.
     * @param Value Business details.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setValue(OutputRiskAssessmentInfo Value) {
        this.Value = Value;
    }

    /**
     * Get Request ID.
Note: This field may return null, indicating that no valid value is found. 
     * @return UUid Request ID.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getUUid() {
        return this.UUid;
    }

    /**
     * Set Request ID.
Note: This field may return null, indicating that no valid value is found.
     * @param UUid Request ID.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setUUid(String UUid) {
        this.UUid = UUid;
    }

    public OutputRiskAssessment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRiskAssessment(OutputRiskAssessment source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new OutputRiskAssessmentInfo(source.Value);
        }
        if (source.UUid != null) {
            this.UUid = new String(source.UUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "UUid", this.UUid);

    }
}


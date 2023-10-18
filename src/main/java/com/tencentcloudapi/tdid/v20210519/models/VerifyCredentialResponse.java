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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyCredentialResponse extends AbstractModel {

    /**
    * Whether the verification is successful.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * The verification code.
    */
    @SerializedName("VerifyCode")
    @Expose
    private Long VerifyCode;

    /**
    * The verification message.
    */
    @SerializedName("VerifyMessage")
    @Expose
    private String VerifyMessage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the verification is successful. 
     * @return Result Whether the verification is successful.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Whether the verification is successful.
     * @param Result Whether the verification is successful.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get The verification code. 
     * @return VerifyCode The verification code.
     */
    public Long getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set The verification code.
     * @param VerifyCode The verification code.
     */
    public void setVerifyCode(Long VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get The verification message. 
     * @return VerifyMessage The verification message.
     */
    public String getVerifyMessage() {
        return this.VerifyMessage;
    }

    /**
     * Set The verification message.
     * @param VerifyMessage The verification message.
     */
    public void setVerifyMessage(String VerifyMessage) {
        this.VerifyMessage = VerifyMessage;
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

    public VerifyCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyCredentialResponse(VerifyCredentialResponse source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new Long(source.VerifyCode);
        }
        if (source.VerifyMessage != null) {
            this.VerifyMessage = new String(source.VerifyMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "VerifyMessage", this.VerifyMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


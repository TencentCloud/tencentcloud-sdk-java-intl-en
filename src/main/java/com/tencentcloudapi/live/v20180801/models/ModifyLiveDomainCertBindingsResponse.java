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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainCertBindingsResponse extends AbstractModel {

    /**
    * The domains skipped due to certificate mismatch.
    */
    @SerializedName("MismatchedDomainNames")
    @Expose
    private String [] MismatchedDomainNames;

    /**
    * The domains that the API failed to bind, including those in `MismatchedDomainNames`, and the error information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private BatchDomainOperateErrors [] Errors;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The domains skipped due to certificate mismatch. 
     * @return MismatchedDomainNames The domains skipped due to certificate mismatch.
     */
    public String [] getMismatchedDomainNames() {
        return this.MismatchedDomainNames;
    }

    /**
     * Set The domains skipped due to certificate mismatch.
     * @param MismatchedDomainNames The domains skipped due to certificate mismatch.
     */
    public void setMismatchedDomainNames(String [] MismatchedDomainNames) {
        this.MismatchedDomainNames = MismatchedDomainNames;
    }

    /**
     * Get The domains that the API failed to bind, including those in `MismatchedDomainNames`, and the error information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors The domains that the API failed to bind, including those in `MismatchedDomainNames`, and the error information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BatchDomainOperateErrors [] getErrors() {
        return this.Errors;
    }

    /**
     * Set The domains that the API failed to bind, including those in `MismatchedDomainNames`, and the error information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Errors The domains that the API failed to bind, including those in `MismatchedDomainNames`, and the error information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(BatchDomainOperateErrors [] Errors) {
        this.Errors = Errors;
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

    public ModifyLiveDomainCertBindingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainCertBindingsResponse(ModifyLiveDomainCertBindingsResponse source) {
        if (source.MismatchedDomainNames != null) {
            this.MismatchedDomainNames = new String[source.MismatchedDomainNames.length];
            for (int i = 0; i < source.MismatchedDomainNames.length; i++) {
                this.MismatchedDomainNames[i] = new String(source.MismatchedDomainNames[i]);
            }
        }
        if (source.Errors != null) {
            this.Errors = new BatchDomainOperateErrors[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new BatchDomainOperateErrors(source.Errors[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MismatchedDomainNames.", this.MismatchedDomainNames);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


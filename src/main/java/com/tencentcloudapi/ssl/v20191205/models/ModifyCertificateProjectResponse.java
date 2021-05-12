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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCertificateProjectResponse extends AbstractModel{

    /**
    * List of certificates whose projects were modified successfully
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuccessCertificates")
    @Expose
    private String [] SuccessCertificates;

    /**
    * List of certificates whose projects failed to be modified
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailCertificates")
    @Expose
    private String [] FailCertificates;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of certificates whose projects were modified successfully
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SuccessCertificates List of certificates whose projects were modified successfully
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSuccessCertificates() {
        return this.SuccessCertificates;
    }

    /**
     * Set List of certificates whose projects were modified successfully
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SuccessCertificates List of certificates whose projects were modified successfully
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuccessCertificates(String [] SuccessCertificates) {
        this.SuccessCertificates = SuccessCertificates;
    }

    /**
     * Get List of certificates whose projects failed to be modified
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FailCertificates List of certificates whose projects failed to be modified
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFailCertificates() {
        return this.FailCertificates;
    }

    /**
     * Set List of certificates whose projects failed to be modified
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FailCertificates List of certificates whose projects failed to be modified
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFailCertificates(String [] FailCertificates) {
        this.FailCertificates = FailCertificates;
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

    public ModifyCertificateProjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCertificateProjectResponse(ModifyCertificateProjectResponse source) {
        if (source.SuccessCertificates != null) {
            this.SuccessCertificates = new String[source.SuccessCertificates.length];
            for (int i = 0; i < source.SuccessCertificates.length; i++) {
                this.SuccessCertificates[i] = new String(source.SuccessCertificates[i]);
            }
        }
        if (source.FailCertificates != null) {
            this.FailCertificates = new String[source.FailCertificates.length];
            for (int i = 0; i < source.FailCertificates.length; i++) {
                this.FailCertificates[i] = new String(source.FailCertificates[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessCertificates.", this.SuccessCertificates);
        this.setParamArraySimple(map, prefix + "FailCertificates.", this.FailCertificates);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


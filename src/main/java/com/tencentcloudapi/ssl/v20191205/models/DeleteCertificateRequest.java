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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCertificateRequest extends AbstractModel {

    /**
    * Certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * When deleting, check whether the certificate is associated with cloud resources. By default, no check is performed. if you choose to check (the authorization service role SSL_QCSLinkedRoleInReplaceLoadCertificate is required), the deletion will become asynchronous, and the API will return an asynchronous task id. you need to use the DescribeDeleteCertificatesTaskResult API to check whether the deletion is successful.
    */
    @SerializedName("IsCheckResource")
    @Expose
    private Boolean IsCheckResource;

    /**
     * Get Certificate ID 
     * @return CertificateId Certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID
     * @param CertificateId Certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get When deleting, check whether the certificate is associated with cloud resources. By default, no check is performed. if you choose to check (the authorization service role SSL_QCSLinkedRoleInReplaceLoadCertificate is required), the deletion will become asynchronous, and the API will return an asynchronous task id. you need to use the DescribeDeleteCertificatesTaskResult API to check whether the deletion is successful. 
     * @return IsCheckResource When deleting, check whether the certificate is associated with cloud resources. By default, no check is performed. if you choose to check (the authorization service role SSL_QCSLinkedRoleInReplaceLoadCertificate is required), the deletion will become asynchronous, and the API will return an asynchronous task id. you need to use the DescribeDeleteCertificatesTaskResult API to check whether the deletion is successful.
     */
    public Boolean getIsCheckResource() {
        return this.IsCheckResource;
    }

    /**
     * Set When deleting, check whether the certificate is associated with cloud resources. By default, no check is performed. if you choose to check (the authorization service role SSL_QCSLinkedRoleInReplaceLoadCertificate is required), the deletion will become asynchronous, and the API will return an asynchronous task id. you need to use the DescribeDeleteCertificatesTaskResult API to check whether the deletion is successful.
     * @param IsCheckResource When deleting, check whether the certificate is associated with cloud resources. By default, no check is performed. if you choose to check (the authorization service role SSL_QCSLinkedRoleInReplaceLoadCertificate is required), the deletion will become asynchronous, and the API will return an asynchronous task id. you need to use the DescribeDeleteCertificatesTaskResult API to check whether the deletion is successful.
     */
    public void setIsCheckResource(Boolean IsCheckResource) {
        this.IsCheckResource = IsCheckResource;
    }

    public DeleteCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCertificateRequest(DeleteCertificateRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.IsCheckResource != null) {
            this.IsCheckResource = new Boolean(source.IsCheckResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "IsCheckResource", this.IsCheckResource);

    }
}


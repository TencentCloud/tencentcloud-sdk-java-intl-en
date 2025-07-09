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

public class UploadUpdateCertificateRecordRollbackRequest extends AbstractModel {

    /**
    * Record ID of the certificate pending rollback, obtained through the UpdateCertificateInstance API.
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
     * Get Record ID of the certificate pending rollback, obtained through the UpdateCertificateInstance API. 
     * @return DeployRecordId Record ID of the certificate pending rollback, obtained through the UpdateCertificateInstance API.
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set Record ID of the certificate pending rollback, obtained through the UpdateCertificateInstance API.
     * @param DeployRecordId Record ID of the certificate pending rollback, obtained through the UpdateCertificateInstance API.
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    public UploadUpdateCertificateRecordRollbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateRecordRollbackRequest(UploadUpdateCertificateRecordRollbackRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);

    }
}


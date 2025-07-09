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

public class ModifyCertificateProjectRequest extends AbstractModel {

    /**
    * ID list of certificates whose projects need to be modified. A maximum of 100 certificate IDs are supported.
    */
    @SerializedName("CertificateIdList")
    @Expose
    private String [] CertificateIdList;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get ID list of certificates whose projects need to be modified. A maximum of 100 certificate IDs are supported. 
     * @return CertificateIdList ID list of certificates whose projects need to be modified. A maximum of 100 certificate IDs are supported.
     */
    public String [] getCertificateIdList() {
        return this.CertificateIdList;
    }

    /**
     * Set ID list of certificates whose projects need to be modified. A maximum of 100 certificate IDs are supported.
     * @param CertificateIdList ID list of certificates whose projects need to be modified. A maximum of 100 certificate IDs are supported.
     */
    public void setCertificateIdList(String [] CertificateIdList) {
        this.CertificateIdList = CertificateIdList;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyCertificateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCertificateProjectRequest(ModifyCertificateProjectRequest source) {
        if (source.CertificateIdList != null) {
            this.CertificateIdList = new String[source.CertificateIdList.length];
            for (int i = 0; i < source.CertificateIdList.length; i++) {
                this.CertificateIdList[i] = new String(source.CertificateIdList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIdList.", this.CertificateIdList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}


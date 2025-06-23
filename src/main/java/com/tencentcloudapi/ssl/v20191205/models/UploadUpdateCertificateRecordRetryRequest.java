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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateRecordRetryRequest extends AbstractModel {

    /**
    * Retry deployment record ID, obtained through UpdateCertificateInstance to get the deployment record ID. If this parameter is not provided, DeployRecordDetailId must be provided.
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * Retry deployment record detail ID, obtained through the DescribeHostUpdateRecordDetail API. If this parameter is not provided, DeployRecordId must be provided.
    */
    @SerializedName("DeployRecordDetailId")
    @Expose
    private Long DeployRecordDetailId;

    /**
     * Get Retry deployment record ID, obtained through UpdateCertificateInstance to get the deployment record ID. If this parameter is not provided, DeployRecordDetailId must be provided. 
     * @return DeployRecordId Retry deployment record ID, obtained through UpdateCertificateInstance to get the deployment record ID. If this parameter is not provided, DeployRecordDetailId must be provided.
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set Retry deployment record ID, obtained through UpdateCertificateInstance to get the deployment record ID. If this parameter is not provided, DeployRecordDetailId must be provided.
     * @param DeployRecordId Retry deployment record ID, obtained through UpdateCertificateInstance to get the deployment record ID. If this parameter is not provided, DeployRecordDetailId must be provided.
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get Retry deployment record detail ID, obtained through the DescribeHostUpdateRecordDetail API. If this parameter is not provided, DeployRecordId must be provided. 
     * @return DeployRecordDetailId Retry deployment record detail ID, obtained through the DescribeHostUpdateRecordDetail API. If this parameter is not provided, DeployRecordId must be provided.
     */
    public Long getDeployRecordDetailId() {
        return this.DeployRecordDetailId;
    }

    /**
     * Set Retry deployment record detail ID, obtained through the DescribeHostUpdateRecordDetail API. If this parameter is not provided, DeployRecordId must be provided.
     * @param DeployRecordDetailId Retry deployment record detail ID, obtained through the DescribeHostUpdateRecordDetail API. If this parameter is not provided, DeployRecordId must be provided.
     */
    public void setDeployRecordDetailId(Long DeployRecordDetailId) {
        this.DeployRecordDetailId = DeployRecordDetailId;
    }

    public UploadUpdateCertificateRecordRetryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateRecordRetryRequest(UploadUpdateCertificateRecordRetryRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployRecordDetailId != null) {
            this.DeployRecordDetailId = new Long(source.DeployRecordDetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployRecordDetailId", this.DeployRecordDetailId);

    }
}


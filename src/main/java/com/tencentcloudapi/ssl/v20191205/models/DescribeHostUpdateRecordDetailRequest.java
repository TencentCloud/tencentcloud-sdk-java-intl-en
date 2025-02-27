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

public class DescribeHostUpdateRecordDetailRequest extends AbstractModel {

    /**
    * Deployment record id, which is the record id returned by calling the UpdateCertificateInstance api, or the record id returned by calling the UpdateCertificateRecordRollback rollback api.
    */
    @SerializedName("DeployRecordId")
    @Expose
    private String DeployRecordId;

    /**
    * Number of items per page. the default is 10. the maximum value is 200.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Pagination offset, starting from 0. default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
     * Get Deployment record id, which is the record id returned by calling the UpdateCertificateInstance api, or the record id returned by calling the UpdateCertificateRecordRollback rollback api. 
     * @return DeployRecordId Deployment record id, which is the record id returned by calling the UpdateCertificateInstance api, or the record id returned by calling the UpdateCertificateRecordRollback rollback api.
     */
    public String getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set Deployment record id, which is the record id returned by calling the UpdateCertificateInstance api, or the record id returned by calling the UpdateCertificateRecordRollback rollback api.
     * @param DeployRecordId Deployment record id, which is the record id returned by calling the UpdateCertificateInstance api, or the record id returned by calling the UpdateCertificateRecordRollback rollback api.
     */
    public void setDeployRecordId(String DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get Number of items per page. the default is 10. the maximum value is 200. 
     * @return Limit Number of items per page. the default is 10. the maximum value is 200.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. the default is 10. the maximum value is 200.
     * @param Limit Number of items per page. the default is 10. the maximum value is 200.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, starting from 0. default is 0. 
     * @return Offset Pagination offset, starting from 0. default is 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, starting from 0. default is 0.
     * @param Offset Pagination offset, starting from 0. default is 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    public DescribeHostUpdateRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordDetailRequest(DescribeHostUpdateRecordDetailRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new String(source.DeployRecordId);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}


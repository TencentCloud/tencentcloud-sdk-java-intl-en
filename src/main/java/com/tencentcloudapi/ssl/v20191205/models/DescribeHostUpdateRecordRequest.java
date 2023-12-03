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

public class DescribeHostUpdateRecordRequest extends AbstractModel {

    /**
    * Paging offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number per page, 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * New certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Old certificate ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get Paging offset, starting from 0 
     * @return Offset Paging offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset, starting from 0
     * @param Offset Paging offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number per page, 10 by default. 
     * @return Limit Number per page, 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number per page, 10 by default.
     * @param Limit Number per page, 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get New certificate ID 
     * @return CertificateId New certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set New certificate ID
     * @param CertificateId New certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Old certificate ID 
     * @return OldCertificateId Old certificate ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set Old certificate ID
     * @param OldCertificateId Old certificate ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public DescribeHostUpdateRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordRequest(DescribeHostUpdateRecordRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}


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

public class DescribeCSRSetRequest extends AbstractModel {

    /**
    * The number of CSRs on each page. The default value is 10, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The pagination offset, starting from 0.	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The domain for CSR filtering.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The encryption algorithm for CSR filtering.
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
     * Get The number of CSRs on each page. The default value is 10, and the maximum value is 100. 
     * @return Limit The number of CSRs on each page. The default value is 10, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of CSRs on each page. The default value is 10, and the maximum value is 100.
     * @param Limit The number of CSRs on each page. The default value is 10, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The pagination offset, starting from 0.	 
     * @return Offset The pagination offset, starting from 0.	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The pagination offset, starting from 0.	
     * @param Offset The pagination offset, starting from 0.	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The domain for CSR filtering. 
     * @return Domain The domain for CSR filtering.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain for CSR filtering.
     * @param Domain The domain for CSR filtering.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The encryption algorithm for CSR filtering. 
     * @return EncryptAlgo The encryption algorithm for CSR filtering.
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set The encryption algorithm for CSR filtering.
     * @param EncryptAlgo The encryption algorithm for CSR filtering.
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    public DescribeCSRSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSRSetRequest(DescribeCSRSetRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);

    }
}


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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerListByCertIdRequest extends AbstractModel {

    /**
    * Server or client certificate ID
    */
    @SerializedName("CertIds")
    @Expose
    private String [] CertIds;

    /**
     * Get Server or client certificate ID 
     * @return CertIds Server or client certificate ID
     */
    public String [] getCertIds() {
        return this.CertIds;
    }

    /**
     * Set Server or client certificate ID
     * @param CertIds Server or client certificate ID
     */
    public void setCertIds(String [] CertIds) {
        this.CertIds = CertIds;
    }

    public DescribeLoadBalancerListByCertIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerListByCertIdRequest(DescribeLoadBalancerListByCertIdRequest source) {
        if (source.CertIds != null) {
            this.CertIds = new String[source.CertIds.length];
            for (int i = 0; i < source.CertIds.length; i++) {
                this.CertIds[i] = new String(source.CertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertIds.", this.CertIds);

    }
}


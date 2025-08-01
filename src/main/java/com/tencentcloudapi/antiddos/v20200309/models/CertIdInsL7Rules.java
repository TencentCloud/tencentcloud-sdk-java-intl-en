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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertIdInsL7Rules extends AbstractModel {

    /**
    * List of rules configured for certificates
    */
    @SerializedName("L7Rules")
    @Expose
    private InsL7Rules [] L7Rules;

    /**
    * Certificate ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
     * Get List of rules configured for certificates 
     * @return L7Rules List of rules configured for certificates
     */
    public InsL7Rules [] getL7Rules() {
        return this.L7Rules;
    }

    /**
     * Set List of rules configured for certificates
     * @param L7Rules List of rules configured for certificates
     */
    public void setL7Rules(InsL7Rules [] L7Rules) {
        this.L7Rules = L7Rules;
    }

    /**
     * Get Certificate ID 
     * @return CertId Certificate ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID
     * @param CertId Certificate ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    public CertIdInsL7Rules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertIdInsL7Rules(CertIdInsL7Rules source) {
        if (source.L7Rules != null) {
            this.L7Rules = new InsL7Rules[source.L7Rules.length];
            for (int i = 0; i < source.L7Rules.length; i++) {
                this.L7Rules[i] = new InsL7Rules(source.L7Rules[i]);
            }
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "L7Rules.", this.L7Rules);
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}


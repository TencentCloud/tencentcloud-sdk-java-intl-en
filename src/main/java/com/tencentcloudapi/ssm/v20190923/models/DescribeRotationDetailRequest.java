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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRotationDetailRequest extends AbstractModel {

    /**
    * Specifies the name of the credential for which to get the credential rotation details.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
     * Get Specifies the name of the credential for which to get the credential rotation details. 
     * @return SecretName Specifies the name of the credential for which to get the credential rotation details.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Specifies the name of the credential for which to get the credential rotation details.
     * @param SecretName Specifies the name of the credential for which to get the credential rotation details.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    public DescribeRotationDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRotationDetailRequest(DescribeRotationDetailRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);

    }
}


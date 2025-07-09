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

public class UpdateDescriptionRequest extends AbstractModel {

    /**
    * Name of a Secret whose description is to be updated.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * New description information, which can be up to 2048 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Name of a Secret whose description is to be updated. 
     * @return SecretName Name of a Secret whose description is to be updated.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of a Secret whose description is to be updated.
     * @param SecretName Name of a Secret whose description is to be updated.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get New description information, which can be up to 2048 bytes. 
     * @return Description New description information, which can be up to 2048 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New description information, which can be up to 2048 bytes.
     * @param Description New description information, which can be up to 2048 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDescriptionRequest(UpdateDescriptionRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


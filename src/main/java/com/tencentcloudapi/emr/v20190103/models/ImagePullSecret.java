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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImagePullSecret extends AbstractModel {

    /**
    * Namespace of the source key.
    */
    @SerializedName("SourceNamespace")
    @Expose
    private String SourceNamespace;

    /**
    * Key name list.
    */
    @SerializedName("SecretNames")
    @Expose
    private String [] SecretNames;

    /**
     * Get Namespace of the source key. 
     * @return SourceNamespace Namespace of the source key.
     */
    public String getSourceNamespace() {
        return this.SourceNamespace;
    }

    /**
     * Set Namespace of the source key.
     * @param SourceNamespace Namespace of the source key.
     */
    public void setSourceNamespace(String SourceNamespace) {
        this.SourceNamespace = SourceNamespace;
    }

    /**
     * Get Key name list. 
     * @return SecretNames Key name list.
     */
    public String [] getSecretNames() {
        return this.SecretNames;
    }

    /**
     * Set Key name list.
     * @param SecretNames Key name list.
     */
    public void setSecretNames(String [] SecretNames) {
        this.SecretNames = SecretNames;
    }

    public ImagePullSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagePullSecret(ImagePullSecret source) {
        if (source.SourceNamespace != null) {
            this.SourceNamespace = new String(source.SourceNamespace);
        }
        if (source.SecretNames != null) {
            this.SecretNames = new String[source.SecretNames.length];
            for (int i = 0; i < source.SecretNames.length; i++) {
                this.SecretNames[i] = new String(source.SecretNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceNamespace", this.SourceNamespace);
        this.setParamArraySimple(map, prefix + "SecretNames.", this.SecretNames);

    }
}


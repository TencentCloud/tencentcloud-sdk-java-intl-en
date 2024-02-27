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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateParameter extends AbstractModel {

    /**
    * The name of the private authentication parameter. Valid values:
<li>AccessKeyId: Access Key ID for authentication;</li>
<li>SecretAccessKey: Secret Access Key for authentication;</li>
<li>SignatureVersion: Authentication version, v2 or v4;</li>
<li>Region: The region of the storage bucket.</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The parameter value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get The name of the private authentication parameter. Valid values:
<li>AccessKeyId: Access Key ID for authentication;</li>
<li>SecretAccessKey: Secret Access Key for authentication;</li>
<li>SignatureVersion: Authentication version, v2 or v4;</li>
<li>Region: The region of the storage bucket.</li> 
     * @return Name The name of the private authentication parameter. Valid values:
<li>AccessKeyId: Access Key ID for authentication;</li>
<li>SecretAccessKey: Secret Access Key for authentication;</li>
<li>SignatureVersion: Authentication version, v2 or v4;</li>
<li>Region: The region of the storage bucket.</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name of the private authentication parameter. Valid values:
<li>AccessKeyId: Access Key ID for authentication;</li>
<li>SecretAccessKey: Secret Access Key for authentication;</li>
<li>SignatureVersion: Authentication version, v2 or v4;</li>
<li>Region: The region of the storage bucket.</li>
     * @param Name The name of the private authentication parameter. Valid values:
<li>AccessKeyId: Access Key ID for authentication;</li>
<li>SecretAccessKey: Secret Access Key for authentication;</li>
<li>SignatureVersion: Authentication version, v2 or v4;</li>
<li>Region: The region of the storage bucket.</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The parameter value. 
     * @return Value The parameter value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The parameter value.
     * @param Value The parameter value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PrivateParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateParameter(PrivateParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


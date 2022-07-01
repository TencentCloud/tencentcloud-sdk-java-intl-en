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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginRecordPrivateParameter extends AbstractModel{

    /**
    * Name of the private origin authentication parameter.
`AccessKeyId`: Access key ID
`SecretAccessKey`: Secret access key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value of the private origin authentication parameter
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Name of the private origin authentication parameter.
`AccessKeyId`: Access key ID
`SecretAccessKey`: Secret access key 
     * @return Name Name of the private origin authentication parameter.
`AccessKeyId`: Access key ID
`SecretAccessKey`: Secret access key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the private origin authentication parameter.
`AccessKeyId`: Access key ID
`SecretAccessKey`: Secret access key
     * @param Name Name of the private origin authentication parameter.
`AccessKeyId`: Access key ID
`SecretAccessKey`: Secret access key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value of the private origin authentication parameter 
     * @return Value Value of the private origin authentication parameter
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of the private origin authentication parameter
     * @param Value Value of the private origin authentication parameter
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public OriginRecordPrivateParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecordPrivateParameter(OriginRecordPrivateParameter source) {
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


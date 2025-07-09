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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TkeNameSpaceDetail extends AbstractModel {

    /**
    * The namespace name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The secret list.
    */
    @SerializedName("SecretList")
    @Expose
    private TkeSecretDetail [] SecretList;

    /**
     * Get The namespace name. 
     * @return Name The namespace name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The namespace name.
     * @param Name The namespace name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The secret list. 
     * @return SecretList The secret list.
     */
    public TkeSecretDetail [] getSecretList() {
        return this.SecretList;
    }

    /**
     * Set The secret list.
     * @param SecretList The secret list.
     */
    public void setSecretList(TkeSecretDetail [] SecretList) {
        this.SecretList = SecretList;
    }

    public TkeNameSpaceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeNameSpaceDetail(TkeNameSpaceDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SecretList != null) {
            this.SecretList = new TkeSecretDetail[source.SecretList.length];
            for (int i = 0; i < source.SecretList.length; i++) {
                this.SecretList[i] = new TkeSecretDetail(source.SecretList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SecretList.", this.SecretList);

    }
}


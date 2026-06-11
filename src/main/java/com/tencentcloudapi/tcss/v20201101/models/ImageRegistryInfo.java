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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryInfo extends AbstractModel {

    /**
    * repository name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * repository type
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * repository address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get repository name 
     * @return Name repository name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set repository name
     * @param Name repository name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get repository type
aws
ccr
harbor
jfrog
other-tcr
quay
tcr 
     * @return Type repository type
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set repository type
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     * @param Type repository type
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get repository address 
     * @return Address repository address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set repository address
     * @param Address repository address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ImageRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryInfo(ImageRegistryInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}


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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetUserInfoRequest extends AbstractModel {

    /**
    * CVM UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * CWPP UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get CVM UUID 
     * @return Quuid CVM UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM UUID
     * @param Quuid CVM UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get CWPP UUID 
     * @return Uuid CWPP UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP UUID
     * @param Uuid CWPP UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Account name 
     * @return Name Account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account name
     * @param Name Account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeAssetUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetUserInfoRequest(DescribeAssetUserInfoRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}


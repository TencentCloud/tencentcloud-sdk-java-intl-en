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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetJarInfoRequest extends AbstractModel {

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * JAR package ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get JAR package ID 
     * @return Id JAR package ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set JAR package ID
     * @param Id JAR package ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeAssetJarInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetJarInfoRequest(DescribeAssetJarInfoRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}


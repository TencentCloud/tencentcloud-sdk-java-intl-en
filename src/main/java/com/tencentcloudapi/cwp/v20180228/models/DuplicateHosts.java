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

public class DuplicateHosts extends AbstractModel {

    /**
    * Quuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Uuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Quuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Quuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Quuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Quuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Uuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Uuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Id 
     * @return Id Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DuplicateHosts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateHosts(DuplicateHosts source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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


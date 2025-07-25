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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisksAttributeRequest extends AbstractModel {

    /**
    * List of cloud disk IDs.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Cloud disk name.
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get List of cloud disk IDs. 
     * @return DiskIds List of cloud disk IDs.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set List of cloud disk IDs.
     * @param DiskIds List of cloud disk IDs.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Cloud disk name. 
     * @return DiskName Cloud disk name.
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set Cloud disk name.
     * @param DiskName Cloud disk name.
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    public ModifyDisksAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDisksAttributeRequest(ModifyDisksAttributeRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);

    }
}


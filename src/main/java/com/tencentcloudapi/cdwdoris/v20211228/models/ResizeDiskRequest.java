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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResizeDiskRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Role (MATER/CORE), MASTER corresponds to FE, CORE corresponds to BE.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cloud disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Role (MATER/CORE), MASTER corresponds to FE, CORE corresponds to BE. 
     * @return Type Role (MATER/CORE), MASTER corresponds to FE, CORE corresponds to BE.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Role (MATER/CORE), MASTER corresponds to FE, CORE corresponds to BE.
     * @param Type Role (MATER/CORE), MASTER corresponds to FE, CORE corresponds to BE.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cloud disk size 
     * @return DiskSize Cloud disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size
     * @param DiskSize Cloud disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ResizeDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeDiskRequest(ResizeDiskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}


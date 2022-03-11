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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel{

    /**
    * Data disk size in GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Data disk type. Valid values:
- LOCAL_BASIC: local disk
- CLOUD_PREMIUM: Premium Cloud Storage

Default value: LOCAL_BASIC.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
     * Get Data disk size in GB. 
     * @return DiskSize Data disk size in GB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data disk size in GB.
     * @param DiskSize Data disk size in GB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Data disk type. Valid values:
- LOCAL_BASIC: local disk
- CLOUD_PREMIUM: Premium Cloud Storage

Default value: LOCAL_BASIC. 
     * @return DiskType Data disk type. Valid values:
- LOCAL_BASIC: local disk
- CLOUD_PREMIUM: Premium Cloud Storage

Default value: LOCAL_BASIC.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Data disk type. Valid values:
- LOCAL_BASIC: local disk
- CLOUD_PREMIUM: Premium Cloud Storage

Default value: LOCAL_BASIC.
     * @param DiskType Data disk type. Valid values:
- LOCAL_BASIC: local disk
- CLOUD_PREMIUM: Premium Cloud Storage

Default value: LOCAL_BASIC.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);

    }
}


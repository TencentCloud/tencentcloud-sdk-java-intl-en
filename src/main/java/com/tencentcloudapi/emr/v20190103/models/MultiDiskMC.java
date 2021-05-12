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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiDiskMC extends AbstractModel{

    /**
    * Number of cloud disks in this type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Disk type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Cloud disk size
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get Number of cloud disks in this type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Count Number of cloud disks in this type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of cloud disks in this type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Count Number of cloud disks in this type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Disk type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Cloud disk size
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Volume Cloud disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Cloud disk size
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Volume Cloud disk size
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public MultiDiskMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiDiskMC(MultiDiskMC source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}


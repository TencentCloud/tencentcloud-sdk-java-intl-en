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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageVolumeDetail extends AbstractModel {

    /**
    * Storage volume name.
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * Storage volume type.
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * Storage volume details.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Storage volume name. 
     * @return VolumeName Storage volume name.
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set Storage volume name.
     * @param VolumeName Storage volume name.
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get Storage volume type. 
     * @return VolumeType Storage volume type.
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set Storage volume type.
     * @param VolumeType Storage volume type.
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get Storage volume details. 
     * @return Desc Storage volume details.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Storage volume details.
     * @param Desc Storage volume details.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public StorageVolumeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageVolumeDetail(StorageVolumeDetail source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}


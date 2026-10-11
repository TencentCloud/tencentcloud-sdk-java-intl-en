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

public class COSVolume extends AbstractModel {

    /**
    * Storage volume name.
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * Secret name.
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * Region where the COS bucket is located.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS subdirectory.
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

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
     * Get Secret name. 
     * @return Secret Secret name.
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set Secret name.
     * @param Secret Secret name.
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get Region where the COS bucket is located. 
     * @return Region Region where the COS bucket is located.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region where the COS bucket is located.
     * @param Region Region where the COS bucket is located.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Bucket name. 
     * @return Bucket Bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket name.
     * @param Bucket Bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS subdirectory. 
     * @return SubPath COS subdirectory.
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set COS subdirectory.
     * @param SubPath COS subdirectory.
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    public COSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public COSVolume(COSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);

    }
}


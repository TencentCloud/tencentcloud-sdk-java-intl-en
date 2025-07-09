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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaOutputInfo extends AbstractModel {

    /**
    * Region of the bucket where an output file is stored, such as ap-guangzhou.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Bucket of output file.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Path to output file, which must end in "/".
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
     * Get Region of the bucket where an output file is stored, such as ap-guangzhou. 
     * @return Region Region of the bucket where an output file is stored, such as ap-guangzhou.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the bucket where an output file is stored, such as ap-guangzhou.
     * @param Region Region of the bucket where an output file is stored, such as ap-guangzhou.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Bucket of output file. 
     * @return Bucket Bucket of output file.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket of output file.
     * @param Bucket Bucket of output file.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Path to output file, which must end in "/". 
     * @return Dir Path to output file, which must end in "/".
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set Path to output file, which must end in "/".
     * @param Dir Path to output file, which must end in "/".
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public MediaOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaOutputInfo(MediaOutputInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}


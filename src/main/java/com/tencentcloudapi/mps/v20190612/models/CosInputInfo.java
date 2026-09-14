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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInputInfo extends AbstractModel {

    /**
    * Name of the COS Bucket where the media processing object file resides, for example, TopRankVideo-125xxx88.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region of the COS Bucket where the media processing object file resides, for example, ap-chongqing.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Input path of the media processing object file, for example `/movie/201907/WildAnimal.mov`.
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
     * Get Name of the COS Bucket where the media processing object file resides, for example, TopRankVideo-125xxx88. 
     * @return Bucket Name of the COS Bucket where the media processing object file resides, for example, TopRankVideo-125xxx88.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Name of the COS Bucket where the media processing object file resides, for example, TopRankVideo-125xxx88.
     * @param Bucket Name of the COS Bucket where the media processing object file resides, for example, TopRankVideo-125xxx88.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region of the COS Bucket where the media processing object file resides, for example, ap-chongqing. 
     * @return Region Region of the COS Bucket where the media processing object file resides, for example, ap-chongqing.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the COS Bucket where the media processing object file resides, for example, ap-chongqing.
     * @param Region Region of the COS Bucket where the media processing object file resides, for example, ap-chongqing.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Input path of the media processing object file, for example `/movie/201907/WildAnimal.mov`. 
     * @return Object Input path of the media processing object file, for example `/movie/201907/WildAnimal.mov`.
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set Input path of the media processing object file, for example `/movie/201907/WildAnimal.mov`.
     * @param Object Input path of the media processing object file, for example `/movie/201907/WildAnimal.mov`.
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    public CosInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInputInfo(CosInputInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);

    }
}


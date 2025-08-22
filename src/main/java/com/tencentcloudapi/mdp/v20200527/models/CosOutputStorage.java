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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosOutputStorage extends AbstractModel {

    /**
    * cos bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * region name of your cos bucket.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * cos directory of vod remux task result.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
     * Get cos bucket name. 
     * @return Bucket cos bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos bucket name.
     * @param Bucket cos bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get region name of your cos bucket. 
     * @return Region region name of your cos bucket.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set region name of your cos bucket.
     * @param Region region name of your cos bucket.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get cos directory of vod remux task result. 
     * @return OutputDir cos directory of vod remux task result.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set cos directory of vod remux task result.
     * @param OutputDir cos directory of vod remux task result.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    public CosOutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosOutputStorage(CosOutputStorage source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);

    }
}


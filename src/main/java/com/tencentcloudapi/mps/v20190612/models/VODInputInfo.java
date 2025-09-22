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

public class VODInputInfo extends AbstractModel {

    /**
    * Specifies the Bucket ID where the input file resides.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Specifies the region where the input file's Bucket resides.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Path of the input file.
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * VOD Pro application Id.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Specifies the Bucket ID where the input file resides. 
     * @return Bucket Specifies the Bucket ID where the input file resides.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Specifies the Bucket ID where the input file resides.
     * @param Bucket Specifies the Bucket ID where the input file resides.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Specifies the region where the input file's Bucket resides. 
     * @return Region Specifies the region where the input file's Bucket resides.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specifies the region where the input file's Bucket resides.
     * @param Region Specifies the region where the input file's Bucket resides.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Path of the input file. 
     * @return Object Path of the input file.
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set Path of the input file.
     * @param Object Path of the input file.
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get VOD Pro application Id. 
     * @return SubAppId VOD Pro application Id.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD Pro application Id.
     * @param SubAppId VOD Pro application Id.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public VODInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VODInputInfo(VODInputInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}


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
    * <p><em>Bucket ID</em> where the media processing object file resides</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>Region of the Bucket where the media processing object file resides</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Input path of the media processing object file</p>
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * <p>VOD application ID.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Whether to use VOD Standard Edition.<br>Attention: If left empty, VOD Pro Edition is used.</p><p>Enumeration values: </p><ul><li>Use VOD Pro Edition</li><li>Use VOD Standard Edition, allowing tasks to be initiated with FileId</li></ul><p>Default value: 0</p>
    */
    @SerializedName("VodBasic")
    @Expose
    private Long VodBasic;

    /**
    * <p>VOD Standard Edition FileId</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p><em>Bucket ID</em> where the media processing object file resides</p> 
     * @return Bucket <p><em>Bucket ID</em> where the media processing object file resides</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p><em>Bucket ID</em> where the media processing object file resides</p>
     * @param Bucket <p><em>Bucket ID</em> where the media processing object file resides</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>Region of the Bucket where the media processing object file resides</p> 
     * @return Region <p>Region of the Bucket where the media processing object file resides</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region of the Bucket where the media processing object file resides</p>
     * @param Region <p>Region of the Bucket where the media processing object file resides</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Input path of the media processing object file</p> 
     * @return Object <p>Input path of the media processing object file</p>
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set <p>Input path of the media processing object file</p>
     * @param Object <p>Input path of the media processing object file</p>
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get <p>VOD application ID.</p> 
     * @return SubAppId <p>VOD application ID.</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD application ID.</p>
     * @param SubAppId <p>VOD application ID.</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Whether to use VOD Standard Edition.<br>Attention: If left empty, VOD Pro Edition is used.</p><p>Enumeration values: </p><ul><li>Use VOD Pro Edition</li><li>Use VOD Standard Edition, allowing tasks to be initiated with FileId</li></ul><p>Default value: 0</p> 
     * @return VodBasic <p>Whether to use VOD Standard Edition.<br>Attention: If left empty, VOD Pro Edition is used.</p><p>Enumeration values: </p><ul><li>Use VOD Pro Edition</li><li>Use VOD Standard Edition, allowing tasks to be initiated with FileId</li></ul><p>Default value: 0</p>
     */
    public Long getVodBasic() {
        return this.VodBasic;
    }

    /**
     * Set <p>Whether to use VOD Standard Edition.<br>Attention: If left empty, VOD Pro Edition is used.</p><p>Enumeration values: </p><ul><li>Use VOD Pro Edition</li><li>Use VOD Standard Edition, allowing tasks to be initiated with FileId</li></ul><p>Default value: 0</p>
     * @param VodBasic <p>Whether to use VOD Standard Edition.<br>Attention: If left empty, VOD Pro Edition is used.</p><p>Enumeration values: </p><ul><li>Use VOD Pro Edition</li><li>Use VOD Standard Edition, allowing tasks to be initiated with FileId</li></ul><p>Default value: 0</p>
     */
    public void setVodBasic(Long VodBasic) {
        this.VodBasic = VodBasic;
    }

    /**
     * Get <p>VOD Standard Edition FileId</p> 
     * @return FileId <p>VOD Standard Edition FileId</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>VOD Standard Edition FileId</p>
     * @param FileId <p>VOD Standard Edition FileId</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
        if (source.VodBasic != null) {
            this.VodBasic = new Long(source.VodBasic);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
        this.setParamSimple(map, prefix + "VodBasic", this.VodBasic);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}


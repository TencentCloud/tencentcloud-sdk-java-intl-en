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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulIgnoreRegistryImage extends AbstractModel{

    /**
    * Record ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Repository name
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * Image tag
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Repository address
    */
    @SerializedName("RegistryPath")
    @Expose
    private String RegistryPath;

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
     * Get Record ID 
     * @return ID Record ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Record ID
     * @param ID Record ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Repository name 
     * @return RegistryName Repository name
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set Repository name
     * @param RegistryName Repository name
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get Image tag 
     * @return ImageVersion Image tag
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Image tag
     * @param ImageVersion Image tag
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Repository address 
     * @return RegistryPath Repository address
     */
    public String getRegistryPath() {
        return this.RegistryPath;
    }

    /**
     * Set Repository address
     * @param RegistryPath Repository address
     */
    public void setRegistryPath(String RegistryPath) {
        this.RegistryPath = RegistryPath;
    }

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    public VulIgnoreRegistryImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulIgnoreRegistryImage(VulIgnoreRegistryImage source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.RegistryPath != null) {
            this.RegistryPath = new String(source.RegistryPath);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "RegistryPath", this.RegistryPath);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);

    }
}


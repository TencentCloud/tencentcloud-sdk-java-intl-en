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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel {

    /**
    * The URL for downloading the file
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The 32-bit MD5 checksum of the file
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * The file size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get The URL for downloading the file 
     * @return Url The URL for downloading the file
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL for downloading the file
     * @param Url The URL for downloading the file
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The 32-bit MD5 checksum of the file 
     * @return MD5 The 32-bit MD5 checksum of the file
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set The 32-bit MD5 checksum of the file
     * @param MD5 The 32-bit MD5 checksum of the file
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get The file size 
     * @return Size The file size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The file size
     * @param Size The file size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}


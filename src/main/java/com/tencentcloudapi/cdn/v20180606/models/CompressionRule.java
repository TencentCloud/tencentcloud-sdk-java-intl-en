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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompressionRule extends AbstractModel{

    /**
    * true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compress")
    @Expose
    private Boolean Compress;

    /**
    * Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * File compression algorithm
gzip: specifies Gzip compression
brotli: this can be enabled when the Gzip compression is specified
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Algorithms")
    @Expose
    private String [] Algorithms;

    /**
     * Get true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Compress true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCompress() {
        return this.Compress;
    }

    /**
     * Set true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Compress true: must be set as true, enables compression
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompress(Boolean Compress) {
        this.Compress = Compress;
    }

    /**
     * Get Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileExtensions Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileExtensions Compress according to the file suffix type
Such as: jpg, txt
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MinLength The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MinLength The minimum file size to trigger compression (in bytes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxLength The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxLength The maximum file size to trigger compression (in bytes)
The maximum value is 30 MB
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get File compression algorithm
gzip: specifies Gzip compression
brotli: this can be enabled when the Gzip compression is specified
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Algorithms File compression algorithm
gzip: specifies Gzip compression
brotli: this can be enabled when the Gzip compression is specified
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAlgorithms() {
        return this.Algorithms;
    }

    /**
     * Set File compression algorithm
gzip: specifies Gzip compression
brotli: this can be enabled when the Gzip compression is specified
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Algorithms File compression algorithm
gzip: specifies Gzip compression
brotli: this can be enabled when the Gzip compression is specified
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlgorithms(String [] Algorithms) {
        this.Algorithms = Algorithms;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamArraySimple(map, prefix + "Algorithms.", this.Algorithms);

    }
}


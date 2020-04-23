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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFileInfo extends AbstractModel{

    /**
    * Last modified time of log
    */
    @SerializedName("Mtime")
    @Expose
    private Long Mtime;

    /**
    * File length
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * Uniform resource identifier (URI) used during log download
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get Last modified time of log 
     * @return Mtime Last modified time of log
     */
    public Long getMtime() {
        return this.Mtime;
    }

    /**
     * Set Last modified time of log
     * @param Mtime Last modified time of log
     */
    public void setMtime(Long Mtime) {
        this.Mtime = Mtime;
    }

    /**
     * Get File length 
     * @return Length File length
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set File length
     * @param Length File length
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get Uniform resource identifier (URI) used during log download 
     * @return Uri Uniform resource identifier (URI) used during log download
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set Uniform resource identifier (URI) used during log download
     * @param Uri Uniform resource identifier (URI) used during log download
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mtime", this.Mtime);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}


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

public class SubtitleTransResultItem extends AbstractModel {

    /**
    * Translation marker.
- Success
- Error
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Source language (such as "en").
    */
    @SerializedName("TransSrc")
    @Expose
    private String TransSrc;

    /**
    * Target language (such as "zh").
    */
    @SerializedName("TransDst")
    @Expose
    private String TransDst;

    /**
    * Subtitle file URL.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Translation marker.
- Success
- Error 
     * @return Status Translation marker.
- Success
- Error
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Translation marker.
- Success
- Error
     * @param Status Translation marker.
- Success
- Error
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Source language (such as "en"). 
     * @return TransSrc Source language (such as "en").
     */
    public String getTransSrc() {
        return this.TransSrc;
    }

    /**
     * Set Source language (such as "en").
     * @param TransSrc Source language (such as "en").
     */
    public void setTransSrc(String TransSrc) {
        this.TransSrc = TransSrc;
    }

    /**
     * Get Target language (such as "zh"). 
     * @return TransDst Target language (such as "zh").
     */
    public String getTransDst() {
        return this.TransDst;
    }

    /**
     * Set Target language (such as "zh").
     * @param TransDst Target language (such as "zh").
     */
    public void setTransDst(String TransDst) {
        this.TransDst = TransDst;
    }

    /**
     * Get Subtitle file URL. 
     * @return Path Subtitle file URL.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Subtitle file URL.
     * @param Path Subtitle file URL.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SubtitleTransResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTransResultItem(SubtitleTransResultItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TransSrc != null) {
            this.TransSrc = new String(source.TransSrc);
        }
        if (source.TransDst != null) {
            this.TransDst = new String(source.TransDst);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TransSrc", this.TransSrc);
        this.setParamSimple(map, prefix + "TransDst", this.TransDst);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}


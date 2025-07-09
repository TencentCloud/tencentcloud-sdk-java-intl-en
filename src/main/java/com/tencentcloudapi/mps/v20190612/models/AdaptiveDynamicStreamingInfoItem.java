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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel {

    /**
    * Adaptive bitrate streaming specification.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Container format. Valid values: HLS, MPEG-DASH.
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * Playback address.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Storage location of adaptive bitrate streaming files.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
     * Get Adaptive bitrate streaming specification. 
     * @return Definition Adaptive bitrate streaming specification.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming specification.
     * @param Definition Adaptive bitrate streaming specification.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Container format. Valid values: HLS, MPEG-DASH. 
     * @return Package Container format. Valid values: HLS, MPEG-DASH.
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set Container format. Valid values: HLS, MPEG-DASH.
     * @param Package Container format. Valid values: HLS, MPEG-DASH.
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get Playback address. 
     * @return Path Playback address.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Playback address.
     * @param Path Playback address.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Storage location of adaptive bitrate streaming files. 
     * @return Storage Storage location of adaptive bitrate streaming files.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of adaptive bitrate streaming files.
     * @param Storage Storage location of adaptive bitrate streaming files.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    public AdaptiveDynamicStreamingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingInfoItem(AdaptiveDynamicStreamingInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Storage.", this.Storage);

    }
}


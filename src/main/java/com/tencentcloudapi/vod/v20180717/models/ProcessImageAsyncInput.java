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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageAsyncInput extends AbstractModel {

    /**
    * <p>FileId of image processing.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Image URL.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Image processing parameter.</p>
    */
    @SerializedName("ImageTaskInput")
    @Expose
    private ProcessImageAsyncTaskInput ImageTaskInput;

    /**
    * <p>Output media file configuration for the image processing task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private ProcessImageAsyncOutputConfig OutputConfig;

    /**
     * Get <p>FileId of image processing.</p> 
     * @return FileId <p>FileId of image processing.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>FileId of image processing.</p>
     * @param FileId <p>FileId of image processing.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Image URL.</p> 
     * @return Url <p>Image URL.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Image URL.</p>
     * @param Url <p>Image URL.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Image processing parameter.</p> 
     * @return ImageTaskInput <p>Image processing parameter.</p>
     */
    public ProcessImageAsyncTaskInput getImageTaskInput() {
        return this.ImageTaskInput;
    }

    /**
     * Set <p>Image processing parameter.</p>
     * @param ImageTaskInput <p>Image processing parameter.</p>
     */
    public void setImageTaskInput(ProcessImageAsyncTaskInput ImageTaskInput) {
        this.ImageTaskInput = ImageTaskInput;
    }

    /**
     * Get <p>Output media file configuration for the image processing task.</p> 
     * @return OutputConfig <p>Output media file configuration for the image processing task.</p>
     */
    public ProcessImageAsyncOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output media file configuration for the image processing task.</p>
     * @param OutputConfig <p>Output media file configuration for the image processing task.</p>
     */
    public void setOutputConfig(ProcessImageAsyncOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public ProcessImageAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncInput(ProcessImageAsyncInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ImageTaskInput != null) {
            this.ImageTaskInput = new ProcessImageAsyncTaskInput(source.ImageTaskInput);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new ProcessImageAsyncOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "ImageTaskInput.", this.ImageTaskInput);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}


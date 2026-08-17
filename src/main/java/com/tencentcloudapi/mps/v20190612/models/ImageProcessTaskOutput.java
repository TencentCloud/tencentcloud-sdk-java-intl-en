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

public class ImageProcessTaskOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Processing result of the image-to-text task.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>VOD Standard Edition FileId</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get  
     * @return Path 
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 
     * @param Path 
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get  
     * @return OutputStorage 
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
     * @param OutputStorage 
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Processing result of the image-to-text task.</p> 
     * @return Content <p>Processing result of the image-to-text task.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Processing result of the image-to-text task.</p>
     * @param Content <p>Processing result of the image-to-text task.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
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

    public ImageProcessTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessTaskOutput(ImageProcessTaskOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}


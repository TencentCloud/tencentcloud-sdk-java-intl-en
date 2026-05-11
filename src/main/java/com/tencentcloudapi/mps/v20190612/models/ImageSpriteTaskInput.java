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

public class ImageSpriteTaskInput extends AbstractModel {

    /**
    * <p>Sprite screenshot template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Target storage for the file after the sprite screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Output path of the sprite screenshot image file after the sprite screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}_{number}.{format}</code>.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>Output path of the Web VTT file after the sprite screenshot is taken, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}.{format}</code>.</p>
    */
    @SerializedName("WebVttObjectName")
    @Expose
    private String WebVttObjectName;

    /**
    * <p>Rule of the <code>{number}</code> variable in the output path after the sprite screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * <p>Extended parameter.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>Sprite screenshot template ID.</p> 
     * @return Definition <p>Sprite screenshot template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Sprite screenshot template ID.</p>
     * @param Definition <p>Sprite screenshot template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Target storage for the file after the sprite screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage <p>Target storage for the file after the sprite screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Target storage for the file after the sprite screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage <p>Target storage for the file after the sprite screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Output path of the sprite screenshot image file after the sprite screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}_{number}.{format}</code>. 
     * @return OutputObjectPath <p>Output path of the sprite screenshot image file after the sprite screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}_{number}.{format}</code>.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>Output path of the sprite screenshot image file after the sprite screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}_{number}.{format}</code>.
     * @param OutputObjectPath <p>Output path of the sprite screenshot image file after the sprite screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}_{number}.{format}</code>.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>Output path of the Web VTT file after the sprite screenshot is taken, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}.{format}</code>.</p> 
     * @return WebVttObjectName <p>Output path of the Web VTT file after the sprite screenshot is taken, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}.{format}</code>.</p>
     */
    public String getWebVttObjectName() {
        return this.WebVttObjectName;
    }

    /**
     * Set <p>Output path of the Web VTT file after the sprite screenshot is taken, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}.{format}</code>.</p>
     * @param WebVttObjectName <p>Output path of the Web VTT file after the sprite screenshot is taken, which can only be a relative path. If this is not specified, the default relative path is <code>{inputName}_imageSprite_{definition}.{format}</code>.</p>
     */
    public void setWebVttObjectName(String WebVttObjectName) {
        this.WebVttObjectName = WebVttObjectName;
    }

    /**
     * Get <p>Rule of the <code>{number}</code> variable in the output path after the sprite screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectNumberFormat <p>Rule of the <code>{number}</code> variable in the output path after the sprite screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set <p>Rule of the <code>{number}</code> variable in the output path after the sprite screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectNumberFormat <p>Rule of the <code>{number}</code> variable in the output path after the sprite screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get <p>Extended parameter.</p> 
     * @return ExtInfo <p>Extended parameter.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Extended parameter.</p>
     * @param ExtInfo <p>Extended parameter.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ImageSpriteTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSpriteTaskInput(ImageSpriteTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.WebVttObjectName != null) {
            this.WebVttObjectName = new String(source.WebVttObjectName);
        }
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "WebVttObjectName", this.WebVttObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}


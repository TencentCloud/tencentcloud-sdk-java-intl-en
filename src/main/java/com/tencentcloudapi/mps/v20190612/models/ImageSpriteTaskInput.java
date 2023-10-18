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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSpriteTaskInput extends AbstractModel {

    /**
    * ID of an image sprite generating template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Target bucket of a generated image sprite. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output path to a generated image sprite file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}_{number}.{format}`.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * Output path to the WebVTT file after an image sprite is generated, which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}.{format}`.
    */
    @SerializedName("WebVttObjectName")
    @Expose
    private String WebVttObjectName;

    /**
    * Rule of the `{number}` variable in the image sprite output path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
     * Get ID of an image sprite generating template. 
     * @return Definition ID of an image sprite generating template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set ID of an image sprite generating template.
     * @param Definition ID of an image sprite generating template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Target bucket of a generated image sprite. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage Target bucket of a generated image sprite. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target bucket of a generated image sprite. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage Target bucket of a generated image sprite. If this parameter is left empty, the `OutputStorage` value of the upper folder will be inherited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output path to a generated image sprite file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}_{number}.{format}`. 
     * @return OutputObjectPath Output path to a generated image sprite file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}_{number}.{format}`.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Output path to a generated image sprite file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}_{number}.{format}`.
     * @param OutputObjectPath Output path to a generated image sprite file, which can be a relative path or an absolute path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}_{number}.{format}`.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get Output path to the WebVTT file after an image sprite is generated, which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}.{format}`. 
     * @return WebVttObjectName Output path to the WebVTT file after an image sprite is generated, which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}.{format}`.
     */
    public String getWebVttObjectName() {
        return this.WebVttObjectName;
    }

    /**
     * Set Output path to the WebVTT file after an image sprite is generated, which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}.{format}`.
     * @param WebVttObjectName Output path to the WebVTT file after an image sprite is generated, which can only be a relative path. If this parameter is left empty, the following relative path will be used by default: `{inputName}_imageSprite_{definition}.{format}`.
     */
    public void setWebVttObjectName(String WebVttObjectName) {
        this.WebVttObjectName = WebVttObjectName;
    }

    /**
     * Get Rule of the `{number}` variable in the image sprite output path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectNumberFormat Rule of the `{number}` variable in the image sprite output path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set Rule of the `{number}` variable in the image sprite output path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectNumberFormat Rule of the `{number}` variable in the image sprite output path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
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

    }
}


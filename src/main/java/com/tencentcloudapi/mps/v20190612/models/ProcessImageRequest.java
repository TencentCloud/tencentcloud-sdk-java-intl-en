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

public class ProcessImageRequest extends AbstractModel {

    /**
    * File input information for image processing.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Target storage for image processing output files. If left blank, it inherits the storage location in InputInfo.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output file path for image processing. If left blank, it is the directory of the file in InputInfo. If it is a directory, such as `/image/201907/`, it means inheriting the original filename and outputting to this directory.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Output path, which can be a relative or an absolute path.
The path must end with `.{format}`. For details, please refer to the [Filename Variable](https://www.tencentcloud.comom/document/product/862/37039?from_cn_redirect=1).
**Relative path example:**
<Li>`Filename_{Variablename}.{format}`.</li>
<Li>`Filename.{format}`.</li>

**Absolute path example:**
<Li>`/Path/Filename_{Variablename}.{format}`.</li>

If not filled in, default relative path: `{inputName}.{format}`.
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * Image processing parameter.
    */
    @SerializedName("ImageTask")
    @Expose
    private ImageTaskInput ImageTask;

    /**
     * Get File input information for image processing. 
     * @return InputInfo File input information for image processing.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set File input information for image processing.
     * @param InputInfo File input information for image processing.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Target storage for image processing output files. If left blank, it inherits the storage location in InputInfo. 
     * @return OutputStorage Target storage for image processing output files. If left blank, it inherits the storage location in InputInfo.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage for image processing output files. If left blank, it inherits the storage location in InputInfo.
     * @param OutputStorage Target storage for image processing output files. If left blank, it inherits the storage location in InputInfo.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output file path for image processing. If left blank, it is the directory of the file in InputInfo. If it is a directory, such as `/image/201907/`, it means inheriting the original filename and outputting to this directory. 
     * @return OutputDir Output file path for image processing. If left blank, it is the directory of the file in InputInfo. If it is a directory, such as `/image/201907/`, it means inheriting the original filename and outputting to this directory.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set Output file path for image processing. If left blank, it is the directory of the file in InputInfo. If it is a directory, such as `/image/201907/`, it means inheriting the original filename and outputting to this directory.
     * @param OutputDir Output file path for image processing. If left blank, it is the directory of the file in InputInfo. If it is a directory, such as `/image/201907/`, it means inheriting the original filename and outputting to this directory.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Output path, which can be a relative or an absolute path.
The path must end with `.{format}`. For details, please refer to the [Filename Variable](https://www.tencentcloud.comom/document/product/862/37039?from_cn_redirect=1).
**Relative path example:**
<Li>`Filename_{Variablename}.{format}`.</li>
<Li>`Filename.{format}`.</li>

**Absolute path example:**
<Li>`/Path/Filename_{Variablename}.{format}`.</li>

If not filled in, default relative path: `{inputName}.{format}`. 
     * @return OutputPath Output path, which can be a relative or an absolute path.
The path must end with `.{format}`. For details, please refer to the [Filename Variable](https://www.tencentcloud.comom/document/product/862/37039?from_cn_redirect=1).
**Relative path example:**
<Li>`Filename_{Variablename}.{format}`.</li>
<Li>`Filename.{format}`.</li>

**Absolute path example:**
<Li>`/Path/Filename_{Variablename}.{format}`.</li>

If not filled in, default relative path: `{inputName}.{format}`.
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set Output path, which can be a relative or an absolute path.
The path must end with `.{format}`. For details, please refer to the [Filename Variable](https://www.tencentcloud.comom/document/product/862/37039?from_cn_redirect=1).
**Relative path example:**
<Li>`Filename_{Variablename}.{format}`.</li>
<Li>`Filename.{format}`.</li>

**Absolute path example:**
<Li>`/Path/Filename_{Variablename}.{format}`.</li>

If not filled in, default relative path: `{inputName}.{format}`.
     * @param OutputPath Output path, which can be a relative or an absolute path.
The path must end with `.{format}`. For details, please refer to the [Filename Variable](https://www.tencentcloud.comom/document/product/862/37039?from_cn_redirect=1).
**Relative path example:**
<Li>`Filename_{Variablename}.{format}`.</li>
<Li>`Filename.{format}`.</li>

**Absolute path example:**
<Li>`/Path/Filename_{Variablename}.{format}`.</li>

If not filled in, default relative path: `{inputName}.{format}`.
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get Image processing parameter. 
     * @return ImageTask Image processing parameter.
     */
    public ImageTaskInput getImageTask() {
        return this.ImageTask;
    }

    /**
     * Set Image processing parameter.
     * @param ImageTask Image processing parameter.
     */
    public void setImageTask(ImageTaskInput ImageTask) {
        this.ImageTask = ImageTask;
    }

    public ProcessImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageRequest(ProcessImageRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.ImageTask != null) {
            this.ImageTask = new ImageTaskInput(source.ImageTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamObj(map, prefix + "ImageTask.", this.ImageTask);

    }
}


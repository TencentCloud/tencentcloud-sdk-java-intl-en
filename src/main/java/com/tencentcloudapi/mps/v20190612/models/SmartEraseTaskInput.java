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

public class SmartEraseTaskInput extends AbstractModel {

    /**
    * Smart erasing template id.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Custom parameter for smart erasing. Valid when Definition is set to 0. This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify smart erasing parameters.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartEraseParameter RawParameter;

    /**
    * Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideEraseParameter OverrideParameter;

    /**
    * Target storage for files. If left blank, it inherits the upper-level OutputStorage value.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output path of the file, which can be a relative or absolute path.
To define the output path, it must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}.</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>

**Note**: The `BatchProcessMedia` API is currently not supported.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
     * Get Smart erasing template id. 
     * @return Definition Smart erasing template id.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Smart erasing template id.
     * @param Definition Smart erasing template id.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Custom parameter for smart erasing. Valid when Definition is set to 0. This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify smart erasing parameters. 
     * @return RawParameter Custom parameter for smart erasing. Valid when Definition is set to 0. This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify smart erasing parameters.
     */
    public RawSmartEraseParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Custom parameter for smart erasing. Valid when Definition is set to 0. This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify smart erasing parameters.
     * @param RawParameter Custom parameter for smart erasing. Valid when Definition is set to 0. This parameter is used for highly customized scenarios. We recommend you prioritize using Definition to specify smart erasing parameters.
     */
    public void setRawParameter(RawSmartEraseParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters. 
     * @return OverrideParameter Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.
     */
    public OverrideEraseParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.
     * @param OverrideParameter Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.
     */
    public void setOverrideParameter(OverrideEraseParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get Target storage for files. If left blank, it inherits the upper-level OutputStorage value. 
     * @return OutputStorage Target storage for files. If left blank, it inherits the upper-level OutputStorage value.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage for files. If left blank, it inherits the upper-level OutputStorage value.
     * @param OutputStorage Target storage for files. If left blank, it inherits the upper-level OutputStorage value.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output path of the file, which can be a relative or absolute path.
To define the output path, it must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}.</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>

**Note**: The `BatchProcessMedia` API is currently not supported. 
     * @return OutputObjectPath Output path of the file, which can be a relative or absolute path.
To define the output path, it must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}.</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>

**Note**: The `BatchProcessMedia` API is currently not supported.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Output path of the file, which can be a relative or absolute path.
To define the output path, it must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}.</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>

**Note**: The `BatchProcessMedia` API is currently not supported.
     * @param OutputObjectPath Output path of the file, which can be a relative or absolute path.
To define the output path, it must end with `.{format}`. For variable names, please refer to [Filename Variable Explanation](https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1).
Relative path example:
<li>Filename_{Variable name}.{format}.</li>
<li>Filename.{format}.</li>
Absolute path example:
<li>/Custom path/Filename_{Variable name}.{format}</li>

**Note**: The `BatchProcessMedia` API is currently not supported.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    public SmartEraseTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTaskInput(SmartEraseTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartEraseParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideEraseParameter(source.OverrideParameter);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);

    }
}


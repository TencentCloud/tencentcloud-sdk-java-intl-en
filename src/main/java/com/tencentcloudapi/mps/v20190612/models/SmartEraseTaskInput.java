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
    * Smart erasure template id.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Intelligent erasure custom parameter. valid when Definition is 0. this parameter is used for highly custom scenarios. we recommend you prioritize using Definition to specify intelligent erasure parameters.
Note: This field may return null, indicating that no valid value can be obtained.
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
    * Specifies the target storage for files. if left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Output path of the file, which can be a relative or absolute path.
Specifies the output path must end with `.{format}`. variable names, please refer to [filename variable explanation](https://www.tencentcloud.com/document/product/1041/33495?has_map=1).
**Relative path example**:
<Li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}</li>

**Absolute path example**:
<Li>/Custom path/filename_{variable name}.{format}</li>

**Note**: currently does not support the `BatchProcessMedia` api.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
     * Get Smart erasure template id. 
     * @return Definition Smart erasure template id.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Smart erasure template id.
     * @param Definition Smart erasure template id.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Intelligent erasure custom parameter. valid when Definition is 0. this parameter is used for highly custom scenarios. we recommend you prioritize using Definition to specify intelligent erasure parameters.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RawParameter Intelligent erasure custom parameter. valid when Definition is 0. this parameter is used for highly custom scenarios. we recommend you prioritize using Definition to specify intelligent erasure parameters.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RawSmartEraseParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Intelligent erasure custom parameter. valid when Definition is 0. this parameter is used for highly custom scenarios. we recommend you prioritize using Definition to specify intelligent erasure parameters.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RawParameter Intelligent erasure custom parameter. valid when Definition is 0. this parameter is used for highly custom scenarios. we recommend you prioritize using Definition to specify intelligent erasure parameters.
Note: This field may return null, indicating that no valid value can be obtained.
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
     * Get Specifies the target storage for files. if left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OutputStorage Specifies the target storage for files. if left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Specifies the target storage for files. if left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OutputStorage Specifies the target storage for files. if left blank, it inherits the upper-level OutputStorage value.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Output path of the file, which can be a relative or absolute path.
Specifies the output path must end with `.{format}`. variable names, please refer to [filename variable explanation](https://www.tencentcloud.com/document/product/1041/33495?has_map=1).
**Relative path example**:
<Li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}</li>

**Absolute path example**:
<Li>/Custom path/filename_{variable name}.{format}</li>

**Note**: currently does not support the `BatchProcessMedia` api. 
     * @return OutputObjectPath Output path of the file, which can be a relative or absolute path.
Specifies the output path must end with `.{format}`. variable names, please refer to [filename variable explanation](https://www.tencentcloud.com/document/product/1041/33495?has_map=1).
**Relative path example**:
<Li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}</li>

**Absolute path example**:
<Li>/Custom path/filename_{variable name}.{format}</li>

**Note**: currently does not support the `BatchProcessMedia` api.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Output path of the file, which can be a relative or absolute path.
Specifies the output path must end with `.{format}`. variable names, please refer to [filename variable explanation](https://www.tencentcloud.com/document/product/1041/33495?has_map=1).
**Relative path example**:
<Li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}</li>

**Absolute path example**:
<Li>/Custom path/filename_{variable name}.{format}</li>

**Note**: currently does not support the `BatchProcessMedia` api.
     * @param OutputObjectPath Output path of the file, which can be a relative or absolute path.
Specifies the output path must end with `.{format}`. variable names, please refer to [filename variable explanation](https://www.tencentcloud.com/document/product/1041/33495?has_map=1).
**Relative path example**:
<Li>Filename_{Variable name}.{format}</li>
<li>Filename.{format}</li>

**Absolute path example**:
<Li>/Custom path/filename_{variable name}.{format}</li>

**Note**: currently does not support the `BatchProcessMedia` api.
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


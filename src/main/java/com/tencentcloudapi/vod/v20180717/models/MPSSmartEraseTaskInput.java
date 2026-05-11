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

public class MPSSmartEraseTaskInput extends AbstractModel {

    /**
    * <p>id of the intelligent erasing template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Custom parameters for intelligent erasure. Valid when Definition is set to 0. This parameter is used in highly customized scenarios. It is recommended to prioritize using Definition to specify intelligent erasure parameters.</p>
    */
    @SerializedName("RawParameter")
    @Expose
    private MPSRawSmartEraseParameter RawParameter;

    /**
    * <p>Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.</p>
    */
    @SerializedName("OverrideParameter")
    @Expose
    private MPSOverrideEraseParameter OverrideParameter;

    /**
     * Get <p>id of the intelligent erasing template.</p> 
     * @return Definition <p>id of the intelligent erasing template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>id of the intelligent erasing template.</p>
     * @param Definition <p>id of the intelligent erasing template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Custom parameters for intelligent erasure. Valid when Definition is set to 0. This parameter is used in highly customized scenarios. It is recommended to prioritize using Definition to specify intelligent erasure parameters.</p> 
     * @return RawParameter <p>Custom parameters for intelligent erasure. Valid when Definition is set to 0. This parameter is used in highly customized scenarios. It is recommended to prioritize using Definition to specify intelligent erasure parameters.</p>
     */
    public MPSRawSmartEraseParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>Custom parameters for intelligent erasure. Valid when Definition is set to 0. This parameter is used in highly customized scenarios. It is recommended to prioritize using Definition to specify intelligent erasure parameters.</p>
     * @param RawParameter <p>Custom parameters for intelligent erasure. Valid when Definition is set to 0. This parameter is used in highly customized scenarios. It is recommended to prioritize using Definition to specify intelligent erasure parameters.</p>
     */
    public void setRawParameter(MPSRawSmartEraseParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.</p> 
     * @return OverrideParameter <p>Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.</p>
     */
    public MPSOverrideEraseParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set <p>Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.</p>
     * @param OverrideParameter <p>Custom parameters for smart erasing. When the value of Definition is not 0, this parameter is valid. When certain erasing parameters in this structure are specified, the specified parameters will be used to overwrite those in the smart erasing template. This parameter is used in highly customized scenarios. It is recommended to use only Definition to specify smart erasing parameters.</p>
     */
    public void setOverrideParameter(MPSOverrideEraseParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    public MPSSmartEraseTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartEraseTaskInput(MPSSmartEraseTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new MPSRawSmartEraseParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new MPSOverrideEraseParameter(source.OverrideParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);

    }
}


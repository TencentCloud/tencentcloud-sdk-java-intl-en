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

public class SmartSubtitlesTaskInput extends AbstractModel {

    /**
    * Smart subtitle template ID.	
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * User extension field, which does not need to be filled in for general scenarios.
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
    * Custom smart subtitle parameter. It takes effect when Definition is set to 0. This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify smart subtitle parameters.	
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartSubtitleParameter RawParameter;

    /**
     * Get Smart subtitle template ID.	 
     * @return Definition Smart subtitle template ID.	
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Smart subtitle template ID.	
     * @param Definition Smart subtitle template ID.	
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get User extension field, which does not need to be filled in for general scenarios. 
     * @return UserExtPara User extension field, which does not need to be filled in for general scenarios.
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set User extension field, which does not need to be filled in for general scenarios.
     * @param UserExtPara User extension field, which does not need to be filled in for general scenarios.
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    /**
     * Get Custom smart subtitle parameter. It takes effect when Definition is set to 0. This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify smart subtitle parameters.	
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RawParameter Custom smart subtitle parameter. It takes effect when Definition is set to 0. This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify smart subtitle parameters.	
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RawSmartSubtitleParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set Custom smart subtitle parameter. It takes effect when Definition is set to 0. This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify smart subtitle parameters.	
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RawParameter Custom smart subtitle parameter. It takes effect when Definition is set to 0. This parameter is used in high customization scenarios. It is recommended that you preferentially use Definition to specify smart subtitle parameters.	
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRawParameter(RawSmartSubtitleParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    public SmartSubtitlesTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitlesTaskInput(SmartSubtitlesTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartSubtitleParameter(source.RawParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);

    }
}


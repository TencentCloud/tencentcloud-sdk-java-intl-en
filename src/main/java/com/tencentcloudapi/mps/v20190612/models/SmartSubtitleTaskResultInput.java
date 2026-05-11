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

public class SmartSubtitleTaskResultInput extends AbstractModel {

    /**
    * <p>Smart subtitle template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Custom smart subtitle parameter. It takes effect when Definition is set to 0.<br>This parameter is used in highly customized scenarios. We recommend that you use Definition to specify smart subtitle parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartSubtitleParameter RawParameter;

    /**
    * <p>Extended parameter.</p>
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get <p>Smart subtitle template ID.</p> 
     * @return Definition <p>Smart subtitle template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Smart subtitle template ID.</p>
     * @param Definition <p>Smart subtitle template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Custom smart subtitle parameter. It takes effect when Definition is set to 0.<br>This parameter is used in highly customized scenarios. We recommend that you use Definition to specify smart subtitle parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RawParameter <p>Custom smart subtitle parameter. It takes effect when Definition is set to 0.<br>This parameter is used in highly customized scenarios. We recommend that you use Definition to specify smart subtitle parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RawSmartSubtitleParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>Custom smart subtitle parameter. It takes effect when Definition is set to 0.<br>This parameter is used in highly customized scenarios. We recommend that you use Definition to specify smart subtitle parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RawParameter <p>Custom smart subtitle parameter. It takes effect when Definition is set to 0.<br>This parameter is used in highly customized scenarios. We recommend that you use Definition to specify smart subtitle parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRawParameter(RawSmartSubtitleParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>Extended parameter.</p> 
     * @return UserExtPara <p>Extended parameter.</p>
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set <p>Extended parameter.</p>
     * @param UserExtPara <p>Extended parameter.</p>
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public SmartSubtitleTaskResultInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskResultInput(SmartSubtitleTaskResultInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartSubtitleParameter(source.RawParameter);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}


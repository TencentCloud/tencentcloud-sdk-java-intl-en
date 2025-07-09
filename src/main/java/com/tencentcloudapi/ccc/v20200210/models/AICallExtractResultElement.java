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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallExtractResultElement extends AbstractModel {

    /**
    * Type of extracted information.
Text.
Selector options.
Boolean value.
Number.
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * Name of the extracted information.
    */
    @SerializedName("InfoName")
    @Expose
    private String InfoName;

    /**
    * Specific description of the extracted information.
    */
    @SerializedName("InfoContent")
    @Expose
    private String InfoContent;

    /**
    * Specific result of the extracted information.
    */
    @SerializedName("Result")
    @Expose
    private AICallExtractResultInfo Result;

    /**
     * Get Type of extracted information.
Text.
Selector options.
Boolean value.
Number. 
     * @return InfoType Type of extracted information.
Text.
Selector options.
Boolean value.
Number.
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set Type of extracted information.
Text.
Selector options.
Boolean value.
Number.
     * @param InfoType Type of extracted information.
Text.
Selector options.
Boolean value.
Number.
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get Name of the extracted information. 
     * @return InfoName Name of the extracted information.
     */
    public String getInfoName() {
        return this.InfoName;
    }

    /**
     * Set Name of the extracted information.
     * @param InfoName Name of the extracted information.
     */
    public void setInfoName(String InfoName) {
        this.InfoName = InfoName;
    }

    /**
     * Get Specific description of the extracted information. 
     * @return InfoContent Specific description of the extracted information.
     */
    public String getInfoContent() {
        return this.InfoContent;
    }

    /**
     * Set Specific description of the extracted information.
     * @param InfoContent Specific description of the extracted information.
     */
    public void setInfoContent(String InfoContent) {
        this.InfoContent = InfoContent;
    }

    /**
     * Get Specific result of the extracted information. 
     * @return Result Specific result of the extracted information.
     */
    public AICallExtractResultInfo getResult() {
        return this.Result;
    }

    /**
     * Set Specific result of the extracted information.
     * @param Result Specific result of the extracted information.
     */
    public void setResult(AICallExtractResultInfo Result) {
        this.Result = Result;
    }

    public AICallExtractResultElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallExtractResultElement(AICallExtractResultElement source) {
        if (source.InfoType != null) {
            this.InfoType = new String(source.InfoType);
        }
        if (source.InfoName != null) {
            this.InfoName = new String(source.InfoName);
        }
        if (source.InfoContent != null) {
            this.InfoContent = new String(source.InfoContent);
        }
        if (source.Result != null) {
            this.Result = new AICallExtractResultInfo(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "InfoName", this.InfoName);
        this.setParamSimple(map, prefix + "InfoContent", this.InfoContent);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}


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

public class AICallExtractConfigElement extends AbstractModel {

    /**
    * Configuration item type, including.
Text.
Selector option.
Boolean value.
Number.
    */
    @SerializedName("InfoType")
    @Expose
    private String InfoType;

    /**
    * Configuration item name, duplicat.
    */
    @SerializedName("InfoName")
    @Expose
    private String InfoName;

    /**
    * Specific content of the configuration item.
    */
    @SerializedName("InfoContent")
    @Expose
    private String InfoContent;

    /**
    * Example of extracted content from the configuration item.
    */
    @SerializedName("Examples")
    @Expose
    private String [] Examples;

    /**
    * When infotype is selector, this field needs to be configured.
    */
    @SerializedName("Choices")
    @Expose
    private String [] Choices;

    /**
     * Get Configuration item type, including.
Text.
Selector option.
Boolean value.
Number. 
     * @return InfoType Configuration item type, including.
Text.
Selector option.
Boolean value.
Number.
     */
    public String getInfoType() {
        return this.InfoType;
    }

    /**
     * Set Configuration item type, including.
Text.
Selector option.
Boolean value.
Number.
     * @param InfoType Configuration item type, including.
Text.
Selector option.
Boolean value.
Number.
     */
    public void setInfoType(String InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get Configuration item name, duplicat. 
     * @return InfoName Configuration item name, duplicat.
     */
    public String getInfoName() {
        return this.InfoName;
    }

    /**
     * Set Configuration item name, duplicat.
     * @param InfoName Configuration item name, duplicat.
     */
    public void setInfoName(String InfoName) {
        this.InfoName = InfoName;
    }

    /**
     * Get Specific content of the configuration item. 
     * @return InfoContent Specific content of the configuration item.
     */
    public String getInfoContent() {
        return this.InfoContent;
    }

    /**
     * Set Specific content of the configuration item.
     * @param InfoContent Specific content of the configuration item.
     */
    public void setInfoContent(String InfoContent) {
        this.InfoContent = InfoContent;
    }

    /**
     * Get Example of extracted content from the configuration item. 
     * @return Examples Example of extracted content from the configuration item.
     */
    public String [] getExamples() {
        return this.Examples;
    }

    /**
     * Set Example of extracted content from the configuration item.
     * @param Examples Example of extracted content from the configuration item.
     */
    public void setExamples(String [] Examples) {
        this.Examples = Examples;
    }

    /**
     * Get When infotype is selector, this field needs to be configured. 
     * @return Choices When infotype is selector, this field needs to be configured.
     */
    public String [] getChoices() {
        return this.Choices;
    }

    /**
     * Set When infotype is selector, this field needs to be configured.
     * @param Choices When infotype is selector, this field needs to be configured.
     */
    public void setChoices(String [] Choices) {
        this.Choices = Choices;
    }

    public AICallExtractConfigElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallExtractConfigElement(AICallExtractConfigElement source) {
        if (source.InfoType != null) {
            this.InfoType = new String(source.InfoType);
        }
        if (source.InfoName != null) {
            this.InfoName = new String(source.InfoName);
        }
        if (source.InfoContent != null) {
            this.InfoContent = new String(source.InfoContent);
        }
        if (source.Examples != null) {
            this.Examples = new String[source.Examples.length];
            for (int i = 0; i < source.Examples.length; i++) {
                this.Examples[i] = new String(source.Examples[i]);
            }
        }
        if (source.Choices != null) {
            this.Choices = new String[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new String(source.Choices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "InfoName", this.InfoName);
        this.setParamSimple(map, prefix + "InfoContent", this.InfoContent);
        this.setParamArraySimple(map, prefix + "Examples.", this.Examples);
        this.setParamArraySimple(map, prefix + "Choices.", this.Choices);

    }
}


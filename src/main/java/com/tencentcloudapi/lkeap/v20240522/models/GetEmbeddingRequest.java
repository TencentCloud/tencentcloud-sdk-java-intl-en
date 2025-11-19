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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingRequest extends AbstractModel {

    /**
    * Select the model for generating vectors
Note: Optional [adp-text-embedding-0.5b]


    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Text that requires embedding. The maximum length of a single text is 500 characters. The maximum total number of entries is 7.
    */
    @SerializedName("Inputs")
    @Expose
    private String [] Inputs;

    /**
    * The type of text vectorization. To achieve better retrieval performance, it is recommended to distinguish between query text and document text types. For symmetric tasks such as clustering and classification, there is no need for special specification simply use the system default value "document".
    */
    @SerializedName("TextType")
    @Expose
    private String TextType;

    /**
    * This field is not currently supported.
    */
    @SerializedName("Instruction")
    @Expose
    private String Instruction;

    /**
     * Get Select the model for generating vectors
Note: Optional [adp-text-embedding-0.5b]

 
     * @return Model Select the model for generating vectors
Note: Optional [adp-text-embedding-0.5b]


     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Select the model for generating vectors
Note: Optional [adp-text-embedding-0.5b]


     * @param Model Select the model for generating vectors
Note: Optional [adp-text-embedding-0.5b]


     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Text that requires embedding. The maximum length of a single text is 500 characters. The maximum total number of entries is 7. 
     * @return Inputs Text that requires embedding. The maximum length of a single text is 500 characters. The maximum total number of entries is 7.
     */
    public String [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set Text that requires embedding. The maximum length of a single text is 500 characters. The maximum total number of entries is 7.
     * @param Inputs Text that requires embedding. The maximum length of a single text is 500 characters. The maximum total number of entries is 7.
     */
    public void setInputs(String [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get The type of text vectorization. To achieve better retrieval performance, it is recommended to distinguish between query text and document text types. For symmetric tasks such as clustering and classification, there is no need for special specification simply use the system default value "document". 
     * @return TextType The type of text vectorization. To achieve better retrieval performance, it is recommended to distinguish between query text and document text types. For symmetric tasks such as clustering and classification, there is no need for special specification simply use the system default value "document".
     */
    public String getTextType() {
        return this.TextType;
    }

    /**
     * Set The type of text vectorization. To achieve better retrieval performance, it is recommended to distinguish between query text and document text types. For symmetric tasks such as clustering and classification, there is no need for special specification simply use the system default value "document".
     * @param TextType The type of text vectorization. To achieve better retrieval performance, it is recommended to distinguish between query text and document text types. For symmetric tasks such as clustering and classification, there is no need for special specification simply use the system default value "document".
     */
    public void setTextType(String TextType) {
        this.TextType = TextType;
    }

    /**
     * Get This field is not currently supported. 
     * @return Instruction This field is not currently supported.
     */
    public String getInstruction() {
        return this.Instruction;
    }

    /**
     * Set This field is not currently supported.
     * @param Instruction This field is not currently supported.
     */
    public void setInstruction(String Instruction) {
        this.Instruction = Instruction;
    }

    public GetEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingRequest(GetEmbeddingRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Inputs != null) {
            this.Inputs = new String[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new String(source.Inputs[i]);
            }
        }
        if (source.TextType != null) {
            this.TextType = new String(source.TextType);
        }
        if (source.Instruction != null) {
            this.Instruction = new String(source.Instruction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "Inputs.", this.Inputs);
        this.setParamSimple(map, prefix + "TextType", this.TextType);
        this.setParamSimple(map, prefix + "Instruction", this.Instruction);

    }
}


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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRunContent extends AbstractModel {

    /**
    * Input variable information
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Output variable information
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Original output information. Only partial nodes have a value, such as tool nodes and code nodes.
    */
    @SerializedName("OriginalOutput")
    @Expose
    private String OriginalOutput;

    /**
    * URLs of the complete node Input content. (This field has a value only when the Input content exceeds the limit.)
    */
    @SerializedName("InputRef")
    @Expose
    private String InputRef;

    /**
    * URLs of the complete node Output. This field has a value only when the Output exceeds the limit.
    */
    @SerializedName("OutputRef")
    @Expose
    private String OutputRef;

    /**
    * URLs of the complete original output content of the task. (This field has a value only when the TaskOutput content exceeds the limit.)
    */
    @SerializedName("OriginalOutputRef")
    @Expose
    private String OriginalOutputRef;

    /**
     * Get Input variable information 
     * @return Input Input variable information
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Input variable information
     * @param Input Input variable information
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Output variable information 
     * @return Output Output variable information
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output variable information
     * @param Output Output variable information
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Original output information. Only partial nodes have a value, such as tool nodes and code nodes. 
     * @return OriginalOutput Original output information. Only partial nodes have a value, such as tool nodes and code nodes.
     */
    public String getOriginalOutput() {
        return this.OriginalOutput;
    }

    /**
     * Set Original output information. Only partial nodes have a value, such as tool nodes and code nodes.
     * @param OriginalOutput Original output information. Only partial nodes have a value, such as tool nodes and code nodes.
     */
    public void setOriginalOutput(String OriginalOutput) {
        this.OriginalOutput = OriginalOutput;
    }

    /**
     * Get URLs of the complete node Input content. (This field has a value only when the Input content exceeds the limit.) 
     * @return InputRef URLs of the complete node Input content. (This field has a value only when the Input content exceeds the limit.)
     */
    public String getInputRef() {
        return this.InputRef;
    }

    /**
     * Set URLs of the complete node Input content. (This field has a value only when the Input content exceeds the limit.)
     * @param InputRef URLs of the complete node Input content. (This field has a value only when the Input content exceeds the limit.)
     */
    public void setInputRef(String InputRef) {
        this.InputRef = InputRef;
    }

    /**
     * Get URLs of the complete node Output. This field has a value only when the Output exceeds the limit. 
     * @return OutputRef URLs of the complete node Output. This field has a value only when the Output exceeds the limit.
     */
    public String getOutputRef() {
        return this.OutputRef;
    }

    /**
     * Set URLs of the complete node Output. This field has a value only when the Output exceeds the limit.
     * @param OutputRef URLs of the complete node Output. This field has a value only when the Output exceeds the limit.
     */
    public void setOutputRef(String OutputRef) {
        this.OutputRef = OutputRef;
    }

    /**
     * Get URLs of the complete original output content of the task. (This field has a value only when the TaskOutput content exceeds the limit.) 
     * @return OriginalOutputRef URLs of the complete original output content of the task. (This field has a value only when the TaskOutput content exceeds the limit.)
     */
    public String getOriginalOutputRef() {
        return this.OriginalOutputRef;
    }

    /**
     * Set URLs of the complete original output content of the task. (This field has a value only when the TaskOutput content exceeds the limit.)
     * @param OriginalOutputRef URLs of the complete original output content of the task. (This field has a value only when the TaskOutput content exceeds the limit.)
     */
    public void setOriginalOutputRef(String OriginalOutputRef) {
        this.OriginalOutputRef = OriginalOutputRef;
    }

    public NodeRunContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunContent(NodeRunContent source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.OriginalOutput != null) {
            this.OriginalOutput = new String(source.OriginalOutput);
        }
        if (source.InputRef != null) {
            this.InputRef = new String(source.InputRef);
        }
        if (source.OutputRef != null) {
            this.OutputRef = new String(source.OutputRef);
        }
        if (source.OriginalOutputRef != null) {
            this.OriginalOutputRef = new String(source.OriginalOutputRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "OriginalOutput", this.OriginalOutput);
        this.setParamSimple(map, prefix + "InputRef", this.InputRef);
        this.setParamSimple(map, prefix + "OutputRef", this.OutputRef);
        this.setParamSimple(map, prefix + "OriginalOutputRef", this.OriginalOutputRef);

    }
}


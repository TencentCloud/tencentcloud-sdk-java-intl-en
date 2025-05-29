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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SummaryOutput extends AbstractModel {

    /**
    * Output method: 1. streaming; 2. non-streaming.
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * Output requirement 1: text summary. 2: customized requirement.
    */
    @SerializedName("Requirement")
    @Expose
    private Long Requirement;

    /**
    * Custom requirement command.
    */
    @SerializedName("RequireCommand")
    @Expose
    private String RequireCommand;

    /**
     * Get Output method: 1. streaming; 2. non-streaming. 
     * @return Method Output method: 1. streaming; 2. non-streaming.
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set Output method: 1. streaming; 2. non-streaming.
     * @param Method Output method: 1. streaming; 2. non-streaming.
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get Output requirement 1: text summary. 2: customized requirement. 
     * @return Requirement Output requirement 1: text summary. 2: customized requirement.
     */
    public Long getRequirement() {
        return this.Requirement;
    }

    /**
     * Set Output requirement 1: text summary. 2: customized requirement.
     * @param Requirement Output requirement 1: text summary. 2: customized requirement.
     */
    public void setRequirement(Long Requirement) {
        this.Requirement = Requirement;
    }

    /**
     * Get Custom requirement command. 
     * @return RequireCommand Custom requirement command.
     */
    public String getRequireCommand() {
        return this.RequireCommand;
    }

    /**
     * Set Custom requirement command.
     * @param RequireCommand Custom requirement command.
     */
    public void setRequireCommand(String RequireCommand) {
        this.RequireCommand = RequireCommand;
    }

    public SummaryOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryOutput(SummaryOutput source) {
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.Requirement != null) {
            this.Requirement = new Long(source.Requirement);
        }
        if (source.RequireCommand != null) {
            this.RequireCommand = new String(source.RequireCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Requirement", this.Requirement);
        this.setParamSimple(map, prefix + "RequireCommand", this.RequireCommand);

    }
}


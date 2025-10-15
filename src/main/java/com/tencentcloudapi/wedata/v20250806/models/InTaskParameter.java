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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InTaskParameter extends AbstractModel {

    /**
    * Parameter name.

    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * Parameter Description: The format is ProjectIdentifier.TaskName.ParameterName
Example: project_wedata_1.sh_250820_104107.pp_out
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * Parent Task ID

    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * Parent task parameter key.

    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
     * Get Parameter name.
 
     * @return ParamKey Parameter name.

     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set Parameter name.

     * @param ParamKey Parameter name.

     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get Parameter Description: The format is ProjectIdentifier.TaskName.ParameterName
Example: project_wedata_1.sh_250820_104107.pp_out 
     * @return ParamDesc Parameter Description: The format is ProjectIdentifier.TaskName.ParameterName
Example: project_wedata_1.sh_250820_104107.pp_out
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set Parameter Description: The format is ProjectIdentifier.TaskName.ParameterName
Example: project_wedata_1.sh_250820_104107.pp_out
     * @param ParamDesc Parameter Description: The format is ProjectIdentifier.TaskName.ParameterName
Example: project_wedata_1.sh_250820_104107.pp_out
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get Parent Task ID
 
     * @return FromTaskId Parent Task ID

     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set Parent Task ID

     * @param FromTaskId Parent Task ID

     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get Parent task parameter key.
 
     * @return FromParamKey Parent task parameter key.

     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set Parent task parameter key.

     * @param FromParamKey Parent task parameter key.

     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
    }

    public InTaskParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InTaskParameter(InTaskParameter source) {
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.FromTaskId != null) {
            this.FromTaskId = new String(source.FromTaskId);
        }
        if (source.FromParamKey != null) {
            this.FromParamKey = new String(source.FromParamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "FromTaskId", this.FromTaskId);
        this.setParamSimple(map, prefix + "FromParamKey", this.FromParamKey);

    }
}


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
    * <p>Parameter name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * <p>Parameter description: Format is project ID.task name.parameter name; for example: project_wedata_1.sh_250820_104107.pp_out</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * <p>Parent task ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * <p>Parent task parameter key</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
    * <p>Task input type, by default uses TASK.</p><p>Enumeration value:</p><ul><li>TASK: Source is the parent task.</li><li>CONSTANT: Constant value, currently only supported by for-each node.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Parameter name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamKey <p>Parameter name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set <p>Parameter name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamKey <p>Parameter name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get <p>Parameter description: Format is project ID.task name.parameter name; for example: project_wedata_1.sh_250820_104107.pp_out</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamDesc <p>Parameter description: Format is project ID.task name.parameter name; for example: project_wedata_1.sh_250820_104107.pp_out</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set <p>Parameter description: Format is project ID.task name.parameter name; for example: project_wedata_1.sh_250820_104107.pp_out</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamDesc <p>Parameter description: Format is project ID.task name.parameter name; for example: project_wedata_1.sh_250820_104107.pp_out</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get <p>Parent task ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FromTaskId <p>Parent task ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set <p>Parent task ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FromTaskId <p>Parent task ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get <p>Parent task parameter key</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FromParamKey <p>Parent task parameter key</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set <p>Parent task parameter key</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FromParamKey <p>Parent task parameter key</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
    }

    /**
     * Get <p>Task input type, by default uses TASK.</p><p>Enumeration value:</p><ul><li>TASK: Source is the parent task.</li><li>CONSTANT: Constant value, currently only supported by for-each node.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Task input type, by default uses TASK.</p><p>Enumeration value:</p><ul><li>TASK: Source is the parent task.</li><li>CONSTANT: Constant value, currently only supported by for-each node.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Task input type, by default uses TASK.</p><p>Enumeration value:</p><ul><li>TASK: Source is the parent task.</li><li>CONSTANT: Constant value, currently only supported by for-each node.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Task input type, by default uses TASK.</p><p>Enumeration value:</p><ul><li>TASK: Source is the parent task.</li><li>CONSTANT: Constant value, currently only supported by for-each node.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


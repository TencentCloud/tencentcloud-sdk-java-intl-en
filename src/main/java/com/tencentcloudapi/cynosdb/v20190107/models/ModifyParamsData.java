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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamsData extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter value before modification.
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * Parameter value after modification.
    */
    @SerializedName("CurValue")
    @Expose
    private String CurValue;

    /**
     * Get Parameter name. 
     * @return Name Parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name.
     * @param Name Parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter value before modification. 
     * @return OldValue Parameter value before modification.
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Parameter value before modification.
     * @param OldValue Parameter value before modification.
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get Parameter value after modification. 
     * @return CurValue Parameter value after modification.
     */
    public String getCurValue() {
        return this.CurValue;
    }

    /**
     * Set Parameter value after modification.
     * @param CurValue Parameter value after modification.
     */
    public void setCurValue(String CurValue) {
        this.CurValue = CurValue;
    }

    public ModifyParamsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParamsData(ModifyParamsData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.CurValue != null) {
            this.CurValue = new String(source.CurValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "CurValue", this.CurValue);

    }
}


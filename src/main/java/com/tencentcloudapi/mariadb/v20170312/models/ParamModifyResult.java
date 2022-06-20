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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamModifyResult extends AbstractModel{

    /**
    * Renames parameter
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Result of parameter modification. 0: success; -1: failure; -2: invalid parameter value.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
     * Get Renames parameter 
     * @return Param Renames parameter
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Renames parameter
     * @param Param Renames parameter
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Result of parameter modification. 0: success; -1: failure; -2: invalid parameter value. 
     * @return Code Result of parameter modification. 0: success; -1: failure; -2: invalid parameter value.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Result of parameter modification. 0: success; -1: failure; -2: invalid parameter value.
     * @param Code Result of parameter modification. 0: success; -1: failure; -2: invalid parameter value.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    public ParamModifyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamModifyResult(ParamModifyResult source) {
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}


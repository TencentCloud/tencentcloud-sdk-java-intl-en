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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteResult extends AbstractModel{

    /**
    * Status code. `0`: Succeeded. Others: Failed\
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Description
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get Status code. `0`: Succeeded. Others: Failed\ 
     * @return Code Status code. `0`: Succeeded. Others: Failed\
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Status code. `0`: Succeeded. Others: Failed\
     * @param Code Status code. `0`: Succeeded. Others: Failed\
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Description 
     * @return ErrorMsg Description
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Description
     * @param ErrorMsg Description
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public DeleteResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteResult(DeleteResult source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}


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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchCodeAttr extends AbstractModel {

    /**
    * MatchCode
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
     * Get MatchCode
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchCode MatchCode
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set MatchCode
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchCode MatchCode
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    public MatchCodeAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchCodeAttr(MatchCodeAttr source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);

    }
}


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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditFilter extends AbstractModel {

    /**
    * Filter parameter names. Valid values:
SrcIp: Client IP;
User: Database account;
DB: Database name.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter match type. Valid value:
`INC`: Include;
`EXC`: Exclude;
`EQ`: Equal to;
`NEQ`: Not equal to.
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * Filter match value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Filter parameter names. Valid values:
SrcIp: Client IP;
User: Database account;
DB: Database name. 
     * @return Type Filter parameter names. Valid values:
SrcIp: Client IP;
User: Database account;
DB: Database name.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filter parameter names. Valid values:
SrcIp: Client IP;
User: Database account;
DB: Database name.
     * @param Type Filter parameter names. Valid values:
SrcIp: Client IP;
User: Database account;
DB: Database name.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter match type. Valid value:
`INC`: Include;
`EXC`: Exclude;
`EQ`: Equal to;
`NEQ`: Not equal to. 
     * @return Compare Filter match type. Valid value:
`INC`: Include;
`EXC`: Exclude;
`EQ`: Equal to;
`NEQ`: Not equal to.
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Filter match type. Valid value:
`INC`: Include;
`EXC`: Exclude;
`EQ`: Equal to;
`NEQ`: Not equal to.
     * @param Compare Filter match type. Valid value:
`INC`: Include;
`EXC`: Exclude;
`EQ`: Equal to;
`NEQ`: Not equal to.
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get Filter match value 
     * @return Value Filter match value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Filter match value
     * @param Value Filter match value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AuditFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditFilter(AuditFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


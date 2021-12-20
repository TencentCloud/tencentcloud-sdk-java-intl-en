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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolParams extends AbstractModel{

    /**
    * Parameters of WebSockets protocol
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WSParams")
    @Expose
    private WSParams WSParams;

    /**
     * Get Parameters of WebSockets protocol
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WSParams Parameters of WebSockets protocol
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public WSParams getWSParams() {
        return this.WSParams;
    }

    /**
     * Set Parameters of WebSockets protocol
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WSParams Parameters of WebSockets protocol
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWSParams(WSParams WSParams) {
        this.WSParams = WSParams;
    }

    public ProtocolParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolParams(ProtocolParams source) {
        if (source.WSParams != null) {
            this.WSParams = new WSParams(source.WSParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WSParams.", this.WSParams);

    }
}


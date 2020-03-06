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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableType extends AbstractModel{

    /**
    * Protocol and sale details
    */
    @SerializedName("Protocols")
    @Expose
    private AvailableProtoStatus [] Protocols;

    /**
    * Storage class. Valid values: SD (standard), HP (high-performance)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Protocol and sale details 
     * @return Protocols Protocol and sale details
     */
    public AvailableProtoStatus [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set Protocol and sale details
     * @param Protocols Protocol and sale details
     */
    public void setProtocols(AvailableProtoStatus [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get Storage class. Valid values: SD (standard), HP (high-performance) 
     * @return Type Storage class. Valid values: SD (standard), HP (high-performance)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Storage class. Valid values: SD (standard), HP (high-performance)
     * @param Type Storage class. Valid values: SD (standard), HP (high-performance)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


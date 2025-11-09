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

public class ExchangeInstanceInfo extends AbstractModel {

    /**
    * Source instance information.
    */
    @SerializedName("SrcInstanceInfo")
    @Expose
    private RollbackInstanceInfo SrcInstanceInfo;

    /**
    * Target instance information.
    */
    @SerializedName("DstInstanceInfo")
    @Expose
    private RollbackInstanceInfo DstInstanceInfo;

    /**
     * Get Source instance information. 
     * @return SrcInstanceInfo Source instance information.
     */
    public RollbackInstanceInfo getSrcInstanceInfo() {
        return this.SrcInstanceInfo;
    }

    /**
     * Set Source instance information.
     * @param SrcInstanceInfo Source instance information.
     */
    public void setSrcInstanceInfo(RollbackInstanceInfo SrcInstanceInfo) {
        this.SrcInstanceInfo = SrcInstanceInfo;
    }

    /**
     * Get Target instance information. 
     * @return DstInstanceInfo Target instance information.
     */
    public RollbackInstanceInfo getDstInstanceInfo() {
        return this.DstInstanceInfo;
    }

    /**
     * Set Target instance information.
     * @param DstInstanceInfo Target instance information.
     */
    public void setDstInstanceInfo(RollbackInstanceInfo DstInstanceInfo) {
        this.DstInstanceInfo = DstInstanceInfo;
    }

    public ExchangeInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExchangeInstanceInfo(ExchangeInstanceInfo source) {
        if (source.SrcInstanceInfo != null) {
            this.SrcInstanceInfo = new RollbackInstanceInfo(source.SrcInstanceInfo);
        }
        if (source.DstInstanceInfo != null) {
            this.DstInstanceInfo = new RollbackInstanceInfo(source.DstInstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SrcInstanceInfo.", this.SrcInstanceInfo);
        this.setParamObj(map, prefix + "DstInstanceInfo.", this.DstInstanceInfo);

    }
}


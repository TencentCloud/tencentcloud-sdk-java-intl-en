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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineInfo extends AbstractModel {

    /**
    * Machine type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Machine quantity
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
     * Get Machine type 
     * @return MachineType Machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
     * @param MachineType Machine type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Machine quantity 
     * @return MachineNum Machine quantity
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set Machine quantity
     * @param MachineNum Machine quantity
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    public MachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineInfo(MachineInfo source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineNum != null) {
            this.MachineNum = new Long(source.MachineNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);

    }
}


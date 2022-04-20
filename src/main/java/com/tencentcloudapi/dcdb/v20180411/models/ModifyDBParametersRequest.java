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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBParametersRequest extends AbstractModel{

    /**
    * Instance ID in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Parameter list. Each element is a combination of `Param` and `Value`.
    */
    @SerializedName("Params")
    @Expose
    private DBParamValue [] Params;

    /**
     * Get Instance ID in the format of dcdbt-ow728lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow728lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Parameter list. Each element is a combination of `Param` and `Value`. 
     * @return Params Parameter list. Each element is a combination of `Param` and `Value`.
     */
    public DBParamValue [] getParams() {
        return this.Params;
    }

    /**
     * Set Parameter list. Each element is a combination of `Param` and `Value`.
     * @param Params Parameter list. Each element is a combination of `Param` and `Value`.
     */
    public void setParams(DBParamValue [] Params) {
        this.Params = Params;
    }

    public ModifyDBParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBParametersRequest(ModifyDBParametersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Params != null) {
            this.Params = new DBParamValue[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new DBParamValue(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}


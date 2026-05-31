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

public class BizTaskModifyInstanceParam extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Details of instance parameter modification task.
    */
    @SerializedName("ModifyInstanceParamList")
    @Expose
    private ModifyParamItem [] ModifyInstanceParamList;

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Details of instance parameter modification task. 
     * @return ModifyInstanceParamList Details of instance parameter modification task.
     */
    public ModifyParamItem [] getModifyInstanceParamList() {
        return this.ModifyInstanceParamList;
    }

    /**
     * Set Details of instance parameter modification task.
     * @param ModifyInstanceParamList Details of instance parameter modification task.
     */
    public void setModifyInstanceParamList(ModifyParamItem [] ModifyInstanceParamList) {
        this.ModifyInstanceParamList = ModifyInstanceParamList;
    }

    public BizTaskModifyInstanceParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizTaskModifyInstanceParam(BizTaskModifyInstanceParam source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyInstanceParamList != null) {
            this.ModifyInstanceParamList = new ModifyParamItem[source.ModifyInstanceParamList.length];
            for (int i = 0; i < source.ModifyInstanceParamList.length; i++) {
                this.ModifyInstanceParamList[i] = new ModifyParamItem(source.ModifyInstanceParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ModifyInstanceParamList.", this.ModifyInstanceParamList);

    }
}


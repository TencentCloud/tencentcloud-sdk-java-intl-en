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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITransferItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TransferFunctionName")
    @Expose
    private String TransferFunctionName;

    /**
    * 
    */
    @SerializedName("TransferFunctionDesc")
    @Expose
    private String TransferFunctionDesc;

    /**
    * 
    */
    @SerializedName("TransferSkillGroupId")
    @Expose
    private Long TransferSkillGroupId;

    /**
     * Get  
     * @return TransferFunctionName 
     */
    public String getTransferFunctionName() {
        return this.TransferFunctionName;
    }

    /**
     * Set 
     * @param TransferFunctionName 
     */
    public void setTransferFunctionName(String TransferFunctionName) {
        this.TransferFunctionName = TransferFunctionName;
    }

    /**
     * Get  
     * @return TransferFunctionDesc 
     */
    public String getTransferFunctionDesc() {
        return this.TransferFunctionDesc;
    }

    /**
     * Set 
     * @param TransferFunctionDesc 
     */
    public void setTransferFunctionDesc(String TransferFunctionDesc) {
        this.TransferFunctionDesc = TransferFunctionDesc;
    }

    /**
     * Get  
     * @return TransferSkillGroupId 
     */
    public Long getTransferSkillGroupId() {
        return this.TransferSkillGroupId;
    }

    /**
     * Set 
     * @param TransferSkillGroupId 
     */
    public void setTransferSkillGroupId(Long TransferSkillGroupId) {
        this.TransferSkillGroupId = TransferSkillGroupId;
    }

    public AITransferItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AITransferItem(AITransferItem source) {
        if (source.TransferFunctionName != null) {
            this.TransferFunctionName = new String(source.TransferFunctionName);
        }
        if (source.TransferFunctionDesc != null) {
            this.TransferFunctionDesc = new String(source.TransferFunctionDesc);
        }
        if (source.TransferSkillGroupId != null) {
            this.TransferSkillGroupId = new Long(source.TransferSkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferFunctionName", this.TransferFunctionName);
        this.setParamSimple(map, prefix + "TransferFunctionDesc", this.TransferFunctionDesc);
        this.setParamSimple(map, prefix + "TransferSkillGroupId", this.TransferSkillGroupId);

    }
}


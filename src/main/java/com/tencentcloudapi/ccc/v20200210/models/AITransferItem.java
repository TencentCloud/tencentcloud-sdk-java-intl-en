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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AITransferItem extends AbstractModel {

    /**
    * Name of the function calling for transfer to human.
    */
    @SerializedName("TransferFunctionName")
    @Expose
    private String TransferFunctionName;

    /**
    * Takes effect when transferfunctionenable is true; the description of transfer_to_human function calling defaults to "transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so.".
    */
    @SerializedName("TransferFunctionDesc")
    @Expose
    private String TransferFunctionDesc;

    /**
    * Skill group id for transferring to human agent.
    */
    @SerializedName("TransferSkillGroupId")
    @Expose
    private Long TransferSkillGroupId;

    /**
     * Get Name of the function calling for transfer to human. 
     * @return TransferFunctionName Name of the function calling for transfer to human.
     */
    public String getTransferFunctionName() {
        return this.TransferFunctionName;
    }

    /**
     * Set Name of the function calling for transfer to human.
     * @param TransferFunctionName Name of the function calling for transfer to human.
     */
    public void setTransferFunctionName(String TransferFunctionName) {
        this.TransferFunctionName = TransferFunctionName;
    }

    /**
     * Get Takes effect when transferfunctionenable is true; the description of transfer_to_human function calling defaults to "transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so.". 
     * @return TransferFunctionDesc Takes effect when transferfunctionenable is true; the description of transfer_to_human function calling defaults to "transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so.".
     */
    public String getTransferFunctionDesc() {
        return this.TransferFunctionDesc;
    }

    /**
     * Set Takes effect when transferfunctionenable is true; the description of transfer_to_human function calling defaults to "transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so.".
     * @param TransferFunctionDesc Takes effect when transferfunctionenable is true; the description of transfer_to_human function calling defaults to "transfer to human when the user has to transfer to human (like says transfer to human) or you are instructed to do so.".
     */
    public void setTransferFunctionDesc(String TransferFunctionDesc) {
        this.TransferFunctionDesc = TransferFunctionDesc;
    }

    /**
     * Get Skill group id for transferring to human agent. 
     * @return TransferSkillGroupId Skill group id for transferring to human agent.
     */
    public Long getTransferSkillGroupId() {
        return this.TransferSkillGroupId;
    }

    /**
     * Set Skill group id for transferring to human agent.
     * @param TransferSkillGroupId Skill group id for transferring to human agent.
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


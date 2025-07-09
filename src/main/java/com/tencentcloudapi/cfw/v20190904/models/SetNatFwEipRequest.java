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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetNatFwEipRequest extends AbstractModel {

    /**
    * bind: bind EIP; unbind: unbind EIP; newAdd: add firewall EIP
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * Firewall instance ID
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * This field is required when OperationType is "bind" or "unbind".
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
     * Get bind: bind EIP; unbind: unbind EIP; newAdd: add firewall EIP 
     * @return OperationType bind: bind EIP; unbind: unbind EIP; newAdd: add firewall EIP
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set bind: bind EIP; unbind: unbind EIP; newAdd: add firewall EIP
     * @param OperationType bind: bind EIP; unbind: unbind EIP; newAdd: add firewall EIP
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Firewall instance ID 
     * @return CfwInstance Firewall instance ID
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set Firewall instance ID
     * @param CfwInstance Firewall instance ID
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get This field is required when OperationType is "bind" or "unbind". 
     * @return EipList This field is required when OperationType is "bind" or "unbind".
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set This field is required when OperationType is "bind" or "unbind".
     * @param EipList This field is required when OperationType is "bind" or "unbind".
     */
    public void setEipList(String [] EipList) {
        this.EipList = EipList;
    }

    public SetNatFwEipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNatFwEipRequest(SetNatFwEipRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.EipList != null) {
            this.EipList = new String[source.EipList.length];
            for (int i = 0; i < source.EipList.length; i++) {
                this.EipList[i] = new String(source.EipList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArraySimple(map, prefix + "EipList.", this.EipList);

    }
}


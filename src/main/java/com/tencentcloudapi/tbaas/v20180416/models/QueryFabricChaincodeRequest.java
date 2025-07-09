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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFabricChaincodeRequest extends AbstractModel {

    /**
    * Cluster ID, which can be obtained from the blockchain cluster details.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Channel ID, which can be obtained from the channel list or channel details.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Contract name. it can be obtained from the contract list or contract details.
    */
    @SerializedName("ChaincodeName")
    @Expose
    private String ChaincodeName;

    /**
    * Contract method.
    */
    @SerializedName("FuncName")
    @Expose
    private String FuncName;

    /**
    * Contract method input parameter.
    */
    @SerializedName("FuncParam")
    @Expose
    private String [] FuncParam;

    /**
     * Get Cluster ID, which can be obtained from the blockchain cluster details. 
     * @return ClusterId Cluster ID, which can be obtained from the blockchain cluster details.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which can be obtained from the blockchain cluster details.
     * @param ClusterId Cluster ID, which can be obtained from the blockchain cluster details.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Channel ID, which can be obtained from the channel list or channel details. 
     * @return ChannelId Channel ID, which can be obtained from the channel list or channel details.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID, which can be obtained from the channel list or channel details.
     * @param ChannelId Channel ID, which can be obtained from the channel list or channel details.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Contract name. it can be obtained from the contract list or contract details. 
     * @return ChaincodeName Contract name. it can be obtained from the contract list or contract details.
     */
    public String getChaincodeName() {
        return this.ChaincodeName;
    }

    /**
     * Set Contract name. it can be obtained from the contract list or contract details.
     * @param ChaincodeName Contract name. it can be obtained from the contract list or contract details.
     */
    public void setChaincodeName(String ChaincodeName) {
        this.ChaincodeName = ChaincodeName;
    }

    /**
     * Get Contract method. 
     * @return FuncName Contract method.
     */
    public String getFuncName() {
        return this.FuncName;
    }

    /**
     * Set Contract method.
     * @param FuncName Contract method.
     */
    public void setFuncName(String FuncName) {
        this.FuncName = FuncName;
    }

    /**
     * Get Contract method input parameter. 
     * @return FuncParam Contract method input parameter.
     */
    public String [] getFuncParam() {
        return this.FuncParam;
    }

    /**
     * Set Contract method input parameter.
     * @param FuncParam Contract method input parameter.
     */
    public void setFuncParam(String [] FuncParam) {
        this.FuncParam = FuncParam;
    }

    public QueryFabricChaincodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFabricChaincodeRequest(QueryFabricChaincodeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChaincodeName != null) {
            this.ChaincodeName = new String(source.ChaincodeName);
        }
        if (source.FuncName != null) {
            this.FuncName = new String(source.FuncName);
        }
        if (source.FuncParam != null) {
            this.FuncParam = new String[source.FuncParam.length];
            for (int i = 0; i < source.FuncParam.length; i++) {
                this.FuncParam[i] = new String(source.FuncParam[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChaincodeName", this.ChaincodeName);
        this.setParamSimple(map, prefix + "FuncName", this.FuncName);
        this.setParamArraySimple(map, prefix + "FuncParam.", this.FuncParam);

    }
}


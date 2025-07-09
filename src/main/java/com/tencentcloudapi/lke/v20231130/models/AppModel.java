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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppModel extends AbstractModel {

    /**
    * Model name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Model description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * The round referenced by the context.
    */
    @SerializedName("ContextLimit")
    @Expose
    private Long ContextLimit;

    /**
    * Model alias.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Remaining token quota.
    */
    @SerializedName("TokenBalance")
    @Expose
    private Float TokenBalance;

    /**
    * Whether to use the round referenced by the context.
    */
    @SerializedName("IsUseContext")
    @Expose
    private Boolean IsUseContext;

    /**
    * The number of context memory rounds.
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * Usage type.
    */
    @SerializedName("UsageType")
    @Expose
    private String UsageType;

    /**
    * Model temperature.
    */
    @SerializedName("Temperature")
    @Expose
    private String Temperature;

    /**
    * Model TopP.
    */
    @SerializedName("TopP")
    @Expose
    private String TopP;

    /**
    * Model resource status: 1: available; 2: exhausted.
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get Model name. 
     * @return Name Model name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Model name.
     * @param Name Model name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Model description. 
     * @return Desc Model description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Model description.
     * @param Desc Model description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get The round referenced by the context. 
     * @return ContextLimit The round referenced by the context.
     */
    public Long getContextLimit() {
        return this.ContextLimit;
    }

    /**
     * Set The round referenced by the context.
     * @param ContextLimit The round referenced by the context.
     */
    public void setContextLimit(Long ContextLimit) {
        this.ContextLimit = ContextLimit;
    }

    /**
     * Get Model alias. 
     * @return AliasName Model alias.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Model alias.
     * @param AliasName Model alias.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Remaining token quota. 
     * @return TokenBalance Remaining token quota.
     */
    public Float getTokenBalance() {
        return this.TokenBalance;
    }

    /**
     * Set Remaining token quota.
     * @param TokenBalance Remaining token quota.
     */
    public void setTokenBalance(Float TokenBalance) {
        this.TokenBalance = TokenBalance;
    }

    /**
     * Get Whether to use the round referenced by the context. 
     * @return IsUseContext Whether to use the round referenced by the context.
     */
    public Boolean getIsUseContext() {
        return this.IsUseContext;
    }

    /**
     * Set Whether to use the round referenced by the context.
     * @param IsUseContext Whether to use the round referenced by the context.
     */
    public void setIsUseContext(Boolean IsUseContext) {
        this.IsUseContext = IsUseContext;
    }

    /**
     * Get The number of context memory rounds. 
     * @return HistoryLimit The number of context memory rounds.
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set The number of context memory rounds.
     * @param HistoryLimit The number of context memory rounds.
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get Usage type. 
     * @return UsageType Usage type.
     */
    public String getUsageType() {
        return this.UsageType;
    }

    /**
     * Set Usage type.
     * @param UsageType Usage type.
     */
    public void setUsageType(String UsageType) {
        this.UsageType = UsageType;
    }

    /**
     * Get Model temperature. 
     * @return Temperature Model temperature.
     */
    public String getTemperature() {
        return this.Temperature;
    }

    /**
     * Set Model temperature.
     * @param Temperature Model temperature.
     */
    public void setTemperature(String Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get Model TopP. 
     * @return TopP Model TopP.
     */
    public String getTopP() {
        return this.TopP;
    }

    /**
     * Set Model TopP.
     * @param TopP Model TopP.
     */
    public void setTopP(String TopP) {
        this.TopP = TopP;
    }

    /**
     * Get Model resource status: 1: available; 2: exhausted. 
     * @return ResourceStatus Model resource status: 1: available; 2: exhausted.
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set Model resource status: 1: available; 2: exhausted.
     * @param ResourceStatus Model resource status: 1: available; 2: exhausted.
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public AppModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModel(AppModel source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ContextLimit != null) {
            this.ContextLimit = new Long(source.ContextLimit);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.TokenBalance != null) {
            this.TokenBalance = new Float(source.TokenBalance);
        }
        if (source.IsUseContext != null) {
            this.IsUseContext = new Boolean(source.IsUseContext);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.UsageType != null) {
            this.UsageType = new String(source.UsageType);
        }
        if (source.Temperature != null) {
            this.Temperature = new String(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new String(source.TopP);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ContextLimit", this.ContextLimit);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "TokenBalance", this.TokenBalance);
        this.setParamSimple(map, prefix + "IsUseContext", this.IsUseContext);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "UsageType", this.UsageType);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}


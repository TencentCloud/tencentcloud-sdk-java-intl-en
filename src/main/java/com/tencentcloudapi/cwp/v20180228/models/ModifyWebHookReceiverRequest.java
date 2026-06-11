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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebHookReceiverRequest extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Receiver name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * webhook URL
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * Whether to modify
    */
    @SerializedName("IsModify")
    @Expose
    private Boolean IsModify;

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * target region
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function version
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * Alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Receiver name 
     * @return Name Receiver name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Receiver name
     * @param Name Receiver name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get webhook URL 
     * @return Addr webhook URL
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set webhook URL
     * @param Addr webhook URL
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get Whether to modify 
     * @return IsModify Whether to modify
     */
    public Boolean getIsModify() {
        return this.IsModify;
    }

    /**
     * Set Whether to modify
     * @param IsModify Whether to modify
     */
    public void setIsModify(Boolean IsModify) {
        this.IsModify = IsModify;
    }

    /**
     * Get Type 
     * @return Type Type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get target region 
     * @return SCFRegion target region
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set target region
     * @param SCFRegion target region
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get function name 
     * @return FunctionName function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set function name
     * @param FunctionName function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function version 
     * @return FunctionVersion Function version
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set Function version
     * @param FunctionVersion Function version
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get Alias 
     * @return Alias Alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias
     * @param Alias Alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyWebHookReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebHookReceiverRequest(ModifyWebHookReceiverRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.IsModify != null) {
            this.IsModify = new Boolean(source.IsModify);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "IsModify", this.IsModify);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}


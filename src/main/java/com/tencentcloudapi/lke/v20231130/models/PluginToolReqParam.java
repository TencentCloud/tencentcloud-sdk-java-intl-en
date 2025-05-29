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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginToolReqParam extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Parameter type, 0: string; 1: int; 2: float; 3: bool; 4: object; 5: array_string; 6: array_int; 7: array_float; 8: array_bool; 9: array_object, 99: null, 100: upspecified.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether the parameter is required.
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * Parameter default value.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Sub-parameter. "ParamType" is useful when it is "OBJECT " or "ARRAY<>" type.
    */
    @SerializedName("SubParams")
    @Expose
    private PluginToolReqParam [] SubParams;

    /**
    * Whether the plugin parameter configuration is hidden and invisible. true - Hidden and invisible; false - Visible.
    */
    @SerializedName("GlobalHidden")
    @Expose
    private Boolean GlobalHidden;

    /**
    * OneOf type parameter.
    */
    @SerializedName("OneOf")
    @Expose
    private PluginToolReqParam [] OneOf;

    /**
    * AnyOf type parameter.
    */
    @SerializedName("AnyOf")
    @Expose
    private PluginToolReqParam [] AnyOf;

    /**
     * Get Parameter name. 
     * @return Name Parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name.
     * @param Name Parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter description. 
     * @return Desc Parameter description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Parameter description.
     * @param Desc Parameter description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Parameter type, 0: string; 1: int; 2: float; 3: bool; 4: object; 5: array_string; 6: array_int; 7: array_float; 8: array_bool; 9: array_object, 99: null, 100: upspecified. 
     * @return Type Parameter type, 0: string; 1: int; 2: float; 3: bool; 4: object; 5: array_string; 6: array_int; 7: array_float; 8: array_bool; 9: array_object, 99: null, 100: upspecified.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Parameter type, 0: string; 1: int; 2: float; 3: bool; 4: object; 5: array_string; 6: array_int; 7: array_float; 8: array_bool; 9: array_object, 99: null, 100: upspecified.
     * @param Type Parameter type, 0: string; 1: int; 2: float; 3: bool; 4: object; 5: array_string; 6: array_int; 7: array_float; 8: array_bool; 9: array_object, 99: null, 100: upspecified.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the parameter is required. 
     * @return IsRequired Whether the parameter is required.
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set Whether the parameter is required.
     * @param IsRequired Whether the parameter is required.
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get Parameter default value. 
     * @return DefaultValue Parameter default value.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Parameter default value.
     * @param DefaultValue Parameter default value.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Sub-parameter. "ParamType" is useful when it is "OBJECT " or "ARRAY<>" type. 
     * @return SubParams Sub-parameter. "ParamType" is useful when it is "OBJECT " or "ARRAY<>" type.
     */
    public PluginToolReqParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set Sub-parameter. "ParamType" is useful when it is "OBJECT " or "ARRAY<>" type.
     * @param SubParams Sub-parameter. "ParamType" is useful when it is "OBJECT " or "ARRAY<>" type.
     */
    public void setSubParams(PluginToolReqParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get Whether the plugin parameter configuration is hidden and invisible. true - Hidden and invisible; false - Visible. 
     * @return GlobalHidden Whether the plugin parameter configuration is hidden and invisible. true - Hidden and invisible; false - Visible.
     */
    public Boolean getGlobalHidden() {
        return this.GlobalHidden;
    }

    /**
     * Set Whether the plugin parameter configuration is hidden and invisible. true - Hidden and invisible; false - Visible.
     * @param GlobalHidden Whether the plugin parameter configuration is hidden and invisible. true - Hidden and invisible; false - Visible.
     */
    public void setGlobalHidden(Boolean GlobalHidden) {
        this.GlobalHidden = GlobalHidden;
    }

    /**
     * Get OneOf type parameter. 
     * @return OneOf OneOf type parameter.
     */
    public PluginToolReqParam [] getOneOf() {
        return this.OneOf;
    }

    /**
     * Set OneOf type parameter.
     * @param OneOf OneOf type parameter.
     */
    public void setOneOf(PluginToolReqParam [] OneOf) {
        this.OneOf = OneOf;
    }

    /**
     * Get AnyOf type parameter. 
     * @return AnyOf AnyOf type parameter.
     */
    public PluginToolReqParam [] getAnyOf() {
        return this.AnyOf;
    }

    /**
     * Set AnyOf type parameter.
     * @param AnyOf AnyOf type parameter.
     */
    public void setAnyOf(PluginToolReqParam [] AnyOf) {
        this.AnyOf = AnyOf;
    }

    public PluginToolReqParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginToolReqParam(PluginToolReqParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.SubParams != null) {
            this.SubParams = new PluginToolReqParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new PluginToolReqParam(source.SubParams[i]);
            }
        }
        if (source.GlobalHidden != null) {
            this.GlobalHidden = new Boolean(source.GlobalHidden);
        }
        if (source.OneOf != null) {
            this.OneOf = new PluginToolReqParam[source.OneOf.length];
            for (int i = 0; i < source.OneOf.length; i++) {
                this.OneOf[i] = new PluginToolReqParam(source.OneOf[i]);
            }
        }
        if (source.AnyOf != null) {
            this.AnyOf = new PluginToolReqParam[source.AnyOf.length];
            for (int i = 0; i < source.AnyOf.length; i++) {
                this.AnyOf[i] = new PluginToolReqParam(source.AnyOf[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamSimple(map, prefix + "GlobalHidden", this.GlobalHidden);
        this.setParamArrayObj(map, prefix + "OneOf.", this.OneOf);
        this.setParamArrayObj(map, prefix + "AnyOf.", this.AnyOf);

    }
}


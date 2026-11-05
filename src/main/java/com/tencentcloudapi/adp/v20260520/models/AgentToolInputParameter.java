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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentToolInputParameter extends AbstractModel {

    /**
    * <p>Tool name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Tool description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tool parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Required or not</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>Sub-parameter, used only when the data type is OBJECT or ARRAY&lt;&gt;</p>
    */
    @SerializedName("SubParameterList")
    @Expose
    private AgentToolInputParameter [] SubParameterList;

    /**
    * <p>Whether to hide from the model in mode</p>
    */
    @SerializedName("IsHidden")
    @Expose
    private Boolean IsHidden;

    /**
    * <p>Parameters in types of OneOf</p>
    */
    @SerializedName("OneOfList")
    @Expose
    private AgentToolInputParameter [] OneOfList;

    /**
    * <p>Parameters in types of AnyOf</p>
    */
    @SerializedName("AnyOfList")
    @Expose
    private AgentToolInputParameter [] AnyOfList;

    /**
    * <p>Source of parameter value</p>
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get <p>Tool name</p> 
     * @return Name <p>Tool name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tool name</p>
     * @param Name <p>Tool name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Tool description</p> 
     * @return Description <p>Tool description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Tool description</p>
     * @param Description <p>Tool description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Tool parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul> 
     * @return Type <p>Tool parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Tool parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     * @param Type <p>Tool parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Required or not</p> 
     * @return IsRequired <p>Required or not</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>Required or not</p>
     * @param IsRequired <p>Required or not</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>Sub-parameter, used only when the data type is OBJECT or ARRAY&lt;&gt;</p> 
     * @return SubParameterList <p>Sub-parameter, used only when the data type is OBJECT or ARRAY&lt;&gt;</p>
     */
    public AgentToolInputParameter [] getSubParameterList() {
        return this.SubParameterList;
    }

    /**
     * Set <p>Sub-parameter, used only when the data type is OBJECT or ARRAY&lt;&gt;</p>
     * @param SubParameterList <p>Sub-parameter, used only when the data type is OBJECT or ARRAY&lt;&gt;</p>
     */
    public void setSubParameterList(AgentToolInputParameter [] SubParameterList) {
        this.SubParameterList = SubParameterList;
    }

    /**
     * Get <p>Whether to hide from the model in mode</p> 
     * @return IsHidden <p>Whether to hide from the model in mode</p>
     */
    public Boolean getIsHidden() {
        return this.IsHidden;
    }

    /**
     * Set <p>Whether to hide from the model in mode</p>
     * @param IsHidden <p>Whether to hide from the model in mode</p>
     */
    public void setIsHidden(Boolean IsHidden) {
        this.IsHidden = IsHidden;
    }

    /**
     * Get <p>Parameters in types of OneOf</p> 
     * @return OneOfList <p>Parameters in types of OneOf</p>
     */
    public AgentToolInputParameter [] getOneOfList() {
        return this.OneOfList;
    }

    /**
     * Set <p>Parameters in types of OneOf</p>
     * @param OneOfList <p>Parameters in types of OneOf</p>
     */
    public void setOneOfList(AgentToolInputParameter [] OneOfList) {
        this.OneOfList = OneOfList;
    }

    /**
     * Get <p>Parameters in types of AnyOf</p> 
     * @return AnyOfList <p>Parameters in types of AnyOf</p>
     */
    public AgentToolInputParameter [] getAnyOfList() {
        return this.AnyOfList;
    }

    /**
     * Set <p>Parameters in types of AnyOf</p>
     * @param AnyOfList <p>Parameters in types of AnyOf</p>
     */
    public void setAnyOfList(AgentToolInputParameter [] AnyOfList) {
        this.AnyOfList = AnyOfList;
    }

    /**
     * Get <p>Source of parameter value</p> 
     * @return Input <p>Source of parameter value</p>
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Source of parameter value</p>
     * @param Input <p>Source of parameter value</p>
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentToolInputParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolInputParameter(AgentToolInputParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.SubParameterList != null) {
            this.SubParameterList = new AgentToolInputParameter[source.SubParameterList.length];
            for (int i = 0; i < source.SubParameterList.length; i++) {
                this.SubParameterList[i] = new AgentToolInputParameter(source.SubParameterList[i]);
            }
        }
        if (source.IsHidden != null) {
            this.IsHidden = new Boolean(source.IsHidden);
        }
        if (source.OneOfList != null) {
            this.OneOfList = new AgentToolInputParameter[source.OneOfList.length];
            for (int i = 0; i < source.OneOfList.length; i++) {
                this.OneOfList[i] = new AgentToolInputParameter(source.OneOfList[i]);
            }
        }
        if (source.AnyOfList != null) {
            this.AnyOfList = new AgentToolInputParameter[source.AnyOfList.length];
            for (int i = 0; i < source.AnyOfList.length; i++) {
                this.AnyOfList[i] = new AgentToolInputParameter(source.AnyOfList[i]);
            }
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamArrayObj(map, prefix + "SubParameterList.", this.SubParameterList);
        this.setParamSimple(map, prefix + "IsHidden", this.IsHidden);
        this.setParamArrayObj(map, prefix + "OneOfList.", this.OneOfList);
        this.setParamArrayObj(map, prefix + "AnyOfList.", this.AnyOfList);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}


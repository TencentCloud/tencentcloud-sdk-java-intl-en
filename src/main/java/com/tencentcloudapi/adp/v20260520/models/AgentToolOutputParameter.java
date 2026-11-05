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

public class AgentToolOutputParameter extends AbstractModel {

    /**
    * <p>Parameter name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Variable description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Sub-parameter, used only when the data type is OBJECT or ARRAY_OBJECT</p>
    */
    @SerializedName("SubParameterList")
    @Expose
    private AgentToolOutputParameter [] SubParameterList;

    /**
    * <p>Parsing method</p>
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
     * Get <p>Parameter name</p> 
     * @return Name <p>Parameter name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Parameter name</p>
     * @param Name <p>Parameter name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Variable description</p> 
     * @return Description <p>Variable description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Variable description</p>
     * @param Description <p>Variable description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul> 
     * @return Type <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     * @param Type <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: STRING</li><li>1: INT</li><li>2: FLOAT</li><li>3: BOOL</li><li>4: OBJECT</li><li>5: ARRAY_STRING</li><li>6: ARRAY_INT</li><li>7: ARRAY_FLOAT</li><li>8: ARRAY_BOOL</li><li>9: ARRAY_OBJECT</li><li>20: ARRAY_ARRAY</li><li>99: NULL</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Sub-parameter, used only when the data type is OBJECT or ARRAY_OBJECT</p> 
     * @return SubParameterList <p>Sub-parameter, used only when the data type is OBJECT or ARRAY_OBJECT</p>
     */
    public AgentToolOutputParameter [] getSubParameterList() {
        return this.SubParameterList;
    }

    /**
     * Set <p>Sub-parameter, used only when the data type is OBJECT or ARRAY_OBJECT</p>
     * @param SubParameterList <p>Sub-parameter, used only when the data type is OBJECT or ARRAY_OBJECT</p>
     */
    public void setSubParameterList(AgentToolOutputParameter [] SubParameterList) {
        this.SubParameterList = SubParameterList;
    }

    /**
     * Get <p>Parsing method</p> 
     * @return RenderMode <p>Parsing method</p>
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set <p>Parsing method</p>
     * @param RenderMode <p>Parsing method</p>
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    public AgentToolOutputParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolOutputParameter(AgentToolOutputParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SubParameterList != null) {
            this.SubParameterList = new AgentToolOutputParameter[source.SubParameterList.length];
            for (int i = 0; i < source.SubParameterList.length; i++) {
                this.SubParameterList[i] = new AgentToolOutputParameter(source.SubParameterList[i]);
            }
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SubParameterList.", this.SubParameterList);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);

    }
}


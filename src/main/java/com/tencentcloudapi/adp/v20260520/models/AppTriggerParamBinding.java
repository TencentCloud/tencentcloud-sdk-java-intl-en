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

public class AppTriggerParamBinding extends AbstractModel {

    /**
    * <p>Parameter name.</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>4: object</li><li>5: string array</li><li>6: integer array</li><li>7: floating-point number array</li><li>8: boolean value array</li><li>3: boolean value</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: nested array</li><li>22: key</li><li>99: null</li><li>100: unspecified type, for OneOf and AnyOf scenarios</li></ul>
    */
    @SerializedName("ParamType")
    @Expose
    private Long ParamType;

    /**
    * <p>Parameter value</p>
    */
    @SerializedName("Value")
    @Expose
    private AppTriggerParamBindingValue Value;

    /**
     * Get <p>Parameter name.</p> 
     * @return ParamName <p>Parameter name.</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>Parameter name.</p>
     * @param ParamName <p>Parameter name.</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>4: object</li><li>5: string array</li><li>6: integer array</li><li>7: floating-point number array</li><li>8: boolean value array</li><li>3: boolean value</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: nested array</li><li>22: key</li><li>99: null</li><li>100: unspecified type, for OneOf and AnyOf scenarios</li></ul> 
     * @return ParamType <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>4: object</li><li>5: string array</li><li>6: integer array</li><li>7: floating-point number array</li><li>8: boolean value array</li><li>3: boolean value</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: nested array</li><li>22: key</li><li>99: null</li><li>100: unspecified type, for OneOf and AnyOf scenarios</li></ul>
     */
    public Long getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>4: object</li><li>5: string array</li><li>6: integer array</li><li>7: floating-point number array</li><li>8: boolean value array</li><li>3: boolean value</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: nested array</li><li>22: key</li><li>99: null</li><li>100: unspecified type, for OneOf and AnyOf scenarios</li></ul>
     * @param ParamType <p>Parameter type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>4: object</li><li>5: string array</li><li>6: integer array</li><li>7: floating-point number array</li><li>8: boolean value array</li><li>3: boolean value</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: nested array</li><li>22: key</li><li>99: null</li><li>100: unspecified type, for OneOf and AnyOf scenarios</li></ul>
     */
    public void setParamType(Long ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>Parameter value</p> 
     * @return Value <p>Parameter value</p>
     */
    public AppTriggerParamBindingValue getValue() {
        return this.Value;
    }

    /**
     * Set <p>Parameter value</p>
     * @param Value <p>Parameter value</p>
     */
    public void setValue(AppTriggerParamBindingValue Value) {
        this.Value = Value;
    }

    public AppTriggerParamBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerParamBinding(AppTriggerParamBinding source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new Long(source.ParamType);
        }
        if (source.Value != null) {
            this.Value = new AppTriggerParamBindingValue(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}


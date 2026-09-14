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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalAcceleratorRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Cross-border type.</p><p>Enumeration values:</p><ul><li>HighQuality: high-quality cross-border.</li><li>Unicom: China Unicom cross-border.</li></ul>
    */
    @SerializedName("CrossBorderType")
    @Expose
    private String CrossBorderType;

    /**
    * <p>Indicates whether to complete the cross-border service commitment.</p><p>When CrossBorderType is passed in, this field must be set to true, indicating the cross-border commitment is completed.</p>
    */
    @SerializedName("CrossBorderPromiseFlag")
    @Expose
    private Boolean CrossBorderPromiseFlag;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p> 
     * @return Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     * @param Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p> 
     * @return Description <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     * @param Description <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Cross-border type.</p><p>Enumeration values:</p><ul><li>HighQuality: high-quality cross-border.</li><li>Unicom: China Unicom cross-border.</li></ul> 
     * @return CrossBorderType <p>Cross-border type.</p><p>Enumeration values:</p><ul><li>HighQuality: high-quality cross-border.</li><li>Unicom: China Unicom cross-border.</li></ul>
     */
    public String getCrossBorderType() {
        return this.CrossBorderType;
    }

    /**
     * Set <p>Cross-border type.</p><p>Enumeration values:</p><ul><li>HighQuality: high-quality cross-border.</li><li>Unicom: China Unicom cross-border.</li></ul>
     * @param CrossBorderType <p>Cross-border type.</p><p>Enumeration values:</p><ul><li>HighQuality: high-quality cross-border.</li><li>Unicom: China Unicom cross-border.</li></ul>
     */
    public void setCrossBorderType(String CrossBorderType) {
        this.CrossBorderType = CrossBorderType;
    }

    /**
     * Get <p>Indicates whether to complete the cross-border service commitment.</p><p>When CrossBorderType is passed in, this field must be set to true, indicating the cross-border commitment is completed.</p> 
     * @return CrossBorderPromiseFlag <p>Indicates whether to complete the cross-border service commitment.</p><p>When CrossBorderType is passed in, this field must be set to true, indicating the cross-border commitment is completed.</p>
     */
    public Boolean getCrossBorderPromiseFlag() {
        return this.CrossBorderPromiseFlag;
    }

    /**
     * Set <p>Indicates whether to complete the cross-border service commitment.</p><p>When CrossBorderType is passed in, this field must be set to true, indicating the cross-border commitment is completed.</p>
     * @param CrossBorderPromiseFlag <p>Indicates whether to complete the cross-border service commitment.</p><p>When CrossBorderType is passed in, this field must be set to true, indicating the cross-border commitment is completed.</p>
     */
    public void setCrossBorderPromiseFlag(Boolean CrossBorderPromiseFlag) {
        this.CrossBorderPromiseFlag = CrossBorderPromiseFlag;
    }

    public ModifyGlobalAcceleratorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorRequest(ModifyGlobalAcceleratorRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CrossBorderType != null) {
            this.CrossBorderType = new String(source.CrossBorderType);
        }
        if (source.CrossBorderPromiseFlag != null) {
            this.CrossBorderPromiseFlag = new Boolean(source.CrossBorderPromiseFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CrossBorderType", this.CrossBorderType);
        this.setParamSimple(map, prefix + "CrossBorderPromiseFlag", this.CrossBorderPromiseFlag);

    }
}

